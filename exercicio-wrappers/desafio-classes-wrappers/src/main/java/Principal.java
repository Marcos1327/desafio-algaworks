public class Principal {

    public static void main(String[] args) {
        var tv = new Televisor();

        //Não deveria mudar o volume do canal
        tv.mudarVolume(20);
        tv.mudarCanal(130);


        //Deveria mudar o volume e canal
        tv.mudarVolume(300);
        tv.mudarCanal(10);
    }
}
