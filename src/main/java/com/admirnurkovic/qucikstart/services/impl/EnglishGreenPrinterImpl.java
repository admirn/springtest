package com.admirnurkovic.qucikstart.services.impl;

import com.admirnurkovic.qucikstart.services.GreenPrinter;
import org.springframework.stereotype.Component;


public class EnglishGreenPrinterImpl implements GreenPrinter {
    @Override
    public String print() {
        return "green";
    }
}
