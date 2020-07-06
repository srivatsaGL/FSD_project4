package com.learner.controller;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

@Provider
public class CORSResponseFilter implements ContainerResponseFilter {
	public void filter(
			ContainerRequestContext requestContext,
			ContainerResponseContext responseContext)
	throws IOException {
		//MultivaluedMap<String, Object> headers=responseContext.getHeaders();
		responseContext.getHeaders().add("Access-Control-Allow-Origin","*");
		responseContext.getHeaders().add("Access-Control-Allow-Methods","GET,POST,PATCH,DELETE,PUT,OPTIONS, HEAD");
		//responseContext.getHeaders().add("Access-Control-Allow-Headers","X-Requested-With, Content-Type");
	      
		responseContext.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
		responseContext.getHeaders().add("Access-Control-Allow-Credentials", "true");

		
	}

}

