package bpv.example.springboot.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Question {
    @Id
    @GeneratedValue
    private int questionId;
    private String description;

    @OneToOne
    @JoinColumn(name="category_id")
    private Category category;

    @OneToMany
    @JoinColumn(name="answer_id")
    private Set<Answer> answers;
}
