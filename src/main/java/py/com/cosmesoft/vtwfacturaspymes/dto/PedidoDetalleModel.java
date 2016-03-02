/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.cosmesoft.vtwfacturaspymes.dto;

import java.io.Serializable;

/**
 *
 * @author rudy
 */
public class PedidoDetalleModel implements Serializable {

    private String codArticulo;
    private String descripcion;
    private String cantidad;
    private String montoTotal;
    private String precioBase;
    private String estadoDetalle;
    private String cantidadFacturada;
    private String puedeModificar;

    public PedidoDetalleModel() {
    }

//    PedidoDetalleModel(VtwPedidosDetalle vtwdetalle) {
//        this.codArticulo = vtwdetalle.getStwArticulos().getCodArticulo();
//        this.descripcion = vtwdetalle.getStwArticulos().getDescripcion();
//        this.cantidad = FuncionesVarias.getNumberAsString(vtwdetalle.getCantidad());
//        this.montoTotal = FuncionesVarias.getNumberAsString(vtwdetalle.getMontoTotal());
//        this.precioBase = FuncionesVarias.getNumberAsString(vtwdetalle.getPrecioUnitario());
//        this.cantidadFacturada = FuncionesVarias.getNumberAsString(vtwdetalle.getCantidadFacturada());
//    }

    public String getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(String codArticulo) {
        this.codArticulo = codArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(String montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(String precioBase) {
        this.precioBase = precioBase;
    }

    public String getEstadoDetalle() {
        return estadoDetalle;
    }

    public void setEstadoDetalle(String estadoDetalle) {
        this.estadoDetalle = estadoDetalle;
    }

    public String getCantidadFacturada() {
        return cantidadFacturada;
    }

    public void setCantidadFacturada(String cantidadFacturada) {
        this.cantidadFacturada = cantidadFacturada;
    }

    public String getPuedeModificar() {
        return puedeModificar;
    }

    public void setPuedeModificar(String puedeModificar) {
        this.puedeModificar = puedeModificar;
    }
    

}
