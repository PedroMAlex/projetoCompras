package com.example.algamoneyapi.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.algamoneyapi.model.Pessoa;
import com.example.algamoneyapi.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@GetMapping
	public List<Pessoa> listar(){
		return pessoaRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Pessoa> adicionarPessoa(@Valid @RequestBody Pessoa pessoa, HttpServletRequest request){
		Pessoa pessoaSalva = pessoaRepository.save(pessoa);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
				.buildAndExpand(pessoaSalva.getId()).toUri();
		
		return ResponseEntity.created(uri).body(pessoaSalva);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Pessoa> buscarPorId(@PathVariable Long id){
		Optional<Pessoa> pessoaPorId = pessoaRepository.findById(id);
		return pessoaPorId.isPresent() ?
				ResponseEntity.ok(pessoaPorId.get()) : ResponseEntity.notFound().build();
	}
}
