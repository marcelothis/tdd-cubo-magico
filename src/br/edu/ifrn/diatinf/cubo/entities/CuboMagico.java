package br.edu.ifrn.diatinf.cubo.entities;

import br.edu.ifrn.diatinf.cubo.entities.state.RotacionarCima;
import br.edu.ifrn.diatinf.cubo.entities.state.RotacionarBaixo;
import br.edu.ifrn.diatinf.cubo.entities.state.RotacionarDireita;
import br.edu.ifrn.diatinf.cubo.entities.state.RotacionarEsquerda;

public class CuboMagico{

	public Face[] faces;
	public Face facePrincipal;
	
	public Face getFacePrincipal() {
		return this.facePrincipal;
	}

	public Face[] getFaces() {
		return faces;
	}

	public void setFaces(Face[] faces) {
		this.faces = faces;
	}

	public void rotacionar(Direcoes direcao) {
		
		if (direcao==Direcoes.Esquerda){
			RotacionarEsquerda rtEsquerda = new RotacionarEsquerda();
			rtEsquerda.rotacionarEsquerda(direcao, facePrincipal);
		}
		else if(direcao==Direcoes.Direita){
			RotacionarDireita rtDireita = new RotacionarDireita();
			rtDireita.rotacionarDireita(direcao, facePrincipal);
		}
		else if(direcao==Direcoes.Cima){
			RotacionarCima rtCima = new RotacionarCima();
			rtCima.rotacionarCima(direcao, facePrincipal);
		}
		else if(direcao==Direcoes.Baixo){
			RotacionarBaixo rtBaixo = new RotacionarBaixo();
			rtBaixo.rotacionarBaixo(direcao, facePrincipal);
		}
		
		
	}
	
}