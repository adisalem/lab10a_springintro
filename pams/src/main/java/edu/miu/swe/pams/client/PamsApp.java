package edu.miu.swe.pams.client;

import org.springframework.boot.CommandLineRunner;
import edu.miu.swe.pams.controller.PatientController;
import edu.miu.swe.pams.util.ConvertToJson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PamsApp implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PamsApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 PatientController controller = new PatientController();
		var sortedPatients = controller.getAllPatients();
		String json = ConvertToJson.convertToJson(sortedPatients);
		System.out.println(json);
	}

}
