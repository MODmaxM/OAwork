package com.nju.oawork.model.dao.processdao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nju.oawork.model.entity.process.ProcessList;
import com.nju.oawork.model.entity.process.Resign;

public interface ResignDao extends PagingAndSortingRepository<Resign, Long>{

	Resign findByProId(ProcessList process);

}
