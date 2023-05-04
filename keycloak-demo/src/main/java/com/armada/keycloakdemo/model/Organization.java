package com.armada.keycloakdemo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Organization {

    private long id;
    private String name;
}
