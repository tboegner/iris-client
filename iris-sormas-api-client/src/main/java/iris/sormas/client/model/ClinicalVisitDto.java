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
import iris.sormas.client.model.ClinicalCourseReferenceDto;
import iris.sormas.client.model.Disease;
import iris.sormas.client.model.SymptomsDto;

import java.time.OffsetDateTime;
import java.time.Instant;

/**
 * ClinicalVisitDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
		date = "2021-01-28T11:46:54.705673+01:00[Europe/Berlin]")
public class ClinicalVisitDto {
	@JsonProperty("creationDate")
	private Instant creationDate = null;

	@JsonProperty("changeDate")
	private Instant changeDate = null;

	@JsonProperty("uuid")
	private String uuid = null;

	@JsonProperty("pseudonymized")
	private Boolean pseudonymized = null;

	@JsonProperty("clinicalCourse")
	private ClinicalCourseReferenceDto clinicalCourse = null;

	@JsonProperty("symptoms")
	private SymptomsDto symptoms = null;

	@JsonProperty("disease")
	private Disease disease = null;

	@JsonProperty("visitDateTime")
	private Instant visitDateTime = null;

	@JsonProperty("visitingPerson")
	private String visitingPerson = null;

	@JsonProperty("visitRemarks")
	private String visitRemarks = null;

	public ClinicalVisitDto creationDate(Instant creationDate) {
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

	public ClinicalVisitDto changeDate(Instant changeDate) {
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

	public ClinicalVisitDto uuid(String uuid) {
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

	public ClinicalVisitDto pseudonymized(Boolean pseudonymized) {
		this.pseudonymized = pseudonymized;
		return this;
	}

	/**
	 * Get pseudonymized
	 * 
	 * @return pseudonymized
	 **/
	@Schema(description = "")
	public Boolean isPseudonymized() {
		return pseudonymized;
	}

	public void setPseudonymized(Boolean pseudonymized) {
		this.pseudonymized = pseudonymized;
	}

	public ClinicalVisitDto clinicalCourse(ClinicalCourseReferenceDto clinicalCourse) {
		this.clinicalCourse = clinicalCourse;
		return this;
	}

	/**
	 * Get clinicalCourse
	 * 
	 * @return clinicalCourse
	 **/
	@Schema(description = "")
	public ClinicalCourseReferenceDto getClinicalCourse() {
		return clinicalCourse;
	}

	public void setClinicalCourse(ClinicalCourseReferenceDto clinicalCourse) {
		this.clinicalCourse = clinicalCourse;
	}

	public ClinicalVisitDto symptoms(SymptomsDto symptoms) {
		this.symptoms = symptoms;
		return this;
	}

	/**
	 * Get symptoms
	 * 
	 * @return symptoms
	 **/
	@Schema(description = "")
	public SymptomsDto getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(SymptomsDto symptoms) {
		this.symptoms = symptoms;
	}

	public ClinicalVisitDto disease(Disease disease) {
		this.disease = disease;
		return this;
	}

	/**
	 * Get disease
	 * 
	 * @return disease
	 **/
	@Schema(description = "")
	public Disease getDisease() {
		return disease;
	}

	public void setDisease(Disease disease) {
		this.disease = disease;
	}

	public ClinicalVisitDto visitDateTime(Instant visitDateTime) {
		this.visitDateTime = visitDateTime;
		return this;
	}

	/**
	 * Get visitDateTime
	 * 
	 * @return visitDateTime
	 **/
	@Schema(description = "")
	public Instant getVisitDateTime() {
		return visitDateTime;
	}

	public void setVisitDateTime(Instant visitDateTime) {
		this.visitDateTime = visitDateTime;
	}

	public ClinicalVisitDto visitingPerson(String visitingPerson) {
		this.visitingPerson = visitingPerson;
		return this;
	}

	/**
	 * Get visitingPerson
	 * 
	 * @return visitingPerson
	 **/
	@Schema(description = "")
	public String getVisitingPerson() {
		return visitingPerson;
	}

	public void setVisitingPerson(String visitingPerson) {
		this.visitingPerson = visitingPerson;
	}

	public ClinicalVisitDto visitRemarks(String visitRemarks) {
		this.visitRemarks = visitRemarks;
		return this;
	}

	/**
	 * Get visitRemarks
	 * 
	 * @return visitRemarks
	 **/
	@Schema(description = "")
	public String getVisitRemarks() {
		return visitRemarks;
	}

	public void setVisitRemarks(String visitRemarks) {
		this.visitRemarks = visitRemarks;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ClinicalVisitDto clinicalVisitDto = (ClinicalVisitDto) o;
		return Objects.equals(this.creationDate, clinicalVisitDto.creationDate)
				&& Objects.equals(this.changeDate, clinicalVisitDto.changeDate)
				&& Objects.equals(this.uuid, clinicalVisitDto.uuid)
				&& Objects.equals(this.pseudonymized, clinicalVisitDto.pseudonymized)
				&& Objects.equals(this.clinicalCourse, clinicalVisitDto.clinicalCourse)
				&& Objects.equals(this.symptoms, clinicalVisitDto.symptoms)
				&& Objects.equals(this.disease, clinicalVisitDto.disease)
				&& Objects.equals(this.visitDateTime, clinicalVisitDto.visitDateTime)
				&& Objects.equals(this.visitingPerson, clinicalVisitDto.visitingPerson)
				&& Objects.equals(this.visitRemarks, clinicalVisitDto.visitRemarks);
	}

	@Override
	public int hashCode() {
		return Objects.hash(creationDate, changeDate, uuid, pseudonymized, clinicalCourse, symptoms, disease, visitDateTime,
				visitingPerson, visitRemarks);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ClinicalVisitDto {\n");

		sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
		sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
		sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
		sb.append("    pseudonymized: ").append(toIndentedString(pseudonymized)).append("\n");
		sb.append("    clinicalCourse: ").append(toIndentedString(clinicalCourse)).append("\n");
		sb.append("    symptoms: ").append(toIndentedString(symptoms)).append("\n");
		sb.append("    disease: ").append(toIndentedString(disease)).append("\n");
		sb.append("    visitDateTime: ").append(toIndentedString(visitDateTime)).append("\n");
		sb.append("    visitingPerson: ").append(toIndentedString(visitingPerson)).append("\n");
		sb.append("    visitRemarks: ").append(toIndentedString(visitRemarks)).append("\n");
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
