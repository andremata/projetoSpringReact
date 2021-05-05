package com.andremata.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.andremata.dsvendas.dto.SellerDTO;
import com.andremata.dsvendas.entities.Seller;
import com.andremata.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x))
				.collect(Collectors.toList());
	}
}
