package com.nju.oawork.services.user;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nju.oawork.model.dao.user.UserLogRecordDao;
import com.nju.oawork.model.entity.user.LoginRecord;

@Service
@Transactional
public class UserLongRecordService {
	@Autowired
	private UserLogRecordDao  ulDao;
	
	public LoginRecord save(LoginRecord lr){
		return ulDao.save(lr);
	}
	
}
