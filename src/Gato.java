public class Gato extends Animal {
    public Gato(String nombre, int edad) {
        // con la palabra super estamos asignando la informacion heredada
        super(nombre,edad);
    }

    @Override //decorador
    public String hacerSonido(){
        return "Miau";
    }
}
