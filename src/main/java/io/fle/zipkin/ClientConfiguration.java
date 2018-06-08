package io.fle.zipkin;

import feign.Client;
import feign.Feign;
import feign.okhttp.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfiguration {

    @Bean
    public Client ok() {
        return new OkHttpClient();
    }

    @Bean
    @Autowired
    public HomeClient homeClient(Client client) {
        return Feign.builder().client(client).target(HomeClient.class, "http://localhost:8080");
    }

}
