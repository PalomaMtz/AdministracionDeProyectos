
package Clases;

import java.util.ArrayList;

public class Proyecto {
    //parámetros
    String CodigoProyecto;
    String AdminProyecto;
    String CorreoAdminProyecto;
    String TelefonoAdminProyecto;    
    String TecnicoProyecto;
    String CorreoTecnicoProyecto;
    String TelefonoTecnicoProyecto;
    String TituloProyecto;
    String DescripcionProyecto;
    String ObjetivoProyecto;
    String JustificacionProyecto;
    ArrayList<String> Actividades;
    String ResponsablesProyecto;
    int ImporteEstimado; 
    String StatusProyecto;
    
    
    //propiedades Get y Set para poder leer y modificar los datos
    public void setCodigoProyecto(String _codigoProyecto){
        this.CodigoProyecto = _codigoProyecto;
    }
    public String getCodigoProyecto(){
        return this.CodigoProyecto;
    }
    public void setNombreAdminProyecto(String _adminProyecto){
        this.AdminProyecto = _adminProyecto;
    }
    public String getNombreAdminProyecto(){
        return this.AdminProyecto;
    }
    public void setCorreoAdminProyecto(String _correoAdmin){
        this.CorreoAdminProyecto = _correoAdmin;
        
    }
    public String getCorreoAdminProyecto(){
        return this.CorreoAdminProyecto;
    }
    public void setTelefonoAdminProyecto(String _telefonoAdmin){
        this.TelefonoAdminProyecto = _telefonoAdmin;
    }
    public String getTelefonoAdminProyecto(){
        return this.TelefonoAdminProyecto;
    }
    
    public void setNombreTecnicoProyecto(String _tecnicoProyecto){
        this.TecnicoProyecto = _tecnicoProyecto;
    }
    public String getNombreTecnicoProyecto(){
        return this.TecnicoProyecto;
    }
    public void setCorreoTecnicoProyecto(String _correoTecnico){
        this.CorreoTecnicoProyecto = _correoTecnico;
        
    }
    public String getCorreoTecnicoProyecto(){
        return this.CorreoTecnicoProyecto;
    }
    public void setTelefonoTecnicoProyecto(String _telefonoTecnico){
        this.TelefonoTecnicoProyecto = _telefonoTecnico;
    }
    public String getTelefonoTecnicoProyecto(){
        return this.TelefonoTecnicoProyecto;
    }
    
    public void setTituloProyecto(String _nombreProyecto){
        this.TituloProyecto = _nombreProyecto;
    }
    public String getTituloProyecto(){
        return this.TituloProyecto;
    }
    public void setDescripcionProyecto(String _descripcionProyecto){
        this.DescripcionProyecto = _descripcionProyecto;
    }
    public String getDescripcionProyecto(){
        return this.DescripcionProyecto;
    }
    public void setObjetivosProyecto(String _objetivosProyecto){
        this.ObjetivoProyecto = _objetivosProyecto;
    }
    public String getObjetivosProyecto(){
        return this.ObjetivoProyecto;
    }    
    public void setJustificacionProyecto(String _justificacionProyecto){
        this.JustificacionProyecto = _justificacionProyecto;
    }
    public String getJustificacionProyecto(){
        return this.JustificacionProyecto;
    }
    public void setResponsablesProyecto(String _responsablesProyecto){
        this.ResponsablesProyecto = _responsablesProyecto;
    }
    public String getResponsablesProyecto(){
        return this.ResponsablesProyecto;
    }
   /*[filas][columnas]*/
    public void setActividades(ArrayList<String> _actividades){
        this.Actividades = _actividades;        
    }
    public ArrayList<String> getActividades(){
        return this.Actividades;
    }

    
    public void setImporteEstimado(int _importeEstimado){
        this.ImporteEstimado = _importeEstimado;        
    }
    public int getImporteEstimado(){
        return this.ImporteEstimado;
    }    
    public void setStatusProyecto(String _StatusProyecto){
        this.StatusProyecto = _StatusProyecto;        
    }
    public String getStatusProyecto(){
        return this.StatusProyecto;
    }
}

//<editor-fold desc="Posibles cambios">
/*
    String ActividadFase1;
    String ActividadFase2;
    String ActividadFase3;
    String ActividadFase4;
    String ActividadFase5;
    public void setActividadFase1(String _actividad1){
        this.ActividadFase1 = _actividad1;
    }
    public String getActividadFase1(){
        return this.ActividadFase1;
    }
    public void setActividadFase2(String _actividad2){
        this.ActividadFase2 = _actividad2;
    }
    public String getActividadFase2(){
        return this.ActividadFase2;
    }
    public void setActividadFase3(String _actividad3){
        this.ActividadFase3 = _actividad3;
    }
    public String getActividadFase3(){
        return this.ActividadFase3;
    }
    public void setActividadFase4(String _actividad4){
        this.ActividadFase4 = _actividad4;
    }
    public String getActividadFase4(){
        return this.ActividadFase4;
    }
    public void setActividadFase5(String _actividad5){
        this.ActividadFase5 = _actividad5;
    }
    public String getActividadFase5(){
        return this.ActividadFase5;
    }*/
//</editor-fold> 