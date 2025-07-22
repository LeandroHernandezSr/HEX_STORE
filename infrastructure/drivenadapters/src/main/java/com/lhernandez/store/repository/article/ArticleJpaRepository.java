package com.lhernandez.store.repository.article;

import com.lhernandez.store.entities.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleJpaRepository extends JpaRepository<ArticleEntity,Integer> {
}
