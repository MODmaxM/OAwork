package com.nju.oawork.model.dao.processdao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nju.oawork.model.entity.process.Overtime;
import com.nju.oawork.model.entity.process.ProcessList;

public interface OvertimeDao extends PagingAndSortingRepository<Overtime, Long>{

	Overtime findByProId(ProcessList pro);

}
