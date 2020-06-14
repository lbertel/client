package com.ps.web.controller.healthcheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public final class HealthCheckGetController {

    @GetMapping("/health-check")
    public HashMap<String, String> handle(){
        HashMap<String, String> status = new HashMap<>();
        status.put("status", "ok");

        return status;
    }
}
