/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.cosmesoft.vtwfacturaspymes.dto;

import py.com.cosmesoft.vtwfacturaspymes.util.ApplicationConstant;

/**
 *
 * @author rudy
 */
public class GrupoModel implements Entidad {

    private Long id;
    private String codigo;
    private String descripcion;

    public GrupoModel() {
    }

    public GrupoModel(Long id, String codigo, String descripcion) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
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

    @Override
    public String toString() {
        return this.descripcion; //To change body of generated methods, choose Tools | Templates.
    }

}
