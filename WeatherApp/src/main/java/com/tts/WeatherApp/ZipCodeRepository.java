package com.tts.WeatherApp;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import com.tts.WeatherApp.ZipCode;

public interface ZipCodeRepository extends CrudRepository<ZipCode, Long> {
	List<ZipCode> findAll(); 
	List<ZipCode> findByAuthorIngoreCase(String zipCode);
	ZipCode deleteById(long id); 
	ZipCode findById(long id);
	

	

}