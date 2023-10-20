package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant,Integer>{
public Merchant findbyproductName(String productName);

	

	
}
