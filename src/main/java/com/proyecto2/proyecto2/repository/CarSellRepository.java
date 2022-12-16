package com.proyecto2.proyecto2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.proyecto2.proyecto2.model.CarSell;

public interface CarSellRepository extends CrudRepository <CarSell, Integer> {
    
    @Query(value ="Select * From CarSell where cantidad = ?1", nativeQuery = true)
    List<CarSell> findAllCarSell(int cantidad);

    @Query(value ="Select *From carsell c Join a.carsell cs", nativeQuery = true)
    List<CarSell> buscarAutosVendidos();
}
