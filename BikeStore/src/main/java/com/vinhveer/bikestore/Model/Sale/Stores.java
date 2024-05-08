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
public class Stores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long store_id;

    @Column
    private String store_name;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private String address;
}
