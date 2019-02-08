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
@RequestMapping("/venezuela")
public class VenezuelaServiceController {

	private static final Map<Long, String> CUSTOMERS = ImmutableMap.of(1L, "Caracas", 2L, "Petare", 3L, "Baruta", 4L,
			"Chacao");

	@GetMapping
	public List<String> findAll() {
		System.out.println("Passando pela API Venezuela");
		return new ArrayList<>(CUSTOMERS.values());
	}

	@GetMapping(path = "/{id}")
	public String findById(@PathVariable("id") Long id) {
		return CUSTOMERS.get(id);
	}

}
