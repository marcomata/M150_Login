package com.mata.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Autor: Marco Mata
 * Description: this class extends JPARepository which manages the SQL data retrieval.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
