package cubos.proceso;

import cubos.modelo.Cubo;
import cubos.modelo.CuboRigido;

public class Empacador {
    public boolean empacar(Cubo cubo, Empaque empaque) {
        if (cubo.cabe(empaque)) {
            cubo.setEmpaque(empaque);
            return true;
        }
        return false;
    }
    public boolean empacar(Cubo cubo) {
        if (cubo instanceof CuboRigido) {
            double largoEmpaque = cubo.getLado() + 0.5;
            double anchoEmpaque = cubo.getLado() + 0.5;
            double altoEmpaque = cubo.getLado() + 0.5;
            Empaque empaque = new Empaque(largoEmpaque, anchoEmpaque, altoEmpaque);
            return empacar(cubo, empaque);
        } else {
            return false;
        }
    }
}
