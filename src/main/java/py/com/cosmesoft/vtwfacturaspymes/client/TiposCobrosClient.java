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
import py.com.cosmesoft.vtwfacturaspymes.dto.ClienteModel;
import py.com.cosmesoft.vtwfacturaspymes.dto.GrupoModel;
import py.com.cosmesoft.vtwfacturaspymes.dto.TiposCobrosModel;
import py.com.cosmesoft.vtwfacturaspymes.dto.VendedorModel;
import py.com.cosmesoft.vtwfacturaspymes.util.ApplicationConstant;

/**
 *
 * @author usuario
 */
public class TiposCobrosClient {
    
    private static String baseUri;

    public static List<TiposCobrosModel> recibirTiposCobros() throws InterruptedException, ExecutionException {
        baseUri = getBaseUri();
        Client client = ClientBuilder.newClient();
        Future<List<TiposCobrosModel>> futureRespose = client
                .target(baseUri)
                .path(ApplicationConstant.TIPOS_COBROS_PATH)
                .request()
                .async()
                .get(new GenericType<List<TiposCobrosModel>>() {
                });
          List<TiposCobrosModel> tiposCobrosList = futureRespose.get();
        return tiposCobrosList;
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
