package com.ss.springsecuritytwo.Repository;

import com.ss.springsecuritytwo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
