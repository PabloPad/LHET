package com.parabolt.lhet.api.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VolunteerRequest {

	private String volunteer_name;
	private int country_code;
	private String address;
	private int admin_id;
	
}
