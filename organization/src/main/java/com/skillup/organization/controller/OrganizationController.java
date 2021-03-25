package com.skillup.organization.controller;


import com.skillup.organization.model.Organization;
import com.skillup.organization.service.OrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "v1/organizations")
public class OrganizationController {

    @Autowired
    private OrganizationService service;


    private static final Logger log = LoggerFactory.getLogger(OrganizationController.class);

    @RequestMapping(value = "/{organizationId}", method = RequestMethod.GET)
//    @GetMapping("/hello/{organizationId}")
    public Organization getOrganization(@PathVariable("organizationId") String organizationId) {
        log.debug(String.format("Looking up data for org {}", organizationId));

        Organization org = service.getOrg(organizationId).get();
        org.setContactName("OLD::" + org.getContactName());
        return org;
    }

    @RequestMapping(value = "/{organizationId}", method = RequestMethod.PUT)
    public void updateOrganization(@PathVariable("organizationId") String orgId, @RequestBody Organization org) {
        service.updateOrg(org);
    }

    @RequestMapping(value = "/{organizationId}", method = RequestMethod.POST)
    public void saveOrganization(@RequestBody Organization org) {
        service.saveOrg(org);
    }

    @RequestMapping(value = "/{organizationId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrganization(@PathVariable("orgId") String orgId, @RequestBody Organization org) {
        service.deleteOrg(org);
    }
}
