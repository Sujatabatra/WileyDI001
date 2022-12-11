package com.sujata.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.entity.DemoTable;
import com.sujata.service.DemoTableService;

@RestController
public class DemoTableResource {

	@Autowired
	private DemoTableService demoTableService;
	
	@GetMapping(path = "/demo",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<DemoTable> getAllData(){
		return demoTableService.getAllRecords();
	}
}
