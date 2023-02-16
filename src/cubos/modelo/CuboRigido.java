package cubos.modelo;

import cubos.proceso.Empaque;

public class CuboRigido extends Cubo {
    public CuboRigido(double lado, double valorFabricacion) {
        super(lado, valorFabricacion);
    }
    public boolean cabe(Empaque empaque) {
        if (empaque.getLargo() > this.getLado() && empaque.getAncho() > this.getLado() && empaque.getAlto() > this.getLado()) {
            return true;
        } else {
            return false;
        }
    }
}
