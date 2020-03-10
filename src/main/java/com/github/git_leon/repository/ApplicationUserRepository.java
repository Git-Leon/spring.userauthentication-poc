package com.github.git_leon.repository;

/**
 * @author leonhunter
 * @created 03/09/2020 - 9:39 PM
 */

import com.github.git_leon.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}
