package com.parabolt.lhet.api.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor 
public class AdminRequest {
	
	private String full_name;
	private int country_code;
	private String profession;
	private String address;
	
	
	
}
