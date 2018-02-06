/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.people.boundary;

import com.airhacks.entity.Person;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Nino
 */
@Path("/people")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Stateless
public class PeopleResource {

    @PersistenceContext(unitName = "mysql")
    private EntityManager em;

    @GET
    public List<Person> listPeople() {
        return em.createQuery("SELECT p FROM Person p", Person.class).getResultList();
    }

    @POST
    public Response createPerson(Person person) throws URISyntaxException {
        person.setId(null);
        em.persist(person);
        return Response.created(new URI("people/" + person.getId())).build();
    }

}
