package spring_five.cms.domain.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import spring_five.cms.domain.models.User;

@Service
public interface UserRepository extends MongoRepository<User, String> {

}
