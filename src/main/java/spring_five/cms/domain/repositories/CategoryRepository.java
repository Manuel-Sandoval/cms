package spring_five.cms.domain.repositories;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_five.cms.domain.models.Category;

@Service
public interface CategoryRepository extends JpaRepository <Category, String> {

	List<Category> findByName(String name);
	List<Category> findByNameIgnoreCaseStartingWith(String name);
}
