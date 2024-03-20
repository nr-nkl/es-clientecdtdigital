package com.mibanco.clientecdtdigital.es.gen.type;

import com.mibanco.clientecdtdigital.es.gen.type.CiudadEnum;
import com.mibanco.clientecdtdigital.es.gen.type.DepartamentoEnum;
import com.mibanco.clientecdtdigital.es.gen.type.GeneroEnum;
import com.mibanco.clientecdtdigital.es.gen.type.TipoActividadCIIUEnum;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ClienteCDTDigitalType")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-20T00:30:27.982346800-05:00[America/Bogota]", comments = "Generator version: 7.4.0")
public class ClienteCDTDigitalType   {
  private @Valid String tipoTelefonoPrincipal;
  private @Valid String telefonoPrincipal;
  private @Valid String tipoCorreoElectronico;
  private @Valid GeneroEnum genero;
  private @Valid Integer fechaNacimientoDia;
  private @Valid Integer fechaNacimientoMes;
  private @Valid Integer fechaNacimientoAno;
  private @Valid String lugarNacimientoPais;
  private @Valid DepartamentoEnum lugarNacimientoDpto;
  private @Valid CiudadEnum lugarNacimientoCiudad;
  private @Valid String nacionalidad;
  private @Valid String nivelConsulta;
  private @Valid Integer fechaExpedicionDocumentoDia;
  private @Valid Integer fechaExpedicionDocumentoMes;
  private @Valid Integer fechaExpedicionDocumentoAno;
  private @Valid String expedicionDocumentoPais;
  private @Valid DepartamentoEnum expedicionDocumentoDpto;
  private @Valid CiudadEnum expedicionDocumentoCiudad;
  private @Valid String paisResidencia;
  private @Valid String subActividadEconomica;
  private @Valid String ocupacion;
  private @Valid TipoActividadCIIUEnum actividadEconomicaCIIU;
  private @Valid String sectorEconomico;
  private @Valid Boolean registroBiometria;
  private @Valid Integer causalNoBiometria;
  private @Valid String direccionPersonal;
  private @Valid String direccionPersonalPais;
  private @Valid DepartamentoEnum direccionPersonalDpto;
  private @Valid CiudadEnum direccionPersonalCiudad;
  private @Valid String barrioDireccionPersonal;
  private @Valid String usoDireccionPersonal;
  private @Valid String tipoDireccionPersonal;
  private @Valid String categoriaDireccionPersonal;
  private @Valid String envioCorrespondencia;
  private @Valid Float ingresosMensuales = null;
  private @Valid Float patrimonio = null;
  private @Valid String declaracionOrigenFondos;
  private @Valid Boolean reconocimientoPublicoExtranjero;
  private @Valid Boolean reconocimientoPublicoNacional;
  private @Valid String segmento;
  private @Valid String nicho;
  private @Valid String canalContactoPreferido;
  private @Valid Integer asesorComercial;
  private @Valid String tipoVinculacion;
  private @Valid String porqueMedioSeEnteroDeNosotros;
  private @Valid Integer agenciaVinculacion;
  private @Valid Integer fechaDiligenciamientoFormularioDia;
  private @Valid Integer fechaDiligenciamientoFormularioMes;
  private @Valid Integer fechaDiligenciamientoFormularioAno;
  private @Valid Integer fechaVinculacionDia;
  private @Valid Integer fechaVinculacionMes;
  private @Valid Integer fechaVinculacionAno;
  private @Valid String lugarDiligenciamientoFormularioPais;
  private @Valid DepartamentoEnum lugarDiligenciamientoFormularioDpto;
  private @Valid CiudadEnum lugarDiligenciamientoFormularioCiudad;
  private @Valid Boolean residenteFiscalEnOtroPais;
  private @Valid Integer identificacionFiscal1;
  private @Valid Boolean direccionExtranjero;
  private @Valid Integer tin1;
  private @Valid String residenciaFiscalPais;
  private @Valid String clasificacionFatca;
  private @Valid String fechaClasificacionFatca;
  private @Valid String clasificacionCRS;
  private @Valid String fechaClasificacionCRS;
  private @Valid Boolean autorizacionEnvioCelularCorreo;
  private @Valid String canalEnvioCelularYCorreo;
  private @Valid String productoSolicitado;
  private @Valid String codigoNovedadListas;

  /**
   **/
  public ClienteCDTDigitalType tipoTelefonoPrincipal(String tipoTelefonoPrincipal) {
    this.tipoTelefonoPrincipal = tipoTelefonoPrincipal;
    return this;
  }

  
  @JsonProperty("tipoTelefonoPrincipal")
  public String getTipoTelefonoPrincipal() {
    return tipoTelefonoPrincipal;
  }

  @JsonProperty("tipoTelefonoPrincipal")
  public void setTipoTelefonoPrincipal(String tipoTelefonoPrincipal) {
    this.tipoTelefonoPrincipal = tipoTelefonoPrincipal;
  }

  /**
   **/
  public ClienteCDTDigitalType telefonoPrincipal(String telefonoPrincipal) {
    this.telefonoPrincipal = telefonoPrincipal;
    return this;
  }

  
  @JsonProperty("telefonoPrincipal")
  public String getTelefonoPrincipal() {
    return telefonoPrincipal;
  }

  @JsonProperty("telefonoPrincipal")
  public void setTelefonoPrincipal(String telefonoPrincipal) {
    this.telefonoPrincipal = telefonoPrincipal;
  }

  /**
   **/
  public ClienteCDTDigitalType tipoCorreoElectronico(String tipoCorreoElectronico) {
    this.tipoCorreoElectronico = tipoCorreoElectronico;
    return this;
  }

  
  @JsonProperty("tipoCorreoElectronico")
  public String getTipoCorreoElectronico() {
    return tipoCorreoElectronico;
  }

  @JsonProperty("tipoCorreoElectronico")
  public void setTipoCorreoElectronico(String tipoCorreoElectronico) {
    this.tipoCorreoElectronico = tipoCorreoElectronico;
  }

  /**
   **/
  public ClienteCDTDigitalType genero(GeneroEnum genero) {
    this.genero = genero;
    return this;
  }

  
  @JsonProperty("genero")
  public GeneroEnum getGenero() {
    return genero;
  }

  @JsonProperty("genero")
  public void setGenero(GeneroEnum genero) {
    this.genero = genero;
  }

  /**
   **/
  public ClienteCDTDigitalType fechaNacimientoDia(Integer fechaNacimientoDia) {
    this.fechaNacimientoDia = fechaNacimientoDia;
    return this;
  }

  
  @JsonProperty("fechaNacimientoDia")
  public Integer getFechaNacimientoDia() {
    return fechaNacimientoDia;
  }

  @JsonProperty("fechaNacimientoDia")
  public void setFechaNacimientoDia(Integer fechaNacimientoDia) {
    this.fechaNacimientoDia = fechaNacimientoDia;
  }

  /**
   **/
  public ClienteCDTDigitalType fechaNacimientoMes(Integer fechaNacimientoMes) {
    this.fechaNacimientoMes = fechaNacimientoMes;
    return this;
  }

  
  @JsonProperty("fechaNacimientoMes")
  public Integer getFechaNacimientoMes() {
    return fechaNacimientoMes;
  }

  @JsonProperty("fechaNacimientoMes")
  public void setFechaNacimientoMes(Integer fechaNacimientoMes) {
    this.fechaNacimientoMes = fechaNacimientoMes;
  }

