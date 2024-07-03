import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.helloworld.controller.HelloWorldController; // Vérifiez que ce chemin est correct

@SpringBootTest
public class HelloWorldApplicationTests {

    @Autowired
    private HelloWorldController helloWorldController;

    @Test
    void contextLoads() {
        assertNull(helloWorldController);
    }
}
