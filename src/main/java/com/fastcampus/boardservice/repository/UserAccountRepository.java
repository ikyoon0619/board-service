package com.fastcampus.boardservice.repository;

import com.fastcampus.boardservice.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}