package co.reto1.dominio;

public class Calculadora {
    private Suma sum = new Suma();
    private Resta res = new Resta();
    private Division div = new Division();
    private Multiplicacion mul = new Multiplicacion();
    private Redondeo numRed = new Redondeo();
    public double sumar(){
        return sum.sumar();
    }
    public double restar(){
        return res.restar();
    }
    public double dividir(){
        return div.dividir();
    }
    public double multiplicar(){
        return mul.multiplicar();
    }
    public double redondear(double num){
        return numRed.redondear(num);
    }

}
