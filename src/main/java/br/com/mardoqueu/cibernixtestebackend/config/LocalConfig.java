package br.com.mardoqueu.cibernixtestebackend.config;

import br.com.mardoqueu.cibernixtestebackend.domain.Users;
import br.com.mardoqueu.cibernixtestebackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB(){
        Users u1 = new Users(null,"Mardoqueu Sousa", "mardoqueu@gmail.com", "123");
        Users u2 = new Users(null, "Victor Filipe Yuri da Cruz", "victor-dacruz71@andrelam.com.br", "123");
        Users u3 = new Users(null, "Valdir", "valdir@mail.com", "123");
        Users u4 = new Users(null, "Ruan Oliver Paulo Gonçalves", "ruanolivergoncalves@andrelam.com.br", "123");
        Users u5 = new Users(null, "Sophia Vitória Nina Moura", "sophia-moura97@costaporto.com.br", "123");
        Users u6 = new Users(null, "Thiago Eduardo Anthony Castro", "elias.arthur.alves@equipavmineracao.com.br", "123");
        Users u7 = new Users(null, "Maria Analu Mendes", "maria_mendes@gestion.com.br", "123");

        repository.saveAll(List.of(u1, u2, u3, u4, u5, u6, u7));
    }
}
