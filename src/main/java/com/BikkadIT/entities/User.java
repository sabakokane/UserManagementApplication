package com.BikkadIT.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "USER_ACCOUNTS")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name= "USER_FIRST_NAME")
	private String fname;
	
	@Column(name= "USER_LAST_NAME")
	private String lname;
	
	@Column(name= "USER_MAIL")
	private String mail;
	
	@Column(name= "USER_PHONE")
	private Long userPhone;
	
	@Column(name= "USER_DOB")
	private Date userDOB;
	
	@Column(name= "GENDER")
	private String userGender;

	@Column(name= "COUNTRY")
	private String userCountry;
	
	@Column(name= "STATE")
	private String userState;
	
	@Column(name= "CITY")
	private String userCity;

	@Column(name= "USER_PASSWORD")
	private String password;
	
	@Column(name="ACTICE_SW")
	private Character activeSwitch;
	
	@CreationTimestamp
	@Column(name="CREATED_DATE",updatable = false)
	private LocalDate createdDate;
	
	@UpdateTimestamp
	@Column(name ="UPDATED_DATE",insertable = false)
	private LocalDate updatedDate;
	

}
