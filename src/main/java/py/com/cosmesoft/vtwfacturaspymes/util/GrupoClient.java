/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.cosmesoft.vtwfacturaspymes.util;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import py.com.cosmesoft.vtwfacturaspymes.dto.GrupoModel;

/**
 *
 * @author rudy
 */
public class GrupoClient {

    private static String baseUri;

    public GrupoClient() {
    }

    public static List<GrupoModel> recibirGrupo() throws InterruptedException, ExecutionException {
        baseUri = getBaseUri();
        Client client = ClientBuilder.newClient();
        Future<List<GrupoModel>> futureRespose = client
                .target(baseUri)
                .path(ApplicationConstant.GRUPO_PATH)
                .resolveTemplate("codEmpresa", ApplicationConstant.COD_EMPRESA)
                .request()
                .async()
                .get(new GenericType<List<GrupoModel>>() {
                });
          List<GrupoModel> gruposList = futureRespose.get();
        return gruposList;
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
