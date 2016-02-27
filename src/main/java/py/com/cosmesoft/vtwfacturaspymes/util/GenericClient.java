/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.cosmesoft.vtwfacturaspymes.util;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import py.com.cosmesoft.vtwfacturaspymes.dto.ArticuloModel;
import py.com.cosmesoft.vtwfacturaspymes.dto.ClienteModel;
import py.com.cosmesoft.vtwfacturaspymes.dto.Entidad;
import py.com.cosmesoft.vtwfacturaspymes.dto.GrupoModel;
import py.com.cosmesoft.vtwfacturaspymes.dto.VendedorModel;

/**
 *
 * @author usuario
 */
public class GenericClient<T> {

    private String baseUri;
    private String T_PATH;
    private Class<T> clazz;

    public GenericClient(String T_PATH){
        this.T_PATH = T_PATH;
    }

    public List<T> recibirLista() throws InterruptedException, ExecutionException {
        baseUri = getBaseUri();
        //T_PATH = getTPath();
        Client client = ClientBuilder.newClient();
        Future<List<T>> futureRespose = client
                .target(baseUri)
                .path(T_PATH)
                .resolveTemplate("codEmpresa", ApplicationConstant.COD_EMPRESA)
                .request()
                .async()
                .get(new GenericType<List<T>>() {
                });
        List<T> listaT = (List<T>)futureRespose.get();
        return listaT;
    }

    public List<ArticuloModel> recibirArticulo(GrupoModel grupoModel) throws InterruptedException, ExecutionException {
        baseUri = getBaseUri();
        Client client = ClientBuilder.newClient();
        Future<List<ArticuloModel>> futureRespose = client
                .target(baseUri)
                .path(T_PATH)
                .resolveTemplate("codEmpresa", ApplicationConstant.COD_EMPRESA)
                .resolveTemplate("inicio", "*")
                .resolveTemplate("cantidad", "*")
                .resolveTemplate("filtro", "*")
                .resolveTemplate("codGrupo", grupoModel.getCodigo())
                .request()
                .async()
                .get(new GenericType<List<ArticuloModel>>() {
                });
        List<ArticuloModel> articuloList = futureRespose.get();
        for (int i = 0; i < articuloList.size(); i++) {
            articuloList.get(i).setGrupoModel(grupoModel);
        }
        return articuloList;
    }

    private String getBaseUri() {
//        String NOMBRE_PROYECTO = "SantaFe";
//        String BASE_REST_URI = "rest";
        StringBuilder builder = new StringBuilder(ApplicationConstant.DIRECCION);
        builder.append(ApplicationConstant.NOMBRE_PROYECTO)
                .append("/")
                .append(ApplicationConstant.BASE_REST_URI)
                .append("/");
        return builder.toString();

    }

}
