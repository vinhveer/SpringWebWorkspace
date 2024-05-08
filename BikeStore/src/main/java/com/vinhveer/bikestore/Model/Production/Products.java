package com.vinhveer.bikestore.Model.Production;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long product_id;

    @Column
    private long product_name;

    @Column
    private long brand_id;

    @Column
    private long category_id;

    @Column
    private long model_year;

    @Column
    private long list_price;
}
