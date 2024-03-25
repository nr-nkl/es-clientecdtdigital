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

import java.util.List;

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


    @Override
    public Response buscarClienteCDTDigitalId(Integer idCliente) {
        LOG.info("Inicia el proceso buscarClienteCDTDigitalId Controller.");
        ClienteCDTDigitalType clienteCDTDigitalType = null;
        try{
            clienteCDTDigitalType = clienteCDTDigitalServiceImpl.buscarClienteCDTId(idCliente);
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO+e.getMessage()+" buscarClienteCDTPorId Controller.");
            return Response.status(Response.Status.BAD_REQUEST).entity(clienteCDTDigitalType).build();
        }
        LOG.info("Termina el proceso buscarClienteCDTPorId Controller");
        return Response.status(Response.Status.FOUND).entity(clienteCDTDigitalType).build();
    }

    @Override
    public Response listarClientesCDTDigital() {
        LOG.info("Inicia el proceso listarClientesCDTDigital Controller.");
        List<ClienteCDTDigitalType> clienteCDTDigitalTypeList = null;
        try{
            clienteCDTDigitalTypeList = clienteCDTDigitalServiceImpl.listarClientesCDTDigital();
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO+e.getMessage()+" listarClientesCDTDigital Controller.");
            return Response.status(Response.Status.BAD_REQUEST).entity(clienteCDTDigitalTypeList).build();
        }
        LOG.info("Termina el proceso listarClientesCDTDigital Controller");
        return Response.status(Response.Status.FOUND).entity(clienteCDTDigitalTypeList).build();
    }

    @Override
    public Response eliminarClienteCDTDigitalId(Integer idCliente) {
        LOG.info("Inicia el proceso eliminarClienteCDTDigitalId Controller.");
        try{
            clienteCDTDigitalServiceImpl.eliminarClienteCDTDigitalId(idCliente);
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO+e.getMessage()+" eliminarClienteCDTDigitalId Controller.");
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        LOG.info("Termina el proceso eliminarClienteCDTDigitalId Controller");
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @Override
    public Response actualizarClienteCDTId(Integer idCliente, ClienteCDTDigitalType clienteCDTDigitalType) {
        LOG.info("Inicia el proceso actualizarClienteCDTId Controller.");
        try{
            clienteCDTDigitalServiceImpl.actualizarClienteCDTId(idCliente, clienteCDTDigitalType);
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO+e.getMessage()+" actualizarClienteCDTId Controller.");
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        LOG.info("Termina el proceso actualizarClienteCDTId Controller");
        return Response.status(Response.Status.OK).build();
    }
}
