@RestController
public class HelloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello() {
        LOGGER.info("Start sayHello");
        String message = "Hello World!!";
        LOGGER.info("End sayHello");
        return message;
    }
}
