import javafx.application.Application;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by angel on 2018/9/27.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class ApplicationTest {


    @Test
    public void testOne(){

    }

    @After
    public void AfterTest(){
        System.out.println("");
    }


}
