//Nome: Thiago Gabriel Alves da Costa - RM:95584 *2TDSPK
//Nome: Gabriel de Almeida Rodrigues - RM:93183 *2TDSPK

package com.fiap.filmes;


public record DadosListagemFilmes(
		String titulo,
		String ator,
		String duracao,
		Genero genero,
		String direcao
		) {

	public DadosListagemFilmes(Filme filme) {
		this(
				filme.getTitulo(),
				filme.getAtor(),
				filme.getDuracao(),
				filme.getGenero(),
				filme.getFichaTecnica().getDirecao());
	}
}
