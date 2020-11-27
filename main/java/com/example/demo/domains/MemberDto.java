package com.example.demo.domains;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component @Getter @Setter
public class MemberDto {
    protected int memId;
    protected String password, memName;
	//memId, memName, password
	
    
}
