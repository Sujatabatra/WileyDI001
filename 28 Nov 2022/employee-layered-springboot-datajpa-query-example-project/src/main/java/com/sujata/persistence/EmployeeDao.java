package com.sujata.persistence;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	List<Employee> findByEmpDepartment(String department);
	
	@Query("from Employee where empDesignation=:des")
	List<Employee> searchEmployeeByDesignation(@Param("des") String designation);
	
	
	@Modifying
	@Transactional
	@Query("delete from Employee where empName=:na")
	int deleteByName(@Param("na") String name);
	
}
