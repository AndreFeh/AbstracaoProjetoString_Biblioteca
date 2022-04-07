package com.dio.projetosjavacomspring.spring_sem_dep;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Livro getLivro(){
        return new Livro();
    }

    @Bean
    public AutorLivro getAutorLivro(){
        return new Autor();
    }
//  <bean id="livro" class="com.springbeans.Livro"/> -------- em XML
}
