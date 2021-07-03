package com.client.client.domain.service;

import com.client.client.domain.model.UserDTO;

import java.util.List;

public interface IUserService {

    long create(UserDTO user);

    boolean update(UserDTO user, long id);

    UserDTO get(long id);

    List<UserDTO> getAll();

    boolean delete(long id);

}
