package calculadora.pob;
public class Calculadora    {
    public double Soma(double n1, double n2) {
        return n1 + n2;
    }

    public double Subtrai(double n1, double n2) {
        return n1 - n2;
    }

    public double Multiplica(double n1, double n2) {
        return n1 * n2;
    }
    public double Divide (double n1, double n2) {
        return n1 / n2;
    }

    public double Raiz (double n1) {
        return Math.sqrt(n1);
    }

    public double Potencia (double n1, double n2) {
        return Math.pow(n1, n2);
    }

}
