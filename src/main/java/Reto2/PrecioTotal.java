package Reto2;

public class PrecioTotal<totalComputador> {
    private Double totalComputadores = 0.0;
    private Double totalComputadoresPortatiles = 0.0;
    private Double totalComputadoresMesa = 0.0;
    private Computadores[] listaComputadores;

    PrecioTotal(Computadores[] pComputadores) {
        this.listaComputadores = pComputadores;
    }

    public void mostrarTotales() {
        for (int l = 0; l < listaComputadores.length; l++){

            if (listaComputadores[l] instanceof ComputadoresMesa) {
                totalComputadoresMesa += ((ComputadoresMesa)listaComputadores[l]).calcularPrecio();
            }
            if (listaComputadores[l] instanceof ComputadoresPortatiles) {
                totalComputadoresPortatiles += ((ComputadoresPortatiles)listaComputadores[l]).calcularPrecio();
            }
            if (!(listaComputadores[l] instanceof ComputadoresMesa) && !(listaComputadores[l] instanceof ComputadoresPortatiles) ) {
                totalComputadores += listaComputadores[l].calcularPrecio();
            }

    }
        totalComputadores += totalComputadoresMesa + totalComputadoresPortatiles;
        System.out.println("La suma del precio de los computadores es de " + totalComputadores);
        System.out.println("La suma del precio de los computadores de mesa es de " + totalComputadoresMesa);
        System.out.print("La suma del precio de los computadores portátiles es de " + totalComputadoresPortatiles);
    }
}