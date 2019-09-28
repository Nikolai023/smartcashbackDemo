package com.adwolf.smartcashback.domain.shop;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;
    @Column(unique = true)
    private final Long externalId;
    private final String goToUrl;

    @ManyToMany(targetEntity = Category.class)
    private final List<Category> categories;
}
