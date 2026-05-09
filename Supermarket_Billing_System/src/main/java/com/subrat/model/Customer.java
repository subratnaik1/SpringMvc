package com.subrat.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Customer {
	@NonNull
	private String custName;
	@NonNull
	private String prodName;
	@NonNull
	private int prodQuantity;
	@NonNull
	private int prodPrice;
	private Double prodGST;
	private Double discount;
	private int subTotal;
	private Double finalBillAmt;
}
