package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.entity.DemoTable;
import com.sujata.persistence.DemoTableDao;

@Service
public class DemoTableService {

	@Autowired
	private DemoTableDao demoTableDao;
	
	public List<DemoTable> getAllRecords(){
		return demoTableDao.findAll();
	}
}
