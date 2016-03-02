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
import py.com.cosmesoft.vtwfacturaspymes.dto.PedidoCabeceraModel;
import py.com.cosmesoft.vtwfacturaspymes.dto.VendedorModel;

/**
 *
 * @author usuario
 */
public class PedidosClient {

    private static String baseUri;

    public static List<PedidoCabeceraModel> recibirPedidos() throws InterruptedException, ExecutionException {
        baseUri = getBaseUri();
        Client client = ClientBuilder.newClient();
        Future<List<PedidoCabeceraModel>> futureRespose = client
                .target(baseUri)
                .path(ApplicationConstant.PEDIDOS_PATH)
                .resolveTemplate("codEmpresa", ApplicationConstant.COD_EMPRESA)
                .resolveTemplate("codSucursal", ApplicationConstant.COD_SUCURSAL)
                .request()
                .async()
                .get(new GenericType<List<PedidoCabeceraModel>>() {
                });
        List<PedidoCabeceraModel> pedidosList = futureRespose.get();
        return pedidosList;
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
