package hello;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class// tworzy tabelke z tej nazwy!!
public class Product {



	public Product(String name) {
		this.name = name;
	}

	//domyślnie- trzeba dodać
	public Product (){}

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String name;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

