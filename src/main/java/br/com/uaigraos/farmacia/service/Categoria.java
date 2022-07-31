package br.com.uaigraos.farmacia.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Categoria {

    private String tipo;

    private Categoria(){

    }

    private Categoria (String parametro1){
        tipo = parametro1;
    }

    private Categoria (int parametro2){

    }

    public void deletar(){

    }

    public int deletar(int valor){
        return 0;
    }

    public String deletar(float valor2){
        return null;
    }


    public void salvar(){

    }

     static int calculaIdade(int anoNascimento){
        int anoAtual = 2022;
        int idade = anoAtual - anoNascimento;
        return idade;
    }

}
