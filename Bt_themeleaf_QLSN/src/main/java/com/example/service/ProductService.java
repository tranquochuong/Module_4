package com.example.service;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{

    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1,"Giày 1",12.000,20,"Qua đẹp"));
        products.put(2, new Product(2,"Giày 2",12.000,20,"Qua đẹp"));
        products.put(3, new Product(3,"Giày 3",12.000,20,"Qua đẹp"));
        products.put(4, new Product(4,"Giày 4",12.000,20,"Qua đẹp"));
        products.put(5, new Product(5,"Giày 5",12.000,20,"Qua đẹp"));
        products.put(6, new Product(6,"Giày 6",12.000,20,"Qua đẹp"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
