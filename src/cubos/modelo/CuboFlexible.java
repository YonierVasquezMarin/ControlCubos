package cubos.modelo;

import cubos.proceso.Empaque;

public class CuboFlexible extends Cubo {
    private int elasticidad;
    public CuboFlexible(double lado, double valorFabricacion, int elasticidad) {
        super(lado, valorFabricacion);
        this.elasticidad = elasticidad;
    }
    public boolean cabe(Empaque empaque) {
        double volumenEmpaque = empaque.volumen();
        double volumenCubo = this.volumen();
        return volumenEmpaque > volumenCubo;
    }
    public double precio() {
        double precioCubo = super.precio();
        double precioCuboIncrementado = 0;
        if (this.elasticidad < 50) {
            precioCuboIncrementado = precioCubo + (precioCubo * 0.04);
        } else {
            precioCuboIncrementado = precioCubo + (precioCubo * 0.06);
        }
        return precioCuboIncrementado;
    }
}
