package uk.co.kirstywilliams.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Main Application which starts the
 * Spring Boot context.
 *
 * @author Kirsty Williams
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    /**
     * Main Method.
     *
     * @param args
     *        the arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
