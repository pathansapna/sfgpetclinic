import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = SfgpetclinicApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class SfgpetclinicApplicationTest {

    @Test
    void contextLoads() {
    }
}