package com.bah.msd.customerapi.security.util;

import com.bah.msd.customerapi.domain.Token;

public interface JWTUtil {
	public boolean verifyToken(String jwt_token);
	public String getScopes(String jwt_token) ;
	public Token createToken(String scopes) ;
}
