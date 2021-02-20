package annotations.example1;

import javax.persistence.*;
@Entity
@StudentInfo(studentName = "Mario", studentAddress = "Barakas")
public class Student {
    @Id
    @GeneratedValue
    private Integer id;
    @Transient
    private String tempName;
    @Column (name = "FIRST NAME")
    private String name;
}