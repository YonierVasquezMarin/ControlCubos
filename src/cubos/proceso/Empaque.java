package cubos.proceso;

public class Empaque {
    private double largo;
    private double ancho;
    private double alto;
    public Empaque(double largo, double ancho, double alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }
    public double getLargo() {
        return largo;
    }
    public double getAncho() {
        return ancho;
    }
    public double getAlto() {
        return alto;
    }
    public double volumen() {
        return largo * ancho * alto;
    }
}
