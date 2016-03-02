/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.cosmesoft.vtwfacturaspymes.dto;

import java.math.BigInteger;
import java.util.StringTokenizer;
import py.com.cosmesoft.vtwfacturaspymes.util.RSA;

/**
 *
 * @author usuario
 */
public class UsuarioModel {

    private String codUsuario;
    private String clave;

//    public UsuarioModel(BswUsuarios bswUsuarios){
//        codUsuario = bswUsuarios.getCodUsuario();
//        clave = bswUsuarios.getClave();
//    }
    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
