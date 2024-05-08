package org.vinhveer.productcruddemo.Service;

import org.springframework.stereotype.Service;
import org.vinhveer.productcruddemo.Entity.Product;

import java.util.List;

@Service
public interface ProductService {
    String SaveProduct(Product product);
    List<Product> GetAllProduct();
    Product GetProductById(Long id);
    String DeleteProduct(Long id);

}
