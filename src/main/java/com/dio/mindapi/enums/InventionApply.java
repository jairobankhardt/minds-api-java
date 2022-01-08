package com.dio.mindapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InventionApply {
	
	MATH("Math"),
	CHEMISTRY("Chemistry"),
	PHYSICAL("Physical"),
	PHILOSOPHY("Philosophy"),
	BIOLOGY("Biology"),
	ART("Art");
	
	private final String description;

}
