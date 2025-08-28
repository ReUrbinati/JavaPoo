package Renata.Urbinati.LojaNoivas.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Renata.Urbinati.LojaNoivas.Model.Modelos;

@Repository
public interface ModelosRepository extends JpaRepository<Modelos, Long>{
	public List<Modelos> findAllByModelosContainingIgnoreCase(String titulo);
	public List<Modelos> findAll();

}
