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
public class AirplaneEntity {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private Integer numberOfEngine;

	public AirplaneEntity(String name, Integer numberOfEngine) {
		this.name = name;
		this.numberOfEngine = numberOfEngine;
	}
}
