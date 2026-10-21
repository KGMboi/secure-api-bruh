package com.equipo.secureapi.web;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PingController {

    @GetMapping("/public/status")
    public Map<String, String> status() {
        return Map.of("status", "UP");
    }

    @GetMapping("/v1/ping")
    public Map<String, String> ping() {
        return Map.of("message", "pong");
    }

    @GetMapping("/v1/admin/ping")
    public Map<String, String> adminPing() {
        return Map.of("message", "pong de administrador");
    }
}