package br.edu.ifrn.diatinf.cubo.entities.state;

import br.edu.ifrn.diatinf.cubo.entities.Direcoes;
import br.edu.ifrn.diatinf.cubo.entities.Face;

public class RotacionarCima extends RotacionarState {

	@Override
	public void rotacionarCima(Direcoes direcao, Face face) {
		
		face = face.getFaceBaixo();
		
	}

	@Override
	public void rotacionarBaixo(Direcoes direcao, Face face) {
		face = face.getFaceCima();
		
	}

	@Override
	public void rotacionarDireita(Direcoes direcao, Face face) {
		face = face.getFaceEsquerda();
	}

	@Override
	public void rotacionarEsquerda(Direcoes direcao, Face face) {
		face = face.getFaceDireita();
		
	}
	
}
