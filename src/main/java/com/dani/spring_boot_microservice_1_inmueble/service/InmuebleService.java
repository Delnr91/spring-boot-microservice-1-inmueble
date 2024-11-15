package com.dani.spring_boot_microservice_1_inmueble.service;

import com.dani.spring_boot_microservice_1_inmueble.model.Inmueble;

import java.util.List;


public interface InmuebleService {

    Inmueble saveInmueble(Inmueble inmueble);

    void deleteInmuble(Long inmuebleId);

    List<Inmueble> findAllInmuebles();
}
