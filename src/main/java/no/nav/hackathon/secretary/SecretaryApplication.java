package no.nav.hackathon.secretary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class SecretaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecretaryApplication.class, args);

		Properties properties = new Properties();
		properties.put("SLACK_CLIENT_ID", System.getenv("SLACK_CLIENT_ID"));
		properties.put("BOT_TOKEN", System.getenv("BOT_TOKEN"));
	}
}
