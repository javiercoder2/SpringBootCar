package com.proyecto2.proyecto2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto2.proyecto2.model.CarSell;
import com.proyecto2.proyecto2.service.CarSellService;

@RestController
@CrossOrigin("*")

public class CarSellController {
    
private CarSellService carSellService;
public CarSellController(@Autowired CarSellService carSellService){
    this.carSellService = carSellService;
}
    
    @GetMapping("/CarSell/save")
    public void guardarAutoSell(@RequestBody CarSell carSell){
    carSellService.saveCarSell(carSell);
        }

        @PutMapping("/CarSell/update")
        public void updateCarSell(@RequestBody CarSell carSell){
            carSellService.updateCarSell(carSell);
        }

        @GetMapping("/CarSell/buscarCantidad/{cantidad}")
        public List <CarSell>buscarCantidad(@PathVariable int cantidad){
            return carSellService.buscarPorCantidad(cantidad);
        }

        @DeleteMapping("/CarSell/eliminarAutoSell/{id}")
        public void eliminarAutoSell(@PathVariable Integer id){
    
        }
}
