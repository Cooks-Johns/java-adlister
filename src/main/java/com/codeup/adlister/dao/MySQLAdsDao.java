package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;

import java.sql.Connection;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection = null;


    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public List<Ad> title(String title) {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }

    @Override
    public void deleteQuery(String adId) {

    }

    @Override
    public Ad findById(int id) {
        return null;
    }

    @Override
    public List<Ad> listByUser(int id) {
        return null;
    }
}
}
