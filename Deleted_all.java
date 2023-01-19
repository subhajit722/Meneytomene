import javax.persistence.*;

public class Deleted_all {

    public static void main(String[] args) {
        EntityManagerFactory e1  = Persistence.createEntityManagerFactory("root");
        EntityManager e2 = e1.createEntityManager();
        EntityTransaction e3 = e2.getTransaction();

        Query q1 = e2.createQuery("delete from Student");

        e3.begin();
        q1.executeUpdate();
        e3.commit();
        System.out.println("DATA IS DELETED");
    }
}
