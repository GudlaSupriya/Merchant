package com.cg.service;

import org.springframework.stereotype.Service;

import com.cg.dao.MerchantDao;
import com.cg.entity.Merchant;
import java.util.*;

@Service

public class MerchantService implements MerchantDao {

	List<Merchant> merchants = new ArrayList<Merchant>();

	public String addMerchant(Merchant merchant) {

		merchants.add(merchant);

		return "Merchant added Successfully";

	}

	@Override
	public List<Merchant> getMerchantList() {

		return merchants;
	}

	

}