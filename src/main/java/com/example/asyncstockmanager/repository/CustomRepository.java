package com.example.asyncstockmanager.repository;

import com.example.asyncstockmanager.entity.Company;
import com.example.asyncstockmanager.entity.Stock;
import reactor.core.publisher.Flux;

import java.util.List;

public interface CustomRepository {

    void saveCompanies(List<Company> companies);

    void saveStocks(List<Stock> stocks);

    Flux<String> getCompanies();
}
