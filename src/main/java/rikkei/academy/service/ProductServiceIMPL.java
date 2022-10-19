package rikkei.academy.service;

import rikkei.academy.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceIMPL implements IProductService{

    private static Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1,"N1",10,"D1"));
        products.put(2, new Product(2,"N2",20,"D2"));
        products.put(3, new Product(3,"N3",30,"D3"));
        products.put(4, new Product(4,"N4",40,"D4"));
        products.put(5, new Product(5,"N5",50,"D5"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}