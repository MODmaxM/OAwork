package com.nju.oawork.model.dao.processdao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nju.oawork.model.entity.process.Holiday;
import com.nju.oawork.model.entity.process.ProcessList;

public interface HolidayDao extends PagingAndSortingRepository<Holiday, Long>{

	Holiday findByProId(ProcessList pro);

}
