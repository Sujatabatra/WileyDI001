package com.sujata.model.persistence;

import java.sql.SQLIntegrityConstraintViolationException;
import java.time.LocalDate;
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

	//JPQL
	@Query("from Employee where empDesignation=:des")
	List<Employee> searchEmployeeByDesignation(@Param("des") String designation);

	
	//JPQL
	@Modifying
	@Transactional
	@Query("delete from Employee where empName=:na")
	int deleteByName(@Param("na") String name);

	//Native Query
	@Modifying
	@Transactional
	@Query(value = "insert into employee values(:eid,:na,:des,:dep,:sal,:doj)", nativeQuery = true)
	int insertEmployee(@Param("eid") int id, @Param("na") String name, @Param("des") String desig,
			@Param("dep") String deptt,@Param("sal") double sal,@Param("doj") LocalDate dateOfjoining)throws SQLIntegrityConstraintViolationException;
	
	
	//JPQL
	@Modifying
	@Transactional
	@Query("update Employee set empSalary=empSalary+:inc where empId=:id")
	int updateSalary(@Param("id") int id,@Param("inc") double increment);
}
