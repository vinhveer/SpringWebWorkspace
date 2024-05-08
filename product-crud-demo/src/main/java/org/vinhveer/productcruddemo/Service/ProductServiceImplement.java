package org.vinhveer.productcruddemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vinhveer.productcruddemo.Entity.Product;
import org.vinhveer.productcruddemo.Repository.ProductRepository;

import java.util.List;

@Service
public class ProductServiceImplement implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public String SaveProduct(Product product) {
        productRepository.save(product);
        return "Product saved successfully!";
    }

    @Override
    public List<Product> GetAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product GetProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public String DeleteProduct(Long id) {
        if (productRepository.existsById(id))
        {
            productRepository.deleteById(id);
            return "Product deleted successfully!";
        }
        else
        {
            return "Product not found!";
        }
    }
}
