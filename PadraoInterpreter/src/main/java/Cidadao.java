public class Cidadao {
    private double value1;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double calcular() {
        return Governo.calcular(this.value1);
    }
}