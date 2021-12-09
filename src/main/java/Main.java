import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ReaderCSVImpl;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/spring-context.xml");
        ReaderCSVImpl service = context.getBean(ReaderCSVImpl.class);
        System.out.println(service.loadFile());
    }
}

