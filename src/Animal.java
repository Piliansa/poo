public class Animal {
        String nombre;
        int edad;
        static int contAnimal = 0;

        public Animal(String nombre, int edad){
            this.nombre = nombre;
            this.edad = edad;
            contAnimal++;
        }

        public String hacerSonido(){
            return "hacer sonido genérico";
        }

        public static int getCantAnimales(){
            return contAnimal;
        }
     
        
}

