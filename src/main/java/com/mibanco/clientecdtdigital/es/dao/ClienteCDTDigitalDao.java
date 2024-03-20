package com.mibanco.clientecdtdigital.es.dao;

import com.mibanco.clientecdtdigital.es.entity.ClienteCDTDigital;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ClienteCDTDigitalDao implements PanacheRepository<ClienteCDTDigital> {
}
