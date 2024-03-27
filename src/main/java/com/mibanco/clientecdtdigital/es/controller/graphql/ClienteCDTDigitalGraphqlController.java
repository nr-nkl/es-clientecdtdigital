package com.mibanco.clientecdtdigital.es.controller.graphql;

import com.mibanco.clientecdtdigital.es.constant.Constant;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalType;
import com.mibanco.clientecdtdigital.es.service.impl.ClienteCDTDigitalServiceImpl;
import com.mibanco.clientecdtdigital.es.utils.exception.ApplicationException;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@GraphQLApi
public class ClienteCDTDigitalGraphqlController {
    private static final Logger LOG = LoggerFactory.getLogger(ClienteCDTDigitalGraphqlController.class);
    @Inject
    ClienteCDTDigitalServiceImpl clienteCDTDigitalServiceImpl;

    @Mutation("crearCliente")
//    @Transactional
    public Response crearClienteCDTDigital(ClienteCDTDigitalType clienteCDTDigitalType) {
        LOG.info("Inicia el proceso crearClienteCDTDigital GraphQL Controller.");
        try{
            clienteCDTDigitalServiceImpl.crearClienteCDTDigital(clienteCDTDigitalType);
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO + e.getMessage() + " crearClienteCDTDigital GraphQL Controller.");
            return Response.status(Response.Status.BAD_REQUEST).entity(clienteCDTDigitalType).build();
        }
        LOG.info("Termina el proceso crearClienteCDTDigital GraphQL Controller.");
        return  Response.status(Response.Status.CREATED).entity(clienteCDTDigitalType).build();
    }

    @Query("buscarClienteId")
    public Response buscarClienteCDTDigitalId(Integer idCliente) {
        LOG.info("Inicia el proceso buscarClienteCDTDigitalId GraphQL Controller.");
        ClienteCDTDigitalType clienteCDTDigitalType = null;
        try{
            clienteCDTDigitalType = clienteCDTDigitalServiceImpl.buscarClienteCDTId(idCliente);
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO+e.getMessage()+" buscarClienteCDTPorId GraphQL Controller.");
            return Response.status(Response.Status.BAD_REQUEST).entity(clienteCDTDigitalType).build();
        }
        LOG.info("Termina el proceso buscarClienteCDTPorId GraphQL Controller.");
        return Response.status(Response.Status.FOUND).entity(clienteCDTDigitalType).build();
    }

    @Query("listarClientes")
    public Response listarClientesCDTDigital() {
        LOG.info("Inicia el proceso listarClientesCDTDigital GraphQL Controller.");
        List<ClienteCDTDigitalType> clienteCDTDigitalTypeList = null;
        try{
            clienteCDTDigitalTypeList = clienteCDTDigitalServiceImpl.listarClientesCDTDigital();
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO+e.getMessage()+" listarClientesCDTDigital GraphQL Controller.");
            return Response.status(Response.Status.BAD_REQUEST).entity(clienteCDTDigitalTypeList).build();
        }
        LOG.info("Termina el proceso listarClientesCDTDigital GraphQL Controller.");
        return Response.status(Response.Status.FOUND).entity(clienteCDTDigitalTypeList).build();
    }

    @Mutation("eliminarCliente")
//    @Transactional
    public Response eliminarClienteCDTDigitalId(Integer idCliente) {
        LOG.info("Inicia el proceso eliminarClienteCDTDigitalId GraphQL Controller.");
        try{
            clienteCDTDigitalServiceImpl.eliminarClienteCDTDigitalId(idCliente);
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO+e.getMessage()+" eliminarClienteCDTDigitalId GraphQL Controller.");
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        LOG.info("Termina el proceso eliminarClienteCDTDigitalId GraphQL Controller.");
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @Mutation("actualizarCliente")
//    @Transactional
    public Response actualizarClienteCDTId(Integer idCliente, ClienteCDTDigitalType clienteCDTDigitalType) {
        LOG.info("Inicia el proceso actualizarClienteCDTId GraphQL Controller.");
        try{
            clienteCDTDigitalServiceImpl.actualizarClienteCDTId(idCliente, clienteCDTDigitalType);
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO+e.getMessage()+" actualizarClienteCDTId GraphQL Controller.");
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        LOG.info("Termina el proceso actualizarClienteCDTId GraphQL Controller.");
        return Response.status(Response.Status.OK).build();
    }
}
