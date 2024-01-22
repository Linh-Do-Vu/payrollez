package com.example.payrollez.service.core_user_account;

import com.example.payrollez.model.CoreUserAccount;
import com.example.payrollez.service.IService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface ICoreUserAccountService extends IService<CoreUserAccount,Long>, UserDetailsService {
    @Override
    Optional<CoreUserAccount> findById(Long aLong);

    @Override
    List<CoreUserAccount> findAll();

    @Override
    CoreUserAccount save(CoreUserAccount coreUserAccount);

    @Override
    void delete(Long aLong);
   CoreUserAccount findCoreUserAccountByUsername(String username);
    CoreUserAccount getUserLogging();
    Authentication getAuthentication ();
    public CoreUserAccount createCoreUserAccount(CoreUserAccount userAccount,Long employeeId) ;
    boolean checkAccountExp (CoreUserAccount account) ;
}
