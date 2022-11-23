package com.dhuapaya.fibonacciproyect.controllers;

import com.dhuapaya.fibonacciproyect.services.FigonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
public class FigonacciController {

    @Autowired
    private FigonacciService figonacciService;

    @GetMapping("/getListFigonacciForNumber/{n}")
    public ResponseEntity<?> getListFigonacci(@PathVariable int n) {
        if (n > 0) {
            Map<String, Object> responseFigonacci = new HashMap<>();
            responseFigonacci.put("List Figonacci", figonacciService.getListFigonacci(n));
            responseFigonacci.put("n", figonacciService.getNumberFigonacci(n-1));
            return ResponseEntity.ok(responseFigonacci);
        }
        return ResponseEntity.badRequest().build();
    }
}
