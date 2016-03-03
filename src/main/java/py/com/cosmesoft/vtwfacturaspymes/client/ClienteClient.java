/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.cosmesoft.vtwfacturaspymes.client;

import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import py.com.cosmesoft.vtwfacturaspymes.dto.ClienteModel;
import py.com.cosmesoft.vtwfacturaspymes.dto.GrupoModel;
import py.com.cosmesoft.vtwfacturaspymes.dto.VendedorModel;
import py.com.cosmesoft.vtwfacturaspymes.util.ApplicationConstant;

/**
 *
 * @author usuario
 */
public class ClienteClient {

    private static String baseUri;

    public static List<ClienteModel> recibirClientes(String inicio, String cantidad, String filtroDescripcion, String filtroCodigo) throws InterruptedException, ExecutionException {
        baseUri = getBaseUri();
        Client client = ClientBuilder.newClient();
        Future<List<ClienteModel>> futureRespose = client
                .target(baseUri)
                .path(ApplicationConstant.CLIENTE_PATH)
                .resolveTemplate("codEmpresa", ApplicationConstant.COD_EMPRESA)
                .resolveTemplate("inicio", inicio)
                .resolveTemplate("cantidad", cantidad)
                .resolveTemplate("filtroDescripcion", filtroDescripcion)
                .resolveTemplate("filtroCodigo", filtroCodigo)
                .request()
                .async()
                .get(new GenericType<List<ClienteModel>>() {
                });
        List<ClienteModel> clienteList = futureRespose.get();
        return clienteList;
    }

    public static ClienteModel recibirClientebyCodigo(String codigo) throws InterruptedException, ExecutionException {
        baseUri = getBaseUri();
        Client client = ClientBuilder.newClient();
        Future<ClienteModel> futureRespose = client
                .target(baseUri)
                .path(ApplicationConstant.CLIENTE_COD_PATH)
                .resolveTemplate("codEmpresa", ApplicationConstant.COD_EMPRESA)
                .resolveTemplate("codCliente", codigo)
                .request()
                .async()
                .get(new GenericType<ClienteModel>() {
                });
        ClienteModel cliente = futureRespose.get();
        return cliente;
    }

    public static Long cantidadClientes() throws InterruptedException, ExecutionException {
        baseUri = getBaseUri();
        Client client = ClientBuilder.newClient();
        Future<Long> futureRespose = client
                .target(baseUri)
                .path(ApplicationConstant.CLIENTE_CANTIDAD_PATH)
                .resolveTemplate("codEmpresa", ApplicationConstant.COD_EMPRESA)
                .request()
                .async()
                .get(new GenericType<Long>() {
                });
        Long clienteCantidad = futureRespose.get();
        return clienteCantidad;
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
