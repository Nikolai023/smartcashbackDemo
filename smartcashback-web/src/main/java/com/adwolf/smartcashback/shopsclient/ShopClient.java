package com.adwolf.smartcashback.shopsclient;

import com.adwolf.smartcashback.domain.shop.Shop;

import java.util.List;

public interface ShopClient {
    List<Shop> loadShops();

    void updateToken();

    void updateShops();
}
