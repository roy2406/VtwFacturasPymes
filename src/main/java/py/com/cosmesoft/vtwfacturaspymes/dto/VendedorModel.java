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
public class VendedorModel {

    private String codVendedor;
    private String codUsuario;
    private String codEmpresa;
    private String codSucursal;
    private String nombreVendedor;
    private String codNumero;
    private String modificaPedido;

    public VendedorModel() {
    }

//    public VendedorModel(FvwVendedores vendedor) {
//        BswUsuarios usuario = vendedor.getBswPersonas().getBswUsuarios();
//        codVendedor = vendedor.getCodVendedor();
//        codUsuario = usuario.getCodUsuario();
//        codEmpresa = usuario.getBswEmpresas().getCodEmpresa();
//        codSucursal = usuario.getBswSucursales().getCodSucursal();
//        nombreVendedor = vendedor.getBswPersonas().getNombre();
//
//    }
    public String getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(String codVendedor) {
        this.codVendedor = codVendedor;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

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

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getCodNumero() {
        return codNumero;
    }

    public void setCodNumero(String codNumero) {
        this.codNumero = codNumero;
    }

    public String getModificaPedido() {
        return modificaPedido;
    }

    public void setModificaPedido(String modificaPedido) {
        this.modificaPedido = modificaPedido;
    }

    @Override
    public String toString() {
        return this.nombreVendedor; //To change body of generated methods, choose Tools | Templates.
    }

}
