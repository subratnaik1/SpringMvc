package com.subrat.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.FoodOrder;

public interface FoodOrdrRepo extends JpaRepository<FoodOrder, Long> {

}
