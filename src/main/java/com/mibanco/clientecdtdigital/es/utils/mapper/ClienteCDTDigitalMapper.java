package com.mibanco.clientecdtdigital.es.utils.mapper;

import com.mibanco.clientecdtdigital.es.entity.ClienteCDTDigital;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalType;
import com.mibanco.clientecdtdigital.es.service.contract.IClienteCDTDigitalService;
import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ClienteCDTDigitalMapper {
    public ClienteCDTDigital clienteCDTTypeToEntity(ClienteCDTDigitalType clienteCDTDigitalType){
        return new ModelMapper().map(clienteCDTDigitalType, ClienteCDTDigital.class);
    }

    public ClienteCDTDigitalType entityToClienteCDTType(ClienteCDTDigital clienteCDTDigital){
        return new ModelMapper().map(clienteCDTDigital, ClienteCDTDigitalType.class);
    }

    public List<ClienteCDTDigitalType> clienteCDTListEntityToType(List<ClienteCDTDigital> clientesCDTDigitalList ){
        List<ClienteCDTDigitalType> cdtDigitalTypeList = new ArrayList<>();
        for (ClienteCDTDigital clienteCDTDigital: clientesCDTDigitalList){
            ClienteCDTDigitalType response = new ModelMapper().map(clienteCDTDigital, ClienteCDTDigitalType.class);
            cdtDigitalTypeList.add(response);
        }
        return cdtDigitalTypeList;
    }
}
