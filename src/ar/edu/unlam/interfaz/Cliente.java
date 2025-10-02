package ar.edu.unlam.interfaz;

class Cliente {
    String nombre;
    int mesa;
    double cuenta;

    public Cliente(String nombre, int mesa) {
        this.nombre = nombre;
        this.mesa = mesa;
        this.cuenta = 0.0;
    }

    public void agregarPedido(double monto) {
        this.cuenta += monto;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " - Mesa: " + mesa + " - Cuenta: $" + cuenta;
    }
}