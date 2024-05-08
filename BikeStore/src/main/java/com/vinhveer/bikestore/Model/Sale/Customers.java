package com.vinhveer.bikestore.Model.Sale;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customer_id;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private String address;
}
