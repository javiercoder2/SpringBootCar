package com.proyecto2.proyecto2.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto2.proyecto2.model.BuySell;
import com.proyecto2.proyecto2.service.BuySellService;

@RestController
@CrossOrigin("*")
public class BuySellController {
    
 
        private BuySellService buySellService;
    
        public BuySellController(@Autowired BuySellService buySellService) {
            this.buySellService = buySellService;
        }

        @PostMapping("/BuySell/save")
        public void guardarBuySell(@RequestBody BuySell buySell) {
            System.out.println(buySell.toString());
            buySellService.saveBuySell(buySell);
    
        }
        @PutMapping("/BuySell/update")
        public void actualizarBuySell(@RequestBody BuySell buySell) {
            buySellService.updateBuySell(buySell);
        }
        @GetMapping("/BuySell/findall")
        public Iterable<BuySell> todoslosBuySell() {
            return buySellService.findAll();
        }
        @GetMapping("/BuySell/buscarBuySell/{monto}")
        public Iterable<BuySell> buscarMonto(@PathVariable int monto) {
            return buySellService.buscarPorBuySell(monto);
        }
        @GetMapping("/BuySell/buscarFechacompra/{fechaCompra}")
        public List<BuySell> buscarClase(@PathVariable Date fechaCompra) {
            return buySellService.buscarPorFecha(fechaCompra);
        }
        @GetMapping("/BuySell/buscarMontoFechacompra/{monto}{fechaCompra}")
        public List<BuySell> PatenteNumeroClase(@RequestBody int monto, Date fechaCompra) {
            return buySellService.buscarPorMontoFecha(monto, fechaCompra);
        }

        @DeleteMapping("/BuySell/eliminarBuySell/{id}")
        public void eliminarBuySell(@PathVariable Integer id) {
    
        }
}


