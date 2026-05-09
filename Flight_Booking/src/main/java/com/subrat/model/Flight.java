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
public class Flight {
	@NonNull
	private String pname;
	@NonNull
	private int flightId;
	@NonNull
	private int noOfTickets;
	@NonNull
	private int paybleAmt;
	private int airfare;
	private int finalAmt;
}
