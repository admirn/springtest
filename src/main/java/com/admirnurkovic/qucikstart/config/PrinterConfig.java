package com.admirnurkovic.qucikstart.config;

import com.admirnurkovic.qucikstart.services.BluePrinter;
import com.admirnurkovic.qucikstart.services.ColourPrinter;
import com.admirnurkovic.qucikstart.services.GreenPrinter;
import com.admirnurkovic.qucikstart.services.RedPrinter;
import com.admirnurkovic.qucikstart.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter(){
        return new MontenegrianBlueColor();
    }

    @Bean
    public RedPrinter redPrinter(){
        return new MontenegrianRedColor();
    }

    @Bean
    public GreenPrinter greenPrinter(){
        return new MontenegrianGreenColor();
    }

    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter){
        return new ColourPrinterImpl(bluePrinter, redPrinter, greenPrinter);
    }
}
