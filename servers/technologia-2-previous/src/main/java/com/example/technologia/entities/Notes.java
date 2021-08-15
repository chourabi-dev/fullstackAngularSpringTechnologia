package com.example.technologia.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
 

@Entity
@Table( name = "notes" )
public class Notes {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private long id;
	
	
	@Size(min = 5, max= 15,  message ="must be biger than 5 chars")
	@Column( name ="note_title", nullable = false )
	private String title;
	
	
	
	 
	@Min(value = 10)
	@Column( name ="note_content", nullable = false )
	private String content;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Notes(long id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public Notes() {
		super();
	}
	
	
	
	

}
