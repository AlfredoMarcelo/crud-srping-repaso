package cl.java.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.java.crud.model.Student;

@Repository // ayuda a hacer la persistencia a la base de datos, crud
public interface IStudentRepository extends JpaRepository<Student, Long>{ //solicitara la clase y el tipo de dato del id

}
