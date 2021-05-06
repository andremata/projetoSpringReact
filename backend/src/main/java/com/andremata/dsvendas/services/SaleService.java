package com.andremata.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andremata.dsvendas.dto.SaleDTO;
import com.andremata.dsvendas.dto.SaleSuccessDTO;
import com.andremata.dsvendas.dto.SaleSumDTO;
import com.andremata.dsvendas.entities.Sale;
import com.andremata.dsvendas.repositories.SaleRepository;
import com.andremata.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	SaleRepository repository;
	
	@Autowired
	SellerRepository sellerRepository;
	
	//usado para resolver toda transação de banco nesta classe e não fazer lock no banco
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll(); //resolvendo problema do jpa ir pegando varios select no banco de dados
		
		Page<Sale> result = repository.findAll(pageable);
		
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller() {
		return repository.successGroupedBySeller();
	}
}
