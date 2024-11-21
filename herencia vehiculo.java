public class Main {
class Vehiculo {
     String marca;
     int velocidadMaxima;
    // Constructor
    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;}
    public String getMarca() {
        return marca;}
    public int getVelocidadMaxima() {
        return velocidadMaxima;}

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");}
}
// Clase Coche que hereda de Vehiculo
public class Coche extends Vehiculo {
     int numeroDePuertas;
    // Constructor
    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }
    // Metodo
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }
}
}