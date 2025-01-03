package poo;

public class Numero {
    private double x;

    // Método getter para obter o valor de x
    public double getX() {
        return x;
    }

    // Método setter para definir o valor de x
    public void setX(double x) {
        this.x = x;
    }

    // Métodos de operação
    public double soma(double x, double y) {
        setX(x + y);
        return getX();
    }

    public double subtracao(double x, double y) {
        setX(x - y);
        return getX();
    }

    public double multiplicacao(double x, double y) {
        setX(x * y);
        return getX();
    }

    public double divisao(double x, double y) {
        if (y == 0) { // Verifica divisão por zero
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        setX(x / y);
        return getX();
    }
}
