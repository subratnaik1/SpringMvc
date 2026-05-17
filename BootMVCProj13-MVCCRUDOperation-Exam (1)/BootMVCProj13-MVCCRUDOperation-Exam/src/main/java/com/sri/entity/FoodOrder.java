package com.sri.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="food_order_mvc")
@NoArgsConstructor
@RequiredArgsConstructor
public class FoodOrder {

	@Id
	@SequenceGenerator(name="gen1",sequenceName = "seq1",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator="gen1", strategy=GenerationType.SEQUENCE)
	private Integer orderId;
	@NonNull
	private String custName;
	@NonNull
	private String itemName;
	@NonNull
	private Integer quantity;
	@NonNull
	private Double price;
//	@NonNull
//	private Double totalAmt = getPrice()*getQuantity();
	
}
