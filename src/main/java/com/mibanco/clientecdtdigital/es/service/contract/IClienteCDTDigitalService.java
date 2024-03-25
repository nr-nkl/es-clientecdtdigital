package com.mibanco.clientecdtdigital.es.service.contract;

import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalType;

import java.util.List;

public interface IClienteCDTDigitalService {
    ClienteCDTDigitalType crearClienteCDTDigital(ClienteCDTDigitalType clienteCDTDigitalType);

    ClienteCDTDigitalType buscarClienteCDTId(Integer idCliente);

    List<ClienteCDTDigitalType> listarClientesCDTDigital();

    void eliminarClienteCDTDigitalId(Integer idCliente);

    ClienteCDTDigitalType actualizarClienteCDTId(Integer idCliente, ClienteCDTDigitalType clienteCDTDigitalType);
}
