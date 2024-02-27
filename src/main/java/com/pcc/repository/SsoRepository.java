package com.pcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pcc.model.Sso;

public interface SsoRepository extends JpaRepository<Sso, String> {

}
