package com.example.payrollez.service.core_user_account;
import com.example.payrollez.exception.CustomException;
import com.example.payrollez.exception.ErrorCode;
import com.example.payrollez.model.CoreUserAccount;
import com.example.payrollez.model.Log;
import com.example.payrollez.model.UserPrinciple;
import com.example.payrollez.repository.CoreUserAccountRepository;
import com.example.payrollez.service.auto_pk_support.IAutoPkSupportService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Service
public class CoreUserAccountService implements ICoreUserAccountService {
    private final CoreUserAccountRepository coreUserAccountRepository;
    private final IAutoPkSupportService autoPkSupportService;

    public CoreUserAccountService(CoreUserAccountRepository coreUserAccountRepository, IAutoPkSupportService autoPkSupportService) {
        this.coreUserAccountRepository = coreUserAccountRepository;
        this.autoPkSupportService = autoPkSupportService;
    }

    @Override
    public Optional<CoreUserAccount> findById(Long id) {
        Optional<CoreUserAccount> coreUserAccount = coreUserAccountRepository.findById(id);
        Log.info("CoreUserAccountRepository.findById");
        return coreUserAccount;
    }

    @Override
    public List<CoreUserAccount> findAll() {
        Log.info("CoreUserAccountRepository.findAll");
        return coreUserAccountRepository.findAll();
    }

    @Override
    public CoreUserAccount save(CoreUserAccount coreUserAccount) {
        Log.info(" CoreUserAccountService.save");
        try {
            return coreUserAccountRepository.save(coreUserAccount);
        } catch (Exception e) {
            throw new CustomException(ErrorCode.UNPROCESSABLE_ENTITY, "Trường của User bị bỏ trống");
        }

    }

    @Override
    public void delete(Long aLong) {
        Log.info("CoreUserAccountService.delete");
        coreUserAccountRepository.deleteById(aLong);
    }

    @Override
    public CoreUserAccount findCoreUserAccountByUsername(String username) {
        Log.info("CoreUserAccountService findCoreUserAccountByLogin ");
        Optional<CoreUserAccount> user = coreUserAccountRepository.findCoreUserAccountByUsername(username);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new CustomException(ErrorCode.UNAUTHORIZED, "Tên đăng nhập không đúng");
        }
    }

    @Override
    public CoreUserAccount getUserLogging() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        return findCoreUserAccountByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<CoreUserAccount> userOptional = coreUserAccountRepository.findCoreUserAccountByUsername(username);
        if (!userOptional.isPresent()) {
            throw new UsernameNotFoundException(username + "không tìm thấy ");
        }
        return new UserPrinciple(userOptional.get());
    }


    @Override
    public Authentication getAuthentication() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication;
    }

    @Override
    public CoreUserAccount createCoreUserAccount(CoreUserAccount userAccount, Long employeeId) {
        return null;
    }


    @Override
    public boolean checkAccountExp(CoreUserAccount coreUserAccount) {
        if (!coreUserAccount.isStatus()) {
            return false;
        }
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime expiryDate = coreUserAccount.getExpiryDate();
        LocalDateTime pwdExpDate = coreUserAccount.getPwdExpDate();

        if (expiryDate != null && expiryDate.isBefore(currentDateTime)) {
            return false;
        }

        if (pwdExpDate != null && pwdExpDate.isBefore(currentDateTime)) {
            return false;
        }
        return true;
    }

}
