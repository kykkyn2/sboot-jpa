package me.kykkyn2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.kykkyn2.model.Account;

/**
 * Created by kykkyn2 on 2016-10-13.
 */
public interface AccountRepository extends JpaRepository<Account, Long> {}
