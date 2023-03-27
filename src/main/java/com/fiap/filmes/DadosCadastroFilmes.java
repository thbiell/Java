//Nome: Thiago Gabriel Alves da Costa - RM:95584 *2TDSPK
//Nome: Gabriel de Almeida Rodrigues - RM:93183 *2TDSPK

package com.fiap.filmes;

import com.fiap.fichaTecnica.DadosFichaTecnica;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroFilmes(
		@NotBlank
		String titulo,
		@NotBlank
		String ator,
		@NotBlank
		@Pattern(regexp="\\d{2,3}")
		String duracao,
		@NotBlank
		@Pattern(regexp="\\d{4}")
		String lancamento,
		@NotBlank
		String origem,
		@NotNull
		Genero genero,
		@NotNull @Valid
		DadosFichaTecnica fichaTecnica
		) {

}
