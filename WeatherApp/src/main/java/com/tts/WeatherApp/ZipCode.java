package com.tts.WeatherApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class ZipCode {
	
    @Id
	
    //allows the Id to be generated by the underlying database
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
}
