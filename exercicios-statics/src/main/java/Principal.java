public class Principal {

    public static void main(String[] args) {

        CalculoUtil calculoUtil = new CalculoUtil();

        double areaQuadrado = CalculoUtil.calcularAreaQuadrado(5.2);
        double areCirculo = CalculoUtil.calcularAreaCirculo(10.5);

        System.out.printf("a Area do quadrado é: %.2f%n", areaQuadrado);
        System.out.printf("a Area do circulo é: %.2f%n", areCirculo);


    }
}
