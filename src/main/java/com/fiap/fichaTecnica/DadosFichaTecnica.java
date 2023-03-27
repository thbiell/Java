//Nome: Thiago Gabriel Alves da Costa - RM:95584 *2TDSPK
//Nome: Gabriel de Almeida Rodrigues - RM:93183 *2TDSPK

package com.fiap.fichaTecnica;

import jakarta.validation.constraints.NotBlank;

public record DadosFichaTecnica(
		@NotBlank
		String direcao,
		@NotBlank
		String elenco,
		@NotBlank
		String roteiro,
		String classificacao,
		@NotBlank
		String producao
		) {

}
