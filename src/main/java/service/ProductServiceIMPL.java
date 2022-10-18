package service;

import model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductServiceIMPL implements IProductService{
    private static  List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1,"milk",1000,"sua tuoi"));
        productList.add(new Product(2,"meter",2000,"thit ngon"));
        productList.add(new Product(3,"sugar",3000,"duong ngot"));
    }
    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);

    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void update(int id, Product product) {

    }
}
