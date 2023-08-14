package com.trigyn.priceservice.service;



import com.trigyn.priceservice.model.Price;
import com.trigyn.priceservice.repo.PriceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;


@Service

public class PriceService {

    List<Price> priceList = new ArrayList<>();
    @Autowired
    private PriceRepo pricerepo;

    public Boolean addPriceList(Price price){

        pricerepo.save(price);
        return true;

    }


    public List<Price> getPriceList(){

        return pricerepo.findAll();

    }

}




