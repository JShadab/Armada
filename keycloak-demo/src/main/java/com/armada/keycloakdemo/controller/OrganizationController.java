package com.armada.keycloakdemo.controller;

import com.armada.keycloakdemo.model.Organization;
import com.armada.keycloakdemo.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orgs")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @GetMapping("/")
    @RolesAllowed("Admin")
    public List<Organization> getAllOrganizations() {
        return this.organizationService.getAllOrganizations();
    }
    @GetMapping("/{id}")
    @RolesAllowed("User")
    public Optional<Organization> getOrganizationById(@PathVariable long id) {
        return this.organizationService.getOrganizationById(id);
    }

}