  /**
   **/
  public ClienteCDTDigitalType fechaNacimientoAno(Integer fechaNacimientoAno) {
    this.fechaNacimientoAno = fechaNacimientoAno;
    return this;
  }

  
  @JsonProperty("fechaNacimientoAno")
  public Integer getFechaNacimientoAno() {
    return fechaNacimientoAno;
  }

  @JsonProperty("fechaNacimientoAno")
  public void setFechaNacimientoAno(Integer fechaNacimientoAno) {
    this.fechaNacimientoAno = fechaNacimientoAno;
  }

  /**
   **/
  public ClienteCDTDigitalType lugarNacimientoPais(String lugarNacimientoPais) {
    this.lugarNacimientoPais = lugarNacimientoPais;
    return this;
  }

  
  @JsonProperty("lugarNacimientoPais")
  public String getLugarNacimientoPais() {
    return lugarNacimientoPais;
  }

  @JsonProperty("lugarNacimientoPais")
  public void setLugarNacimientoPais(String lugarNacimientoPais) {
    this.lugarNacimientoPais = lugarNacimientoPais;
  }

  /**
   **/
  public ClienteCDTDigitalType lugarNacimientoDpto(DepartamentoEnum lugarNacimientoDpto) {
    this.lugarNacimientoDpto = lugarNacimientoDpto;
    return this;
  }

  
  @JsonProperty("lugarNacimientoDpto")
  public DepartamentoEnum getLugarNacimientoDpto() {
    return lugarNacimientoDpto;
  }

  @JsonProperty("lugarNacimientoDpto")
  public void setLugarNacimientoDpto(DepartamentoEnum lugarNacimientoDpto) {
    this.lugarNacimientoDpto = lugarNacimientoDpto;
  }

  /**
   **/
  public ClienteCDTDigitalType lugarNacimientoCiudad(CiudadEnum lugarNacimientoCiudad) {
    this.lugarNacimientoCiudad = lugarNacimientoCiudad;
    return this;
  }

  
  @JsonProperty("lugarNacimientoCiudad")
  public CiudadEnum getLugarNacimientoCiudad() {
    return lugarNacimientoCiudad;
  }

  @JsonProperty("lugarNacimientoCiudad")
  public void setLugarNacimientoCiudad(CiudadEnum lugarNacimientoCiudad) {
    this.lugarNacimientoCiudad = lugarNacimientoCiudad;
  }

