package com.sujata.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
public class DemoTable {

	@Id
	int id;
	@JsonFormat(shape = Shape.STRING)
	BigDecimal balance;
}
