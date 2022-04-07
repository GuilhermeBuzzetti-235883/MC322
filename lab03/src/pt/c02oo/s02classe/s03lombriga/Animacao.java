package pt.c02oo.s02classe.s03lombriga;

public class Animacao {
    String animacao;
    int posicao = 6;
    AquarioLombriga saida;

    Animacao (String animacao) {
        this.animacao = animacao;
        saida = null;
    }

    void conecta (AquarioLombriga saida) {
        this.saida = saida;
    }

    void passo () {
        if (animacao.charAt(posicao) == 'C') {
            saida.crescer();
        }
        else if (animacao.charAt(posicao) == 'M')
            saida.mover();
        else
            saida.virar();
        posicao++;
    }

    void apresenta () {
        saida.apresenta();
    }
}