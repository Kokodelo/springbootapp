package app.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import app.model.JSonConverter;

@RestController
@EnableAutoConfiguration
public class MyRestController {

	@RequestMapping("/api")
    String home(@RequestBody String input){
        return input + "\n\n"+ convert(input);
    }
	 
	private String convert(String input) {
		//input = input.replace("\t", "");
		input = input.replace(" ", "");
		
		input = input.replace("[", "[\\n");
		input = input.replace("{", "{\\n");
		
		input = input.replace("\"", "\\\"");
		input = input.replace(",", ",\\n");
		

		input = input.replace("}", "\\n}");
		input = input.replace("]", "\\n]");
		return input;
	}

	@RequestMapping("/test")
    public String jsconv(@RequestParam(value="name", defaultValue="World") String name) {
        return name;
    }
	
}
	
	
