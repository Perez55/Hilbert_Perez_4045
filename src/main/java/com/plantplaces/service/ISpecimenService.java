package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;



/**
 * CRUD Operations for specimen
 *
 */

public interface ISpecimenService {

	/**
	 * Get specimen from persistence layer.
	 * @param id a unique lookup
	 *@return a specimen with a matching id
	 */
	
	SpecimenDTO fetchbyId(int id);
	
	
	/**
	 * Persist the given DTO
	 * @param specimenDTO 
	 */

	void save(SpecimenDTO specimenDTP);

}