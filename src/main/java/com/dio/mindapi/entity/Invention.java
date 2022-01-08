package com.dio.mindapi.entity;

import com.dio.mindapi.enums.InventionApply;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Invention {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idInvention;

	@Column(nullable = false)
	private String nameInvention;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private InventionApply apply;
	
}
