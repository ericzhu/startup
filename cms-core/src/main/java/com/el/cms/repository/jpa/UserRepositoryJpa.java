package com.el.cms.repository.jpa;

import org.springframework.stereotype.Repository;

import com.el.app.repository.jpa.BaseRepositoryJpa;
import com.el.cms.model.User;
import com.el.cms.repository.UserRepository;

@Repository
public class UserRepositoryJpa extends BaseRepositoryJpa<User, Long> implements UserRepository{

}
