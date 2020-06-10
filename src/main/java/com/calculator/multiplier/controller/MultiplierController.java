package com.calculator.multiplier.controller;

import com.calculator.multiplier.service.MultiplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calculator/multiplier", produces = {"application/json"})
public class MultiplierController {

    @Autowired
    private MultiplierService multiplierService;

    @GetMapping(value = "/multiply")
    public ResponseEntity<Integer> multiply(@RequestParam int x, @RequestParam int y) {
        return ResponseEntity.ok().body(multiplierService.multiply(x, y));
    }

}
