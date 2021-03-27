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
import de.healthIMIS.sormas.client.model.Disease;
import de.healthIMIS.sormas.client.model.DistrictReferenceDto;
import de.healthIMIS.sormas.client.model.FacilityReferenceDto;
import de.healthIMIS.sormas.client.model.PointOfEntryReferenceDto;
import de.healthIMIS.sormas.client.model.RegionReferenceDto;
import de.healthIMIS.sormas.client.model.UserReferenceDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.time.Instant;

/**
 * AggregateReportDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
		date = "2021-01-28T11:46:54.705673+01:00[Europe/Berlin]")
public class AggregateReportDto {
	@JsonProperty("creationDate")
	private Instant creationDate = null;

	@JsonProperty("changeDate")
	private Instant changeDate = null;

	@JsonProperty("uuid")
	private String uuid = null;

	@JsonProperty("reportingUser")
	private UserReferenceDto reportingUser = null;

	@JsonProperty("disease")
	private Disease disease = null;

	@JsonProperty("year")
	private Integer year = null;

	@JsonProperty("epiWeek")
	private Integer epiWeek = null;

	@JsonProperty("region")
	private RegionReferenceDto region = null;

	@JsonProperty("district")
	private DistrictReferenceDto district = null;

	@JsonProperty("healthFacility")
	private FacilityReferenceDto healthFacility = null;

	@JsonProperty("pointOfEntry")
	private PointOfEntryReferenceDto pointOfEntry = null;

	@JsonProperty("newCases")
	private Integer newCases = null;

	@JsonProperty("labConfirmations")
	private Integer labConfirmations = null;

	@JsonProperty("deaths")
	private Integer deaths = null;

	public AggregateReportDto creationDate(Instant creationDate) {
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

	public AggregateReportDto changeDate(Instant changeDate) {
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

	public AggregateReportDto uuid(String uuid) {
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

	public AggregateReportDto reportingUser(UserReferenceDto reportingUser) {
		this.reportingUser = reportingUser;
		return this;
	}

	/**
	 * Get reportingUser
	 * 
	 * @return reportingUser
	 **/
	@Schema(description = "")
	public UserReferenceDto getReportingUser() {
		return reportingUser;
	}

	public void setReportingUser(UserReferenceDto reportingUser) {
		this.reportingUser = reportingUser;
	}

	public AggregateReportDto disease(Disease disease) {
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

	public AggregateReportDto year(Integer year) {
		this.year = year;
		return this;
	}

	/**
	 * Get year
	 * 
	 * @return year
	 **/
	@Schema(description = "")
	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public AggregateReportDto epiWeek(Integer epiWeek) {
		this.epiWeek = epiWeek;
		return this;
	}

	/**
	 * Get epiWeek
	 * 
	 * @return epiWeek
	 **/
	@Schema(description = "")
	public Integer getEpiWeek() {
		return epiWeek;
	}

	public void setEpiWeek(Integer epiWeek) {
		this.epiWeek = epiWeek;
	}

	public AggregateReportDto region(RegionReferenceDto region) {
		this.region = region;
		return this;
	}

	/**
	 * Get region
	 * 
	 * @return region
	 **/
	@Schema(description = "")
	public RegionReferenceDto getRegion() {
		return region;
	}

	public void setRegion(RegionReferenceDto region) {
		this.region = region;
	}

	public AggregateReportDto district(DistrictReferenceDto district) {
		this.district = district;
		return this;
	}

	/**
	 * Get district
	 * 
	 * @return district
	 **/
	@Schema(description = "")
	public DistrictReferenceDto getDistrict() {
		return district;
	}

	public void setDistrict(DistrictReferenceDto district) {
		this.district = district;
	}

	public AggregateReportDto healthFacility(FacilityReferenceDto healthFacility) {
		this.healthFacility = healthFacility;
		return this;
	}

	/**
	 * Get healthFacility
	 * 
	 * @return healthFacility
	 **/
	@Schema(description = "")
	public FacilityReferenceDto getHealthFacility() {
		return healthFacility;
	}

	public void setHealthFacility(FacilityReferenceDto healthFacility) {
		this.healthFacility = healthFacility;
	}

	public AggregateReportDto pointOfEntry(PointOfEntryReferenceDto pointOfEntry) {
		this.pointOfEntry = pointOfEntry;
		return this;
	}

	/**
	 * Get pointOfEntry
	 * 
	 * @return pointOfEntry
	 **/
	@Schema(description = "")
	public PointOfEntryReferenceDto getPointOfEntry() {
		return pointOfEntry;
	}

	public void setPointOfEntry(PointOfEntryReferenceDto pointOfEntry) {
		this.pointOfEntry = pointOfEntry;
	}

	public AggregateReportDto newCases(Integer newCases) {
		this.newCases = newCases;
		return this;
	}

	/**
	 * Get newCases
	 * 
	 * @return newCases
	 **/
	@Schema(description = "")
	public Integer getNewCases() {
		return newCases;
	}

	public void setNewCases(Integer newCases) {
		this.newCases = newCases;
	}

	public AggregateReportDto labConfirmations(Integer labConfirmations) {
		this.labConfirmations = labConfirmations;
		return this;
	}

	/**
	 * Get labConfirmations
	 * 
	 * @return labConfirmations
	 **/
	@Schema(description = "")
	public Integer getLabConfirmations() {
		return labConfirmations;
	}

	public void setLabConfirmations(Integer labConfirmations) {
		this.labConfirmations = labConfirmations;
	}

	public AggregateReportDto deaths(Integer deaths) {
		this.deaths = deaths;
		return this;
	}

	/**
	 * Get deaths
	 * 
	 * @return deaths
	 **/
	@Schema(description = "")
	public Integer getDeaths() {
		return deaths;
	}

	public void setDeaths(Integer deaths) {
		this.deaths = deaths;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AggregateReportDto aggregateReportDto = (AggregateReportDto) o;
		return Objects.equals(this.creationDate, aggregateReportDto.creationDate)
				&& Objects.equals(this.changeDate, aggregateReportDto.changeDate)
				&& Objects.equals(this.uuid, aggregateReportDto.uuid)
				&& Objects.equals(this.reportingUser, aggregateReportDto.reportingUser)
				&& Objects.equals(this.disease, aggregateReportDto.disease)
				&& Objects.equals(this.year, aggregateReportDto.year)
				&& Objects.equals(this.epiWeek, aggregateReportDto.epiWeek)
				&& Objects.equals(this.region, aggregateReportDto.region)
				&& Objects.equals(this.district, aggregateReportDto.district)
				&& Objects.equals(this.healthFacility, aggregateReportDto.healthFacility)
				&& Objects.equals(this.pointOfEntry, aggregateReportDto.pointOfEntry)
				&& Objects.equals(this.newCases, aggregateReportDto.newCases)
				&& Objects.equals(this.labConfirmations, aggregateReportDto.labConfirmations)
				&& Objects.equals(this.deaths, aggregateReportDto.deaths);
	}

	@Override
	public int hashCode() {
		return Objects.hash(creationDate, changeDate, uuid, reportingUser, disease, year, epiWeek, region, district,
				healthFacility, pointOfEntry, newCases, labConfirmations, deaths);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AggregateReportDto {\n");

		sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
		sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
		sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
		sb.append("    reportingUser: ").append(toIndentedString(reportingUser)).append("\n");
		sb.append("    disease: ").append(toIndentedString(disease)).append("\n");
		sb.append("    year: ").append(toIndentedString(year)).append("\n");
		sb.append("    epiWeek: ").append(toIndentedString(epiWeek)).append("\n");
		sb.append("    region: ").append(toIndentedString(region)).append("\n");
		sb.append("    district: ").append(toIndentedString(district)).append("\n");
		sb.append("    healthFacility: ").append(toIndentedString(healthFacility)).append("\n");
		sb.append("    pointOfEntry: ").append(toIndentedString(pointOfEntry)).append("\n");
		sb.append("    newCases: ").append(toIndentedString(newCases)).append("\n");
		sb.append("    labConfirmations: ").append(toIndentedString(labConfirmations)).append("\n");
		sb.append("    deaths: ").append(toIndentedString(deaths)).append("\n");
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
