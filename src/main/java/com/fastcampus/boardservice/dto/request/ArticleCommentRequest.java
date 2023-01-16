package com.fastcampus.boardservice.dto.request;

import com.fastcampus.boardservice.dto.ArticleCommentDto;
import com.fastcampus.boardservice.dto.UserAccountDto;
import com.fastcampus.boardservice.dto.response.ArticleCommentResponse;

import java.io.Serializable;

/**
 * A DTO for the {@link com.fastcampus.boardservice.domain.ArticleComment} entity
 */
public record ArticleCommentRequest(Long articleId, String content) {

    public static ArticleCommentRequest of(Long articleId, String content){
        return new ArticleCommentRequest(articleId, content);
    }

    public ArticleCommentDto toDto(UserAccountDto userAccountDto){
        return ArticleCommentDto.of(
                articleId,
                userAccountDto,
                content
        );
    }
}