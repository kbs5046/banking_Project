package com.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CustomerDao;
import com.dao.entity.User;
import com.dto.UserDto;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public void registerCustomer(UserDto userDto) {
		User user = new User();
		BeanUtils.copyProperties(userDto,user);
		customerDao.registerCustomer(user);		
	}

}
