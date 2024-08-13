public class Persona {
     private String nombre, apellido;
     private int edad;
    
    
    //Constructor
    public Persona(String nombre, String apellido, int edad, String nombreCarrera, int duracion, boolean estaEnCurso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        
    }


    //métodos
    public String darNombreCompleto(){
        return apellido + ", " + nombre;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String enviarSaludo(String saludado){
        if(edad > 40) return "Buenos días querido " + saludado;
        return "Hola, ¿Cómo estás " + saludado + "?";
    }
   
    
}
