package spring_five.cms.domain.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import spring_five.cms.domain.models.News;

public interface NewsRepository extends MongoRepository<News, String> {

}
