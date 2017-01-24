package com.BooksCart.dao;


import java.util.List;

import com.BooksCart.model.Product;
import com.BooksCart.model.User;

public interface ProductDAO {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);

	
    
    
}