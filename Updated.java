import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Updated {
    public static void main(String[] args) {
        EntityManagerFactory e1 = Persistence.createEntityManagerFactory("root");
        EntityManager e2 = e1.createEntityManager();
        EntityTransaction e3 =e2.getTransaction();

        Student s1  = new Student();
        s1.setS_id(1);
        s1.setS_name("PATHIK");
        s1.setS_adderss("KOLKATA");

        List<Course> co = new ArrayList<>();

        Course c1  = new Course();
        c1.setC_id(1);
        c1.setCours_name("FULL_STACK");
        c1.setC_duration("8MOUNTH");

        co.add(c1);
        s1.setC1(co);

        e3.begin();
        e2.merge(s1);
        e3.commit();
        System.out.println("DATA IS UPDATED");



    }
}
