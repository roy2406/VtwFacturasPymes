/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.cosmesoft.vtwfacturaspymes.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author usuario
 */
public class CabeceraFacturaModel {

    private String codEmpresa;
    private String codSucursal;
    private UsuarioModel usuarioLogueado;
    private ClienteModel clienteModel;
    private VendedorModel vendedorModel;
    private MesaModel mesaModel;
    private TiposCobrosModel tiposCobroModel;
    private String numero;
    private String tipo;
    private String serie;
    @JsonFormat(pattern = "MMM dd, yyy HH:mm:ss a")
    private Date fecha;
    private BigDecimal pago;
    private BigDecimal vuelto;
    private BigDecimal montoTotal;
    private BigDecimal totalIva;

    private PedidoCabeceraModel pedidoCabeceraModel;
    private String ruc;

    private List<ArticuloEnvioModel> detalle;

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getCodSucursal() {
        return codSucursal;
    }

    public void setCodSucursal(String codSucursal) {
        this.codSucursal = codSucursal;
    }

    public UsuarioModel getUsuarioLogueado() {
        return usuarioLogueado;
    }

    public void setUsuarioLogueado(UsuarioModel usuarioLogueado) {
        this.usuarioLogueado = usuarioLogueado;
    }

    public ClienteModel getClienteModel() {
        return clienteModel;
    }

    public void setClienteModel(ClienteModel clienteModel) {
        this.clienteModel = clienteModel;
    }

    public VendedorModel getVendedorModel() {
        return vendedorModel;
    }

    public void setVendedorModel(VendedorModel vendedorModel) {
        this.vendedorModel = vendedorModel;
    }

    public MesaModel getMesaModel() {
        return mesaModel;
    }

    public void setMesaModel(MesaModel mesaModel) {
        this.mesaModel = mesaModel;
    }

    public TiposCobrosModel getTiposCobroModel() {
        return tiposCobroModel;
    }

    public void setTiposCobroModel(TiposCobrosModel tiposCobroModel) {
        this.tiposCobroModel = tiposCobroModel;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getPago() {
        return pago;
    }

    public void setPago(BigDecimal pago) {
        this.pago = pago;
    }

    public BigDecimal getVuelto() {
        return vuelto;
    }

    public void setVuelto(BigDecimal vuelto) {
        this.vuelto = vuelto;
    }

    public PedidoCabeceraModel getPedidoCabeceraModel() {
        return pedidoCabeceraModel;
    }

    public void setPedidoCabeceraModel(PedidoCabeceraModel pedidoCabeceraModel) {
        this.pedidoCabeceraModel = pedidoCabeceraModel;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public List<ArticuloEnvioModel> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<ArticuloEnvioModel> detalle) {
        this.detalle = detalle;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }

    public BigDecimal getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(BigDecimal totalIva) {
        this.totalIva = totalIva;
    }

}
