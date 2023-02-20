package br.com.madeira.api.services;



import br.com.madeira.api.domain.User;
import br.com.madeira.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
    void delete(Integer id);
}
