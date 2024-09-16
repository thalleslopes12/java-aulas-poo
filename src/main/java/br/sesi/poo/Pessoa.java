package br.sesi.poo;

import br.sesi.poo.cabeca.Cabeca;
import br.sesi.poo.inferior.MembrosInferiores;
import br.sesi.poo.tronco.Tronco;


public class Pessoa {
    public Cabeca cabeca;
    public Tronco tronco;
    public MembrosInferiores inferior;

    public Pessoa(){
        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferior = new MembrosInferiores();
    }
}
