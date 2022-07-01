package Reto1;

public class BecaUniversitaria {

int tiempo;
double monto;
double interes;

    public BecaUniversitaria(double pMonto, double pInteres,int pTiempo){
    }

    public BecaUniversitaria (int pTiempo, double pMonto, double pInteres) {
        this.monto = pMonto;
        this.tiempo = pTiempo;
        this.interes = pInteres;
    }

    public double calcularInteresSimple(){
        double interesSimple = (interes*monto*tiempo)/100;
        return Math.round(interesSimple);
    }

    public double calcularInteresCompuesto(){
        double interesCompuesto = (Math.pow((1+(interes/100)),tiempo)-1)*monto;
        return Math.round(interesCompuesto);
    }

    public String compararInversion (int pTiempo, double pMonto, double pInteres){
        this.monto = pMonto;
        this.tiempo = pTiempo;
        this.interes = pInteres;
        double diferencia = calcularInteresCompuesto()-calcularInteresSimple();
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
    }

    public String compararInversion() {
        if (interes != 0)
            return compararInversion(tiempo,monto,interes);
        else
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
    }


    public static void main(String[] args) {
        BecaUniversitaria becaUniversitaria2 = new BecaUniversitaria(48,10000, 2.0);
        System.out.println(becaUniversitaria2.calcularInteresSimple());
        System.out.println(becaUniversitaria2.calcularInteresCompuesto());
        System.out.println(becaUniversitaria2.compararInversion());
    }
}

