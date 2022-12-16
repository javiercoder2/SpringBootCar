package com.proyecto2.proyecto2.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.proyecto2.proyecto2.model.License;
import com.proyecto2.proyecto2.repository.LicenseRepository;

@Service
public class LicenseService {
    private LicenseRepository licenseRepository;

    public LicenseService(LicenseRepository licenseRepository) {
        this.licenseRepository = licenseRepository;
    }

    public void saveLicense(License license) {
        licenseRepository.save(license);
    }

    public void updateLicense(License license) {

        licenseRepository.save(license);
    }

    public Iterable<License> findAll() {
        return licenseRepository.findAll();
    }

    public Iterable<License> buscarPorLicensia(int numero) {
        return licenseRepository.findAllLicensiaNumero(numero);
    }

    public List<License> buscarPorClase(String clase) {
        return licenseRepository.findAllLicensiaClase(clase);
    }

    public List<License> buscarPorNumeroClase(int numero, String clase) {
        return licenseRepository.findAllLicensiaClase(numero, clase);
    }

    public void eliminarLicensia(Integer id) {
        licenseRepository.deleteById(id);
    }

}