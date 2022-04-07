package pt.c02oo.s02classe.s03lombriga;

public class AppLab03 {
    public static void main(String[] args) throws Exception {

        String strL = "080403MCMVM";
        int tamanhoAquario = 8;
        int tamanhoLombriga = 4;
        int posicaoCabeca = 3;

        Animacao a = new Animacao(strL);
        AquarioLombriga l = new AquarioLombriga(posicaoCabeca, tamanhoLombriga, tamanhoAquario);
        a.conecta(l);

        for (int i = 6; i < strL.length(); i++) {
            a.apresenta();
            a.passo();
        }
        a.apresenta();
    }
}