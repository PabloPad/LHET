package com.parabolt.lhet.api.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HighRiskRequest {

	private String high_risk_name;
	private int country_code;
	private String status;
	private String address;
	private String case_type;
	private int v_id;
	
}
