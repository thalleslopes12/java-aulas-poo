package br.sesi.poo;

import br.sesi.poo.cabeca.Cabeca;
import br.sesi.poo.cabeca.Olho;

public class Main {

    public static void main(String[] args) {
        Olho olho1 = new Olho();
        olho1.cego = true;
        olho1.diametroOlho = 2.0f;
        olho1.corIris = "azul";

        Olho olho2 = new Olho();
        olho2.cego = false;
        olho2.diametroOlho = 2.5f;
        olho2.corIris = "castanho";

        Cabeca cabeca = new Cabeca();
        cabeca.olhoEsquerdo = olho1;
        cabeca.olhoDireito = olho2;

        Pessoa pessoa1 = new Pessoa();

        pessoa1.cabeca = cabeca;

        pessoa1.cabeca.olhoEsquerdo = olho1;
        pessoa1.cabeca.olhoDireito = olho2;

        //pessoa1.cabeca.olhoDireito.cego = false;
        //pessoa1.cabeca.olho.diametroOlho = 3.0f;


    }
}
