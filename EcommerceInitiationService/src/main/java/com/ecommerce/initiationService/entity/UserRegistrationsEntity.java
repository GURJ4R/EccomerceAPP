package com.ecommerce.initiationService.entity;


import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "UserRegistrations") // Specify the table name here
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationsEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long registrationId;
	String applicationNumber;
	String username;
	String userpassword;
	String createdBy;
	Timestamp createdOn;
}
