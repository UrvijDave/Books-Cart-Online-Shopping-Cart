package com.BooksCart.dao;


import java.util.List;

import com.BooksCart.model.Product;
import com.BooksCart.model.User;

public interface UserDAO {

    List<User> getUserList();

    User getUserById(int id);

    void addUser(User user);

    void editUser(User user);

    void deleteUser(User user);
    
    
}
