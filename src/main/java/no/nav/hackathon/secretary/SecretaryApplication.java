package no.nav.hackathon.secretary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Properties;

@SpringBootApplication(scanBasePackages = {"no.nav.hackathon.secretary.jbot", "no.nav.hackathon.secretary.slack"})
public class SecretaryApplication {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	/**
	 * Entry point of the application. Run this method to start the sample bots,
	 * but don't forget to add the correct tokens in application.properties file.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SecretaryApplication.class, args);

		Properties properties = new Properties();
		properties.put("SLACK_CLIENT_ID", System.getenv("SLACK_CLIENT_ID"));
		properties.put("BOT_TOKEN", System.getenv("BOT_TOKEN"));
	}
}
