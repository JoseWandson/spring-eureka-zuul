package com.wandson;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableMap;

@RestController
@RequestMapping("/holanda")
public class HolandaServiceController {

	private static final Map<Long, String> CUSTOMERS = ImmutableMap.of(1L, "Amsterdã", 2L, "Utrecht", 3L, "Roterdã", 4L,
			"Kinderdijk");

	@GetMapping
	public List<String> findAll() {
		System.out.println("Passando pela API Holanda");
		return new ArrayList<>(CUSTOMERS.values());
	}

	@GetMapping(path = "/{id}")
	public String findById(@PathVariable("id") Long id) {
		return CUSTOMERS.get(id);
	}

}
