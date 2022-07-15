package cl.java.crud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cl.java.crud.model.Student;
import cl.java.crud.repository.IStudentRepository;


@Service
public class StudentService {
	
	@Autowired
	private IStudentRepository iStudenRepository;
	
	
	public Student saveStudent (Student student) {
		if(student.getId() == null) {	
			return iStudenRepository.save(student);
		}
		return null;
	}
	
	
	public Page<Student> getAllStudent(Integer page, Integer size, Boolean enablePagination){
		return iStudenRepository.findAll(enablePagination ? PageRequest.of(page, size): Pageable.unpaged());
	}
	
	public Optional<Student> findById(Long id){
		return iStudenRepository.findById(id);
	}
	
	
	public void deleteStudent(Long id) {
		iStudenRepository.deleteById(id);
	}
	
	
	public Student editStudent (Student student) {
		if(student.getId() != null && iStudenRepository.existsById(student.getId())) {
			return iStudenRepository.save(student);	
		}
		return null;
	}
	
	public boolean existById(Long id) {
		return iStudenRepository.existsById(id);
	}
	
}
