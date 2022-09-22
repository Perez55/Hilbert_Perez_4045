/**
 * 
 */
package com.plantplaces.dto;

/**
 * @author Hilbert
 *
 */
public class SpecimenDTO {

	private int specimenId;
	private String latitude;
	private String longitude;
	private String description;

	public int getSpecimenid() {
		return specimenId;
	}

	public void setSpecimenid(int specimenid) {
		this.specimenId = specimenid;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return specimenId + " " + latitude + " " + longitude + " " + description;
	}
}