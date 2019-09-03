package spring_five.cms.domain.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring_five.cms.domain.exceptions.CategoryNotFoundException;
import spring_five.cms.domain.models.Category;
import spring_five.cms.domain.repositories.CategoryRepository;
import spring_five.cms.domain.vo.CategoryRequest;

@Service
@Transactional(readOnly = true)
public class CategoryService {

	@Autowired
	private final CategoryRepository categoryRepository;

	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Transactional
	public Category update(Category category) {
		return this.categoryRepository.save(category);
	}

	@Transactional
	public Category create(CategoryRequest request) {
		Category category = new Category();
	    category.setName(request.getName());
		return this.categoryRepository.save(category);
	}

	@Transactional
	public void delete(String id) {
		final Optional<Category> category = this.categoryRepository.findById(id);
		category.ifPresent(this.categoryRepository::delete);
	}

	public List<Category> findAll() {
		return this.categoryRepository.findAll();
	}
	
	public Category findOne(String id) {
		return null; //this.categoryRepository.findOne(id);
	}

}
