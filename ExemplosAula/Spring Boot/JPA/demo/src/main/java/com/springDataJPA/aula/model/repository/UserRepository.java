package com.springDataJPA.aula.model.repository;

import com.springDataJPA.aula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
