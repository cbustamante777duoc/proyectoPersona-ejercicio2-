
public class Persona {

    private String nombre;
    private String dni;
    private double peso;
    private double altura;
    private int edad;
    private char sexo = 'h';

    public Persona(String nombre, double peso, double altura, int edad, char sexo) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /*
     * metodo que contiene un arreglo de letras y segun el numero leciona la letra y
     * la retorna
     */
    public char generarLetraDNI(int res) {

        char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

        return letras[res];
    }

    public String generarDNI() {

        // va a agregar los numeros
        String carnet = "";
        // genera numero azar entre 1 y 9
        for (int i = 1; i <= 5; i++) {
            int dni = ((int) Math.floor(Math.random() * 9 + 1));
            carnet += dni;
        }

        // genera un numero al azar entre 1 y 23
        int numeroAzar = ((int) Math.floor(Math.random() * 22 + 1));

        return this.dni = carnet + generarLetraDNI(numeroAzar);
    }

    public String comprobarSexo() {
        String palabra = "sexo masculino";
        if (this.sexo == 'h' || this.sexo == 'H') {

            palabra = "sexo masculino";
        }

        if (this.sexo == 'm' || this.sexo == 'M') {

            palabra = "sexo femenino";
        }
        return palabra;
    }

    public String calcularMasaCorporal() {
        String mensaje = "";
        double pesoCalcular = this.peso / (Math.pow(altura, 2));

        if (pesoCalcular >= 20 || pesoCalcular <= 25) {
            mensaje = "Usted esta en su peso ideal";
        }

        else if (pesoCalcular < 25) {
            mensaje = "Usted debe de subir de peso";
        } else {
            mensaje = "Usted debe bajar de peso";
        }

        return mensaje;

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Informacion de la persona:\n"
        + "Nombre: " + nombre + "\n"
        + "Sexo: " + comprobarSexo() + "\n"
        + "Edad: " + edad + " años\n"
        + "DNI: " + generarDNI() + "\n"
        + "Peso: " + peso + " kg\n"
        + "Altura: " + altura + " metros\n";
    }

}