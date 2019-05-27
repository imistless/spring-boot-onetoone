package com.SpringOneToOne.OneToOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringOneToOne.OneToOne.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
