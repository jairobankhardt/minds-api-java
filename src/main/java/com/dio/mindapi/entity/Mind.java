package com.dio.mindapi.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Mind {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMind;
	
	@Column(nullable = false)
	private String nameMind;
	
	@Column(nullable = false)
	private String country;
	
	@Column(nullable = false)
	private LocalDate birthDate;
	
	private LocalDate deathDate;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
	private List<Invention> inventions;
}
