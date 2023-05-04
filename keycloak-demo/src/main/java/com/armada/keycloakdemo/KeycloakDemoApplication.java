package com.armada.keycloakdemo;

import com.armada.keycloakdemo.config.KeycloakConfig;
import org.keycloak.admin.client.Keycloak;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KeycloakDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakDemoApplication.class, args);
		Keycloak keycloack = KeycloakConfig.getInstance();
		System.out.println(keycloack);
	}

}
