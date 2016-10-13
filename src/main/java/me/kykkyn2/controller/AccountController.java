package me.kykkyn2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.kykkyn2.repository.AccountRepository;

/**
 * Created by kykkyn2 on 2016-10-13.
 */
@RestController
public class AccountController {

	@Autowired
	private AccountRepository accountRepository;

	@RequestMapping(value = "/accounts", method = RequestMethod.GET)
	public ResponseEntity getAccount() {
		return new ResponseEntity<>(accountRepository.findAll(), HttpStatus.OK);
	}

}
