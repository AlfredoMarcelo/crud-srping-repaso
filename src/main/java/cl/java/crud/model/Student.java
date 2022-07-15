package cl.java.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data //al inyectar una dependencia nueva se debe hacer clic en el recuadro de pom.xml
@Entity
@Table(name = "Student") //en la base de datos se va a guardar como Student
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //genera el id automaticamente
	private Long id;
	private String name;
	private String lastName;
	private int age;
}
