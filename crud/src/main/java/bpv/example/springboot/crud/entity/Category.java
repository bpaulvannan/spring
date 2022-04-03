package bpv.example.springboot.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Category {
    @Id
    @GeneratedValue
    @Column(name="category_id")
    private int categoryId;
    private String name;
    private String description;
}
