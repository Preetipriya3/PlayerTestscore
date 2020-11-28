/**
 * 
 */
package com.waterlabsqa.datatest;

import com.ebay.xcelite.annotations.Column;

/**
 * @author Preetipriya
 *
 */
public class Player {
	@Column (name="Id")
	private Integer id;
	
	@Column (name="Player Name")
	private String name;
	
	@Column (name="Age (Years)")
	private Integer age;
	
	@Column (name="Rating")
	private Double rating;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
}

