package com.proyecto2.proyecto2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.proyecto2.proyecto2.model.Car;

public interface CarRepository extends CrudRepository <Car,Integer> {

    @Query(value ="Select * From Car where marca = ?1", nativeQuery = true)
    List<Car> findAllAutoMarca(String marca);

    @Query(value ="Select * From Car where color = ?1", nativeQuery = true)
    List<Car> findAllAutoColor(String color);

    @Query(value ="Select * From Car where marca = ?1 AND marca = ?2", nativeQuery = true)
    List<Car> findAllAutoColorMarca(String color, String marca);
    
    @Query(value ="Select *From car c Join a.carsell cs", nativeQuery = true)
    List<Car> buscarAutosVendidos();
}
