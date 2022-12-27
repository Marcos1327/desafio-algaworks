public class NumeroUtil {

    static int maiorNumero1Att(int numero1, int numero2){
        return numero1 > numero2 ? numero1 : numero2;
    }

    static int maiorNumero1Att(int numero1, int numero2, int numero3){
        return maiorNumero1Att(maiorNumero1Att(numero1, numero2), numero3);
    }

    static double maiorNumero3Att(double numero1, double numero2){
        return numero1 > numero2 ? numero1 : numero2;
    }
    static double maiorNumero3Att(double numero1, double numero2, double numero3) {
            return maiorNumero3Att(maiorNumero3Att(numero1,numero2),numero3);

    }

}
