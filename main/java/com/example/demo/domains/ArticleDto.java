package com.example.demo.domains;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter @Setter @Component
public class ArticleDto {
    protected int artId;
    protected String writerId, title, content, writtenDate, updateDate;

}
