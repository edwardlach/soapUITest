import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
    "controller",
    "service"
})
public class SoapUITestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapUITestApplication.class, args);
    }

}
