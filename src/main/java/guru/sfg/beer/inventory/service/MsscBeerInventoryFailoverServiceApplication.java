package guru.sfg.beer.inventory.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisAutoConfiguration;

@SpringBootApplication(exclude = ArtemisAutoConfiguration.class)
public class MsscBeerInventoryFailoverServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscBeerInventoryFailoverServiceApplication.class, args);
    }

}
