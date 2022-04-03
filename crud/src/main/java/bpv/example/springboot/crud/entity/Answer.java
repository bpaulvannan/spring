package bpv.example.springboot.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="question_answer")
public class Answer {
    @Id
    @GeneratedValue
    @Column(name = "answer_id")
    private int answerId;

    @Column(name = "question_id")
    private int questionId;
    private String description;
    private boolean valid;
}
