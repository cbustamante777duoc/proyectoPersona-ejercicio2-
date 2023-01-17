public class App {
    public static void main(String[] args) throws Exception {
    
        Persona persona = new Persona("Karina",46.0,1.67,22, 'm');

        
        // String carnet = persona.generarDNI();
        // carnet = persona.getDni();
        

        // System.out.println(persona.generarDNI());
        // System.out.println(persona.comprobarSexo());
        System.out.println(persona.calcularMasaCorporal());
        System.out.println(persona.toString());

        // Usted esta en su peso ideal
        // Informacion de la persona:
        // Nombre: Karina
        // Sexo: sexo femenino
        // Edad: 22 años
        // Altura: 1.67 metros
        // DNI: 72854K
        // Peso: 46.0 kg
    }
}
