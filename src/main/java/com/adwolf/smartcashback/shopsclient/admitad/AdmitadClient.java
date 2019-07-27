package com.adwolf.smartcashback.shopsclient.admitad;

import com.adwolf.smartcashback.entity.shop.Shop;
import com.adwolf.smartcashback.shopsclient.ShopClient;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Log
public class AdmitadClient implements ShopClient {
    @Value("${admitad.shopId}")
    private String shopId;

    @Override
    public List<Shop> loadShops() {
        return null;
    }
}
