package br.com.mardoqueu.cibernixtestebackend.config;

import br.com.mardoqueu.cibernixtestebackend.domain.Users;
import br.com.mardoqueu.cibernixtestebackend.repositories.UserRepository;
import org.apache.catalina.User;
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
        Users u1 = new Users(null,"Mardoqueu", "mardoqueu@gmail.com", "123");
        Users u2 = new Users(null, "Luiz", "luiz@mail.com", "123");
        Users u3 = new Users(null, "Valdir", "valdir@mail.com", "123");

        repository.saveAll(List.of(u1, u2));
    }
}
