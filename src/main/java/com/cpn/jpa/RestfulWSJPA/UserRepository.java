package com.cpn.jpa.RestfulWSJPA;

import com.cpn.jpa.RestfulWSJPA.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
