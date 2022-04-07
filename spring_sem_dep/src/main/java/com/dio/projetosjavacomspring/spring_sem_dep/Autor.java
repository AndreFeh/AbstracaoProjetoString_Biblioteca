package com.dio.projetosjavacomspring.spring_sem_dep;

public class Autor implements AutorLivro{

    private String nomeAutor;

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public void exibirAutor(){
        System.out.println(this.nomeAutor);
    }
}
