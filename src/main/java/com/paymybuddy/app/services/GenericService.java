package com.paymybuddy.app.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public class GenericService<E> {

	/**
	 * Injects entity repository bean
	 */
	@Autowired
	CrudRepository<E, Integer> repository;

	/**
	 * findById - Get one entity
	 * 
	 * @param id The id of the entity
	 * @return An Entity object full filled
	 */
	public Optional<E> findById(Integer id) {
		return repository.findById(id);
	}

	/**
	 * findAll - Get all entities
	 * 
	 * @return - An Iterable object of Entity full filled
	 */
	public Iterable<E> findAll() {
		return repository.findAll();
	}

	/**
	 * save - Add a new entity, or update a existing entity
	 * 
	 * @param entity An object Entity
	 * @return The entity object saved/updated
	 */
	public E save(E entity) {
		return repository.save(entity);
	}

	/**
	 * deleteById - Delete an entity
	 * 
	 * @param id - The id of the entity to delete
	 */
	public void deleteById(Integer id) {
		repository.deleteById(id);
	}

	/**
	 * delete - Delete an entity
	 * 
	 * @param entity - The entity to delete
	 */
	public void delete(E entity) {
		repository.delete(entity);
	}

	/**
	 * existsById - Returns whether an entity with the given id exists.
	 * 
	 * @param id - The id of the entity to delete
	 * @return true if an entity with the given id exists, false otherwise
	 */
	public boolean existsById(Integer id) {
		return repository.existsById(id);
	}

	/**
	 * count - Returns the number of entities available
	 * 
	 * @return the number of entities
	 */
	public long count() {
		return repository.count();
	}

}
