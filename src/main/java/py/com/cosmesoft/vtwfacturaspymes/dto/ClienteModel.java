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
public class ClienteModel implements Entidad {

    private String codigo;
    private String direccion;
    private String nombre;
    private String ruc;
    private String cedula;
    private String telefono;
    private String email;
    private String latitud;
    private String longitud;

    public ClienteModel() {
    }

//    public ClienteModel(CcwClientes cliente) {
//
//        codigo = cliente.getCodCliente();
//        direccion = cliente.getBswPersonas().getDireccion();
//        nombre = cliente.getBswPersonas().getNombre();
//        ruc = cliente.getBswPersonas().getRuc();
//        cedula = cliente.getBswPersonas().getCedula();
//        telefono = cliente.getBswPersonas().getCelular();
//        email = cliente.getBswPersonas().getDirecElectronica();
//
//    }
    @Override
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    @Override
    public String getDescripcion() {
        return this.nombre;
    }

}
