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
 * Gets or Sets ContactRelation
 */
public enum ContactRelation {
	SAME_HOUSEHOLD("SAME_HOUSEHOLD"), FAMILY_MEMBER_OR_FRIEND("FAMILY_MEMBER_OR_FRIEND"), SAME_ENVIRONMENT(
			"SAME_ENVIRONMENT"), MEDICAL_CARE("MEDICAL_CARE"), OTHER("OTHER");

	private String value;

	ContactRelation(String value) {
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
	public static ContactRelation fromValue(String text) {
		for (ContactRelation b : ContactRelation.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
