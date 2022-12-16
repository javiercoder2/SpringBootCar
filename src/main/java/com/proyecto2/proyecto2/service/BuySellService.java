package com.proyecto2.proyecto2.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto2.proyecto2.model.BuySell;
import com.proyecto2.proyecto2.repository.BuySellRepository;

@Service
public class BuySellService {

    private BuySellRepository buySellRepository;

    public BuySellService(BuySellRepository buySellRepository) {
        this.buySellRepository = buySellRepository;
    }

    public void saveBuySell(BuySell buySell) {
        buySellRepository.save(buySell);
    }

    public void updateBuySell(BuySell buySell) {

        buySellRepository.save(buySell);
    }

    public Iterable<BuySell> findAll() {
        return buySellRepository.findAll();
    }

    public Iterable<BuySell> buscarPorBuySell(int monto) {
        return buySellRepository.findAllAutoMonto(monto);
    }

    public List<BuySell> buscarPorFecha(Date fechaCompra) {
        return buySellRepository.findAllAutoFecha(fechaCompra);
    }

    public List<BuySell> buscarPorMontoFecha(int monto, Date fechaCompra) {
        return buySellRepository.findAllAutoMontoFecha(monto, fechaCompra);
    }

    public void eliminarBuySell(Integer id) {
        buySellRepository.deleteById(id);
    }

}
