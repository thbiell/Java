//Nome: Thiago Gabriel Alves da Costa - RM:95584 *2TDSPK
//Nome: Gabriel de Almeida Rodrigues - RM:93183 *2TDSPK

package com.fiap.filmes;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;



public interface FilmesRepository extends JpaRepository<Filme, Long>{
	
	Page<Filme> findAllByAtivoTrue(Pageable paginacao);
	
}
