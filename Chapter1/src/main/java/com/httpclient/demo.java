package com.httpclient;


import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class demo {

    @Test
    public void getTest(){
        String result;
        HttpGet get = new HttpGet("http://www.baidu.com");
        CloseableHttpClient client = HttpClientBuilder.create().build();
        try {
            CloseableHttpResponse response = client.execute(get);
            result= EntityUtils.toString(response.getEntity());
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
