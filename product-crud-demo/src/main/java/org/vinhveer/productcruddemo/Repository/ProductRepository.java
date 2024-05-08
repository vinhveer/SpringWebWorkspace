package org.vinhveer.productcruddemo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.vinhveer.productcruddemo.Entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {
}
