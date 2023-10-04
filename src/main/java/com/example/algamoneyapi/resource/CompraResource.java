package com.example.algamoneyapi.resource;

import java.net.URI;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.algamoneyapi.model.Compra;
import com.example.algamoneyapi.repository.CompraRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/compras")
public class CompraResource {

	@Autowired
	CompraRepository compraRepository;
	
	@GetMapping
	public List<Compra> listar(){
		return compraRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity adicionar(@Valid @RequestBody Compra compras, HttpServletResponse response){;
		Compra comprasSalvas = compraRepository.save(compras);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
			.buildAndExpand(comprasSalvas.getId()).toUri();
		
		response.setHeader("location", uri.toASCIIString());
		
		return ResponseEntity.created(uri).body(comprasSalvas);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> buscarPeloId(@PathVariable Long id) {
		Optional<Compra> compras = compraRepository.findById(id);
		return compras.isPresent() ?
				ResponseEntity.ok(compras.get()) : ResponseEntity.notFound().build();
		
		
		
	}
}
