/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.cosmesoft.vtwfacturaspymes.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author rudy
 */
public class PedidoCabeceraModel implements Serializable {
//    Vendedor

    private String codVendedor;
    private String nombreVendedor;
//    cliente
//    private String codCliente;
//    private String nombreCliente;
//    private String rucCliente;
//    private String cedula;
//    Pedido
    private String codEmpresa;
    private String codSucursal;
    private String tipoComprobante;
    private String serieComprobante;
    private String nroComprobante;
    private String totalComprobate;
    private String totalGravada;
    private String totalIva;
    private String fecha;
//    Mesa
    private String codMesa;
    private List<PedidoDetalleModel> detalles;
    private ClienteModel cliente;
    private String estadoMesa;
    private String nroAutorizacion;

    public PedidoCabeceraModel() {
    }
//
//    public PedidoCabeceraModel(VtwPedidosCabecera cabecera, VendedorModel vendedorLoguado) {
//        this.codVendedor = cabecera.getFvwVendedores().getCodVendedor();
//        this.nombreVendedor = cabecera.getFvwVendedores().getBswPersonas().getNombre();
//
////        this.codCliente = cabecera.getCcwClientes().getCodCliente();
////        this.nombreCliente = cabecera.getCcwClientes().getBswPersonas().getNombre();
////        this.rucCliente = cabecera.getRucCliente();
////        this.cedula = cabecera.getCcwClientes().getBswPersonas().getCedula();
//        cliente = new ClienteModel(cabecera.getCcwClientes());
//
//        this.codEmpresa = cabecera.getBswEmpresas().getCodEmpresa();
//        this.codSucursal = cabecera.getBswSucursales().getCodSucursal();
//        this.tipoComprobante = cabecera.getTipComprobante();
//        this.serieComprobante = cabecera.getSerComprobante();
//        this.nroComprobante = FuncionesVarias.getNumberAsString(cabecera.getNroComprobante());
//        this.totalComprobate = FuncionesVarias.getNumberAsString(cabecera.getTotComprobante());
//        this.totalGravada = FuncionesVarias.getNumberAsString(cabecera.getTotGravadas());
//        this.totalIva = FuncionesVarias.getNumberAsString(cabecera.getTotIva());
//        this.fecha = FuncionesVarias.getFechaAsString(cabecera.getFecAlta(), "dd/MM/yyyy");
//        this.codMesa = cabecera.getIdMesa().getCodigo();
//        this.estadoMesa = cabecera.getEstado();
//        this.nroAutorizacion = cabecera.getNroAutorizacion() == null ? null : String.valueOf(cabecera.getNroAutorizacion());
//
//        detalles = new ArrayList<>();
//        PedidoDetalleModel detalleModel;
//
//        if (vendedorLoguado != null) {
//            for (VtwPedidosDetalle vtwdetalle : cabecera.getVtwPedidosDetalleList()) {
//                detalleModel = new PedidoDetalleModel(vtwdetalle);
//                detalleModel.setPuedeModificar(vendedorLoguado.getModificaPedido());
//                detalles.add(detalleModel);
//            }
//        }
//
//    }

    public String getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(String codVendedor) {
        this.codVendedor = codVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

//    public String getCodCliente() {
//        return codCliente;
//    }
//
//    public void setCodCliente(String codCliente) {
//        this.codCliente = codCliente;
//    }
//
//    public String getNombreCliente() {
//        return nombreCliente;
//    }
//
//    public void setNombreCliente(String nombreCliente) {
//        this.nombreCliente = nombreCliente;
//    }
//
//    public String getRucCliente() {
//        return rucCliente;
//    }
//
//    public void setRucCliente(String rucCliente) {
//        this.rucCliente = rucCliente;
//    }
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

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getSerieComprobante() {
        return serieComprobante;
    }

    public void setSerieComprobante(String serieComprobante) {
        this.serieComprobante = serieComprobante;
    }

    public String getNroComprobante() {
        return nroComprobante;
    }

    public void setNroComprobante(String nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public String getTotalComprobate() {
        return totalComprobate;
    }

    public void setTotalComprobate(String totalComprobate) {
        this.totalComprobate = totalComprobate;
    }

    public String getTotalGravada() {
        return totalGravada;
    }

    public void setTotalGravada(String totalGravada) {
        this.totalGravada = totalGravada;
    }

    public String getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(String totalIva) {
        this.totalIva = totalIva;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCodMesa() {
        return codMesa;
    }

    public void setCodMesa(String codMesa) {
        this.codMesa = codMesa;
    }

    public List<PedidoDetalleModel> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<PedidoDetalleModel> detalles) {
        this.detalles = detalles;
    }

//    public String getCedula() {
//        return cedula;
//    }
//
//    public void setCedula(String cedula) {
//        this.cedula = cedula;
//    }
    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public String getEstadoMesa() {
        return estadoMesa;
    }

    public void setEstadoMesa(String estadoMesa) {
        this.estadoMesa = estadoMesa;
    }

    public String getNroAutorizacion() {
        return nroAutorizacion;
    }

    public void setNroAutorizacion(String nroAutorizacion) {
        this.nroAutorizacion = nroAutorizacion;
    }

    @Override
    public String toString() {
        return this.nroComprobante;
    }

}
