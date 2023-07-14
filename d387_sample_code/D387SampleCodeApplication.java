package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.il8n.DisplayMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		// create two instances of each DisplayMessage class (one for each locale)
		DisplayMessage displayEngMessage = new DisplayMessage(Locale.US);
		DisplayMessage displayFreMessage = new DisplayMessage(Locale.CANADA_FRENCH);

		// create two threads that each call it's respective DisplayMessage class
		Thread engThread = new Thread(displayEngMessage);
		Thread freThread = new Thread(displayFreMessage);

		// start the threads
		engThread.start();
		freThread.start();
	}

}
