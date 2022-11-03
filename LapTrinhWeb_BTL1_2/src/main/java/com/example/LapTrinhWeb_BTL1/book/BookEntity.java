package com.example.LapTrinhWeb_BTL1.book;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "book")
public class BookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(nullable = false, name = "title")
	private String title;

	@Column(nullable = false, name = "author")
	private String author;

	@Column(nullable = false)
	private String releaseDate;

	@Column(name = "category")
	private String category;

	@Column(name = "description")
	private String description;

	@Column(name = "page")
	private Integer page;

	@Column(columnDefinition = "BLOB")
	private String image;
//	private MultipartFile imageFile;

	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookEntity(Integer id, String title, String author, String releaseDate, String category, String description,
			Integer page, String image) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.releaseDate = releaseDate;
		this.category = category;
		this.description = description;
		this.page = page;
		this.image = image;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
