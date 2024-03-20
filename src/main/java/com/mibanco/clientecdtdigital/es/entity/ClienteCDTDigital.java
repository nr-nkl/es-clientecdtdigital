package com.mibanco.clientecdtdigital.es.entity;

import com.mibanco.clientecdtdigital.es.gen.type.CiudadEnum;
import com.mibanco.clientecdtdigital.es.gen.type.DepartamentoEnum;
import com.mibanco.clientecdtdigital.es.gen.type.GeneroEnum;
import com.mibanco.clientecdtdigital.es.gen.type.TipoActividadCIIUEnum;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RegisterForReflection
@Entity
public class ClienteCDTDigital implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipoTelefonoPrincipal")
    private String tipoTelefonoPrincipal;

    @Column(name = "telefonoPrincipal")
    private String telefonoPrincipal;

    @Column(name = "tipoCorreoElectronico")
    private String tipoCorreoElectronico;

    @Column(name = "genero")
    private GeneroEnum genero;

    @Column(name = "fechaNacimientoDia")
    private int fechaNacimientoDia;

    @Column(name = "fechaNacimientoMes")
    private int fechaNacimientoMes;

    @Column(name = "fechaNacimientoAno")
    private int fechaNacimientoAno;

    @Column(name = "lugarNacimientoPais")
    private String lugarNacimientoPais;

    @Column(name = "lugarNacimientoDpto")
    private DepartamentoEnum lugarNacimientoDpto;

    @Column(name = "lugarNacimientoCiudad")
    private CiudadEnum lugarNacimientoCiudad;

    @Column(name = "nacionalidad")
    private String nacionalidad;

    @Column(name = "nivelConsulta")
    private String nivelConsulta;

    @Column(name = "fechaExpedicionDocumentoDia")
    private int fechaExpedicionDocumentoDia;

    @Column(name = "fechaExpedicionDocumentoMes")
    private int fechaExpedicionDocumentoMes;

    @Column(name = "fechaExpedicionDocumentoAno")
    private int fechaExpedicionDocumentoAno;

    @Column(name = "expedicionDocumentoPais")
    private String expedicionDocumentoPais;

    @Column(name = "expedicionDocumentoDpto")
    private DepartamentoEnum expedicionDocumentoDpto;

    @Column(name = "expedicionDocumentoCiudad")
    private CiudadEnum expedicionDocumentoCiudad;

    @Column(name = "paisResidencia")
    private String paisResidencia;

    @Column(name = "subActividadEconomica")
    private String subActividadEconomica;

    @Column(name = "ocupacion")
    private String ocupacion;

    @Column(name = "actividadEconomicaCIIU")
    private TipoActividadCIIUEnum actividadEconomicaCIIU;

    @Column(name = "sectorEconomico")
    private String sectorEconomico;

    @Column(name = "registroBiometria")
    private boolean registroBiometria;

    @Column(name = "causalNoBiometria")
    private int causalNoBiometria;

    @Column(name = "direccionPersonal")
    private String direccionPersonal;

    @Column(name = "direccionPersonalPais")
    private String direccionPersonalPais;

    @Column(name = "direccionPersonalDpto")
    private DepartamentoEnum direccionPersonalDpto;

    @Column(name = "direccionPersonalCiudad")
    private CiudadEnum direccionPersonalCiudad;

    @Column(name = "barrioDireccionPersonal")
    private String barrioDireccionPersonal;

    @Column(name = "usoDireccionPersonal")
    private String usoDireccionPersonal;

    @Column(name = "tipoDireccionPersonal")
    private String tipoDireccionPersonal;

    @Column(name = "categoriaDireccionPersonal")
    private String categoriaDireccionPersonal;

    @Column(name = "envioCorrespondencia")
    private String envioCorrespondencia;

    @Column(name = "ingresosMensuales")
    private float ingresosMensuales;

    @Column(name = "patrimonio")
    private float patrimonio;

    @Column(name = "declaracionOrigenFondos")
    private String declaracionOrigenFondos;

    @Column(name = "reconocimientoPublicoExtranjero")
    private boolean reconocimientoPublicoExtranjero;

    @Column(name = "reconocimientoPublicoNacional")
    private boolean reconocimientoPublicoNacional;

    @Column(name = "segmento")
    private String segmento;

    @Column(name = "nicho")
    private String nicho;

    @Column(name = "canalContactoPreferido")
    private String canalContactoPreferido;

    @Column(name = "asesorComercial")
    private int asesorComercial;

    @Column(name = "tipoVinculacion")
    private String tipoVinculacion;

    @Column(name = "porqueMedioSeEnteroDeNosotros")
    private String porqueMedioSeEnteroDeNosotros;

    @Column(name = "agenciaVinculacion")
    private int agenciaVinculacion;

    @Column(name = "fechaDiligenciamientoFormularioDia")
    private int fechaDiligenciamientoFormularioDia;

    @Column(name = "fechaDiligenciamientoFormularioMes")
    private int fechaDiligenciamientoFormularioMes;

    @Column(name = "fechaDiligenciamientoFormularioAno")
    private int fechaDiligenciamientoFormularioAno;

    @Column(name = "fechaVinculacionDia")
    private int fechaVinculacionDia;

    @Column(name = "fechaVinculacionMes")
    private int fechaVinculacionMes;

    @Column(name = "fechaVinculacionAno")
    private int fechaVinculacionAno;

    @Column(name = "lugarDiligenciamientoFormularioPais")
    private String lugarDiligenciamientoFormularioPais;

    @Column(name = "lugarDiligenciamientoFormularioDpto")
    private DepartamentoEnum lugarDiligenciamientoFormularioDpto;

    @Column(name = "lugarDiligenciamientoFormularioCiudad")
    private CiudadEnum lugarDiligenciamientoFormularioCiudad;

    @Column(name = "residenteFiscalEnOtroPais")
    private boolean residenteFiscalEnOtroPais;

    @Column(name = "identificacionFiscal1")
    private int identificacionFiscal1;

    @Column(name = "direccionExtranjero")
    private boolean direccionExtranjero;

    @Column(name = "tin1")
    private int tin1;

    @Column(name = "residenciaFiscalPais")
    private String residenciaFiscalPais;

    @Column(name = "clasificacionFatca")
    private String clasificacionFatca;

    @Column(name = "fechaClasificacionFatca")
    private String fechaClasificacionFatca;

    @Column(name = "clasificacionCRS")
    private String clasificacionCRS;

    @Column(name = "fechaClasificacionCRS")
    private String fechaClasificacionCRS;

    @Column(name = "autorizacionEnvioCelularCorreo")
    private boolean autorizacionEnvioCelularCorreo;

    @Column(name = "canalEnvioCelularYCorreo")
    private String canalEnvioCelularYCorreo;

    @Column(name = "productoSolicitado")
    private String productoSolicitado;

    @Column(name = "codigoNovedadListas")
    private String codigoNovedadListas;
}
