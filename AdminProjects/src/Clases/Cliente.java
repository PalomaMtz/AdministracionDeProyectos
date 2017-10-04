
package Clases;

public class Cliente {
    //Parámetros
    private String RazonSocial;
    private String FechaRegistro;
    private String NombreComercial;
    private String RFC;
    private String Direccion;
    private String TelefonoEmpresa;
    private String Extension;
    private String NombreRepresentante;
    private String CorreoRepresentante;
    private String TelefonoRepresentante;
    private String ExtensionTelRepresentante;
    private String Telefono2Representante;
    private String RENIECYT;
    private String VigenciaRENIECYT;
    private String Descripcion;
   
    //Propiedades
    public String getRazonSocial() {
		return this.RazonSocial;
	} 
    public void setRazonSocial(String _razonSocial) {
		this.RazonSocial = _razonSocial ;
	}
    public String getFechaRegistro() {
		return this.FechaRegistro;
	}
    public void setNombreComercial(String _nombreComercial) {
		this.NombreComercial = _nombreComercial  ;
	}
    public String getNombreComercial(){
        return this.NombreComercial;
    }
    public void setFechaRegistro(String _fechaRegistro) {
		this.FechaRegistro = _fechaRegistro  ;
	}
    public String getRFC(){
        return this.RFC;
    }
    public void setRFC(String _RFC){
        this.RFC = _RFC;
    }    
    public String getDireccion (){
        return this.Direccion;    
    }public void setDireccion (String _Direccion){
        this.Direccion = _Direccion;    
    }
    
    public String getTelefonoEmpresa (){
        return this.TelefonoEmpresa;
    }
    public void setTelefonEmpresa (String _telefonoEmpresa){
        this.TelefonoEmpresa = _telefonoEmpresa;
    }
    public String getExtensionEmpresa (){
        return this.Extension;
    }
    public void setExtensionEmpresa(String _extension){
        this.Extension = _extension;
    }
    public String getNombreRepresentante (){
        return this.NombreRepresentante;
    }
    public void setNombreRepresentante (String _nombreRepresentante){
        this.NombreRepresentante = _nombreRepresentante;
    }
    public String getCorreoRepresentante (){
        return this.CorreoRepresentante;
    }
    public void setCorreoRepresentante ( String _correoRepresentante){
        this.CorreoRepresentante = _correoRepresentante;
    }
    public String getTelefonoRepresentante (){
        return this.TelefonoRepresentante;
    }
    public void setTelefonoRepresentante (String _telefonoRepresentante){
        this.TelefonoRepresentante = _telefonoRepresentante;
    }
    public String getExtensionTelRepresentante (){
        return this.ExtensionTelRepresentante;
    }
    public void setExtensionTelRepresentante (String _extensionTelRepresentante){
        this.ExtensionTelRepresentante = _extensionTelRepresentante;
    }
    public String getTelefono2Representante (){
        return this.Telefono2Representante;
    }
    public void setTelefono2Representante (String _telefono2Representante){
        this.Telefono2Representante = _telefono2Representante;
    }
    public String getRENIECYT (){
        return this.RENIECYT;
    }
    public void setRENIECYT (String _RENIECYT){
        this.RENIECYT = _RENIECYT;
    }
    public String getVigenciaRENIECYT (){
        return this.VigenciaRENIECYT;
    }
    public void setVigenciaRENIECYT (String _vigenciaRENIECYT){
        this.VigenciaRENIECYT = _vigenciaRENIECYT;
    }
    public String getDescripcion (){
        return this.Descripcion;
    }
    public void setDescripcion (String _descripcion){
        this.Descripcion = _descripcion;
    }
    
}
