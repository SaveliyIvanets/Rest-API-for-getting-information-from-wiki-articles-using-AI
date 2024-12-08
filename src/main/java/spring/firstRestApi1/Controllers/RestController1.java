package spring.firstRestApi1.Controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.firstRestApi1.Service.ServiceForAPI;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class RestController1 {
    @Autowired
    ServiceForAPI serviceForAPI;

    @GetMapping("/req")
    public String req(@RequestParam("request") String request, @RequestParam("link") String link) throws JsonProcessingException {
        return serviceForAPI.goAnswer(link,request);
    }
}
