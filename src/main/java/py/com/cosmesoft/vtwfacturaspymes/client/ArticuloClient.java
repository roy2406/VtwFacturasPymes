/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.cosmesoft.vtwfacturaspymes.client;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import py.com.cosmesoft.vtwfacturaspymes.dto.ArticuloModel;
import py.com.cosmesoft.vtwfacturaspymes.dto.GrupoModel;
import py.com.cosmesoft.vtwfacturaspymes.util.ApplicationConstant;

/**
 *
 * @author usuario
 */
public class ArticuloClient {

    private static String baseUri;

    public ArticuloClient() {
    }

    public static List<ArticuloModel> recibirArticulo(GrupoModel grupoModel) throws InterruptedException, ExecutionException {
        baseUri = getBaseUri();
        Client client = ClientBuilder.newClient();
        Future<List<ArticuloModel>> futureRespose = client
                .target(baseUri)
                .path(ApplicationConstant.ARTICULO_PATH)
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

    public static String getBaseUri() {
        String NOMBRE_PROYECTO = ApplicationConstant.NOMBRE_PROYECTO;
        String BASE_REST_URI = ApplicationConstant.BASE_REST_URI;
        StringBuilder builder = new StringBuilder(ApplicationConstant.DIRECCION);
        builder.append(NOMBRE_PROYECTO)
                .append("/")
                .append(BASE_REST_URI)
                .append("/");
        return builder.toString();

    }
}
