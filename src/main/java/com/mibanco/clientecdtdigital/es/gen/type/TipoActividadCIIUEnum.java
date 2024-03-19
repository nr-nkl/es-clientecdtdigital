package com.mibanco.clientecdtdigital.es.gen.type;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TipoActividadCIIUEnum
 */
public enum TipoActividadCIIUEnum {
  
  _0010_DESCRIPCION_ASALARIADOS_("{\"codigo\":\"0010\",\"descripcion\":\"ASALARIADOS\"}"),
  
  _0081_DESCRIPCION_SIN_ACTIVIDAD_ECONOMICA_("{\"codigo\":\"0081\",\"descripcion\":\"SIN ACTIVIDAD ECONOMICA\"}"),
  
  _0082_DESCRIPCION_PERSONAS_NATURALES_SUBSIDIADAS_POR_TERCEROS_("{\"codigo\":\"0082\",\"descripcion\":\"PERSONAS NATURALES SUBSIDIADAS POR TERCEROS\"}"),
  
  _0090_DESCRIPCION_RENTISTAS_DE_CAPITAL_SOLO_PARA_PERSONAS_NATUR_("{\"codigo\":\"0090\",\"descripcion\":\"RENTISTAS DE CAPITAL SOLO PARA PERSONAS NATUR\"}"),
  
  _0111_DESCRIPCION_CULTIVO_DE_CEREALES_EXCEPTO_ARROZ_LEGUMBRE_("{\"codigo\":\"0111\",\"descripcion\":\"CULTIVO DE CEREALES (EXCEPTO ARROZ), LEGUMBRE\"}"),
  
  _0112_DESCRIPCION_CULTIVO_DE_ARROZ_("{\"codigo\":\"0112\",\"descripcion\":\"CULTIVO DE ARROZ\"}"),
  
  _0113_DESCRIPCION_CULTIVO_DE_HORTALIZAS_RAICES_Y_TUBERCULOS_("{\"codigo\":\"0113\",\"descripcion\":\"CULTIVO DE HORTALIZAS, RAICES Y TUBERCULOS\"}"),
  
  _0114_DESCRIPCION_CULTIVO_DE_TABACO_("{\"codigo\":\"0114\",\"descripcion\":\"CULTIVO DE TABACO\"}"),
  
  _0115_DESCRIPCION_CULTIVO_DE_PLANTAS_TEXTILES_("{\"codigo\":\"0115\",\"descripcion\":\"CULTIVO DE PLANTAS TEXTILES\"}"),
  
  _0119_DESCRIPCION_OTROS_CULTIVOS_TRANSITORIOS_N_C_P_("{\"codigo\":\"0119\",\"descripcion\":\"OTROS CULTIVOS TRANSITORIOS N.C.P.\"}"),
  
  _0121_DESCRIPCION_CULTIVO_DE_FRUTAS_TROPICALES_Y_SUBTROPICALES_("{\"codigo\":\"0121\",\"descripcion\":\"CULTIVO DE FRUTAS TROPICALES Y SUBTROPICALES\"}");

  private String value;

  TipoActividadCIIUEnum(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TipoActividadCIIUEnum fromString(String s) {
      for (TipoActividadCIIUEnum b : TipoActividadCIIUEnum.values()) {
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
  public static TipoActividadCIIUEnum fromValue(String value) {
    for (TipoActividadCIIUEnum b : TipoActividadCIIUEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


