package pt.c02oo.s02classe.s03lombriga;

public class AquarioLombriga {
    int posicaoCabeca;
    int tamanhoLombriga;
    int tamanhoAquario;
    boolean ladoLombriga = true;
    String lombriga = "";

    AquarioLombriga (int posicaoCabeca, int tamanhoLombriga, int tamanhoAquario) {
        this.posicaoCabeca = posicaoCabeca;
        this.tamanhoLombriga = tamanhoLombriga;
        this.tamanhoAquario = tamanhoAquario;
    }

    void apresenta () {
        if (ladoLombriga == true)
            for (int i = 1; i <= tamanhoAquario; i++) {
                if (i < posicaoCabeca)
                    lombriga = lombriga + '#';
                else if (i == posicaoCabeca)
                    lombriga = lombriga + '0';
                else if (i > posicaoCabeca && posicaoCabeca+tamanhoLombriga > i)
                    lombriga = lombriga + '@';
                else
                    lombriga = lombriga + '#';
            }
        else
            for (int i = 1; i <= tamanhoAquario; i++) {
                if (i < posicaoCabeca && posicaoCabeca-tamanhoLombriga > i)
                    lombriga = lombriga + '#';
                else if (i == posicaoCabeca)
                    lombriga = lombriga + '0';
                else if (i < posicaoCabeca && posicaoCabeca-tamanhoLombriga < i)
                    lombriga = lombriga + '@';
                else
                    lombriga = lombriga + '#';
            }
        System.out.println(lombriga);
        lombriga = "";
    }

    void crescer () {
    	if (ladoLombriga == true)
    		if (posicaoCabeca == tamanhoAquario || posicaoCabeca + tamanhoLombriga - 1 == tamanhoAquario)
    			return;
    		else
    			tamanhoLombriga++;
    	else
    		if (posicaoCabeca == 1 || posicaoCabeca - tamanhoLombriga == 0)
    			return;
    		else
    			tamanhoLombriga++;
    }

    void mover () {
        if (ladoLombriga == true)
        	if (posicaoCabeca == 1)
        		virar();
        	else
        		posicaoCabeca--;
        else
        	if (posicaoCabeca == tamanhoAquario)
        		virar();
        	else
        		posicaoCabeca++;
    }

    void virar () {
        if (ladoLombriga == true) {
            ladoLombriga = false;
            posicaoCabeca = posicaoCabeca + tamanhoLombriga - 1;
        }
        else {
            ladoLombriga = true;
            posicaoCabeca = posicaoCabeca - tamanhoLombriga + 1;
        }
        
    }
}