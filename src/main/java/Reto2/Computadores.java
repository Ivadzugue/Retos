package Reto2;

public class Computadores {
    char CONSUMO_W = 'F';
    double PRECIO_BASE = 100.0;
    Integer PESO_BASE = 5;

    Integer peso;
    char consumoW;
    double precioBase;

    public Computadores(){
        this.peso = PESO_BASE;
        this.consumoW = CONSUMO_W;
        this.precioBase = PRECIO_BASE;
    }
    public Computadores(Double precioBase, Integer peso){
        this.peso = peso;
        this.consumoW = CONSUMO_W;
        this.precioBase = precioBase;
    }

    public Computadores (Double precioBase, Integer peso, char consumoW){
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = consumoW;
    }

    public Double calcularPrecio(){
        Double adicion = 0.0;
        switch (consumoW){
            case 'A':
                adicion += 100.0;
                break;
            case 'B':
                adicion += 80.0;
            case 'C':
                adicion += 60.0;
                break;
            case 'D':
                adicion += 50.0;
                break;
            case 'E':
                adicion += 30.0;
                break;
            case 'F':
                adicion += 10.0;
                break;
        }
        if (peso >= 0 && peso < 19) {
            adicion += 10.0;
        }else if (peso >= 20 && peso < 49){
            adicion += 50.0;
        }else if (peso >= 50 && peso < 79){
            adicion += 80.0;
        }else if (peso >= 80){
            adicion += 100.0;
        }
        return precioBase + adicion;
    }

    public int getPeso(){
        return peso;
    }
    public char getConsumoW(){
        return consumoW;
    }
    public double getPrecioBase(){
        return precioBase;
    }
}
