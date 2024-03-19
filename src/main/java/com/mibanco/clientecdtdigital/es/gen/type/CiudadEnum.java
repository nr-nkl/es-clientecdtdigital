package com.mibanco.clientecdtdigital.es.gen.type;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets CiudadEnum
 */
public enum CiudadEnum {
  
  _05001_DESCRIPCION_MEDELLIN_("{\"dpto\":\"05\",\"ciudad\":\"05001\",\"descripcion\":\"MEDELLIN\"}"),
  
  _05002_DESCRIPCION_ABEJORRAL_("{\"dpto\":\"05\",\"ciudad\":\"05002\",\"descripcion\":\"ABEJORRAL\"}"),
  
  _05004_DESCRIPCION_ABRIAQUI_("{\"dpto\":\"05\",\"ciudad\":\"05004\",\"descripcion\":\"ABRIAQUI\"}"),
  
  _05021_DESCRIPCION_ALEJANDRIA_("{\"dpto\":\"05\",\"ciudad\":\"05021\",\"descripcion\":\"ALEJANDRIA\"}"),
  
  _05030_DESCRIPCION_AMAGA_("{\"dpto\":\"05\",\"ciudad\":\"05030\",\"descripcion\":\"AMAGA\"}"),
  
  _05031_DESCRIPCION_AMALFI_("{\"dpto\":\"05\",\"ciudad\":\"05031\",\"descripcion\":\"AMALFI\"}"),
  
  _05034_DESCRIPCION_ANDES_("{\"dpto\":\"05\",\"ciudad\":\"05034\",\"descripcion\":\"ANDES\"}"),
  
  _05036_DESCRIPCION_ANGELOPOLIS_("{\"dpto\":\"05\",\"ciudad\":\"05036\",\"descripcion\":\"ANGELOPOLIS\"}"),
  
  _05038_DESCRIPCION_ANGOSTURA_("{\"dpto\":\"05\",\"ciudad\":\"05038\",\"descripcion\":\"ANGOSTURA\"}"),
  
  _05040_DESCRIPCION_ANORI_("{\"dpto\":\"05\",\"ciudad\":\"05040\",\"descripcion\":\"ANORI\"}");

  private String value;

  CiudadEnum(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static CiudadEnum fromString(String s) {
      for (CiudadEnum b : CiudadEnum.values()) {
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
  public static CiudadEnum fromValue(String value) {
    for (CiudadEnum b : CiudadEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


