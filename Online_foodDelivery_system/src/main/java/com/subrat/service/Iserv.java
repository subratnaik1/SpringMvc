package com.subrat.service;

import java.util.List;

import com.subrat.entity.FoodOrder;

public interface Iserv {
	List<FoodOrder> viewOrders();
	String addOrder(FoodOrder fo);
	FoodOrder getOrderById(Long id);
	String updateOrder(FoodOrder fo);
	String deleteOrder(Long id);
}
