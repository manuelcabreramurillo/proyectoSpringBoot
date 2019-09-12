package uy.gub.imm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController()
@RequestMapping("/")
public class SpringbootVentasApplication {

    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
    	return "Holaaaaaaaa";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootVentasApplication.class, args);
	}

}
