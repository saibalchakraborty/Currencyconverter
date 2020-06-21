package com.example.myapplication.currencyconverter;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Date;

public class Currencies {

    private JsonNode rates;
    private String base;
    private String date;

    public JsonNode getRates() {
        return rates;
    }

    public void setRates(JsonNode rates) {
        this.rates = rates;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}