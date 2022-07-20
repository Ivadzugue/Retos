package Reto2;

public class ComputadoresMesa extends Computadores{
    Integer ALMACENAMIENTO_BASE = 50;
    Integer almacenamiento;

    public ComputadoresMesa(){
        this.peso = PESO_BASE;
        this.precioBase = PRECIO_BASE;
        this.consumoW = CONSUMO_W;
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }

    public ComputadoresMesa(Double precioBase, Integer peso){
        super(precioBase,peso);
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }
    public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer almacenamiento){
        super(precioBase, peso, consumoW);
        this.almacenamiento = almacenamiento;
    }

    public Double calcularPrecio(){
        Double adicion = super.calcularPrecio();
        if (almacenamiento > 100.0){
            adicion +=50.0;
        }
        return adicion;
    }

    public Integer getCarga(){
        return almacenamiento;
    }
}
