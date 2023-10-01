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
@Table(name = "order_Table")
public class Order {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @OneToOne
    @JoinColumn(name = "fk_UserId")
    User userId;

    @OneToOne
    @JoinColumn(name = "fk_Product_Id")
    Product productId;

    @OneToOne
    @JoinColumn(name = "fk_Address_Id")
    Address addressId;

    private  Integer quantity;



}
