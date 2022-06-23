package br.edu.univas.si7.trabalho01.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.edu.univas.si7.trabalho01.model.Category;

public class CategoryDTO {

	@NotNull(message = "Name can not be null.")
	@NotEmpty(message = "Name can not be empty.")

	private String name;

	public CategoryDTO(Category category) {
		this.name = category.getName();
	}

	public CategoryDTO() {
	}

	public CategoryDTO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CategoryDTO [name=" + name + "]";
	}

}
