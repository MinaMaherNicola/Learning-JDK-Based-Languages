import org.springframework.context.support.ClassPathXmlApplicationContext;
import springannotations.Coach;

public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("tennisCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        context.close();
    }
}