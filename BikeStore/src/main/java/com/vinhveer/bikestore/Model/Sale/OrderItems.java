package com.vinhveer.bikestore.Model.Sale;

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
public class OrderItems {
    @Column
    private long order_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long item_id;

    @Column
    private long product_id;

    @Column
    private double quantity;

    @Column
    private double list_price;

    @Column
    private double discount;
}
