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
public class Staffs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long staff_id;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String active;

    @Column
    private String store_id;

    @Column
    private String manager_id;
}
