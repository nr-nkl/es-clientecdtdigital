package com.mibanco.clientecdtdigital.es.gen.contract;

import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalType;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;




import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


@Path("/v1/es/clienteCDT")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T12:44:57.464657-05:00[America/Bogota]")
public interface V1ClientecdtdigitalApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Response crearClienteCdtDigital(@Valid ClienteCDTDigitalType clienteCDTDigitalType);
}
