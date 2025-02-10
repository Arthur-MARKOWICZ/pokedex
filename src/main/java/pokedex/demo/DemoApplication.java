package pokedex.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pokedex.demo.principal.principal;

import java.security.Principal;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
		@Override
	public void run(String... args) throws Exception {
		principal principal = new principal();
		principal.exibeMenu();



		}

}
