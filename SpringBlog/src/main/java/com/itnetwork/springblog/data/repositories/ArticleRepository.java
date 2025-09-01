package com.itnetwork.springblog.data.repositories;

import com.itnetwork.springblog.data.entities.ArticleEntity;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<ArticleEntity, Long> {
}