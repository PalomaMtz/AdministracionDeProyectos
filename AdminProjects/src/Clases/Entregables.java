
package Clases;

import java.util.ArrayList;

public class Entregables {
    String Codigo;
    ArrayList<String>  Concepto;
    ArrayList<String>  Descripcion;
    ArrayList<Integer>  Importe;
    
    public void setCodigo(String _codigo){
       this.Codigo = _codigo;
    }
    public String getCodigo(){
       return this.Codigo;
    }
    public void setConcepto(ArrayList<String> _concepto){
       this.Concepto = _concepto;
    }
    public ArrayList<String> getConcepto(){
       return this.Concepto;
    }
    public void setDescripcion(ArrayList<String> _descripcion){
       this.Descripcion = _descripcion;
    }
    public ArrayList<String> getDescripcion(){
       return this.Descripcion;
    }
    public void setImporte(ArrayList<Integer> _importe){
        this.Importe = _importe;
    }
    public ArrayList<Integer> getImporte(){
       return this.Importe;
    }
}
