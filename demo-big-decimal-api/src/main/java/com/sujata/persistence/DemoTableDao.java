package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sujata.entity.DemoTable;

public interface DemoTableDao extends JpaRepository<DemoTable, Integer> {

}
