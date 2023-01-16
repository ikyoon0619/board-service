package com.fastcampus.boardservice.repository;

import com.fastcampus.boardservice.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}