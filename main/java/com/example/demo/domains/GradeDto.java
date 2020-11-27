package com.example.demo.domains;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component @Getter @Setter
public class GradeDto {
    protected String kor, eng, math;
    
}
