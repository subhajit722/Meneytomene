import javax.persistence.*;
import java.util.List;

@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "S_ID")

    private  int S_id;
    @Column(name = "S_name")
    private  String S_name;
    @Column(name = "S_adderss")
    private  String S_adderss;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Course> c1;

    public List<Course> getC1() {
        return c1;
    }

    public void setC1(List<Course> c1) {
        this.c1 = c1;
    }

    public int getS_id() {
        return S_id;
    }

    public void setS_id(int s_id) {
        S_id = s_id;
    }

    public String getS_name() {
        return S_name;
    }

    public void setS_name(String s_name) {
        S_name = s_name;
    }

    public String getS_adderss() {
        return S_adderss;
    }

    public void setS_adderss(String s_adderss) {
        S_adderss = s_adderss;
    }
}
