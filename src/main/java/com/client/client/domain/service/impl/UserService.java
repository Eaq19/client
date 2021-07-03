package com.client.client.domain.service.impl;

import com.client.client.adapter.repository.UserRepository;
import com.client.client.domain.model.UserDTO;
import com.client.client.domain.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public long create(UserDTO user) {
        return userRepository.save(user).getId();
    }

    @Override
    public boolean update(UserDTO user, long id) {
        userRepository.save(user);
        return true;
    }

    @Override
    public UserDTO get(long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<UserDTO> getAll() {
        List<UserDTO> users = new ArrayList<>();
        userRepository.findAll().forEach(user1 -> users.add(user1));
        return users;
    }

    @Override
    public boolean delete(long id) {
        userRepository.deleteById(id);
        return true;
    }
}
