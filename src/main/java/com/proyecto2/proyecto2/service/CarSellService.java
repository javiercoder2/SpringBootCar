package com.proyecto2.proyecto2.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.proyecto2.proyecto2.model.CarSell;
import com.proyecto2.proyecto2.repository.CarSellRepository;

@Service
@Transactional

public class CarSellService {

    private CarSellRepository carSellRepository;

    public CarSellService(CarSellRepository carSellRepository) {
    
    this.carSellRepository = carSellRepository;
    }

    public void saveCarSell(CarSell carSell){
        carSellRepository.save(carSell);
    }

    public void eliminarCarSell(Integer id){
        carSellRepository.deleteById(id);
    }
    public List <CarSell> buscarPorCantidad(int cantidad){
        return carSellRepository.findAllCarSell(cantidad);
    }
    public Iterable<CarSell> findAll() {
        return carSellRepository.findAll();
    }
    
    public void updateCarSell(CarSell carSell) {
        carSellRepository.save(carSell);
    }


}
