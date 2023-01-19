import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Deleted_bY_id {
    public static void main(String[] args) {

        EntityManagerFactory e1 = Persistence.createEntityManagerFactory("root");
        EntityManager e2 = e1.createEntityManager();
        EntityTransaction e3 = e2.getTransaction();

        Student s1 = e2.find(Student.class,1);

        e3.begin();
        e2.remove(s1);
        e3.commit();

    }
}
