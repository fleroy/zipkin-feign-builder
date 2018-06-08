package io.fle.zipkin;

import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(name = "client-home", url = "http://localhost:8080")
interface HomeClient {
    //@RequestMapping(value = "/home", method = RequestMethod.GET)
    @RequestLine("GET /home")
    String home();
}
