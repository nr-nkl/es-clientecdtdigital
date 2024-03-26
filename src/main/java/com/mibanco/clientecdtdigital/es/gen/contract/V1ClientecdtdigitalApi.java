package com.mibanco.clientecdtdigital.es.gen.contract;

import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalType;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;




import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


@Path("/v1/es")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-25T23:18:28.067979600-05:00[America/Bogota]", comments = "Generator version: 7.4.0")
public interface V1ClientecdtdigitalApi {

    @PUT
    @Path("/actualizarClienteCDTId/{idCliente}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Response actualizarClienteCDTId(@PathParam("idCliente") @Min(1) Integer idCliente,@Valid ClienteCDTDigitalType clienteCDTDigitalType);

    @GET
    @Path("/buscarClienteCDTDigitalId/{idCliente}")
    @Produces({ "application/json" })
    Response buscarClienteCDTDigitalId(@PathParam("idCliente") @Min(1) Integer idCliente);

    @POST
    @Path("/clienteCDT")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Response crearClienteCDTDigital(@Valid ClienteCDTDigitalType clienteCDTDigitalType);

    @DELETE
    @Path("/eliminarClienteCDTDigitalId/{idCliente}")
    @Produces({ "application/json" })
    Response eliminarClienteCDTDigitalId(@PathParam("idCliente") @Min(1) Integer idCliente);

    @GET
    @Path("/listarTodosLosClientes/")
    @Produces({ "application/json" })
    Response listarClientesCDTDigital();
}
