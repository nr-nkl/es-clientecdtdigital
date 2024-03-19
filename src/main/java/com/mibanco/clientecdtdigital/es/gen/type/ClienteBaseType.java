package com.mibanco.clientecdtdigital.es.gen.type;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ClienteBaseType")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T12:44:57.464657-05:00[America/Bogota]")
public class ClienteBaseType   {
  private @Valid Integer numeroCliente;
  private @Valid String tipoPersona;
  private @Valid String tipoDocumento;
  private @Valid Integer numeroDocumento;
  private @Valid String fechaExpedicionDocumento;
  private @Valid String primerNombre;
  private @Valid Integer numeroCelular;
  private @Valid String segundoNombre;
  private @Valid String primerApellido;
  private @Valid String segundoApellido;
  private @Valid String correoElectronico;

  /**
   **/
  public ClienteBaseType numeroCliente(Integer numeroCliente) {
    this.numeroCliente = numeroCliente;
    return this;
  }

  
  @JsonProperty("numeroCliente")
  public Integer getNumeroCliente() {
    return numeroCliente;
  }

  @JsonProperty("numeroCliente")
  public void setNumeroCliente(Integer numeroCliente) {
    this.numeroCliente = numeroCliente;
  }

  /**
   **/
  public ClienteBaseType tipoPersona(String tipoPersona) {
    this.tipoPersona = tipoPersona;
    return this;
  }

  
  @JsonProperty("tipoPersona")
  public String getTipoPersona() {
    return tipoPersona;
  }

  @JsonProperty("tipoPersona")
  public void setTipoPersona(String tipoPersona) {
    this.tipoPersona = tipoPersona;
  }

  /**
   **/
  public ClienteBaseType tipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
    return this;
  }

  
  @JsonProperty("tipoDocumento")
  public String getTipoDocumento() {
    return tipoDocumento;
  }

  @JsonProperty("tipoDocumento")
  public void setTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  /**
   **/
  public ClienteBaseType numeroDocumento(Integer numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }

  
  @JsonProperty("numeroDocumento")
  public Integer getNumeroDocumento() {
    return numeroDocumento;
  }

  @JsonProperty("numeroDocumento")
  public void setNumeroDocumento(Integer numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  /**
   **/
  public ClienteBaseType fechaExpedicionDocumento(String fechaExpedicionDocumento) {
    this.fechaExpedicionDocumento = fechaExpedicionDocumento;
    return this;
  }

  
  @JsonProperty("fechaExpedicionDocumento")
  public String getFechaExpedicionDocumento() {
    return fechaExpedicionDocumento;
  }

  @JsonProperty("fechaExpedicionDocumento")
  public void setFechaExpedicionDocumento(String fechaExpedicionDocumento) {
    this.fechaExpedicionDocumento = fechaExpedicionDocumento;
  }

  /**
   **/
  public ClienteBaseType primerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
    return this;
  }

  
  @JsonProperty("primerNombre")
  public String getPrimerNombre() {
    return primerNombre;
  }

  @JsonProperty("primerNombre")
  public void setPrimerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
  }

  /**
   **/
  public ClienteBaseType numeroCelular(Integer numeroCelular) {
    this.numeroCelular = numeroCelular;
    return this;
  }

  
  @JsonProperty("numeroCelular")
  public Integer getNumeroCelular() {
    return numeroCelular;
  }

  @JsonProperty("numeroCelular")
  public void setNumeroCelular(Integer numeroCelular) {
    this.numeroCelular = numeroCelular;
  }

  /**
   **/
  public ClienteBaseType segundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
    return this;
  }

  
  @JsonProperty("segundoNombre")
  public String getSegundoNombre() {
    return segundoNombre;
  }

  @JsonProperty("segundoNombre")
  public void setSegundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
  }

  /**
   **/
  public ClienteBaseType primerApellido(String primerApellido) {
    this.primerApellido = primerApellido;
    return this;
  }

  
  @JsonProperty("primerApellido")
  public String getPrimerApellido() {
    return primerApellido;
  }

  @JsonProperty("primerApellido")
  public void setPrimerApellido(String primerApellido) {
    this.primerApellido = primerApellido;
  }

  /**
   **/
  public ClienteBaseType segundoApellido(String segundoApellido) {
    this.segundoApellido = segundoApellido;
    return this;
  }

  
  @JsonProperty("segundoApellido")
  public String getSegundoApellido() {
    return segundoApellido;
  }

  @JsonProperty("segundoApellido")
  public void setSegundoApellido(String segundoApellido) {
    this.segundoApellido = segundoApellido;
  }

  /**
   **/
  public ClienteBaseType correoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
    return this;
  }

  
  @JsonProperty("correoElectronico")
  public String getCorreoElectronico() {
    return correoElectronico;
  }

  @JsonProperty("correoElectronico")
  public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClienteBaseType clienteBaseType = (ClienteBaseType) o;
    return Objects.equals(this.numeroCliente, clienteBaseType.numeroCliente) &&
        Objects.equals(this.tipoPersona, clienteBaseType.tipoPersona) &&
        Objects.equals(this.tipoDocumento, clienteBaseType.tipoDocumento) &&
        Objects.equals(this.numeroDocumento, clienteBaseType.numeroDocumento) &&
        Objects.equals(this.fechaExpedicionDocumento, clienteBaseType.fechaExpedicionDocumento) &&
        Objects.equals(this.primerNombre, clienteBaseType.primerNombre) &&
        Objects.equals(this.numeroCelular, clienteBaseType.numeroCelular) &&
        Objects.equals(this.segundoNombre, clienteBaseType.segundoNombre) &&
        Objects.equals(this.primerApellido, clienteBaseType.primerApellido) &&
        Objects.equals(this.segundoApellido, clienteBaseType.segundoApellido) &&
        Objects.equals(this.correoElectronico, clienteBaseType.correoElectronico);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroCliente, tipoPersona, tipoDocumento, numeroDocumento, fechaExpedicionDocumento, primerNombre, numeroCelular, segundoNombre, primerApellido, segundoApellido, correoElectronico);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClienteBaseType {\n");
    
    sb.append("    numeroCliente: ").append(toIndentedString(numeroCliente)).append("\n");
    sb.append("    tipoPersona: ").append(toIndentedString(tipoPersona)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    fechaExpedicionDocumento: ").append(toIndentedString(fechaExpedicionDocumento)).append("\n");
    sb.append("    primerNombre: ").append(toIndentedString(primerNombre)).append("\n");
    sb.append("    numeroCelular: ").append(toIndentedString(numeroCelular)).append("\n");
    sb.append("    segundoNombre: ").append(toIndentedString(segundoNombre)).append("\n");
    sb.append("    primerApellido: ").append(toIndentedString(primerApellido)).append("\n");
    sb.append("    segundoApellido: ").append(toIndentedString(segundoApellido)).append("\n");
    sb.append("    correoElectronico: ").append(toIndentedString(correoElectronico)).append("\n");
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

