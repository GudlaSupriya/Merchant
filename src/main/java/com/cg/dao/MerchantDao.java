package com.cg.dao;

import java.util.List;

import com.cg.entity.Merchant;

public interface MerchantDao {

	public String addMerchant(Merchant merchant);

	public List<Merchant> getMerchantList();

	

 

}