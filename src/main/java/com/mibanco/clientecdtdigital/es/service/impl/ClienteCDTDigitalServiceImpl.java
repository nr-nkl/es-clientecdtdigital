package com.mibanco.clientecdtdigital.es.service.impl;

import com.mibanco.clientecdtdigital.es.dao.ClienteCDTDigitalDao;
import com.mibanco.clientecdtdigital.es.entity.ClienteCDTDigital;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalType;
import com.mibanco.clientecdtdigital.es.service.contract.IClienteCDTDigitalService;
import com.mibanco.clientecdtdigital.es.utils.exception.ApplicationException;
import com.mibanco.clientecdtdigital.es.utils.mapper.ClienteCdtDigitalMapper;
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
    ClienteCdtDigitalMapper clienteCdtDigitalMapper;

    @Inject
    ClienteCDTDigitalDao clienteCDTDigitalDao;

    @Transactional
    public ClienteCDTDigitalType crearClienteCdtDigital(ClienteCDTDigitalType clienteCDTDigitalType) {
        LOG.info("Inicia crearClienteCdtDigital Impl.");
        try{
            ClienteCDTDigital clienteCDTDigital = clienteCdtDigitalMapper.clienteCdtTypeToEntity(clienteCDTDigitalType);
            clienteCDTDigitalDao.persist(clienteCDTDigital);
            LOG.info("Termina crearClienteCdtDigital Impl.");
            return clienteCDTDigitalType;
        }catch (ApplicationException e){
            Log.error(ERROR_SERVICIO + e.getMessage() + " crearClienteCdtDigital Impl.");
            throw new ApplicationException(ERROR_SERVICIO+ e.getMessage());
        }
    }
}
