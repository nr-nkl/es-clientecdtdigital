package com.mibanco.clientecdtdigital.es.service.impl;

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
            LOG.info("Termina crearClienteCDTDigital Impl.");
            return clienteCDTDigitalType;
        }catch (ApplicationException e){
            Log.error(ERROR_SERVICIO + e.getMessage() + " crearClienteCDTDigital Impl.");
            throw new ApplicationException(ERROR_SERVICIO+ e.getMessage() + " crearClienteCDTDigital Impl.");
        }
    }
}
