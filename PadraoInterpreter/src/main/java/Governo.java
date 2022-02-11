public class Governo {
    /* Quantidade de imposto por cidadao*/
    public static String formula = "0.8 * value1";
    // public static String formula = "0.9 * value1 * 24";

    public static double calcular(double value1) {
        String expressao;
        expressao = formula.replace("value1", Double.toString(value1));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}