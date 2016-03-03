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
    public static final String COD_SUCURSAL = "01";

    /*ENTIDADES PATH*/
    public static final String GRUPO_PATH = "grpArticulo/getListaGruposbyEmpresa/{codEmpresa}";
    public static final String ARTICULO_PATH = "articulos/getLazyListaArticulos/{codEmpresa}/{inicio}/{cantidad}/{filtro}/{codGrupo}";
    public static final String CLIENTE_PATH = "clientes/getListaClientesLazy/{codEmpresa}/{inicio}/{cantidad}/{filtroDescripcion}/{filtroCodigo}";
    public static final String CLIENTE_COD_PATH = "clientes/getClientebyCodigo/{codEmpresa}/{codCliente}";
    public static final String CLIENTE_CANTIDAD_PATH = "clientes/getCantidadClientes/{codEmpresa}";
    public static final String VENDEDOR_PATH = "vendedores/getListaVendedoresbyEmpresa/{codEmpresa}";
    public static final String MESAS_PATH = "mesas/getListaMesasbyEmpresabySucursal/{codEmpresa}/{codSucursal}";
    public static final String TIPOS_COBROS_PATH = "tiposCobros/getTiposCobros";
    public static final String USUARIO_PATH = "usuarios/getUsuario/{userName}";
    public static final String SERIES_PATH = "series/getSeries/{userName}";
    public static final String PEDIDOS_PATH = "mesas/getPedidosMesabyEmpresabySucursal/{codEmpresa}/{codSucursal}";

    /*CARPETAS*/
    public static final String CARPETA_ICONOS = "J:\\proyectos-cosmesoft\\VtwFacturasPymes\\src\\main\\java\\recursos\\icon";
    public static final String CARPETA_IMAGENES = "J:\\proyectos-cosmesoft\\VtwFacturasPymes\\src\\main\\java\\recursos\\img";

    /*TIPOS*/
    public static final String VEN = "VendedorModel";
    public static final String MES = "MesaModel";
    public static final String CLI = "ClienteModel";
    public static final String PED = "PedidoCabeceraModel";

    /*VARIOS*/
    public static final String ELIMINAR = "ELIMINAR_BTN";
    public static final String EDITAR = "EDITAR_BTN";
}
