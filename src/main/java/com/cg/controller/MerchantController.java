package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Merchant;
import com.cg.service.MerchantService;

@RestController

@RequestMapping("/merchantapi")

public class MerchantController {

	@Autowired

	private MerchantService mservice;

	@PostMapping("/add")

	public String add(@Validated @RequestBody Merchant merchant) { // get the object from user and attached with body of
																	// request

		return mservice.addMerchant(merchant);

	}

	@GetMapping("/")

	public List<Merchant> getAll() {

		return mservice.getMerchantList();

	}

	

}