  /**
   **/
  public ClienteCDTDigitalType nacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
    return this;
  }

  
  @JsonProperty("nacionalidad")
  public String getNacionalidad() {
    return nacionalidad;
  }

  @JsonProperty("nacionalidad")
  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }

  /**
   **/
  public ClienteCDTDigitalType nivelConsulta(String nivelConsulta) {
    this.nivelConsulta = nivelConsulta;
    return this;
  }

  
  @JsonProperty("nivelConsulta")
  public String getNivelConsulta() {
    return nivelConsulta;
  }

  @JsonProperty("nivelConsulta")
  public void setNivelConsulta(String nivelConsulta) {
    this.nivelConsulta = nivelConsulta;
  }

  /**
   **/
  public ClienteCDTDigitalType fechaExpedicionDocumentoDia(Integer fechaExpedicionDocumentoDia) {
    this.fechaExpedicionDocumentoDia = fechaExpedicionDocumentoDia;
    return this;
  }

  
  @JsonProperty("fechaExpedicionDocumentoDia")
  public Integer getFechaExpedicionDocumentoDia() {
    return fechaExpedicionDocumentoDia;
  }

  @JsonProperty("fechaExpedicionDocumentoDia")
  public void setFechaExpedicionDocumentoDia(Integer fechaExpedicionDocumentoDia) {
    this.fechaExpedicionDocumentoDia = fechaExpedicionDocumentoDia;
  }

  /**
   **/
  public ClienteCDTDigitalType fechaExpedicionDocumentoMes(Integer fechaExpedicionDocumentoMes) {
    this.fechaExpedicionDocumentoMes = fechaExpedicionDocumentoMes;
    return this;
  }

  
  @JsonProperty("fechaExpedicionDocumentoMes")
  public Integer getFechaExpedicionDocumentoMes() {
    return fechaExpedicionDocumentoMes;
  }

  @JsonProperty("fechaExpedicionDocumentoMes")
  public void setFechaExpedicionDocumentoMes(Integer fechaExpedicionDocumentoMes) {
    this.fechaExpedicionDocumentoMes = fechaExpedicionDocumentoMes;
  }

  /**
   **/
  public ClienteCDTDigitalType fechaExpedicionDocumentoAno(Integer fechaExpedicionDocumentoAno) {
    this.fechaExpedicionDocumentoAno = fechaExpedicionDocumentoAno;
    return this;
  }

  
  @JsonProperty("fechaExpedicionDocumentoAno")
  public Integer getFechaExpedicionDocumentoAno() {
    return fechaExpedicionDocumentoAno;
  }

  @JsonProperty("fechaExpedicionDocumentoAno")
  public void setFechaExpedicionDocumentoAno(Integer fechaExpedicionDocumentoAno) {
    this.fechaExpedicionDocumentoAno = fechaExpedicionDocumentoAno;
  }

  /**
   **/
  public ClienteCDTDigitalType expedicionDocumentoPais(String expedicionDocumentoPais) {
    this.expedicionDocumentoPais = expedicionDocumentoPais;
    return this;
  }

  
  @JsonProperty("expedicionDocumentoPais")
  public String getExpedicionDocumentoPais() {
    return expedicionDocumentoPais;
  }

  @JsonProperty("expedicionDocumentoPais")
  public void setExpedicionDocumentoPais(String expedicionDocumentoPais) {
    this.expedicionDocumentoPais = expedicionDocumentoPais;
  }

  /**
   **/
  public ClienteCDTDigitalType expedicionDocumentoDpto(DepartamentoEnum expedicionDocumentoDpto) {
    this.expedicionDocumentoDpto = expedicionDocumentoDpto;
    return this;
  }

  
  @JsonProperty("expedicionDocumentoDpto")
  public DepartamentoEnum getExpedicionDocumentoDpto() {
    return expedicionDocumentoDpto;
  }

  @JsonProperty("expedicionDocumentoDpto")
  public void setExpedicionDocumentoDpto(DepartamentoEnum expedicionDocumentoDpto) {
    this.expedicionDocumentoDpto = expedicionDocumentoDpto;
  }

  /**
   **/
  public ClienteCDTDigitalType expedicionDocumentoCiudad(CiudadEnum expedicionDocumentoCiudad) {
    this.expedicionDocumentoCiudad = expedicionDocumentoCiudad;
    return this;
  }

  
  @JsonProperty("expedicionDocumentoCiudad")
  public CiudadEnum getExpedicionDocumentoCiudad() {
    return expedicionDocumentoCiudad;
  }

  @JsonProperty("expedicionDocumentoCiudad")
  public void setExpedicionDocumentoCiudad(CiudadEnum expedicionDocumentoCiudad) {
    this.expedicionDocumentoCiudad = expedicionDocumentoCiudad;
  }

  /**
   **/
  public ClienteCDTDigitalType paisResidencia(String paisResidencia) {
    this.paisResidencia = paisResidencia;
    return this;
  }

  
  @JsonProperty("paisResidencia")
  public String getPaisResidencia() {
    return paisResidencia;
  }

  @JsonProperty("paisResidencia")
  public void setPaisResidencia(String paisResidencia) {
    this.paisResidencia = paisResidencia;
  }

  /**
   **/
  public ClienteCDTDigitalType subActividadEconomica(String subActividadEconomica) {
    this.subActividadEconomica = subActividadEconomica;
    return this;
  }

  
  @JsonProperty("subActividadEconomica")
  public String getSubActividadEconomica() {
    return subActividadEconomica;
  }

  @JsonProperty("subActividadEconomica")
  public void setSubActividadEconomica(String subActividadEconomica) {
    this.subActividadEconomica = subActividadEconomica;
  }

  /**
   **/
  public ClienteCDTDigitalType ocupacion(String ocupacion) {
    this.ocupacion = ocupacion;
    return this;
  }

  
  @JsonProperty("ocupacion")
  public String getOcupacion() {
    return ocupacion;
  }

  @JsonProperty("ocupacion")
  public void setOcupacion(String ocupacion) {
    this.ocupacion = ocupacion;
  }

  /**
   **/
  public ClienteCDTDigitalType actividadEconomicaCIIU(TipoActividadCIIUEnum actividadEconomicaCIIU) {
    this.actividadEconomicaCIIU = actividadEconomicaCIIU;
    return this;
  }

  
  @JsonProperty("actividadEconomicaCIIU")
  public TipoActividadCIIUEnum getActividadEconomicaCIIU() {
    return actividadEconomicaCIIU;
  }

  @JsonProperty("actividadEconomicaCIIU")
  public void setActividadEconomicaCIIU(TipoActividadCIIUEnum actividadEconomicaCIIU) {
    this.actividadEconomicaCIIU = actividadEconomicaCIIU;
  }

  /**
   **/
  public ClienteCDTDigitalType sectorEconomico(String sectorEconomico) {
    this.sectorEconomico = sectorEconomico;
    return this;
  }

  
  @JsonProperty("sectorEconomico")
  public String getSectorEconomico() {
    return sectorEconomico;
  }

  @JsonProperty("sectorEconomico")
  public void setSectorEconomico(String sectorEconomico) {
    this.sectorEconomico = sectorEconomico;
  }

  /**
   **/
  public ClienteCDTDigitalType registroBiometria(Boolean registroBiometria) {
    this.registroBiometria = registroBiometria;
    return this;
  }

  
  @JsonProperty("registroBiometria")
  public Boolean getRegistroBiometria() {
    return registroBiometria;
  }

  @JsonProperty("registroBiometria")
  public void setRegistroBiometria(Boolean registroBiometria) {
    this.registroBiometria = registroBiometria;
  }

  /**
   **/
  public ClienteCDTDigitalType causalNoBiometria(Integer causalNoBiometria) {
    this.causalNoBiometria = causalNoBiometria;
    return this;
  }

  
  @JsonProperty("causalNoBiometria")
  public Integer getCausalNoBiometria() {
    return causalNoBiometria;
  }

  @JsonProperty("causalNoBiometria")
  public void setCausalNoBiometria(Integer causalNoBiometria) {
    this.causalNoBiometria = causalNoBiometria;
  }

  /**
   **/
  public ClienteCDTDigitalType direccionPersonal(String direccionPersonal) {
    this.direccionPersonal = direccionPersonal;
    return this;
  }

  
  @JsonProperty("direccionPersonal")
  public String getDireccionPersonal() {
    return direccionPersonal;
  }

  @JsonProperty("direccionPersonal")
  public void setDireccionPersonal(String direccionPersonal) {
    this.direccionPersonal = direccionPersonal;
  }

  /**
   **/
  public ClienteCDTDigitalType direccionPersonalPais(String direccionPersonalPais) {
    this.direccionPersonalPais = direccionPersonalPais;
    return this;
  }

  
  @JsonProperty("direccionPersonalPais")
  public String getDireccionPersonalPais() {
    return direccionPersonalPais;
  }

  @JsonProperty("direccionPersonalPais")
  public void setDireccionPersonalPais(String direccionPersonalPais) {
    this.direccionPersonalPais = direccionPersonalPais;
  }

  /**
   **/
  public ClienteCDTDigitalType direccionPersonalDpto(DepartamentoEnum direccionPersonalDpto) {
    this.direccionPersonalDpto = direccionPersonalDpto;
    return this;
  }

  
  @JsonProperty("direccionPersonalDpto")
  public DepartamentoEnum getDireccionPersonalDpto() {
    return direccionPersonalDpto;
  }

  @JsonProperty("direccionPersonalDpto")
  public void setDireccionPersonalDpto(DepartamentoEnum direccionPersonalDpto) {
    this.direccionPersonalDpto = direccionPersonalDpto;
  }

  /**
   **/
  public ClienteCDTDigitalType direccionPersonalCiudad(CiudadEnum direccionPersonalCiudad) {
    this.direccionPersonalCiudad = direccionPersonalCiudad;
    return this;
  }

  
  @JsonProperty("direccionPersonalCiudad")
  public CiudadEnum getDireccionPersonalCiudad() {
    return direccionPersonalCiudad;
  }

  @JsonProperty("direccionPersonalCiudad")
  public void setDireccionPersonalCiudad(CiudadEnum direccionPersonalCiudad) {
    this.direccionPersonalCiudad = direccionPersonalCiudad;
  }

  /**
   **/
  public ClienteCDTDigitalType barrioDireccionPersonal(String barrioDireccionPersonal) {
    this.barrioDireccionPersonal = barrioDireccionPersonal;
    return this;
  }

  
  @JsonProperty("barrioDireccionPersonal")
  public String getBarrioDireccionPersonal() {
    return barrioDireccionPersonal;
  }

  @JsonProperty("barrioDireccionPersonal")
  public void setBarrioDireccionPersonal(String barrioDireccionPersonal) {
    this.barrioDireccionPersonal = barrioDireccionPersonal;
  }

  /**
   **/
  public ClienteCDTDigitalType usoDireccionPersonal(String usoDireccionPersonal) {
    this.usoDireccionPersonal = usoDireccionPersonal;
    return this;
  }

  
  @JsonProperty("usoDireccionPersonal")
  public String getUsoDireccionPersonal() {
    return usoDireccionPersonal;
  }

  @JsonProperty("usoDireccionPersonal")
  public void setUsoDireccionPersonal(String usoDireccionPersonal) {
    this.usoDireccionPersonal = usoDireccionPersonal;
  }

  /**
   **/
  public ClienteCDTDigitalType tipoDireccionPersonal(String tipoDireccionPersonal) {
    this.tipoDireccionPersonal = tipoDireccionPersonal;
    return this;
  }

  
  @JsonProperty("tipoDireccionPersonal")
  public String getTipoDireccionPersonal() {
    return tipoDireccionPersonal;
  }

  @JsonProperty("tipoDireccionPersonal")
  public void setTipoDireccionPersonal(String tipoDireccionPersonal) {
    this.tipoDireccionPersonal = tipoDireccionPersonal;
  }

  /**
   **/
  public ClienteCDTDigitalType categoriaDireccionPersonal(String categoriaDireccionPersonal) {
    this.categoriaDireccionPersonal = categoriaDireccionPersonal;
    return this;
  }

  
  @JsonProperty("categoriaDireccionPersonal")
  public String getCategoriaDireccionPersonal() {
    return categoriaDireccionPersonal;
  }

  @JsonProperty("categoriaDireccionPersonal")
  public void setCategoriaDireccionPersonal(String categoriaDireccionPersonal) {
    this.categoriaDireccionPersonal = categoriaDireccionPersonal;
  }

  /**
   **/
  public ClienteCDTDigitalType envioCorrespondencia(String envioCorrespondencia) {
    this.envioCorrespondencia = envioCorrespondencia;
    return this;
  }

  
  @JsonProperty("envioCorrespondencia")
  public String getEnvioCorrespondencia() {
    return envioCorrespondencia;
  }

  @JsonProperty("envioCorrespondencia")
  public void setEnvioCorrespondencia(String envioCorrespondencia) {
    this.envioCorrespondencia = envioCorrespondencia;
  }

  /**
   **/
  public ClienteCDTDigitalType ingresosMensuales(Float ingresosMensuales) {
    this.ingresosMensuales = ingresosMensuales;
    return this;
  }

  
  @JsonProperty("ingresosMensuales")
  public Float getIngresosMensuales() {
    return ingresosMensuales;
  }

  @JsonProperty("ingresosMensuales")
  public void setIngresosMensuales(Float ingresosMensuales) {
    this.ingresosMensuales = ingresosMensuales;
  }

  /**
   **/
  public ClienteCDTDigitalType patrimonio(Float patrimonio) {
    this.patrimonio = patrimonio;
    return this;
  }

  
  @JsonProperty("patrimonio")
  public Float getPatrimonio() {
    return patrimonio;
  }

  @JsonProperty("patrimonio")
  public void setPatrimonio(Float patrimonio) {
    this.patrimonio = patrimonio;
  }

  /**
   **/
  public ClienteCDTDigitalType declaracionOrigenFondos(String declaracionOrigenFondos) {
    this.declaracionOrigenFondos = declaracionOrigenFondos;
    return this;
  }

  
  @JsonProperty("declaracionOrigenFondos")
  public String getDeclaracionOrigenFondos() {
    return declaracionOrigenFondos;
  }

  @JsonProperty("declaracionOrigenFondos")
  public void setDeclaracionOrigenFondos(String declaracionOrigenFondos) {
    this.declaracionOrigenFondos = declaracionOrigenFondos;
  }

  /**
   **/
  public ClienteCDTDigitalType reconocimientoPublicoExtranjero(Boolean reconocimientoPublicoExtranjero) {
    this.reconocimientoPublicoExtranjero = reconocimientoPublicoExtranjero;
    return this;
  }

  
  @JsonProperty("reconocimientoPublicoExtranjero")
  public Boolean getReconocimientoPublicoExtranjero() {
    return reconocimientoPublicoExtranjero;
  }

  @JsonProperty("reconocimientoPublicoExtranjero")
  public void setReconocimientoPublicoExtranjero(Boolean reconocimientoPublicoExtranjero) {
    this.reconocimientoPublicoExtranjero = reconocimientoPublicoExtranjero;
  }

  /**
   **/
  public ClienteCDTDigitalType reconocimientoPublicoNacional(Boolean reconocimientoPublicoNacional) {
    this.reconocimientoPublicoNacional = reconocimientoPublicoNacional;
    return this;
  }

  
  @JsonProperty("reconocimientoPublicoNacional")
  public Boolean getReconocimientoPublicoNacional() {
    return reconocimientoPublicoNacional;
  }

  @JsonProperty("reconocimientoPublicoNacional")
  public void setReconocimientoPublicoNacional(Boolean reconocimientoPublicoNacional) {
    this.reconocimientoPublicoNacional = reconocimientoPublicoNacional;
  }

  /**
   **/
  public ClienteCDTDigitalType segmento(String segmento) {
    this.segmento = segmento;
    return this;
  }

  
  @JsonProperty("segmento")
  public String getSegmento() {
    return segmento;
  }

  @JsonProperty("segmento")
  public void setSegmento(String segmento) {
    this.segmento = segmento;
  }

  /**
   **/
  public ClienteCDTDigitalType nicho(String nicho) {
    this.nicho = nicho;
    return this;
  }

  
  @JsonProperty("nicho")
  public String getNicho() {
    return nicho;
  }

  @JsonProperty("nicho")
  public void setNicho(String nicho) {
    this.nicho = nicho;
  }

  /**
   **/
  public ClienteCDTDigitalType canalContactoPreferido(String canalContactoPreferido) {
    this.canalContactoPreferido = canalContactoPreferido;
    return this;
  }

  
  @JsonProperty("canalContactoPreferido")
  public String getCanalContactoPreferido() {
    return canalContactoPreferido;
  }

  @JsonProperty("canalContactoPreferido")
  public void setCanalContactoPreferido(String canalContactoPreferido) {
    this.canalContactoPreferido = canalContactoPreferido;
  }

  /**
   **/
  public ClienteCDTDigitalType asesorComercial(Integer asesorComercial) {
    this.asesorComercial = asesorComercial;
    return this;
  }

  
  @JsonProperty("asesorComercial")
  public Integer getAsesorComercial() {
    return asesorComercial;
  }

  @JsonProperty("asesorComercial")
  public void setAsesorComercial(Integer asesorComercial) {
    this.asesorComercial = asesorComercial;
  }

  /**
   **/
  public ClienteCDTDigitalType tipoVinculacion(String tipoVinculacion) {
    this.tipoVinculacion = tipoVinculacion;
    return this;
  }

  
  @JsonProperty("tipoVinculacion")
  public String getTipoVinculacion() {
    return tipoVinculacion;
  }

  @JsonProperty("tipoVinculacion")
  public void setTipoVinculacion(String tipoVinculacion) {
    this.tipoVinculacion = tipoVinculacion;
  }

  /**
   **/
  public ClienteCDTDigitalType porqueMedioSeEnteroDeNosotros(String porqueMedioSeEnteroDeNosotros) {
    this.porqueMedioSeEnteroDeNosotros = porqueMedioSeEnteroDeNosotros;
    return this;
  }

  
  @JsonProperty("porqueMedioSeEnteroDeNosotros")
  public String getPorqueMedioSeEnteroDeNosotros() {
    return porqueMedioSeEnteroDeNosotros;
  }

  @JsonProperty("porqueMedioSeEnteroDeNosotros")
  public void setPorqueMedioSeEnteroDeNosotros(String porqueMedioSeEnteroDeNosotros) {
    this.porqueMedioSeEnteroDeNosotros = porqueMedioSeEnteroDeNosotros;
  }

  /**
   **/
  public ClienteCDTDigitalType agenciaVinculacion(Integer agenciaVinculacion) {
    this.agenciaVinculacion = agenciaVinculacion;
    return this;
  }

  
  @JsonProperty("agenciaVinculacion")
  public Integer getAgenciaVinculacion() {
    return agenciaVinculacion;
  }

  @JsonProperty("agenciaVinculacion")
  public void setAgenciaVinculacion(Integer agenciaVinculacion) {
    this.agenciaVinculacion = agenciaVinculacion;
  }

  /**
   **/
  public ClienteCDTDigitalType fechaDiligenciamientoFormularioDia(Integer fechaDiligenciamientoFormularioDia) {
    this.fechaDiligenciamientoFormularioDia = fechaDiligenciamientoFormularioDia;
    return this;
  }

  
  @JsonProperty("fechaDiligenciamientoFormularioDia")
  public Integer getFechaDiligenciamientoFormularioDia() {
    return fechaDiligenciamientoFormularioDia;
  }

  @JsonProperty("fechaDiligenciamientoFormularioDia")
  public void setFechaDiligenciamientoFormularioDia(Integer fechaDiligenciamientoFormularioDia) {
    this.fechaDiligenciamientoFormularioDia = fechaDiligenciamientoFormularioDia;
  }

  /**
   **/
  public ClienteCDTDigitalType fechaDiligenciamientoFormularioMes(Integer fechaDiligenciamientoFormularioMes) {
    this.fechaDiligenciamientoFormularioMes = fechaDiligenciamientoFormularioMes;
    return this;
  }

  
  @JsonProperty("fechaDiligenciamientoFormularioMes")
  public Integer getFechaDiligenciamientoFormularioMes() {
    return fechaDiligenciamientoFormularioMes;
  }

  @JsonProperty("fechaDiligenciamientoFormularioMes")
  public void setFechaDiligenciamientoFormularioMes(Integer fechaDiligenciamientoFormularioMes) {
    this.fechaDiligenciamientoFormularioMes = fechaDiligenciamientoFormularioMes;
  }

  /**
   **/
  public ClienteCDTDigitalType fechaDiligenciamientoFormularioAno(Integer fechaDiligenciamientoFormularioAno) {
    this.fechaDiligenciamientoFormularioAno = fechaDiligenciamientoFormularioAno;
    return this;
  }

  
  @JsonProperty("fechaDiligenciamientoFormularioAno")
  public Integer getFechaDiligenciamientoFormularioAno() {
    return fechaDiligenciamientoFormularioAno;
  }

  @JsonProperty("fechaDiligenciamientoFormularioAno")
  public void setFechaDiligenciamientoFormularioAno(Integer fechaDiligenciamientoFormularioAno) {
    this.fechaDiligenciamientoFormularioAno = fechaDiligenciamientoFormularioAno;
  }

  /**
   **/
  public ClienteCDTDigitalType fechaVinculacionDia(Integer fechaVinculacionDia) {
    this.fechaVinculacionDia = fechaVinculacionDia;
    return this;
  }

  
  @JsonProperty("fechaVinculacionDia")
  public Integer getFechaVinculacionDia() {
    return fechaVinculacionDia;
  }

  @JsonProperty("fechaVinculacionDia")
  public void setFechaVinculacionDia(Integer fechaVinculacionDia) {
    this.fechaVinculacionDia = fechaVinculacionDia;
  }

  /**
   **/
  public ClienteCDTDigitalType fechaVinculacionMes(Integer fechaVinculacionMes) {
    this.fechaVinculacionMes = fechaVinculacionMes;
    return this;
  }

  
  @JsonProperty("fechaVinculacionMes")
  public Integer getFechaVinculacionMes() {
    return fechaVinculacionMes;
  }

  @JsonProperty("fechaVinculacionMes")
  public void setFechaVinculacionMes(Integer fechaVinculacionMes) {
    this.fechaVinculacionMes = fechaVinculacionMes;
  }

  /**
   **/
  public ClienteCDTDigitalType fechaVinculacionAno(Integer fechaVinculacionAno) {
    this.fechaVinculacionAno = fechaVinculacionAno;
    return this;
  }

  
  @JsonProperty("fechaVinculacionAno")
  public Integer getFechaVinculacionAno() {
    return fechaVinculacionAno;
  }

  @JsonProperty("fechaVinculacionAno")
  public void setFechaVinculacionAno(Integer fechaVinculacionAno) {
    this.fechaVinculacionAno = fechaVinculacionAno;
  }

  /**
   **/
  public ClienteCDTDigitalType lugarDiligenciamientoFormularioPais(String lugarDiligenciamientoFormularioPais) {
    this.lugarDiligenciamientoFormularioPais = lugarDiligenciamientoFormularioPais;
    return this;
  }

  
  @JsonProperty("lugarDiligenciamientoFormularioPais")
  public String getLugarDiligenciamientoFormularioPais() {
    return lugarDiligenciamientoFormularioPais;
  }

  @JsonProperty("lugarDiligenciamientoFormularioPais")
  public void setLugarDiligenciamientoFormularioPais(String lugarDiligenciamientoFormularioPais) {
    this.lugarDiligenciamientoFormularioPais = lugarDiligenciamientoFormularioPais;
  }

  /**
   **/
  public ClienteCDTDigitalType lugarDiligenciamientoFormularioDpto(DepartamentoEnum lugarDiligenciamientoFormularioDpto) {
    this.lugarDiligenciamientoFormularioDpto = lugarDiligenciamientoFormularioDpto;
    return this;
  }

  
  @JsonProperty("lugarDiligenciamientoFormularioDpto")
  public DepartamentoEnum getLugarDiligenciamientoFormularioDpto() {
    return lugarDiligenciamientoFormularioDpto;
  }

  @JsonProperty("lugarDiligenciamientoFormularioDpto")
  public void setLugarDiligenciamientoFormularioDpto(DepartamentoEnum lugarDiligenciamientoFormularioDpto) {
    this.lugarDiligenciamientoFormularioDpto = lugarDiligenciamientoFormularioDpto;
  }

  /**
   **/
  public ClienteCDTDigitalType lugarDiligenciamientoFormularioCiudad(CiudadEnum lugarDiligenciamientoFormularioCiudad) {
    this.lugarDiligenciamientoFormularioCiudad = lugarDiligenciamientoFormularioCiudad;
    return this;
  }

  
  @JsonProperty("lugarDiligenciamientoFormularioCiudad")
  public CiudadEnum getLugarDiligenciamientoFormularioCiudad() {
    return lugarDiligenciamientoFormularioCiudad;
  }

  @JsonProperty("lugarDiligenciamientoFormularioCiudad")
  public void setLugarDiligenciamientoFormularioCiudad(CiudadEnum lugarDiligenciamientoFormularioCiudad) {
    this.lugarDiligenciamientoFormularioCiudad = lugarDiligenciamientoFormularioCiudad;
  }

  /**
   **/
  public ClienteCDTDigitalType residenteFiscalEnOtroPais(Boolean residenteFiscalEnOtroPais) {
    this.residenteFiscalEnOtroPais = residenteFiscalEnOtroPais;
    return this;
  }

  
  @JsonProperty("residenteFiscalEnOtroPais")
  public Boolean getResidenteFiscalEnOtroPais() {
    return residenteFiscalEnOtroPais;
  }

  @JsonProperty("residenteFiscalEnOtroPais")
  public void setResidenteFiscalEnOtroPais(Boolean residenteFiscalEnOtroPais) {
    this.residenteFiscalEnOtroPais = residenteFiscalEnOtroPais;
  }

  /**
   **/
  public ClienteCDTDigitalType identificacionFiscal1(Integer identificacionFiscal1) {
    this.identificacionFiscal1 = identificacionFiscal1;
    return this;
  }

  
  @JsonProperty("identificacionFiscal1")
  public Integer getIdentificacionFiscal1() {
    return identificacionFiscal1;
  }

  @JsonProperty("identificacionFiscal1")
  public void setIdentificacionFiscal1(Integer identificacionFiscal1) {
    this.identificacionFiscal1 = identificacionFiscal1;
  }

  /**
   **/
  public ClienteCDTDigitalType direccionExtranjero(Boolean direccionExtranjero) {
    this.direccionExtranjero = direccionExtranjero;
    return this;
  }

  
  @JsonProperty("direccionExtranjero")
  public Boolean getDireccionExtranjero() {
    return direccionExtranjero;
  }

  @JsonProperty("direccionExtranjero")
  public void setDireccionExtranjero(Boolean direccionExtranjero) {
    this.direccionExtranjero = direccionExtranjero;
  }

  /**
   **/
  public ClienteCDTDigitalType tin1(Integer tin1) {
    this.tin1 = tin1;
    return this;
  }

  
  @JsonProperty("tin1")
  public Integer getTin1() {
    return tin1;
  }

  @JsonProperty("tin1")
  public void setTin1(Integer tin1) {
    this.tin1 = tin1;
  }

  /**
   **/
  public ClienteCDTDigitalType residenciaFiscalPais(String residenciaFiscalPais) {
    this.residenciaFiscalPais = residenciaFiscalPais;
    return this;
  }

  
  @JsonProperty("residenciaFiscalPais")
  public String getResidenciaFiscalPais() {
    return residenciaFiscalPais;
  }

  @JsonProperty("residenciaFiscalPais")
  public void setResidenciaFiscalPais(String residenciaFiscalPais) {
    this.residenciaFiscalPais = residenciaFiscalPais;
  }

  /**
   **/
  public ClienteCDTDigitalType clasificacionFatca(String clasificacionFatca) {
    this.clasificacionFatca = clasificacionFatca;
    return this;
  }

  
  @JsonProperty("clasificacionFatca")
  public String getClasificacionFatca() {
    return clasificacionFatca;
  }

  @JsonProperty("clasificacionFatca")
  public void setClasificacionFatca(String clasificacionFatca) {
    this.clasificacionFatca = clasificacionFatca;
  }

  /**
   **/
  public ClienteCDTDigitalType fechaClasificacionFatca(String fechaClasificacionFatca) {
    this.fechaClasificacionFatca = fechaClasificacionFatca;
    return this;
  }

  
  @JsonProperty("fechaClasificacionFatca")
  public String getFechaClasificacionFatca() {
    return fechaClasificacionFatca;
  }

  @JsonProperty("fechaClasificacionFatca")
  public void setFechaClasificacionFatca(String fechaClasificacionFatca) {
    this.fechaClasificacionFatca = fechaClasificacionFatca;
  }

  /**
   **/
  public ClienteCDTDigitalType clasificacionCRS(String clasificacionCRS) {
    this.clasificacionCRS = clasificacionCRS;
    return this;
  }

  
  @JsonProperty("clasificacionCRS")
  public String getClasificacionCRS() {
    return clasificacionCRS;
  }

  @JsonProperty("clasificacionCRS")
  public void setClasificacionCRS(String clasificacionCRS) {
    this.clasificacionCRS = clasificacionCRS;
  }

  /**
   **/
  public ClienteCDTDigitalType fechaClasificacionCRS(String fechaClasificacionCRS) {
    this.fechaClasificacionCRS = fechaClasificacionCRS;
    return this;
  }

  
  @JsonProperty("fechaClasificacionCRS")
  public String getFechaClasificacionCRS() {
    return fechaClasificacionCRS;
  }

  @JsonProperty("fechaClasificacionCRS")
  public void setFechaClasificacionCRS(String fechaClasificacionCRS) {
    this.fechaClasificacionCRS = fechaClasificacionCRS;
  }

  /**
   **/
  public ClienteCDTDigitalType autorizacionEnvioCelularCorreo(Boolean autorizacionEnvioCelularCorreo) {
    this.autorizacionEnvioCelularCorreo = autorizacionEnvioCelularCorreo;
    return this;
  }

  
  @JsonProperty("autorizacionEnvioCelularCorreo")
  public Boolean getAutorizacionEnvioCelularCorreo() {
    return autorizacionEnvioCelularCorreo;
  }

  @JsonProperty("autorizacionEnvioCelularCorreo")
  public void setAutorizacionEnvioCelularCorreo(Boolean autorizacionEnvioCelularCorreo) {
    this.autorizacionEnvioCelularCorreo = autorizacionEnvioCelularCorreo;
  }

  /**
   **/
  public ClienteCDTDigitalType canalEnvioCelularYCorreo(String canalEnvioCelularYCorreo) {
    this.canalEnvioCelularYCorreo = canalEnvioCelularYCorreo;
    return this;
  }

  
  @JsonProperty("canalEnvioCelularYCorreo")
  public String getCanalEnvioCelularYCorreo() {
    return canalEnvioCelularYCorreo;
  }

  @JsonProperty("canalEnvioCelularYCorreo")
  public void setCanalEnvioCelularYCorreo(String canalEnvioCelularYCorreo) {
    this.canalEnvioCelularYCorreo = canalEnvioCelularYCorreo;
  }

  /**
   **/
  public ClienteCDTDigitalType productoSolicitado(String productoSolicitado) {
    this.productoSolicitado = productoSolicitado;
    return this;
  }

  
  @JsonProperty("productoSolicitado")
  public String getProductoSolicitado() {
    return productoSolicitado;
  }

  @JsonProperty("productoSolicitado")
  public void setProductoSolicitado(String productoSolicitado) {
    this.productoSolicitado = productoSolicitado;
  }

  /**
   **/
  public ClienteCDTDigitalType codigoNovedadListas(String codigoNovedadListas) {
    this.codigoNovedadListas = codigoNovedadListas;
    return this;
  }

  
  @JsonProperty("codigoNovedadListas")
  public String getCodigoNovedadListas() {
    return codigoNovedadListas;
  }

  @JsonProperty("codigoNovedadListas")
  public void setCodigoNovedadListas(String codigoNovedadListas) {
    this.codigoNovedadListas = codigoNovedadListas;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClienteCDTDigitalType clienteCDTDigitalType = (ClienteCDTDigitalType) o;
    return Objects.equals(this.tipoTelefonoPrincipal, clienteCDTDigitalType.tipoTelefonoPrincipal) &&
        Objects.equals(this.telefonoPrincipal, clienteCDTDigitalType.telefonoPrincipal) &&
        Objects.equals(this.tipoCorreoElectronico, clienteCDTDigitalType.tipoCorreoElectronico) &&
        Objects.equals(this.genero, clienteCDTDigitalType.genero) &&
        Objects.equals(this.fechaNacimientoDia, clienteCDTDigitalType.fechaNacimientoDia) &&
        Objects.equals(this.fechaNacimientoMes, clienteCDTDigitalType.fechaNacimientoMes) &&
        Objects.equals(this.fechaNacimientoAno, clienteCDTDigitalType.fechaNacimientoAno) &&
        Objects.equals(this.lugarNacimientoPais, clienteCDTDigitalType.lugarNacimientoPais) &&
        Objects.equals(this.lugarNacimientoDpto, clienteCDTDigitalType.lugarNacimientoDpto) &&
        Objects.equals(this.lugarNacimientoCiudad, clienteCDTDigitalType.lugarNacimientoCiudad) &&
        Objects.equals(this.nacionalidad, clienteCDTDigitalType.nacionalidad) &&
        Objects.equals(this.nivelConsulta, clienteCDTDigitalType.nivelConsulta) &&
        Objects.equals(this.fechaExpedicionDocumentoDia, clienteCDTDigitalType.fechaExpedicionDocumentoDia) &&
        Objects.equals(this.fechaExpedicionDocumentoMes, clienteCDTDigitalType.fechaExpedicionDocumentoMes) &&
        Objects.equals(this.fechaExpedicionDocumentoAno, clienteCDTDigitalType.fechaExpedicionDocumentoAno) &&
        Objects.equals(this.expedicionDocumentoPais, clienteCDTDigitalType.expedicionDocumentoPais) &&
        Objects.equals(this.expedicionDocumentoDpto, clienteCDTDigitalType.expedicionDocumentoDpto) &&
        Objects.equals(this.expedicionDocumentoCiudad, clienteCDTDigitalType.expedicionDocumentoCiudad) &&
        Objects.equals(this.paisResidencia, clienteCDTDigitalType.paisResidencia) &&
        Objects.equals(this.subActividadEconomica, clienteCDTDigitalType.subActividadEconomica) &&
        Objects.equals(this.ocupacion, clienteCDTDigitalType.ocupacion) &&
        Objects.equals(this.actividadEconomicaCIIU, clienteCDTDigitalType.actividadEconomicaCIIU) &&
        Objects.equals(this.sectorEconomico, clienteCDTDigitalType.sectorEconomico) &&
        Objects.equals(this.registroBiometria, clienteCDTDigitalType.registroBiometria) &&
        Objects.equals(this.causalNoBiometria, clienteCDTDigitalType.causalNoBiometria) &&
        Objects.equals(this.direccionPersonal, clienteCDTDigitalType.direccionPersonal) &&
        Objects.equals(this.direccionPersonalPais, clienteCDTDigitalType.direccionPersonalPais) &&
        Objects.equals(this.direccionPersonalDpto, clienteCDTDigitalType.direccionPersonalDpto) &&
        Objects.equals(this.direccionPersonalCiudad, clienteCDTDigitalType.direccionPersonalCiudad) &&
        Objects.equals(this.barrioDireccionPersonal, clienteCDTDigitalType.barrioDireccionPersonal) &&
        Objects.equals(this.usoDireccionPersonal, clienteCDTDigitalType.usoDireccionPersonal) &&
        Objects.equals(this.tipoDireccionPersonal, clienteCDTDigitalType.tipoDireccionPersonal) &&
        Objects.equals(this.categoriaDireccionPersonal, clienteCDTDigitalType.categoriaDireccionPersonal) &&
        Objects.equals(this.envioCorrespondencia, clienteCDTDigitalType.envioCorrespondencia) &&
        Objects.equals(this.ingresosMensuales, clienteCDTDigitalType.ingresosMensuales) &&
        Objects.equals(this.patrimonio, clienteCDTDigitalType.patrimonio) &&
        Objects.equals(this.declaracionOrigenFondos, clienteCDTDigitalType.declaracionOrigenFondos) &&
        Objects.equals(this.reconocimientoPublicoExtranjero, clienteCDTDigitalType.reconocimientoPublicoExtranjero) &&
        Objects.equals(this.reconocimientoPublicoNacional, clienteCDTDigitalType.reconocimientoPublicoNacional) &&
        Objects.equals(this.segmento, clienteCDTDigitalType.segmento) &&
        Objects.equals(this.nicho, clienteCDTDigitalType.nicho) &&
        Objects.equals(this.canalContactoPreferido, clienteCDTDigitalType.canalContactoPreferido) &&
        Objects.equals(this.asesorComercial, clienteCDTDigitalType.asesorComercial) &&
        Objects.equals(this.tipoVinculacion, clienteCDTDigitalType.tipoVinculacion) &&
        Objects.equals(this.porqueMedioSeEnteroDeNosotros, clienteCDTDigitalType.porqueMedioSeEnteroDeNosotros) &&
        Objects.equals(this.agenciaVinculacion, clienteCDTDigitalType.agenciaVinculacion) &&
        Objects.equals(this.fechaDiligenciamientoFormularioDia, clienteCDTDigitalType.fechaDiligenciamientoFormularioDia) &&
        Objects.equals(this.fechaDiligenciamientoFormularioMes, clienteCDTDigitalType.fechaDiligenciamientoFormularioMes) &&
        Objects.equals(this.fechaDiligenciamientoFormularioAno, clienteCDTDigitalType.fechaDiligenciamientoFormularioAno) &&
        Objects.equals(this.fechaVinculacionDia, clienteCDTDigitalType.fechaVinculacionDia) &&
        Objects.equals(this.fechaVinculacionMes, clienteCDTDigitalType.fechaVinculacionMes) &&
        Objects.equals(this.fechaVinculacionAno, clienteCDTDigitalType.fechaVinculacionAno) &&
        Objects.equals(this.lugarDiligenciamientoFormularioPais, clienteCDTDigitalType.lugarDiligenciamientoFormularioPais) &&
        Objects.equals(this.lugarDiligenciamientoFormularioDpto, clienteCDTDigitalType.lugarDiligenciamientoFormularioDpto) &&
        Objects.equals(this.lugarDiligenciamientoFormularioCiudad, clienteCDTDigitalType.lugarDiligenciamientoFormularioCiudad) &&
        Objects.equals(this.residenteFiscalEnOtroPais, clienteCDTDigitalType.residenteFiscalEnOtroPais) &&
        Objects.equals(this.identificacionFiscal1, clienteCDTDigitalType.identificacionFiscal1) &&
        Objects.equals(this.direccionExtranjero, clienteCDTDigitalType.direccionExtranjero) &&
        Objects.equals(this.tin1, clienteCDTDigitalType.tin1) &&
        Objects.equals(this.residenciaFiscalPais, clienteCDTDigitalType.residenciaFiscalPais) &&
        Objects.equals(this.clasificacionFatca, clienteCDTDigitalType.clasificacionFatca) &&
        Objects.equals(this.fechaClasificacionFatca, clienteCDTDigitalType.fechaClasificacionFatca) &&
        Objects.equals(this.clasificacionCRS, clienteCDTDigitalType.clasificacionCRS) &&
        Objects.equals(this.fechaClasificacionCRS, clienteCDTDigitalType.fechaClasificacionCRS) &&
        Objects.equals(this.autorizacionEnvioCelularCorreo, clienteCDTDigitalType.autorizacionEnvioCelularCorreo) &&
        Objects.equals(this.canalEnvioCelularYCorreo, clienteCDTDigitalType.canalEnvioCelularYCorreo) &&
        Objects.equals(this.productoSolicitado, clienteCDTDigitalType.productoSolicitado) &&
        Objects.equals(this.codigoNovedadListas, clienteCDTDigitalType.codigoNovedadListas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoTelefonoPrincipal, telefonoPrincipal, tipoCorreoElectronico, genero, fechaNacimientoDia, fechaNacimientoMes, fechaNacimientoAno, lugarNacimientoPais, lugarNacimientoDpto, lugarNacimientoCiudad, nacionalidad, nivelConsulta, fechaExpedicionDocumentoDia, fechaExpedicionDocumentoMes, fechaExpedicionDocumentoAno, expedicionDocumentoPais, expedicionDocumentoDpto, expedicionDocumentoCiudad, paisResidencia, subActividadEconomica, ocupacion, actividadEconomicaCIIU, sectorEconomico, registroBiometria, causalNoBiometria, direccionPersonal, direccionPersonalPais, direccionPersonalDpto, direccionPersonalCiudad, barrioDireccionPersonal, usoDireccionPersonal, tipoDireccionPersonal, categoriaDireccionPersonal, envioCorrespondencia, ingresosMensuales, patrimonio, declaracionOrigenFondos, reconocimientoPublicoExtranjero, reconocimientoPublicoNacional, segmento, nicho, canalContactoPreferido, asesorComercial, tipoVinculacion, porqueMedioSeEnteroDeNosotros, agenciaVinculacion, fechaDiligenciamientoFormularioDia, fechaDiligenciamientoFormularioMes, fechaDiligenciamientoFormularioAno, fechaVinculacionDia, fechaVinculacionMes, fechaVinculacionAno, lugarDiligenciamientoFormularioPais, lugarDiligenciamientoFormularioDpto, lugarDiligenciamientoFormularioCiudad, residenteFiscalEnOtroPais, identificacionFiscal1, direccionExtranjero, tin1, residenciaFiscalPais, clasificacionFatca, fechaClasificacionFatca, clasificacionCRS, fechaClasificacionCRS, autorizacionEnvioCelularCorreo, canalEnvioCelularYCorreo, productoSolicitado, codigoNovedadListas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClienteCDTDigitalType {\n");
    
    sb.append("    tipoTelefonoPrincipal: ").append(toIndentedString(tipoTelefonoPrincipal)).append("\n");
    sb.append("    telefonoPrincipal: ").append(toIndentedString(telefonoPrincipal)).append("\n");
    sb.append("    tipoCorreoElectronico: ").append(toIndentedString(tipoCorreoElectronico)).append("\n");
    sb.append("    genero: ").append(toIndentedString(genero)).append("\n");
    sb.append("    fechaNacimientoDia: ").append(toIndentedString(fechaNacimientoDia)).append("\n");
    sb.append("    fechaNacimientoMes: ").append(toIndentedString(fechaNacimientoMes)).append("\n");
    sb.append("    fechaNacimientoAno: ").append(toIndentedString(fechaNacimientoAno)).append("\n");
    sb.append("    lugarNacimientoPais: ").append(toIndentedString(lugarNacimientoPais)).append("\n");
    sb.append("    lugarNacimientoDpto: ").append(toIndentedString(lugarNacimientoDpto)).append("\n");
    sb.append("    lugarNacimientoCiudad: ").append(toIndentedString(lugarNacimientoCiudad)).append("\n");
    sb.append("    nacionalidad: ").append(toIndentedString(nacionalidad)).append("\n");
    sb.append("    nivelConsulta: ").append(toIndentedString(nivelConsulta)).append("\n");
    sb.append("    fechaExpedicionDocumentoDia: ").append(toIndentedString(fechaExpedicionDocumentoDia)).append("\n");
    sb.append("    fechaExpedicionDocumentoMes: ").append(toIndentedString(fechaExpedicionDocumentoMes)).append("\n");
    sb.append("    fechaExpedicionDocumentoAno: ").append(toIndentedString(fechaExpedicionDocumentoAno)).append("\n");
    sb.append("    expedicionDocumentoPais: ").append(toIndentedString(expedicionDocumentoPais)).append("\n");
    sb.append("    expedicionDocumentoDpto: ").append(toIndentedString(expedicionDocumentoDpto)).append("\n");
    sb.append("    expedicionDocumentoCiudad: ").append(toIndentedString(expedicionDocumentoCiudad)).append("\n");
    sb.append("    paisResidencia: ").append(toIndentedString(paisResidencia)).append("\n");
    sb.append("    subActividadEconomica: ").append(toIndentedString(subActividadEconomica)).append("\n");
    sb.append("    ocupacion: ").append(toIndentedString(ocupacion)).append("\n");
    sb.append("    actividadEconomicaCIIU: ").append(toIndentedString(actividadEconomicaCIIU)).append("\n");
    sb.append("    sectorEconomico: ").append(toIndentedString(sectorEconomico)).append("\n");
    sb.append("    registroBiometria: ").append(toIndentedString(registroBiometria)).append("\n");
    sb.append("    causalNoBiometria: ").append(toIndentedString(causalNoBiometria)).append("\n");
    sb.append("    direccionPersonal: ").append(toIndentedString(direccionPersonal)).append("\n");
    sb.append("    direccionPersonalPais: ").append(toIndentedString(direccionPersonalPais)).append("\n");
    sb.append("    direccionPersonalDpto: ").append(toIndentedString(direccionPersonalDpto)).append("\n");
    sb.append("    direccionPersonalCiudad: ").append(toIndentedString(direccionPersonalCiudad)).append("\n");
    sb.append("    barrioDireccionPersonal: ").append(toIndentedString(barrioDireccionPersonal)).append("\n");
    sb.append("    usoDireccionPersonal: ").append(toIndentedString(usoDireccionPersonal)).append("\n");
    sb.append("    tipoDireccionPersonal: ").append(toIndentedString(tipoDireccionPersonal)).append("\n");
    sb.append("    categoriaDireccionPersonal: ").append(toIndentedString(categoriaDireccionPersonal)).append("\n");
    sb.append("    envioCorrespondencia: ").append(toIndentedString(envioCorrespondencia)).append("\n");
    sb.append("    ingresosMensuales: ").append(toIndentedString(ingresosMensuales)).append("\n");
    sb.append("    patrimonio: ").append(toIndentedString(patrimonio)).append("\n");
    sb.append("    declaracionOrigenFondos: ").append(toIndentedString(declaracionOrigenFondos)).append("\n");
    sb.append("    reconocimientoPublicoExtranjero: ").append(toIndentedString(reconocimientoPublicoExtranjero)).append("\n");
    sb.append("    reconocimientoPublicoNacional: ").append(toIndentedString(reconocimientoPublicoNacional)).append("\n");
    sb.append("    segmento: ").append(toIndentedString(segmento)).append("\n");
    sb.append("    nicho: ").append(toIndentedString(nicho)).append("\n");
    sb.append("    canalContactoPreferido: ").append(toIndentedString(canalContactoPreferido)).append("\n");
    sb.append("    asesorComercial: ").append(toIndentedString(asesorComercial)).append("\n");
    sb.append("    tipoVinculacion: ").append(toIndentedString(tipoVinculacion)).append("\n");
    sb.append("    porqueMedioSeEnteroDeNosotros: ").append(toIndentedString(porqueMedioSeEnteroDeNosotros)).append("\n");
    sb.append("    agenciaVinculacion: ").append(toIndentedString(agenciaVinculacion)).append("\n");
    sb.append("    fechaDiligenciamientoFormularioDia: ").append(toIndentedString(fechaDiligenciamientoFormularioDia)).append("\n");
    sb.append("    fechaDiligenciamientoFormularioMes: ").append(toIndentedString(fechaDiligenciamientoFormularioMes)).append("\n");
    sb.append("    fechaDiligenciamientoFormularioAno: ").append(toIndentedString(fechaDiligenciamientoFormularioAno)).append("\n");
    sb.append("    fechaVinculacionDia: ").append(toIndentedString(fechaVinculacionDia)).append("\n");
    sb.append("    fechaVinculacionMes: ").append(toIndentedString(fechaVinculacionMes)).append("\n");
    sb.append("    fechaVinculacionAno: ").append(toIndentedString(fechaVinculacionAno)).append("\n");
    sb.append("    lugarDiligenciamientoFormularioPais: ").append(toIndentedString(lugarDiligenciamientoFormularioPais)).append("\n");
    sb.append("    lugarDiligenciamientoFormularioDpto: ").append(toIndentedString(lugarDiligenciamientoFormularioDpto)).append("\n");
    sb.append("    lugarDiligenciamientoFormularioCiudad: ").append(toIndentedString(lugarDiligenciamientoFormularioCiudad)).append("\n");
    sb.append("    residenteFiscalEnOtroPais: ").append(toIndentedString(residenteFiscalEnOtroPais)).append("\n");
    sb.append("    identificacionFiscal1: ").append(toIndentedString(identificacionFiscal1)).append("\n");
    sb.append("    direccionExtranjero: ").append(toIndentedString(direccionExtranjero)).append("\n");
    sb.append("    tin1: ").append(toIndentedString(tin1)).append("\n");
    sb.append("    residenciaFiscalPais: ").append(toIndentedString(residenciaFiscalPais)).append("\n");
    sb.append("    clasificacionFatca: ").append(toIndentedString(clasificacionFatca)).append("\n");
    sb.append("    fechaClasificacionFatca: ").append(toIndentedString(fechaClasificacionFatca)).append("\n");
    sb.append("    clasificacionCRS: ").append(toIndentedString(clasificacionCRS)).append("\n");
    sb.append("    fechaClasificacionCRS: ").append(toIndentedString(fechaClasificacionCRS)).append("\n");
    sb.append("    autorizacionEnvioCelularCorreo: ").append(toIndentedString(autorizacionEnvioCelularCorreo)).append("\n");
    sb.append("    canalEnvioCelularYCorreo: ").append(toIndentedString(canalEnvioCelularYCorreo)).append("\n");
    sb.append("    productoSolicitado: ").append(toIndentedString(productoSolicitado)).append("\n");
    sb.append("    codigoNovedadListas: ").append(toIndentedString(codigoNovedadListas)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

