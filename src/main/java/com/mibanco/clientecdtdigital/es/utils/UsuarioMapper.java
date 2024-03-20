package com.mibanco.clientecdtdigital.es.utils;

import com.mibanco.clientecdtdigital.es.entity.ClienteCDTDigital;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalType;
import org.modelmapper.ModelMapper;

public class UsuarioMapper {
    public ClienteCDTDigital clienteCdtTypeToEntity(ClienteCDTDigitalType clienteCDTDigitalType){
        return new ModelMapper().map(clienteCDTDigitalType, ClienteCDTDigital.class);
    }
}
