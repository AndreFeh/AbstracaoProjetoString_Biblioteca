package com.dio.projetosjavacomspring.spring_sem_dep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args){
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class); // depois de criado a classe AppConfig, informar de onde retirará essa info

        Livro livro = factory.getBean(Livro.class);
        livro.setNome("Harry Potter");
        livro.setCodigo("D34FD");

        Autor autor = factory.getBean(Autor.class);
        autor.setNomeAutor("J.K.Rowling");

        livro.exibir();
//      Fachando Aplicação com Contexto
        ((AbstractApplicationContext) factory).close();
    }
}
