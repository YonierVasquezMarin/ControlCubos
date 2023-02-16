package cubos.modelo;

import cubos.proceso.Empaque;

public abstract class Cubo {
    private double lado;
    private double valorFabricacion;
    private Empaque empaque;
    public Cubo(double lado, double valorFabricacion) {
        this.lado = lado;
        this.valorFabricacion = valorFabricacion;
    }
    public double getLado() {
        return lado;
    }
    public void setEmpaque(Empaque empaque) {
        this.empaque = empaque;
    }
    public boolean estaEmpacado() {
        return empaque != null;
    }
    public double volumen() {
        return lado * lado * lado;
    }
    public double precio() {
        double porcentajeIva = 0.19;
        return this.valorFabricacion + (this.valorFabricacion * porcentajeIva);
    }
    public abstract boolean cabe(Empaque empaque);
    public String toString() {
        return "Cubo de lado " + lado + "cm con un precio de $" + this.precio() + "";
    }
}
