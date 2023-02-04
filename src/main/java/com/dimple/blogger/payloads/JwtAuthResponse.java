package com.dimple.blogger.payloads;

import com.dimple.blogger.payloads.UserDto;

import lombok.Data;

@Data
public class JwtAuthResponse {

	private String token;
	
	private UserDto user;
}
