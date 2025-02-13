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

package iris.sormas.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets OccupationType
 */
public enum OccupationType {
	RETAIL_AND_REPAIR_SERVICE("RETAIL_AND_REPAIR_SERVICE"), MANUFACTURING("MANUFACTURING"), CONSTRUCTION(
			"CONSTRUCTION"), TRANSPORT_AND_STORAGE("TRANSPORT_AND_STORAGE"), HEALTH_AND_SOCIAL(
					"HEALTH_AND_SOCIAL"), EDUCATION("EDUCATION"), ACCOMMODATION_AND_FOOD_SERVICES(
							"ACCOMMODATION_AND_FOOD_SERVICES"), ARTS_ENTERTAINMENT_AND_RECREATION(
									"ARTS_ENTERTAINMENT_AND_RECREATION"), PUBLIC_ADMINISTRATION_AND_DEFENCE(
											"PUBLIC_ADMINISTRATION_AND_DEFENCE"), FINANCE_AND_INSURANCE(
													"FINANCE_AND_INSURANCE"), INFORMATION_AND_COMMUNICATION(
															"INFORMATION_AND_COMMUNICATION"), PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL(
																	"PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL"), ADMINISTRATIVE_AND_SUPPORT(
																			"ADMINISTRATIVE_AND_SUPPORT"), SERVICE_OTHER("SERVICE_OTHER"), REAL_ESTATE(
																					"REAL_ESTATE"), ENERGY_SUPPLY("ENERGY_SUPPLY"), WATER_SUPPLY_AND_WASTE(
																							"WATER_SUPPLY_AND_WASTE"), EXTRATERRITORIAL_ORGANIZATIONS(
																									"EXTRATERRITORIAL_ORGANIZATIONS"), AGRICULTURE("AGRICULTURE"), MINING(
																											"MINING"), PRIVATE_HOUSEHOLD("PRIVATE_HOUSEHOLD"), FARMER(
																													"FARMER"), BUTCHER("BUTCHER"), HUNTER_MEAT_TRADER(
																															"HUNTER_MEAT_TRADER"), MINER("MINER"), RELIGIOUS_LEADER(
																																	"RELIGIOUS_LEADER"), HOUSEWIFE(
																																			"HOUSEWIFE"), PUPIL_STUDENT(
																																					"PUPIL_STUDENT"), CHILD(
																																							"CHILD"), BUSINESSMAN_WOMAN(
																																									"BUSINESSMAN_WOMAN"), TRANSPORTER(
																																											"TRANSPORTER"), HEALTHCARE_WORKER(
																																													"HEALTHCARE_WORKER"), TRADITIONAL_SPIRITUAL_HEALER(
																																															"TRADITIONAL_SPIRITUAL_HEALER"), WORKING_WITH_ANIMALS(
																																																	"WORKING_WITH_ANIMALS"), LABORATORY_STAFF(
																																																			"LABORATORY_STAFF"), OTHER(
																																																					"OTHER");

	private String value;

	OccupationType(String value) {
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
	public static OccupationType fromValue(String text) {
		for (OccupationType b : OccupationType.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
