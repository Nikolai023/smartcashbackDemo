package com.adwolf.smartcashback.entity.shop;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;
    private final String name;
    private final String goToUrl;

    @ManyToOne(targetEntity = Category.class)
    private final Category category;
}
