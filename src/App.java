public class App {
    public static void main(String[] args) throws Exception {
        // Animal animal = new Animal("Bestia", 200);
        // Gato gato = new Gato("Glottis", 15);
        // Perro perro = new Perro("Firulais", 3);

        // System.out.println("El animal llamado "+ animal.nombre + " Hace: ");
        // System.out.println(animal.hacerSonido());
        // System.out.println("El animal llamado "+ gato.nombre + " Hace: ");
        // System.out.println(gato.hacerSonido());
        // System.out.println("El animal llamado "+ perro.nombre + " Hace: ");
        // System.out.println(perro.hacerSonido());
        // System.out.println("El total de los animales creados es de: " + Animal.getCantAnimales());
        // System.out.println("Yo atiendo a mis animales en: " + Veterinaria.nombre);

        Circulo circulo = new Circulo(10);
        Rectangulo rectangulo = new Rectangulo(8, 6);
        
        circulo.printInfo();
        System.out.println("El área de este circulo es " + circulo.calcularArea());
        rectangulo.printInfo();
        
        System.out.println("El área de este rectángulo es " + rectangulo.calcularArea());
    }
}
