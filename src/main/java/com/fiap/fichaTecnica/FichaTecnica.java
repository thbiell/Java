//Nome: Thiago Gabriel Alves da Costa - RM:95584 *2TDSPK
//Nome: Gabriel de Almeida Rodrigues - RM:93183 *2TDSPK

package com.fiap.fichaTecnica;

import jakarta.persistence.Embeddable;

@Embeddable
public class FichaTecnica {
	private String direcao, elenco, roteiro, classificacao, producao;

	
	public FichaTecnica(DadosFichaTecnica dados) {
		this.direcao = dados.direcao();
		this.elenco = dados.elenco();
		this.roteiro = dados.roteiro();
		this.classificacao = dados.classificacao();
		this.producao = dados.producao();
	}
	
	public void atualizaInformacoes(DadosFichaTecnica dados) {
		if (dados.direcao() != null) {
			this.direcao = dados.direcao();
		}
		if (dados.elenco() != null) {
			this.elenco = dados.elenco();
		}
		if (dados.roteiro() != null) {
			this.roteiro = dados.roteiro();
		}
		if (dados.classificacao() != null) {
			this.classificacao = dados.classificacao();
		}
		if (dados.producao() != null) {
			this.producao = dados.producao();
		}
	}
	
	public FichaTecnica() {
		
	}
	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public String getElenco() {
		return elenco;
	}

	public void setElenco(String elenco) {
		this.elenco = elenco;
	}

	public String getRoteiro() {
		return roteiro;
	}

	public void setRoteiro(String roteiro) {
		this.roteiro = roteiro;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getProducao() {
		return producao;
	}

	public void setProducao(String producao) {
		this.producao = producao;
	}
	
	
}
