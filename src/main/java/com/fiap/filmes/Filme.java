//Nome: Thiago Gabriel Alves da Costa - RM:95584 *2TDSPK
//Nome: Gabriel de Almeida Rodrigues - RM:93183 *2TDSPK

package com.fiap.filmes;

import com.fiap.fichaTecnica.FichaTecnica;


import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name = "filmes")
@Entity(name = "Filme")
public class Filme {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String titulo, ator, origem, duracao, lancamento;
	private Boolean ativo;

	@Embedded
	private FichaTecnica fichaTecnica;

	@Enumerated(EnumType.STRING)
	private Genero genero;

	public Filme() {

	}

	public Filme(DadosCadastroFilmes dados) {
		super();
		this.ativo = true;
		this.titulo = dados.titulo();
		this.ator = dados.ator();
		this.origem = dados.origem();
		this.duracao = dados.duracao();
		this.lancamento = dados.lancamento();
		this.genero = dados.genero();
		this.fichaTecnica = new FichaTecnica(dados.fichaTecnica());
		
	}

	public void atualizaInformacoes(DadosAtualizacaoFilmes dados) {
		if (dados.titulo() != null) {
			this.titulo = dados.titulo();
		}
		if (dados.ator() != null) {
			this.ator = dados.ator();
		}
		if (dados.origem() != null) {
			this.origem = dados.origem();
		}
		if (dados.genero() != null) {
			this.genero = dados.genero();
		}
		if (dados.duracao() != null) {
			this.duracao = dados.duracao();
		}
		if (dados.lancamento() != null) {
			this.lancamento = dados.lancamento();
		}
		if (dados.dadosFichaTecnica() != null) {
			this.fichaTecnica.atualizaInformacoes(dados.dadosFichaTecnica());
		}
	}
	public void excluir() {
		this.ativo = false;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAtor() {
		return ator;
	}

	public void setAtor(String ator) {
		this.ator = ator;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public FichaTecnica getFichaTecnica() {
		return fichaTecnica;
	}

	public void setFichaTecnica(FichaTecnica fichaTecnica) {
		this.fichaTecnica = fichaTecnica;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getLancamento() {
		return lancamento;
	}

	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}

}
