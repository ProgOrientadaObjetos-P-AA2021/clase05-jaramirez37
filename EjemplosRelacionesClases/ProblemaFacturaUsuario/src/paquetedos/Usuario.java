package paquetedos;

/**
 *
 * @author josep
 */
public class Usuario {
    
    private String nombre;
    private String apellido;
    private String identificacion;
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerApellido(String n){
        apellido = n;
    }
    
    public void establecerIdentificacion(String n){
        identificacion = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public String obtenerIdentificacion(){
        return identificacion;
    }
        
}

