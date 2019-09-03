package spring_five.cms.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import spring_five.cms.domain.models.User;

@Service
public interface UserRepository extends JpaRepository<User, String> {

}
