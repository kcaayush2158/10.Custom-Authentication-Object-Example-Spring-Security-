package com.oreilly.security;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import com.oreilly.security.domain.entities.AutoUser;

public class CustomAuthenticationToken extends UsernamePasswordAuthenticationToken {
	
	private String make;
	
	public CustomAuthenticationToken(String principal, Object credentials,String make) {
		super(principal, credentials);
			this.make = make;
	}

	public CustomAuthenticationToken(AutoUser principal, Object credentials,
			Collection<? extends GrantedAuthority> authorities, String make) {
		super(principal, credentials, authorities);
		this.make = make;
	}

	public String getMake() {
		return make;
	}
}
