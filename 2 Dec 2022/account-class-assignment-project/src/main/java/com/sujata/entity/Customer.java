package com.sujata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Account")
public class Customer {

	@Id
	private int accountId;
	private String customerName;
	@Column(name="password")
	private String customerPassword;
	@Column(name="address")
	private String customerAddress;
	@Column(name="phoneNumber")
	private String customerPhoneNumber;
	@Column(name="balance")
	private double customerBalance;
	
}
