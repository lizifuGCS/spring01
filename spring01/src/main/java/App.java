import com.qst.Impl.MathInterImpl;
import com.qst.MathInter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mvc.xml");
        MathInter mathInter = (MathInter) context.getBean("mathInterImpl");
        mathInter.add(10, 2);

    }

}