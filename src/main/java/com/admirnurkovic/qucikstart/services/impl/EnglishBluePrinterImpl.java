package com.admirnurkovic.qucikstart.services.impl;

import com.admirnurkovic.qucikstart.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinterImpl implements BluePrinter {

    @Override
    public String print() {
        return "blue";
    }
}
