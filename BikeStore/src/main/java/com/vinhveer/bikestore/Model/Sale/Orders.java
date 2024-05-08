package com.vinhveer.bikestore.Model.Sale;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long order_id;

    @Column
    private String order_status;

    @Column
    private Date order_date;

    @Column
    private Date required_date;

    @Column
    private Date shipped_date;

}
