package  com.eldisol.jacoboot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import  com.eldisol.jacoboot.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
