package br.com.uaigraos.farmacia.repository;

import br.com.uaigraos.farmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Integer>{
}
