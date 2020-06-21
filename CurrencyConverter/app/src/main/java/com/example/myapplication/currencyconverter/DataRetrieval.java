package com.example.myapplication.currencyconverter;

import android.util.Log;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Map;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class DataRetrieval {

    private static OkHttpClient client = new OkHttpClient();
    final String url = "https://api.exchangeratesapi.io/latest?base=USD";
    ObjectMapper objectMapper = new ObjectMapper();
    Currencies currencies;

    public Currencies getCurrencyData() throws IOException {
        Request request = new Request.Builder()
                .url(url).build();
        try (Response response = client.newCall(request).execute()) {
            Log.i("Request Info : ", "Request made to get the info");
            if(response.isSuccessful()){
                String jsonData = response.body().string();
                JSONObject jsonObject = new JSONObject(jsonData);
                currencies = objectMapper.readValue(jsonData, Currencies.class);
            }
        }
        catch (IOException | JSONException e) {
            Log.i("Retreival info : ", "Data retreival failed");
            e.getLocalizedMessage();
        }
        return currencies;
    }
}
