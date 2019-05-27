package com.SpringOneToOne.OneToOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringOneToOne.OneToOne.domain.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

}
