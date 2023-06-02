package in.kalyan.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SsnController {

	Logger logger = LoggerFactory.getLogger(SsnController.class);

	
	@GetMapping("/{ssn}")
	public String sendStateName(@PathVariable("ssn") String ssn) {
		logger.debug("--this is debug logger 11-----");
		logger.debug("--this is debug logger 22-----");
		logger.info("----this is info logger-----");
		Character c = ssn.charAt(0);
		String state = null;
		switch (c) {
		case '1':
			state = "Memphis";
			break;
		case '2':
			state = "Dallas";
			break;
		case '3':
			state = "New Jersey";
			break;
		case '4':
			state = "Texas";
			break;
		case '5':
			state = "New York";
			break;
		default:
			state = "Invalid SSN";
			break;
		}
		logger.warn("---this is warn logger----");
		logger.error("---this is error logger----");
		return state;
	}
	
}
