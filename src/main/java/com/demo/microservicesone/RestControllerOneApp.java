package com.demo.microservicesone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/client")
public class RestControllerOneApp {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	public String hello() {
		String url = "http://micro-services-two/rest/server";
		String url2 = "http://micro-services-three/rest/three";
		String url3 = "http://micro-services-four/rest/server1";
		String response1 = restTemplate.getForObject(url, String.class);
		String response2 = restTemplate.getForObject(url2, String.class);
		String response3 = restTemplate.getForObject(url3, String.class);
		System.out.println("response1 " + response1);
		System.out.println("response2 " + response2);
		System.out.println("response3 " + response3);
		return response1 +"  ::  \n"+ response2  +" \n ::  "+response3;
	}

}
