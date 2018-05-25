package com.forro.festivals.forrofestivals;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class FestivalController {

    public FestivalController() {
        
    }

    @RequestMapping(method = RequestMethod.GET, value = "festivals")
    public String getFestivals() {
        return "Festivals";
    }
}
