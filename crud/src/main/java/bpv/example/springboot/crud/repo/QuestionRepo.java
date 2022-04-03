package bpv.example.springboot.crud.repo;

import bpv.example.springboot.crud.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {
    @Query(value = "Select q from Question q where upper(q.category.name) = :name")
    List<Question> findByCategory(@Param("name") String category);
}
