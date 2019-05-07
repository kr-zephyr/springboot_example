package com.sz21c.bootexample.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ManufactureEntity {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String country;

	public ManufactureEntity(String name, String country) {
		this.name = name;
		this.country = country;
	}
}
