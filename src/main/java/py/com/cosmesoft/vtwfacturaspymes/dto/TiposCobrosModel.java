/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.cosmesoft.vtwfacturaspymes.dto;

/**
 *
 * @author usuario
 */
public class TiposCobrosModel {
    private short codTipo;
    private String descripcion;

//    public TiposCobrosModel(VtwTiposCobros vtwTiposCobros){
//        this.codTipo = vtwTiposCobros.getCodTipo();
//        this.descripcion = vtwTiposCobros.getDescripcion();
//    }
    
    public short getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(short codTipo) {
        this.codTipo = codTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString(){
        return this.descripcion;
    }
}
