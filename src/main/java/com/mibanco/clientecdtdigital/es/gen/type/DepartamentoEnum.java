package com.mibanco.clientecdtdigital.es.gen.type;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DepartamentoEnum
 */
public enum DepartamentoEnum {
  
  _05_DESCRIPCION_ANTIOQUIA_("{\"codigo\":\"05\",\"descripcion\":\"ANTIOQUIA\"}"),
  
  _08_DESCRIPCION_ATLANTICO_("{\"codigo\":\"08\",\"descripcion\":\"ATLANTICO\"}"),
  
  _11_DESCRIPCION_BOGOTA_D_C_("{\"codigo\":\"11\",\"descripcion\":\"BOGOTA D.C.\"}"),
  
  _12_DESCRIPCION_FUERA_DEL_PAIS_("{\"codigo\":\"12\",\"descripcion\":\"FUERA DEL PAIS\"}"),
  
  _13_DESCRIPCION_BOLIVAR_("{\"codigo\":\"13\",\"descripcion\":\"BOLIVAR\"}"),
  
  _15_DESCRIPCION_BOYACA_("{\"codigo\":\"15\",\"descripcion\":\"BOYACA\"}"),
  
  _17_DESCRIPCION_CALDAS_("{\"codigo\":\"17\",\"descripcion\":\"CALDAS\"}"),
  
  _18_DESCRIPCION_CAQUETA_("{\"codigo\":\"18\",\"descripcion\":\"CAQUETA\"}"),
  
  _19_DESCRIPCION_CAUCA_("{\"codigo\":\"19\",\"descripcion\":\"CAUCA\"}"),
  
  _20_DESCRIPCION_CESAR_("{\"codigo\":\"20\",\"descripcion\":\"CESAR\"}"),
  
  _23_DESCRIPCION_CORDOBA_("{\"codigo\":\"23\",\"descripcion\":\"CORDOBA\"}"),
  
  _25_DESCRIPCION_CUNDINAMARCA_("{\"codigo\":\"25\",\"descripcion\":\"CUNDINAMARCA\"}");

  private String value;

  DepartamentoEnum(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static DepartamentoEnum fromString(String s) {
      for (DepartamentoEnum b : DepartamentoEnum.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DepartamentoEnum fromValue(String value) {
    for (DepartamentoEnum b : DepartamentoEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


