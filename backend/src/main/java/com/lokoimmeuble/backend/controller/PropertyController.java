package com.lokoimmeuble.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/properties")
public class PropertyController {

    @GetMapping
    public List<Map<String, Object>> list() {
        return List.of(
                Map.of("id", 1, "title", "Appartement 2 chambres — Lomé", "price", 120000),
                Map.of("id", 2, "title", "Studio meublé — Agoè", "price", 80000),
                Map.of("id", 3, "title", "Maison 3 chambres — Tokoin", "price", 220000)
        );
    }
}
