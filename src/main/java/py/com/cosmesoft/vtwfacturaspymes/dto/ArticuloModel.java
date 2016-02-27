/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.cosmesoft.vtwfacturaspymes.dto;

import java.math.BigDecimal;
import py.com.cosmesoft.vtwfacturaspymes.util.ApplicationConstant;

/**
 *
 * @author rudy
 */
public class ArticuloModel implements Entidad {

    private Long id;
    private String codigo;
    private String descripcion;
    private BigDecimal existencia;
    private BigDecimal precioBase;
    private String codGrupo;
    private GrupoModel grupoModel;
    
    public ArticuloModel() {
    }

    public ArticuloModel(Long id, String codigo, String descripcion, BigDecimal existencia, BigDecimal precioBase, String codGrupo) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.existencia = existencia;
        this.precioBase = precioBase;
        this.codGrupo = codGrupo;
    }

    public GrupoModel getGrupoModel() {
        return grupoModel;
    }

    public void setGrupoModel(GrupoModel grupoModel) {
        this.grupoModel = grupoModel;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getExistencia() {
        return existencia;
    }

    public void setExistencia(BigDecimal existencia) {
        this.existencia = existencia;
    }

    public BigDecimal getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(BigDecimal precioBase) {
        this.precioBase = precioBase;
    }

    public String getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(String codGrupo) {
        this.codGrupo = codGrupo;
    }
    @Override
    public String toString() {
        return this.descripcion; //To change body of generated methods, choose Tools | Templates.
    }

}
