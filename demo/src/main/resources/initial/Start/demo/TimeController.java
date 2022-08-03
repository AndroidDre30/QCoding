package initial.Start.demo;

import java.time.ZonedDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TimeController {
	@GetMapping("/UTC")
	public ZonedDateTime UTCTime() {
		ZonedDateTime Ztime = ZonedDateTime.now();
		return Ztime;
	
		
	}
	
	public ZonedDateTime DateTime() {
		
			ZonedDateTime Ztime = ZonedDateTime.now();
			return Ztime;
		
	}

}
