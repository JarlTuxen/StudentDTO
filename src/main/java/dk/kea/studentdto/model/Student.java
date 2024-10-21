package dk.kea.studentdto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String password;

    private LocalDate bornDate;

    private LocalTime bornTime;

    public Student(String name, LocalDate bornDate, LocalTime bornTime) {
        this.name = name;
        this.bornDate = bornDate;
        this.bornTime = bornTime;
    }

}
