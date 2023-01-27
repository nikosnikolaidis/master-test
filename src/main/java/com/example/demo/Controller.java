
@RestController
@RequestMapping(value="/api")
public class Controller {
    
    @GetMapping(value="/hello")
    public String hello() {
        return "Hello!";
    }
}