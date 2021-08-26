package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalTime;


@RestController
@RequestMapping(path = "/")
public class RestApiController {

    @GetMapping(path = "/displaytime")
    public String getTime() {

        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);
        return "This is now updated with a github commit -- can you see  :"+myObj;
    }

}
