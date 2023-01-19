import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Insert {
    public static void main(String[] args) {
        EntityManagerFactory e1 = Persistence.createEntityManagerFactory("root");
        EntityManager e2 = e1.createEntityManager();
        EntityTransaction e3 =e2.getTransaction();
        Student s1 = new Student();
        s1.setS_name("Subho");
        s1.setS_adderss("Asansole");
        Course c1 = new Course();
        c1.setCours_name("BACKENT_DEVELOPRE");
        c1.setC_duration("6MOUNTHS");

        Course c2 = new Course();
        c2.setCours_name("SQL");
        c2.setC_duration("1MOUNTHS");


        Course c3 = new Course();
        c3.setCours_name("CORE_JAVA");
        c3.setC_duration("3MOUNTHS");


        Course c4 = new Course();
        c4.setCours_name("ADVANDEC_JAVA");
        c4.setC_duration("3MOUNTHS");
        List<Course> cl = new ArrayList<>();
        cl.add(c1);
        cl.add(c2);
        cl.add(c3);
        cl.add(c4);

        Student s2 = new Student();
        s2.setS_name("JIT");
        s2.setS_adderss("Asansole");

        Course c5 = new Course();
        c5.setCours_name("FRONTEND_DEVELOPER");
        c5.setC_duration("3MOUNTHS");


        Course c6 = new Course();
        c6.setCours_name("HTML");
        c6.setC_duration("20DAYS");


        Course c7 = new Course();
        c7.setCours_name("CSS");
        c7.setC_duration("1MOUNTHS");

        Course c8 = new Course();
        c8.setCours_name("JAVA_SCRIPT");
        c8.setC_duration("1MOUNTHS");


        List<Course> cl2 = new ArrayList<>();
        cl2.add(c5);
        cl2.add(c6);
        cl2.add(c7);
        cl2.add(c8);

        s1.setC1(cl);
        s2.setC1(cl2);

        e3.begin();
        e2.persist(s1);
        e2.persist(s2);
        e3.commit();
        System.out.println("DATA IS INSERTED");


    }
}
