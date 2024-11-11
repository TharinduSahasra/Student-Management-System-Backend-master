package Entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "student")
public class Student {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   
    private String firstName;

    private String lastName;

   
    private String email;

    
    private String department;

    
    private int yearOfEnrollment;

    
}
