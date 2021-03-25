package com.skillup.organization.service;


import com.skillup.organization.model.Organization;
import com.skillup.organization.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository repository;


    public Optional<Organization> getOrg(String organizationId) {
        return repository.findById(organizationId);
    }

    public void saveOrg(Organization org) {
        org.setId(UUID.randomUUID().toString());

        repository.save(org);

    }

    public void updateOrg(Organization org) {
        repository.save(org);
    }

    public void deleteOrg(Organization org) {
        repository.deleteById(org.getId());
    }

}
