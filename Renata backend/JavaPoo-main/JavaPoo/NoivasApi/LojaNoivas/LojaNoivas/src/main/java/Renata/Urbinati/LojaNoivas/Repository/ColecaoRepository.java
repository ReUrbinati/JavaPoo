package Renata.Urbinati.LojaNoivas.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Renata.Urbinati.LojaNoivas.Model.Colecao;

@Repository
public interface ColecaoRepository extends JpaRepository<Colecao,Long > {
	public List<Colecao> findAllByDescricaoContainingIgnoreCase(String descricao);
	public List<Colecao> findById();
}
