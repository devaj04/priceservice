package com.trigyn.priceservice.repo;

import com.trigyn.priceservice.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepo extends JpaRepository<Price,Integer> {
}
