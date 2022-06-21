package com.example;

import io.micronaut.http.annotation.*;

@Controller("/demo3")
public class Demo3Controller {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}