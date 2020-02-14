package com.nju.oawork.model.dao.processdao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nju.oawork.model.entity.process.Bursement;
import com.nju.oawork.model.entity.process.ProcessList;

public interface BursementDao extends PagingAndSortingRepository<Bursement, Long>{

	Bursement findByProId(ProcessList process);
	
	

}
