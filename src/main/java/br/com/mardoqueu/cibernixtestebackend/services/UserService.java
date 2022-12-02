package br.com.mardoqueu.cibernixtestebackend.services;

import br.com.mardoqueu.cibernixtestebackend.domain.Users;

public interface UserService {
    Users findById(Integer id);
}
