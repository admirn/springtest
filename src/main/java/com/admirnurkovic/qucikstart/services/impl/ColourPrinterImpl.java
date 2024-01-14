package com.admirnurkovic.qucikstart.services.impl;

import com.admirnurkovic.qucikstart.services.BluePrinter;
import com.admirnurkovic.qucikstart.services.ColourPrinter;
import com.admirnurkovic.qucikstart.services.GreenPrinter;
import com.admirnurkovic.qucikstart.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {
    private  BluePrinter bluePrinter;
    private  RedPrinter redPrinter;
    private  GreenPrinter greenPrinter;

    public ColourPrinterImpl(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter){
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
        this.redPrinter = redPrinter;
    }
    @Override
    public String print() {
        return String.join(", ", bluePrinter.print(), redPrinter.print(), greenPrinter.print());
    }
}
