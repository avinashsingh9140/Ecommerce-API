package com.ecommerceAPI.Ecommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Validated
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    private String name;
    private String landmark;
    private Long phoneNumber;
    private Integer zipcode;
    private String state;

    @OneToOne
    @JoinColumn(name = "fk_User_Id")
    User userId;
}
