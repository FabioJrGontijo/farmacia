package br.com.uaigraos.farmacia.service;

import br.com.uaigraos.farmacia.model.Produto;
import br.com.uaigraos.farmacia.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository repository){
        produtoRepository = repository;
    }

    public Produto cadastrarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public void deletarProduto(int id){
         produtoRepository.deleteById(id);
    }

    public Produto atualizarProduto(int id, Produto produto){
        return null;
    }

    public List<Produto> listarTodos(){
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId (int idProduto){
        return produtoRepository.findById(idProduto);
    }

}
