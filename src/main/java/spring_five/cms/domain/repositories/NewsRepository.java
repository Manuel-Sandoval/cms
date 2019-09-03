package spring_five.cms.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import spring_five.cms.domain.models.News;

public interface NewsRepository extends JpaRepository<News, String> {

}
