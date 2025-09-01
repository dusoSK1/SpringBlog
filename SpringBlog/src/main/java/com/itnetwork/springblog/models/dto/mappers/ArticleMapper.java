package com.itnetwork.springblog.models.dto.mappers;

import com.itnetwork.springblog.data.entities.ArticleEntity;
import com.itnetwork.springblog.models.dto.ArticleDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ArticleMapper {
    ArticleEntity toEntity(ArticleDTO source);

    ArticleDTO toDTO(ArticleEntity source);

    void updateArticleDTO(ArticleDTO source, @MappingTarget ArticleDTO target);
    void updateArticleEntity(ArticleDTO source, @MappingTarget ArticleEntity target);


}
