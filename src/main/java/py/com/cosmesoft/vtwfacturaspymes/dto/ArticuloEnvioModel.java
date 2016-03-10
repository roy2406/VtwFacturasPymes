/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.cosmesoft.vtwfacturaspymes.dto;

import java.math.BigDecimal;
import py.com.cosmesoft.vtwfacturaspymes.dto.ArticuloModel;

/**
 *
 * @author usuario
 */
public class ArticuloEnvioModel {

    private BigDecimal cantidad;
    private BigDecimal montoTotal;
    private ArticuloModel articuloModel;
    private BigDecimal totalIVA;

    public ArticuloEnvioModel(BigDecimal cantidad, BigDecimal montoTotal, ArticuloModel articuloModel, BigDecimal totalIVA) {
        this.cantidad = cantidad;
        this.montoTotal = montoTotal;
        this.articuloModel = articuloModel;
        this.totalIVA = totalIVA;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }

    public ArticuloModel getArticuloModel() {
        return articuloModel;
    }

    public void setArticuloModel(ArticuloModel articuloModel) {
        this.articuloModel = articuloModel;
    }

    public BigDecimal getTotalIVA() {
        return totalIVA;
    }

    public void setTotalIVA(BigDecimal totalIVA) {
        this.totalIVA = totalIVA;
    }

    @Override
    public String toString() {
        return this.articuloModel.getDescripcion(); //To change body of generated methods, choose Tools | Templates.
    }

}
