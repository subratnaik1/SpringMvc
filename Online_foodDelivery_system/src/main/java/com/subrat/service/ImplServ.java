package com.subrat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.entity.FoodOrder;
import com.subrat.repositary.FoodOrdrRepo;
@Service
public class ImplServ implements Iserv {
	@Autowired
	private FoodOrdrRepo repo;

	@Override
	public List<FoodOrder> viewOrders() {
		List<FoodOrder> all = repo.findAll();
		return all;
	}

	@Override
	public String addOrder(FoodOrder fo) {
		FoodOrder save = repo.save(fo);
		return "food order saved with id : "+save.getOrderId();
	}

	@Override
	public FoodOrder getOrderById(Long id) {
		Optional<FoodOrder> byId = repo.findById(id);
		if(byId.isEmpty()) {
			throw new RuntimeException("invalid id");
		}
		return byId.get();
	}

	@Override
	public String updateOrder(FoodOrder fo) {
		FoodOrder save = repo.save(fo);
		return "order with id : "+save.getOrderId()+" successfully updated";
	}

	@Override
	public String deleteOrder(Long id) {
		FoodOrder fo = repo.findById(id).orElseThrow(()-> new RuntimeException("Id not found"));
		repo.delete(fo);
		return "Employee with id : "+fo.getOrderId()+" deleted successfully";
	}
	
}
