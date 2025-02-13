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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import iris.sormas.client.model.SymptomJournalStatus;

/**
 * PersonSymptomJournalStatusDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
		date = "2021-01-28T11:46:54.705673+01:00[Europe/Berlin]")
public class PersonSymptomJournalStatusDto {
	@JsonProperty("status")
	private SymptomJournalStatus status = null;

	@JsonProperty("statusDateTime")
	private String statusDateTime = null;

	public PersonSymptomJournalStatusDto status(SymptomJournalStatus status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@Schema(required = true, description = "")
	public SymptomJournalStatus getStatus() {
		return status;
	}

	public void setStatus(SymptomJournalStatus status) {
		this.status = status;
	}

	public PersonSymptomJournalStatusDto statusDateTime(String statusDateTime) {
		this.statusDateTime = statusDateTime;
		return this;
	}

	/**
	 * Get statusDateTime
	 * 
	 * @return statusDateTime
	 **/
	@Schema(description = "")
	public String getStatusDateTime() {
		return statusDateTime;
	}

	public void setStatusDateTime(String statusDateTime) {
		this.statusDateTime = statusDateTime;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonSymptomJournalStatusDto personSymptomJournalStatusDto = (PersonSymptomJournalStatusDto) o;
		return Objects.equals(this.status, personSymptomJournalStatusDto.status)
				&& Objects.equals(this.statusDateTime, personSymptomJournalStatusDto.statusDateTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(status, statusDateTime);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonSymptomJournalStatusDto {\n");

		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    statusDateTime: ").append(toIndentedString(statusDateTime)).append("\n");
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
