package Renata.Urbinati.LojaNoivas.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Renata.Urbinati.LojaNoivas.Model.Colecao;
import Renata.Urbinati.LojaNoivas.Repository.ColecaoRepository;


@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping("/colecao")
public class ColecaoController {
	
	@Autowired
	private ColecaoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Colecao>>getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Colecao>> getAllByDescricaoContainingIgonoreCase(@PathVariable String descricao){
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
		
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Optional<Colecao>> getById(@PathVariable Long id){
		return ResponseEntity.ok(repository.findById(id));
		
	}

}
