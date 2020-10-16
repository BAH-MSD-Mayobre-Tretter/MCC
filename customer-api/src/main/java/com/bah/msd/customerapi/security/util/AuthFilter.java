package com.bah.msd.customerapi.security.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class AuthFilter implements Filter {
	
	JWTHelper jwtUtil = new JWTHelper();

	private String api_scope = "com.bah.msd.customerapi.api";

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String uri = req.getRequestURI();
		
		// System.out.println("filter uri: " + uri);
		
		// auth checking will not apply to these cases
		// token endpoint
		// user register endpoint
		// healthcheck endpoint on '/api/'
		
		if(   !uri.startsWith("/api/events") 
	       && !uri.startsWith("/api/registrations")
	       && !uri.startsWith("/api/customers")
	       ) {
			// System.out.println("blah blah blah");
			chain.doFilter(request, response);
			return;
			
		} else {
			
			
			// System.out.println("we need authorization here");
			// check JWT token
			String authheader = req.getHeader("authorization");
			
			// System.out.println("authheader is "+ authheader);
			
			if (authheader != null && authheader.length() > 7 && authheader.startsWith("Bearer")) {
				String jwt_token = authheader.substring(7, authheader.length());
				
				// System.out.println(jwtUtil.verifyToken(jwt_token));
				if (jwtUtil.verifyToken(jwt_token)) {
					String request_scopes = jwtUtil.getScopes(jwt_token);
					
					// System.out.println("Compare request scopes " + request_scopes + " with api scope "+ api_scope);
					
					if (request_scopes.contains(api_scope)) {
						// continue on to api
						chain.doFilter(request, response);
						return;
					}
				}
			}
		}

		// reject request and return error instead of data
		res.sendError(HttpServletResponse.SC_FORBIDDEN, "failed authentication");
	}

}

