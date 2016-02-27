/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.cosmesoft.vtwfacturaspymes.util;

/**
 *
 * @author usuario
 */
public final class ApplicationConstant {

    /*DATOS CONEXION*/
    public static final String NOMBRE_PROYECTO = "SantaFe";
    public static final String BASE_REST_URI = "rest";
    public static final String DIRECCION = "http://localhost:8080/";

    public static final String COD_EMPRESA = "1";

    /*ENTIDADES PATH*/
    public static final String GRUPO_PATH = "grpArticulo/getListaGruposbyEmpresa/{codEmpresa}";
    public static final String ARTICULO_PATH = "articulos/getLazyListaArticulos/{codEmpresa}/{inicio}/{cantidad}/{filtro}/{codGrupo}";
    public static final String CLIENTE_PATH = "clientes/getListaClientesbyEmpresa/{codEmpresa}";
    public static final String VENDEDOR_PATH = "vendedores/getListaVendedoresbyEmpresa/{codEmpresa}";
    public static final String MESAS_PATH = "mesas/getListaMesasbyEmpresabySucursal/{codEmpresa}/{codSucursal}";

    /*CARPETAS*/
    public static final String CARPETA_ICONOS = "J:\\proyectos-cosmesoft\\VtwFacturasPymes\\src\\main\\java\\recursos\\icon";
    public static final String CARPETA_IMAGENES = "J:\\proyectos-cosmesoft\\VtwFacturasPymes\\src\\main\\java\\recursos\\img";

    /*TIPOS*/
    public static final String VEN = "VendedorModel";
    public static final String MES = "MesaModel";
    public static final String CLI = "ClienteModel";

}
