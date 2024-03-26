package com.mibanco.clientecdtdigital.es.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.mibanco.clientecdtdigital.es.constant.Constant;
import com.mibanco.clientecdtdigital.es.dao.ClienteCDTDigitalDao;
import com.mibanco.clientecdtdigital.es.entity.ClienteCDTDigital;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalType;
import com.mibanco.clientecdtdigital.es.service.contract.IClienteCDTDigitalService;
import com.mibanco.clientecdtdigital.es.utils.exception.ApplicationException;
import com.mibanco.clientecdtdigital.es.utils.mapper.ClienteCDTDigitalMapper;
import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import static com.mibanco.clientecdtdigital.es.constant.Constant.ERROR_SERVICIO;

@ApplicationScoped
public class ClienteCDTDigitalServiceImpl implements IClienteCDTDigitalService {

    private static final Logger LOG = LoggerFactory.getLogger(ClienteCDTDigitalServiceImpl.class);

    @Inject
    ClienteCDTDigitalMapper clienteCDTDigitalMapper;

    @Inject
    ClienteCDTDigitalDao clienteCDTDigitalDao;

    @Transactional
    public ClienteCDTDigitalType crearClienteCDTDigital(ClienteCDTDigitalType clienteCDTDigitalType) {
        LOG.info("Inicia crearClienteCDTDigital Impl.");
        try{
            ClienteCDTDigital clienteCDTDigital = clienteCDTDigitalMapper.clienteCDTTypeToEntity(clienteCDTDigitalType);
            clienteCDTDigitalDao.persist(clienteCDTDigital);
        }catch (ApplicationException e){
            Log.error(ERROR_SERVICIO + e.getMessage() + " crearClienteCDTDigital Impl.");
            throw new ApplicationException(ERROR_SERVICIO+ e.getMessage() + " crearClienteCDTDigital Impl.");
        }
        LOG.info("Termina crearClienteCDTDigital Impl.");
        return clienteCDTDigitalType;
    }

    @Override
    public ClienteCDTDigitalType buscarClienteCDTId(Integer idCliente) {
        LOG.info("Inicia el proceso buscarClienteCDTId Impl.");
        ClienteCDTDigitalType clienteCDTDigitalType = null;
        try{
            ClienteCDTDigital clienteCDTDigital = clienteCDTDigitalDao.findById(idCliente.longValue());
            clienteCDTDigitalType = clienteCDTDigitalMapper.entityToClienteCDTType(clienteCDTDigital);
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO+e.getMessage()+" buscarClienteCDTId Impl.");
            throw new ApplicationException(Constant.ERROR_SERVICIO+e.getMessage()+" buscarClienteCDTId Impl.");
        }
        LOG.info("Termina el proceso buscarClienteCDTId Impl");
        return  clienteCDTDigitalType;
    }

    @Override
    public List<ClienteCDTDigitalType> listarClientesCDTDigital() {
        LOG.info("Inicia el proceso listarClientesCDTDigital Impl.");
        List<ClienteCDTDigitalType> clienteCDTDigitalType = null;
        try{
            List<ClienteCDTDigital> clienteCDTDigitalList = clienteCDTDigitalDao.findAll().list();
            clienteCDTDigitalType = clienteCDTDigitalMapper.clienteCDTListEntityToType(clienteCDTDigitalList);
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO+e.getMessage()+" listarClientesCDTDigital Impl.");
            throw new ApplicationException(Constant.ERROR_SERVICIO+e.getMessage()+" listarClientesCDTDigital Impl.");
        }
        LOG.info("Termina el proceso listarClientesCDTDigital Impl");
        return  clienteCDTDigitalType;
    }

    @Transactional
    public void eliminarClienteCDTDigitalId(Integer idCliente) {
        LOG.info("Inicia el proceso eliminarClienteCDTDigitalId Impl.");
        try{
            clienteCDTDigitalDao.deleteById(idCliente.longValue());
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO+e.getMessage()+" eliminarClienteCDTDigitalId Impl.");
            throw new ApplicationException(Constant.ERROR_SERVICIO+e.getMessage()+" eliminarClienteCDTDigitalId Impl.");
        }
        LOG.info("Termina el proceso eliminarClienteCDTDigitalId Impl");
    }

    @Transactional
    public ClienteCDTDigitalType actualizarClienteCDTId(Integer idCliente, ClienteCDTDigitalType clienteCDTDigitalType) {
        LOG.info("Inicia el proceso actualizarClienteCDTId Impl.");
        try{
            ClienteCDTDigital clienteCDTDigitalAnt = clienteCDTDigitalDao.findById(idCliente.longValue());
            ClienteCDTDigital clienteCDTDigitalNuevo = clienteCDTDigitalMapper.clienteCDTTypeToEntity(clienteCDTDigitalType);

            clienteCDTDigitalAnt.setAgenciaVinculacion(clienteCDTDigitalNuevo.getAgenciaVinculacion());
            clienteCDTDigitalAnt.setAgenciaVinculacion(clienteCDTDigitalNuevo.getAgenciaVinculacion());
            clienteCDTDigitalAnt.setTipoTelefonoPrincipal(clienteCDTDigitalNuevo.getTipoTelefonoPrincipal());
            clienteCDTDigitalAnt.setTelefonoPrincipal(clienteCDTDigitalNuevo.getTelefonoPrincipal());
            clienteCDTDigitalAnt.setTipoCorreoElectronico(clienteCDTDigitalNuevo.getTipoCorreoElectronico());
            clienteCDTDigitalAnt.setGenero(clienteCDTDigitalNuevo.getGenero());
            clienteCDTDigitalAnt.setFechaNacimientoDia(clienteCDTDigitalNuevo.getFechaNacimientoDia());
            clienteCDTDigitalAnt.setFechaNacimientoMes(clienteCDTDigitalNuevo.getFechaNacimientoMes());
            clienteCDTDigitalAnt.setFechaNacimientoAno(clienteCDTDigitalNuevo.getFechaNacimientoAno());
            clienteCDTDigitalAnt.setLugarNacimientoPais(clienteCDTDigitalNuevo.getLugarNacimientoPais());
            clienteCDTDigitalAnt.setLugarNacimientoDpto(clienteCDTDigitalNuevo.getLugarNacimientoDpto());
            clienteCDTDigitalAnt.setLugarNacimientoCiudad(clienteCDTDigitalNuevo.getLugarNacimientoCiudad());
            clienteCDTDigitalAnt.setNacionalidad(clienteCDTDigitalNuevo.getNacionalidad());
            clienteCDTDigitalAnt.setNivelConsulta(clienteCDTDigitalNuevo.getNivelConsulta());
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO+e.getMessage()+" actualizarClienteCDTId Impl.");
            throw new ApplicationException(Constant.ERROR_SERVICIO+e.getMessage()+" actualizarClienteCDTId Impl.");
        }
        LOG.info("Termina el proceso actualizarClienteCDTId Impl");
        return clienteCDTDigitalType;
    }
}
