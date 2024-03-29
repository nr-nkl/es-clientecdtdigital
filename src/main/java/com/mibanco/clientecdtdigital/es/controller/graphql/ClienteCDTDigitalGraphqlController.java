package com.mibanco.clientecdtdigital.es.controller.graphql;

import com.mibanco.clientecdtdigital.es.constant.Constant;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalType;
import com.mibanco.clientecdtdigital.es.service.impl.ClienteCDTDigitalServiceImpl;
import com.mibanco.clientecdtdigital.es.utils.exception.ApplicationException;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Name;
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
    public ClienteCDTDigitalType crearClienteCDTDigital(@Name("cliente") ClienteCDTDigitalType clienteCDTDigitalType) {
        LOG.info("Inicia el proceso crearClienteCDTDigital GraphQL Controller.");
        ClienteCDTDigitalType clienteCDTDigitalTypeCreado = null;
        try{
            clienteCDTDigitalTypeCreado = clienteCDTDigitalServiceImpl.crearClienteCDTDigital(clienteCDTDigitalType);
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO + e.getMessage() + " crearClienteCDTDigital GraphQL Controller.");
        }
        LOG.info("Termina el proceso crearClienteCDTDigital GraphQL Controller.");
        return clienteCDTDigitalTypeCreado;
    }

    @Query("buscarClienteId")
    public ClienteCDTDigitalType buscarClienteCDTDigitalId(@Name("id") Integer idCliente) {
        LOG.info("Inicia el proceso buscarClienteCDTDigitalId GraphQL Controller.");
        ClienteCDTDigitalType clienteCDTDigitalType = null;
        try{
            clienteCDTDigitalType = clienteCDTDigitalServiceImpl.buscarClienteCDTId(idCliente);
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO+e.getMessage()+" buscarClienteCDTPorId GraphQL Controller.");
        }
        LOG.info("Termina el proceso buscarClienteCDTPorId GraphQL Controller.");
        return clienteCDTDigitalType;
    }

    @Query("listarClientes")
    public List<ClienteCDTDigitalType> listarClientesCDTDigital() {
        LOG.info("Inicia el proceso listarClientesCDTDigital GraphQL Controller.");
        List<ClienteCDTDigitalType> clienteCDTDigitalTypeList = null;
        try{
            clienteCDTDigitalTypeList = clienteCDTDigitalServiceImpl.listarClientesCDTDigital();
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO+e.getMessage()+" listarClientesCDTDigital GraphQL Controller.");
        }
        LOG.info("Termina el proceso listarClientesCDTDigital GraphQL Controller.");
        return clienteCDTDigitalTypeList;
    }

    @Mutation("eliminarCliente")
    public void eliminarClienteCDTDigitalId(@Name("id") Integer idCliente) {
        LOG.info("Inicia el proceso eliminarClienteCDTDigitalId GraphQL Controller.");
        try{
            clienteCDTDigitalServiceImpl.eliminarClienteCDTDigitalId(idCliente);
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO+e.getMessage()+" eliminarClienteCDTDigitalId GraphQL Controller.");
        }
        LOG.info("Termina el proceso eliminarClienteCDTDigitalId GraphQL Controller.");
    }

    @Mutation("actualizarCliente")
    public ClienteCDTDigitalType actualizarClienteCDTId(@Name("id")Integer idCliente, ClienteCDTDigitalType clienteCDTDigitalType) {
        LOG.info("Inicia el proceso actualizarClienteCDTId GraphQL Controller.");
        ClienteCDTDigitalType clienteCDTDigitalTypeActualizado = null;
        try{
            clienteCDTDigitalTypeActualizado = clienteCDTDigitalServiceImpl.actualizarClienteCDTId(idCliente, clienteCDTDigitalType);
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO+e.getMessage()+" actualizarClienteCDTId GraphQL Controller.");
        }
        LOG.info("Termina el proceso actualizarClienteCDTId GraphQL Controller.");
        return clienteCDTDigitalTypeActualizado;
    }


}
