/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks;

import java.sql.SQLException;
import javax.annotation.Resource;
import javax.sql.DataSource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Nino
 */
@Path("dbtest")
public class DbTester {

    @Resource(lookup = "java:jboss/datasources/mysqlds")
    DataSource dataSource;

    @GET
    @Path("check")
    public String greet() throws SQLException {
        return "Connection is valid: " + dataSource.getConnection().isValid(2);
    }

}
