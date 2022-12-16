package com.proyecto2.proyecto2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.proyecto2.proyecto2.model.License;

public interface LicenseRepository extends CrudRepository <License, Integer> {

    @Query(value ="Select * From License where numero = ?1", nativeQuery = true)
    List<License> findAllLicensiaNumero(int numero);

    @Query(value ="Select * From License where clase = ?1", nativeQuery = true)
    List<License> findAllLicensiaClase(String clase);

    @Query(value ="Select * From License where numero = ?1 AND clase = ?2", nativeQuery = true)
    List<License> findAllLicensiaClase(int numero, String clase);
    
    @Query(value ="Select *From license l Join l.carsell lcs", nativeQuery = true)
    List<License> buscarAutosVentidosPatentes();
}


