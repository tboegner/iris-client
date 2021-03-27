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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.time.Instant;

/**
 * TherapyDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
		date = "2021-01-28T11:46:54.705673+01:00[Europe/Berlin]")
public class TherapyDto {
	@JsonProperty("creationDate")
	private Instant creationDate = null;

	@JsonProperty("changeDate")
	private Instant changeDate = null;

	@JsonProperty("uuid")
	private String uuid = null;

	public TherapyDto creationDate(Instant creationDate) {
		this.creationDate = creationDate;
		return this;
	}

	/**
	 * Get creationDate
	 * 
	 * @return creationDate
	 **/
	@Schema(description = "")
	public Instant getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Instant creationDate) {
		this.creationDate = creationDate;
	}

	public TherapyDto changeDate(Instant changeDate) {
		this.changeDate = changeDate;
		return this;
	}

	/**
	 * Get changeDate
	 * 
	 * @return changeDate
	 **/
	@Schema(description = "")
	public Instant getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(Instant changeDate) {
		this.changeDate = changeDate;
	}

	public TherapyDto uuid(String uuid) {
		this.uuid = uuid;
		return this;
	}

	/**
	 * Get uuid
	 * 
	 * @return uuid
	 **/
	@Schema(description = "")
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TherapyDto therapyDto = (TherapyDto) o;
		return Objects.equals(this.creationDate, therapyDto.creationDate)
				&& Objects.equals(this.changeDate, therapyDto.changeDate) && Objects.equals(this.uuid, therapyDto.uuid);
	}

	@Override
	public int hashCode() {
		return Objects.hash(creationDate, changeDate, uuid);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TherapyDto {\n");

		sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
		sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
		sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
