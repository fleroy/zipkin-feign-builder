package io.fle.zipkin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private static Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    private HomeClient clientHome;

    @RequestMapping("/home")
    public String home() {
        log.info("Hello World");
        return "Hello World!";
    }

    @RequestMapping("/go-home")
    public String goHome() {
        log.info("GO HomeClient");
        return clientHome.home();
    }
}

