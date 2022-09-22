
package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;

/**
 * @author Hilbert
 *
 */
@Component
public class SpecimenServiceStub implements ISpecimenService {

	@Override
	public SpecimenDTO fetchbyId(int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenid(43);
		specimenDTO.setLatitude("3974");
		specimenDTO.setLongitude("-84.51");
		specimenDTO.setDescription("A beautiful Eastern RedBud");
		return specimenDTO;
	}

	@Override
	public void save(SpecimenDTO specimenDTP) {

	}

}
