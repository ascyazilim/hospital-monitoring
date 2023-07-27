package com.birkil.hospitalmonitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.birkil.hospitalmonitoring")
//@ComponentScan(basePackages = {"com.birkil.hospitalmonitoring.controller"})
//@ComponentScan(basePackages = {"com.birkil.hospitalmonitoring.service"})
public class HospitalMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalMonitoringApplication.class, args);
	}

}
