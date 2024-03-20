package com.mibanco.clientecdtdigital.es.controller;

import com.mibanco.clientecdtdigital.es.gen.contract.V1ClientecdtdigitalApi;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalType;
import com.mibanco.clientecdtdigital.es.service.impl.ClienteCDTDigitalServiceImpl;
import com.mibanco.clientecdtdigital.es.utils.exception.ApplicationException;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mibanco.clientecdtdigital.es.constant.Constant;

public class ClienteCDTDigitalController implements V1ClientecdtdigitalApi {
    public static final Logger LOG = LoggerFactory.getLogger(ClienteCDTDigitalController.class);

    @Inject
    ClienteCDTDigitalServiceImpl clienteCDTDigitalServiceImpl;

    @Override
    public Response crearClienteCDTDigital(ClienteCDTDigitalType clienteCDTDigitalType) {
        LOG.info("Inicia el proceso crearClienteCDTDigital Controller");
        try{
            clienteCDTDigitalServiceImpl.crearClienteCDTDigital(clienteCDTDigitalType);
            LOG.info("Termina el proceso crearClienteCDTDigital Controller");
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO + e.getMessage() + "crearClienteCDTDigital Controller");
            return Response.status(Response.Status.BAD_REQUEST).entity(clienteCDTDigitalType).build();
        }
        return  Response.status(Response.Status.CREATED).entity(clienteCDTDigitalType).build();
    }
}
