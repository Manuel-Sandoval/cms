package spring_five.cms.domain.repositories;

import org.springframework.stereotype.Service;

import org.springframework.data.mongodb.repository.MongoRepository;

import spring_five.cms.domain.models.Category;

@Service
public interface CategoryRepository extends MongoRepository <Category, String> {
	
}
