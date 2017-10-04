package AdminAplication;
//import org.bson.types.*;
import java.text.*;
import java.util.*;
import java.time.*;

public class MetodosPrincipales { 
    ProcesosMongoDB procesosDB = new ProcesosMongoDB();

    Clock c = new Clock() {

            @Override
            public ZoneId getZone() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public Clock withZone(ZoneId zone) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public Instant instant() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    //Thread cronometro;
    Timer cronometro = new Timer();

    public String ObtenerFechaHora(){
        Date d = new Date();
        String Tiempo;
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Tiempo = (hourdateFormat.format(d));
        return Tiempo;    
}

    public void Cerrar_Inactivo(){
        //this.cronometro.start();
        System.out.print("Cronometro");
        System.out.print(cronometro.toString());
        System.out.println( cronometro);
        //Crear un a variable de contador
        //insertar u timer y sumar contador++
        //comparar  con el timer si contador > TimeToClose
        //cuando el mouse se mueva en el evento MouseMove contador = 0
        //Timer Inicia de nuevo
    }
    
    public Boolean ValidarRFC(String RFC){
        /*Método que tiene la función de validar el rfc*/
        RFC = RFC.toUpperCase();
        return RFC.matches("[A-Z]{4}[0-9]{6}[A-Z0-9]{3}") || RFC.toUpperCase().matches("[A-Z]{3}[0-9]{6}[A-Z0-9]{3}");
    }
    
    public Boolean ValidarTelefono(String telefono){
        //Método que tiene la función de validar el rfcc
        return telefono.matches("[+]{1}[0-9]{12}") || telefono.matches("[0-9]{10}") || telefono.matches("[0-9]{12}");
    }
        
    public String GenerarCodificacion(String _tipo){
        //Declaracion de variables para formar la codificacion
        int NumeroProyectos;
        String Codificacion = "";
        Date _fecha = new Date();
        //Inicializacion de variables para obtener mes(0=Enero.. 11=Diciembre) y año
        int mes = _fecha.getMonth(),
            año =_fecha.getYear();
        //Estructura para determinar el tipo al que pertenece la codificación
        switch (_tipo) {
            case "Proyecto":
                Codificacion += "P";
                break;
            case "Formato":
                Codificacion += "F";
                break;
            case "Cotizacion":
                Codificacion += "C";
                break;
            case "Solicitud":
                Codificacion += "S";
                break;
        }
        //Estructura para determinar el mes
        switch (mes) {
            case 0:
                Codificacion += "A";
                break;
            case 1:
                Codificacion += "B";
                break;
            case 2:
                Codificacion += "C";
                break;
            case 3:
                Codificacion += "D";
                break;
            case 4:
                Codificacion += "E";
                break;
            case 5:
                Codificacion += "F";
                break;
            case 6:
                Codificacion += "G";
                break;
            case 7:
                Codificacion += "H";
                break;
            case 8:
                Codificacion += "I";
                break;
            case 9:
                Codificacion += "J";
                break;
            case 10:
                Codificacion += "K";
                break;
            case 11:
                Codificacion += "L";
                break;
        }        
        NumeroProyectos = procesosDB.TotalRegistros("Proyectos"); //Cantidad de Proyectos registrados
        Codificacion += año%100;// "año%100" Obtener los últimos dos digitos del año     
        Codificacion+=String.format("%02d",NumeroProyectos);// "String.format" Codificar con formato 01, 02, 03... etc. // no usar numero de proyectos, podrian repetirse los codigos
        //Regresar la cadena resultante
        return Codificacion;
    }
    
    
   
    
}