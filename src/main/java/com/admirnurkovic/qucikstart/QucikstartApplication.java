package com.admirnurkovic.qucikstart;

import com.admirnurkovic.qucikstart.services.ColourPrinter;
import com.admirnurkovic.qucikstart.services.impl.ColourPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class QucikstartApplication implements CommandLineRunner {

	private final ColourPrinter colourPrinter;

	public QucikstartApplication(ColourPrinter colourPrinter){
		this.colourPrinter = colourPrinter;
	}
	public static void main(String[] args) {
		SpringApplication.run(QucikstartApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(colourPrinter.print());
	}
}
