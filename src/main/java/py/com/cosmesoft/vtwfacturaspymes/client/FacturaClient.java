/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.cosmesoft.vtwfacturaspymes.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import static py.com.cosmesoft.vtwfacturaspymes.client.ClienteClient.getBaseUri;
import py.com.cosmesoft.vtwfacturaspymes.dto.CabeceraFacturaModel;
import py.com.cosmesoft.vtwfacturaspymes.dto.ClienteModel;
import py.com.cosmesoft.vtwfacturaspymes.util.ApplicationConstant;


/**
 *
 * @author usuario
 */
public class FacturaClient {

    public static void guardarFactura(CabeceraFacturaModel cabeceraFacturaModel)
            throws InterruptedException, ExecutionException {
        //baseUri = getBaseUri();
        Client client = ClientBuilder.newClient();
        Future<CabeceraFacturaModel> futureRespose = client
                .target(getBaseUri())
                .path(ApplicationConstant.FACTURAS_PATH)
                .request()
                .async()
                .post(Entity.entity(cabeceraFacturaModel, MediaType.APPLICATION_JSON + ";charset=utf-8"),
                        CabeceraFacturaModel.class);
        Gson gson = new Gson();
        String json = gson.toJson(cabeceraFacturaModel);

        futureRespose.get();

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
