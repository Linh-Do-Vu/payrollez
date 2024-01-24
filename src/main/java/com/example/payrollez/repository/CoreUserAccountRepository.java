package com.example.payrollez.repository;


import com.example.payrollez.model.user.CoreUserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CoreUserAccountRepository extends JpaRepository<CoreUserAccount,Long> {

    Optional<CoreUserAccount> findCoreUserAccountByUsername(String name);

}
