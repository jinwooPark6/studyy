package com.example.demo.services;

import com.example.demo.domains.ArticleDto;
import com.example.demo.domains.ReplyDto;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public interface ArticleService {
    public void writeArticle(ArticleDto article);
    public void modifyArticle(ArticleDto article);
    public void removeArticle(ArticleDto article);
    public void writeReply(ReplyDto reply);
    public void removeRepl(ReplyDto reply);
    public ArticleDto readArticle(int artId);
    public List<ReplyDto> readReply(int artId);

    
}
