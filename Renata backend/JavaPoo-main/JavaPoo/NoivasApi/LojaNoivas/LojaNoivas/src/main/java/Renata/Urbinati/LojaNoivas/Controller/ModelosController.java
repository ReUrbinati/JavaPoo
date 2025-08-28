package Renata.Urbinati.LojaNoivas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Renata.Urbinati.LojaNoivas.Model.Modelos;
import Renata.Urbinati.LojaNoivas.Repository.ModelosRepository;



@RestController
@RequestMapping("/modelos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ModelosController {
	@Autowired
	private ModelosRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Modelos>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
}
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Modelos>> getByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByModelosContainingIgnoreCase(titulo));	
	}

}
