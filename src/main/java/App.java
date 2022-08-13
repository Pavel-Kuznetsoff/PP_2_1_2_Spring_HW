import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hw1 = (HelloWorld) context.getBean("helloworld");
        System.out.println(hw1.getMessage());

        HelloWorld hw2 = (HelloWorld) context.getBean("helloworld");
        System.out.println(hw2.getMessage());

        Cat cat1 = context.getBean("cat", Cat.class);
        Cat cat2 = context.getBean("cat", Cat.class);

        System.out.println(hw1 == hw2);
        System.out.println(cat1 == cat2);

    }
}