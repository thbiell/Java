//Nome: Thiago Gabriel Alves da Costa - RM:95584 *2TDSPK
//Nome: Gabriel de Almeida Rodrigues - RM:93183 *2TDSPK

package com.fiap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.filmes.DadosAtualizacaoFilmes;
import com.fiap.filmes.DadosCadastroFilmes;
import com.fiap.filmes.DadosListagemFilmes;
import com.fiap.filmes.Filme;
import com.fiap.filmes.FilmesRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/filmes")
public class FilmesController {
	@Autowired
	private FilmesRepository repository;
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroFilmes dados) {
		repository.save(new Filme(dados));
	}
	@GetMapping
	public Page<DadosListagemFilmes> listar(@PageableDefault(size=3,sort= {"ator"}) Pageable paginacao){
		return repository.findAllByAtivoTrue(paginacao).map(DadosListagemFilmes::new);
	}
	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid DadosAtualizacaoFilmes dados) {
		Filme filmes = new Filme();
		filmes = repository.getReferenceById(dados.id());
		filmes.atualizaInformacoes(dados);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public void excluir(@PathVariable Long id) {
		Filme filmes = new Filme();
		filmes = repository.getReferenceById(id);
		filmes.excluir();
		
	}
}
