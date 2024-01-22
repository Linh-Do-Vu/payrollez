package com.example.payrollez.repository;

import com.example.payrollez.model.AutoPkSupport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoPkSupportRepository extends JpaRepository<AutoPkSupport,String> {
AutoPkSupport findAutoPkSupportByTableName (String tableName);
}
