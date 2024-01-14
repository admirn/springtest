package com.admirnurkovic.qucikstart.services.impl;

import com.admirnurkovic.qucikstart.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinterImpl implements RedPrinter {
    @Override
    public String print() {
        return "red";
    }
}
