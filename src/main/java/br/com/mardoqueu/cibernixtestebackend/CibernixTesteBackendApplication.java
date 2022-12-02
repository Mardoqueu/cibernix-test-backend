package br.com.mardoqueu.cibernixtestebackend;

import br.com.mardoqueu.cibernixtestebackend.domain.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CibernixTesteBackendApplication {

    public static void main(String[] args) {

        SpringApplication.run(CibernixTesteBackendApplication.class, args);

        Users user = new Users(1, "mardoqueu", "mardoqueu@mail.com","123");
    }

}
