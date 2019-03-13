package no.nav.hackathon.secretary;

import no.nav.hackathon.secretary.jbot.common.EventType;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecretaryApplicationTests {

	@Test
	@Ignore
	public void contextLoads() {
	}

	/**
	 * Number of events in {@link EventType} should be
	 * equal to the number of events supported by slack
	 * (including 3 added by JBot) plus number of events
	 * supported in fb bot.
	 */
	@Test
    @Ignore
	public void numberOfEventsType() {
		EventType[] events = EventType.values();
		assertEquals(87, events.length);
	}
}
