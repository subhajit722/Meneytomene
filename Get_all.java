import javax.persistence.*;
import java.util.List;

public class Get_all {

    public static void main(String[] args) {
        EntityManagerFactory e1 = Persistence.createEntityManagerFactory("root");
        EntityManager e2 = e1.createEntityManager();
        EntityTransaction e3 = e2.getTransaction();

        Query q1 = e2.createQuery("select s from Student s");

        List<Student> l1  = q1.getResultList();
        for(Student s1:l1){
            System.out.println("_________________________STUDENTS______________________");

            System.out.println("S_ID IS "+s1.getS_id());
            System.out.println("S_NAME IS "+s1.getS_name());
            System.out.println("S_ADDERSS "+s1.getS_adderss() );

            List<Course> c1  = s1.getC1();

            for (Course c2:c1){
                System.out.println("____________________COURRSE_______________________");
                System.out.println("C_ID is "+c2.getC_id() );
                System.out.println("C_NAME IS "+c2.getCours_name());
                System.out.println("C_DURAING IS "+c2.getC_duration());
            }


        }





    }
}
