package com.subrat.entity;

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
@Table(name="foodOrder")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class FoodOrder {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "mvc1",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
	private Long orderId;
	@NonNull
	private String customerName;
	@NonNull
	private String itemName;
	@NonNull
	private Integer quantity;
	@NonNull
	private Integer price;
	@NonNull
	private Integer totalAmount;
}
