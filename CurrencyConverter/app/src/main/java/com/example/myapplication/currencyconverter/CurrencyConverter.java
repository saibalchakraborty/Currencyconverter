package com.example.myapplication.currencyconverter;

import android.util.Log;

class CurrencyConverter {

    static double convertCurrency(String fromCurrency, String toCurrency, Currencies currencies) {
        Log.i("INFO : ", fromCurrency +" to "+toCurrency);
        return getCurrency(toCurrency, currencies)/getCurrency(fromCurrency, currencies);
    }

    private static double getCurrency(String currency, Currencies currencies){
        double value = 0;
        switch(currency){
            case "CAD":
                value = currencies.getRates().get("CAD").asDouble();
                break;
            case "HKD":
                value = currencies.getRates().get("HKD").asDouble();
                break;
            case "ISK":
                value = currencies.getRates().get("ISK").asDouble();
                break;
            case "PHP":
                value = currencies.getRates().get("PHP").asDouble();
                break;
            case "DKK":
                value = currencies.getRates().get("DKK").asDouble();
                break;
            case "HUF":
                value = currencies.getRates().get("HUF").asDouble();
                break;
            case "CZK":
                value = currencies.getRates().get("CZK").asDouble();
                break;
            case "GBP":
                value = currencies.getRates().get("GBP").asDouble();
                break;
            case "RON":
                value = currencies.getRates().get("RON").asDouble();
                break;
            case "SEK":
                value = currencies.getRates().get("SEK").asDouble();
                break;
            case  "IDR":
                value = currencies.getRates().get("IDR").asDouble();
                break;
            case  "INR":
                value = currencies.getRates().get("INR").asDouble();
                break;
            case  "BRL":
                value = currencies.getRates().get("BRL").asDouble();
                break;
            case  "RUB":
                value = currencies.getRates().get("RUB").asDouble();
                break;
            case  "HRK":
                value = currencies.getRates().get("HRK").asDouble();
                break;
            case  "JPY":
                value = currencies.getRates().get("JPY").asDouble();
                break;
            case  "THB":
                value = currencies.getRates().get("THB").asDouble();
                break;
            case  "CHF":
                value = currencies.getRates().get("CHF").asDouble();
                break;
            case  "EUR":
                value = currencies.getRates().get("EUR").asDouble();
                break;
            case  "MYR":
                value = currencies.getRates().get("MYR").asDouble();
                break;
            case  "BGN":
                value = currencies.getRates().get("BGN").asDouble();
                break;
            case  "TRY":
                value = currencies.getRates().get("TRY").asDouble();
                break;
            case  "CNY":
                value = currencies.getRates().get("CNY").asDouble();
                break;
            case  "NOK":
                value = currencies.getRates().get("NOK").asDouble();
                break;
            case  "NZD":
                value = currencies.getRates().get("NZD").asDouble();
                break;
            case  "ZAR":
                value = currencies.getRates().get("ZAR").asDouble();
                break;
            case  "USD":
                value = currencies.getRates().get("USD").asDouble();
                break;
            case  "MXN":
                value = currencies.getRates().get("MXN").asDouble();
                break;
            case  "SGD":
                value = currencies.getRates().get("SGD").asDouble();
                break;
            case  "AUD":
                value = currencies.getRates().get("AUD").asDouble();
                break;
            case  "ILS":
                value = currencies.getRates().get("ILS").asDouble();
                break;
            case  "KRW":
                value = currencies.getRates().get("KRW").asDouble();
                break;
            case  "PLN":
                value = currencies.getRates().get("PLN").asDouble();
                break;
        }
        return value;
    }

}