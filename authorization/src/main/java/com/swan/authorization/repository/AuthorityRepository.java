package com.swan.authorization.repository;

import com.swan.authorization.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String>{

    Authority findByName(String name);

}