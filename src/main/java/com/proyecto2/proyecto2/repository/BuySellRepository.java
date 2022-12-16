package com.proyecto2.proyecto2.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.proyecto2.proyecto2.model.BuySell;

public interface BuySellRepository extends CrudRepository <BuySell, Integer> {
    
 
        @Query(value ="Select * From BuySell where monto = ?1", nativeQuery = true)
        List<BuySell> findAllAutoMonto(int monto);
    
        @Query(value ="Select * From BuySell where fechaCompra = ?1", nativeQuery = true)
        List<BuySell> findAllAutoFecha(Date fechaCompra);
    
        @Query(value ="Select * From BuySell where monto = ?1 AND fechaCompra = ?2", nativeQuery = true)
        List<BuySell> findAllAutoMontoFecha(int monto, Date fechaCompra);
        
        @Query(value ="Select *From buySell b Join a.buySell cs", nativeQuery = true)
        List<BuySell> buscarAutosComprados();
    }

