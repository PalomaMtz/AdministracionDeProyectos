package AdminAplication;

import com.mongodb.MongoClient;
import com.mongodb.DB;

public class Conexion {
    
    //Base de datos
    DB DataBase;
   //Conexion a la base de datos
    public DB Conexion(){
       try{
            MongoClient mongo = new MongoClient("localhost",27017);
            DataBase = mongo.getDB("AdminProjects");
            System.out.println("Conexion segura a la base de datos");
            return DataBase;
        }
        catch(Exception e){
            System.out.println("NO se ha creado la conexion");
            }
        return DataBase;
     }
    
    /*
    tabla           ----    coleccion
    fila o tupla    ----    documento
    columna         ----    field
    clave primaria  ----    _id (field)
    indice          ----    indice
    Group By        ----    Aggregation
    
    */
}   

