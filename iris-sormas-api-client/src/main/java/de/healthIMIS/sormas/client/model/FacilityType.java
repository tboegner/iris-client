/*
 * SORMAS REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.55.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package de.healthIMIS.sormas.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets FacilityType
 */
public enum FacilityType {
	ASSOCIATION("ASSOCIATION"), BUSINESS("BUSINESS"), CAMPSITE("CAMPSITE"), CANTINE("CANTINE"), CHILDRENS_DAY_CARE(
			"CHILDRENS_DAY_CARE"), CHILDRENS_HOME("CHILDRENS_HOME"), CORRECTIONAL_FACILITY(
					"CORRECTIONAL_FACILITY"), CRUISE_SHIP("CRUISE_SHIP"), ELDERLY_DAY_CARE("ELDERLY_DAY_CARE"), EVENT_VENUE(
							"EVENT_VENUE"), FOOD_STALL("FOOD_STALL"), HOLIDAY_CAMP("HOLIDAY_CAMP"), HOMELESS_SHELTER(
									"HOMELESS_SHELTER"), HOSPITAL("HOSPITAL"), HOSTEL("HOSTEL"), HOTEL("HOTEL"), KINDERGARTEN(
											"KINDERGARTEN"), LABORATORY("LABORATORY"), MASS_ACCOMMODATION(
													"MASS_ACCOMMODATION"), MILITARY_BARRACKS("MILITARY_BARRACKS"), MOBILE_NURSING_SERVICE(
															"MOBILE_NURSING_SERVICE"), OTHER_ACCOMMODATION(
																	"OTHER_ACCOMMODATION"), OTHER_CARE_FACILITY(
																			"OTHER_CARE_FACILITY"), OTHER_CATERING_OUTLET(
																					"OTHER_CATERING_OUTLET"), OTHER_EDUCATIONAL_FACILITY(
																							"OTHER_EDUCATIONAL_FACILITY"), OTHER_LEISURE_FACILITY(
																									"OTHER_LEISURE_FACILITY"), OTHER_MEDICAL_FACILITY(
																											"OTHER_MEDICAL_FACILITY"), OTHER_RESIDENCE(
																													"OTHER_RESIDENCE"), OTHER_WORKING_PLACE(
																															"OTHER_WORKING_PLACE"), OUTPATIENT_TREATMENT_FACILITY(
																																	"OUTPATIENT_TREATMENT_FACILITY"), PLACE_OF_WORSHIP(
																																			"PLACE_OF_WORSHIP"), PUBLIC_PLACE(
																																					"PUBLIC_PLACE"), REFUGEE_ACCOMMODATION(
																																							"REFUGEE_ACCOMMODATION"), REHAB_FACILITY(
																																									"REHAB_FACILITY"), RESTAURANT(
																																											"RESTAURANT"), RETIREMENT_HOME(
																																													"RETIREMENT_HOME"), SCHOOL(
																																															"SCHOOL"), SWIMMING_POOL(
																																																	"SWIMMING_POOL"), THEATER(
																																																			"THEATER"), UNIVERSITY(
																																																					"UNIVERSITY"), ZOO(
																																																							"ZOO");

	private String value;

	FacilityType(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static FacilityType fromValue(String text) {
		for (FacilityType b : FacilityType.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
