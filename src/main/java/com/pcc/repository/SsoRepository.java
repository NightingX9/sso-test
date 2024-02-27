package com.pcc.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pcc.model.Sso;

public interface SsoRepository extends JpaRepository<Sso, Date> {

}
