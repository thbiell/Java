//Nome: Thiago Gabriel Alves da Costa - RM:95584 *2TDSPK
//Nome: Gabriel de Almeida Rodrigues - RM:93183 *2TDSPK

package com.fiap.filmes;


import com.fiap.fichaTecnica.DadosFichaTecnica;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoFilmes(
		@NotNull
		Long id,
		String titulo,
		String ator,
		String origem,
		String duracao,
		String lancamento,
		Genero genero,
		DadosFichaTecnica dadosFichaTecnica
		) {

}
