import javax.persistence.*;

@Entity


public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_ID")
    private int c_id;
    @Column(name = "C_name")
    private  String cours_name;
    @Column(name = "C_duration")
    private String c_duration;

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getCours_name() {
        return cours_name;
    }

    public void setCours_name(String cours_name) {
        this.cours_name = cours_name;
    }

    public String getC_duration() {
        return c_duration;
    }

    public void setC_duration(String c_duration) {
        this.c_duration = c_duration;
    }
}
