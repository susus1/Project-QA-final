package com.instagram.com.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//mark class as an Entity
@Entity
//defining class name as Table name
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Followers implements Serializable{
	
//Defining followers id as primary key

private static final long serialVersionUID = 1L;

@Id
@Column
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;

@Column(name="age_followers")
private Integer age;
@Column(name="name_followers")
private String name;
@Column(name="country_followers")
private String country;
@Column(name="email_followers")
private String email;
@Column(name="gender_followers")
private String gender;

}
