package com.adwolf.smartcashback.config.schedulers;

import com.adwolf.smartcashback.shopsclient.ShopClient;
import lombok.extern.java.Log;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.PostConstruct;

@Configuration
@EnableScheduling
@Log
public class ShopScheduler {

    private ShopClient client;

    public ShopScheduler(ShopClient client) {
        this.client = client;
    }

    @Scheduled(cron = "0 0 0 * * *")
    public void updateToken() {
        log.info("Admitad token update started");
        client.updateToken();
    }

    @Scheduled(cron = "0 */30 * * * *")
    public void updateShopsInfo() {
        log.info("Admitad shops update started");
        client.updateShops();
    }

    @PostConstruct
    private void init() {
        updateToken();
        updateShopsInfo();
    }
}
