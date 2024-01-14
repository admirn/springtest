package com.admirnurkovic.qucikstart.services.impl;

import com.admirnurkovic.qucikstart.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class MontenegrianGreenColor implements GreenPrinter {
    @Override
    public String print() {
        return "zelena";
    }
}
