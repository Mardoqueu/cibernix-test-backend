package br.com.mardoqueu.cibernixtestebackend.repositories;

import br.com.mardoqueu.cibernixtestebackend.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

}
