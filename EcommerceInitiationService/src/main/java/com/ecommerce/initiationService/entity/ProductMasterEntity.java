package com.ecommerce.initiationService.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.hibernate.envers.Audited;
//import org.hibernate.envers.AuditTable;


@Entity
@Table(name = "mst_product_master") // Specify the table name here
//@Audited
//@AuditTable("mst_product_master_hist")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProductMasterEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long Id;
	String productCode;
	String productName;
	String productDescription;
	String status;
	String createdBy;
	Timestamp createdOn;
	String updatedBy;
	Timestamp updatedOn;
}
