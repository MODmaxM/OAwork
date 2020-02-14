package com.nju.oawork.model.dao.processdao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nju.oawork.model.entity.process.ProcessList;
import com.nju.oawork.model.entity.process.Regular;

public interface RegularDao extends PagingAndSortingRepository<Regular, Long>{

	Regular findByProId(ProcessList pro);

}
