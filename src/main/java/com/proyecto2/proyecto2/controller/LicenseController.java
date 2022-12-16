package com.proyecto2.proyecto2.controller;

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

import com.proyecto2.proyecto2.model.License;
import com.proyecto2.proyecto2.service.LicenseService;

@RestController
@CrossOrigin("*")
public class LicenseController {
    private LicenseService licenseService;

    public LicenseController(@Autowired LicenseService licenseService) {
        this.licenseService = licenseService;
    }

    @PostMapping("/License/save")
    public void guardarLicensia(@RequestBody License license) {
        System.out.println(license.toString());
        licenseService.saveLicense(license);

    }

    @PutMapping("/License/update")
    public void actualizarAuto(@RequestBody License license) {
        licenseService.updateLicense(license);
    }

    @GetMapping("/License/findall")
    public Iterable<License> todasLasLicencias() {
        return licenseService.findAll();
    }

    @GetMapping("/License/buscarLicensia/{numero}")
    public Iterable<License> buscarPatente(@PathVariable int numero) {
        return licenseService.buscarPorLicensia(numero);
    }

    @GetMapping("/License/buscarClase/{clase}")
    public List<License> buscarClase(@PathVariable String clase) {
        return licenseService.buscarPorClase(clase);
    }

    @GetMapping("/License/buscarNumeroClase")
    public List<License> PatenteNumeroClase(@RequestBody int numero, String clase) {
        return licenseService.buscarPorNumeroClase(numero, clase);
    }

    @DeleteMapping("/License/eliminarLicense/{id}")
    public void eliminarLicense(@PathVariable Integer id) {

    }
}
