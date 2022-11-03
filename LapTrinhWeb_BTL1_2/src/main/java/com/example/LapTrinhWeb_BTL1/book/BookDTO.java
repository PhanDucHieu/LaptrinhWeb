package com.example.LapTrinhWeb_BTL1.book;

import java.util.Date;

public class BookDTO {
	private Integer id;
	private String title;
	private String author;
	private String releaseDate;
	private String category;
	private String description;
	private Integer page;
	private String image;

//	private MultipartFile imageFile;
//	private String imageUrl;
	public BookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookDTO(Integer id, String title, String author, String releaseDate, String category, String description,
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
//	th:method="${id} == 'add' ? POST:PUT"
}
