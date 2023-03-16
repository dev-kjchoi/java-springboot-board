package kr.co.kjchoi.board.repository;

import kr.co.kjchoi.board.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
