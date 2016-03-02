/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.cosmesoft.vtwfacturaspymes.dto;


/**
 *
 * @author rudy
 */
public class MesaModel {

    private Long id;
    private String codigo;
    private String descripcion;
    private String estado;

    public MesaModel() {
    }

    public MesaModel(Long id, String codigo, String descripcion, String estado) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

//    public MesaModel(VtwMesas mesa) {
//        this(mesa.getId(), mesa.getCodigo(), mesa.getDescripcion(),
//                mesa.getEstadoMesa());
//    }

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return this.descripcion; //To change body of generated methods, choose Tools | Templates.
    }
}
