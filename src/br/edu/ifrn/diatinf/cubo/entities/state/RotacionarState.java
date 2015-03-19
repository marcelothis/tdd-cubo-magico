package br.edu.ifrn.diatinf.cubo.entities.state;

import br.edu.ifrn.diatinf.cubo.entities.Direcoes;
import br.edu.ifrn.diatinf.cubo.entities.Face;

public abstract class RotacionarState{
	
	  public abstract void rotacionarCima(Direcoes direcao, Face face);
	  public abstract void rotacionarBaixo(Direcoes direcao, Face face);
	  public abstract void rotacionarDireita(Direcoes direcao, Face face);
	  public abstract void rotacionarEsquerda(Direcoes direcao, Face face);
	  
	
}