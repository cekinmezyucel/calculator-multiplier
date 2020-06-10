package com.calculator.multiplier.service;

import org.springframework.stereotype.Service;

@Service
public class MultiplierService {

    public int multiply(int x, int y) {
        return Math.multiplyExact(x, y);
    }

}
