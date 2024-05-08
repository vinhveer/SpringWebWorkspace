package org.vinhveer.productcruddemo.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.vinhveer.productcruddemo.Entity.Product;
import org.vinhveer.productcruddemo.Service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    final
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveProduct(@RequestBody Product product)
    {
        return ResponseEntity.ok(productService.SaveProduct(product));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAllProduct()
    {
        return ResponseEntity.ok(productService.GetAllProduct());
    }

    @GetMapping("/all/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id)
    {
        return ResponseEntity.ok(productService.GetProductById(id));
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id)
    {
        return ResponseEntity.ok(productService.DeleteProduct(id));
    }
}
