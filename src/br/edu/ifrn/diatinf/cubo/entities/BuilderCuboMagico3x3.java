package br.edu.ifrn.diatinf.cubo.entities;

public class BuilderCuboMagico3x3 {
	public CuboMagico cubo;
	
	public CuboMagico build() {
		cubo = new CuboMagico();
		return cubo;
	}

	public PecaFace buildPecaFace(Cor cor) {
		PecaFace face = new PecaFace();
		face.cor = cor;
		return face;
	}

	public Peca buildPecaCentral(Cor cor) {
		Peca p = new Peca();
		p.faces = new PecaFace[1];
		p.faces[0] = this.buildPecaFace(cor);
		p.faces[0].peca = p;
		return p;
	}

	public Peca buildPecaLateral(Cor cor1, Cor cor2) {
		Peca p = new Peca();
		p.faces = new PecaFace[2];
		p.faces[0] = this.buildPecaFace(cor1);
		p.faces[1]=this.buildPecaFace(cor2);
		p.faces[0].peca = p;
		p.faces[1].peca = p;
		return p;
	}

	public Peca buildPecaQuina(Cor vermelho, Cor azul, Cor verde) {
		Peca p = new Peca();
		p.faces = new PecaFace[3];
		p.faces[0] = this.buildPecaFace(vermelho);
		p.faces[1] = this.buildPecaFace(azul);
		p.faces[2] = this.buildPecaFace(verde);
		p.faces[0].peca = p;
		p.faces[1].peca = p;
		p.faces[2].peca = p;
		return p;
	}

	public Face buildFace(Cor cor) {
		Face face = new Face();
		face.pecasFaces = new PecaFace[9];
		
		for (int i = 0; i < 9; i++) {
			face.pecasFaces[i] = this.buildPecaFace(cor);
		}
		
		return face;
	}

	public Face[] build6faces() {
		Face[] faces= new Face[6];
		
		Cor[] cores= {
             Cor.vermelho,
             Cor.azul,
             Cor.branco,
             Cor.amarelo,
             Cor.verde,
             Cor.laranja
		};
		
		for (int i =0; i<faces.length; i++){
			faces[i]= buildFace(cores[i]);
		}
		
		return faces;
	}

	public CuboMagico buildCubo() {
		CuboMagico cubo = new CuboMagico();
		
		
		
		return cubo;
	}
	
}
