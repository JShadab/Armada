package com.armada.keycloakdemo.service;

import com.armada.keycloakdemo.model.Organization;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class OrganizationService {
    private List<Organization> organizations;

    @PostConstruct
    private void setUp() {
        this.organizations = Arrays.asList(Organization.builder().id(1L).name("Armada").build(),
                Organization.builder().id(2L).name("BMC").build(),
                Organization.builder().id(3L).name("Capgemini").build(),
                Organization.builder().id(4L).name("Deloitte").build());
    }

    public List<Organization> getAllOrganizations() {
        return this.organizations;
    }

    public Optional<Organization> getOrganizationById(long id) {
        return this.organizations.stream().filter(o -> o.getId() == id).findAny();
    }
}
