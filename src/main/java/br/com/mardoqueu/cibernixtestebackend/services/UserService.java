package br.com.mardoqueu.cibernixtestebackend.services;

import br.com.mardoqueu.cibernixtestebackend.domain.Users;

import java.util.List;

public interface UserService {
    Users findById(Integer id);
    List<Users> findAll();
}
