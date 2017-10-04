
package AdminAplication;

import Clases.*;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;


public class ProcesosMongoDB {
    
    private Conexion bd = new Conexion();    
    private DBCollection coleccion; //Tablas     
    private BasicDBObject documento = new BasicDBObject();//Columnas
    private DBCursor cursor;//Query
    
    public int TotalRegistros(String _coleccion){
        int cont;
        coleccion = bd.Conexion().getCollection(_coleccion);
        cont = coleccion.find().count();  
        cont=cont+1;        
        return cont;      
    }
                
//<editor-fold desc="Procesos para el Cliente">

    //contar los registros de una determinada colección
     public String GuardarCliente(String _coleccion, Cliente _cliente){
        //Obtener la coleccion correspondiente para insertar los datos
        coleccion = bd.Conexion().getCollection(_coleccion);
        //Creación del documento para insertarlo enla Base de Datos
        documento.put("RazonSocial",_cliente.getRazonSocial());
        documento.put("FechaRegistro",_cliente.getFechaRegistro());
        documento.put("NombreComercial",_cliente.getNombreComercial());
        documento.put("RFC",_cliente.getRFC());
        documento.put("Direccion",_cliente.getDireccion());
        documento.put("TelefonoEmpresa",_cliente.getTelefonoEmpresa());
        documento.put("ExtensionEmpresa",_cliente.getExtensionEmpresa());
        documento.put("NombreRepresentante",_cliente.getNombreRepresentante());
        documento.put("CorreoRepresentante",_cliente.getCorreoRepresentante());
        documento.put("TelefonoRepresentante",_cliente.getTelefonoRepresentante());
        documento.put("ExtensionTelRepresentante",_cliente.getExtensionTelRepresentante());
        documento.put("Telefono2Representante",_cliente.getTelefono2Representante());
        documento.put("RENUECYT",_cliente.getRENIECYT());
        documento.put("VigenciaRENIECYT",_cliente.getVigenciaRENIECYT());
        documento.put("Descripcion",_cliente.getDescripcion());
        //Inseratar los datos en la Base de Datos
        coleccion.insert(documento);
        return "Guardado";
    }
//</editor-fold>   
     
 //<editor-fold  desc="operaciones basicas para proyecto Proyecto">
    public String GuardarProyecto(String _coleccion, Proyecto _proyecto, String _coleccion2, Entregables _entregables){
        
        
        
        
        //Obtención de la tabla correspondiente para insertar los datos
        this.coleccion = bd.Conexion().getCollection(_coleccion);
        //Creación del documento para insertarlo enla Base de Datos
        documento.put("CodigoProyecto", _proyecto.getCodigoProyecto());
        documento.put("NombreAdminProyecto",_proyecto.getNombreAdminProyecto());
        documento.put("CorreoAdminProyecto",_proyecto.getCorreoAdminProyecto());
        documento.put("TelefonoAdminProyecto",_proyecto.getTelefonoAdminProyecto());
        documento.put("NombreTecnicoProyecto",_proyecto.getNombreTecnicoProyecto());
        documento.put("TelefonoTecnicoProyecto",_proyecto.getTelefonoTecnicoProyecto());
        documento.put("CorreoTecnicoProyecto",_proyecto.getCorreoTecnicoProyecto());
        documento.put("TituloProyecto",_proyecto.getTituloProyecto());
        documento.put("DescripcionProyecto",_proyecto.getDescripcionProyecto());
        documento.put("ObjetivoProyecto",_proyecto.getObjetivosProyecto());
        documento.put("JustificacionProyecto",_proyecto.getJustificacionProyecto());
        documento.put("Actividades",_proyecto.getActividades());
        documento.put("ResponsablesProyecto",_proyecto.getResponsablesProyecto());
        documento.put("ImporteEstimado",_proyecto.getImporteEstimado());
        documento.put("StatusProyecto",_proyecto.getStatusProyecto());
        
        //Insertar los datos del proyecto en la Base de Datos
        coleccion.insert(documento); 
        
        //Guardar los entregables del proyecto
        documento.clear();
         this.coleccion = bd.Conexion().getCollection(_coleccion2); 
        //Colocar los datos a insertar en el documento
        documento.put("Codigo",_entregables.getCodigo());
        documento.put("Concepto",_entregables.getConcepto());
        documento.put("Descripcion",_entregables.getDescripcion());
        documento.put("ImporteEstimado",_entregables.getImporte());
        //Insertar los datos de entregables del proyecto en la Base de Datos
        coleccion.insert(documento); 
        
        return "Guardado";   
    }           

    public void BuscarProyecto(String _codigo, String _coleccion){
        //Buscar proyecto por medio del codigo de proyecto
        coleccion = bd.Conexion().getCollection(_coleccion);
	// Obtener el documento donde "CodigoProyecto" = codigo   
        documento.put( "CodigoProyecto", _codigo);              
        cursor = coleccion.find (documento); 
        DBObject Objeto = cursor.next();//System.out.println(cursor.next());    
        Objeto.get("Espacio a buscar");
        
        BasicDBList listaEntregables = (BasicDBList) Objeto.get("Entregables");
	ArrayList<Object> actividades = new ArrayList<>(listaEntregables);
        
        ArrayList<Object> entregables = new ArrayList<>(actividades);
                
        System.out.println(actividades.get(0));
        System.out.println(entregables);
         
 
 }
            
 } 
//</editor-fold>   
