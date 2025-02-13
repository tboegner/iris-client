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
import java.time.OffsetDateTime;
import java.time.Instant;

/**
 * InfrastructureChangeDatesDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
		date = "2021-01-28T11:46:54.705673+01:00[Europe/Berlin]")
public class InfrastructureChangeDatesDto {
	@JsonProperty("countryChangeDate")
	private Instant countryChangeDate = null;

	@JsonProperty("regionChangeDate")
	private Instant regionChangeDate = null;

	@JsonProperty("districtChangeDate")
	private Instant districtChangeDate = null;

	@JsonProperty("communityChangeDate")
	private Instant communityChangeDate = null;

	@JsonProperty("facilityChangeDate")
	private Instant facilityChangeDate = null;

	@JsonProperty("pointOfEntryChangeDate")
	private Instant pointOfEntryChangeDate = null;

	@JsonProperty("userChangeDate")
	private Instant userChangeDate = null;

	@JsonProperty("diseaseClassificationChangeDate")
	private Instant diseaseClassificationChangeDate = null;

	@JsonProperty("diseaseConfigurationChangeDate")
	private Instant diseaseConfigurationChangeDate = null;

	@JsonProperty("userRoleConfigurationChangeDate")
	private Instant userRoleConfigurationChangeDate = null;

	@JsonProperty("featureConfigurationChangeDate")
	private Instant featureConfigurationChangeDate = null;

	@JsonProperty("campaignChangeDate")
	private Instant campaignChangeDate = null;

	@JsonProperty("campaignFormMetaChangeDate")
	private Instant campaignFormMetaChangeDate = null;

	public InfrastructureChangeDatesDto countryChangeDate(Instant countryChangeDate) {
		this.countryChangeDate = countryChangeDate;
		return this;
	}

	/**
	 * Get countryChangeDate
	 * 
	 * @return countryChangeDate
	 **/
	@Schema(description = "")
	public Instant getCountryChangeDate() {
		return countryChangeDate;
	}

	public void setCountryChangeDate(Instant countryChangeDate) {
		this.countryChangeDate = countryChangeDate;
	}

	public InfrastructureChangeDatesDto regionChangeDate(Instant regionChangeDate) {
		this.regionChangeDate = regionChangeDate;
		return this;
	}

	/**
	 * Get regionChangeDate
	 * 
	 * @return regionChangeDate
	 **/
	@Schema(description = "")
	public Instant getRegionChangeDate() {
		return regionChangeDate;
	}

	public void setRegionChangeDate(Instant regionChangeDate) {
		this.regionChangeDate = regionChangeDate;
	}

	public InfrastructureChangeDatesDto districtChangeDate(Instant districtChangeDate) {
		this.districtChangeDate = districtChangeDate;
		return this;
	}

	/**
	 * Get districtChangeDate
	 * 
	 * @return districtChangeDate
	 **/
	@Schema(description = "")
	public Instant getDistrictChangeDate() {
		return districtChangeDate;
	}

	public void setDistrictChangeDate(Instant districtChangeDate) {
		this.districtChangeDate = districtChangeDate;
	}

	public InfrastructureChangeDatesDto communityChangeDate(Instant communityChangeDate) {
		this.communityChangeDate = communityChangeDate;
		return this;
	}

	/**
	 * Get communityChangeDate
	 * 
	 * @return communityChangeDate
	 **/
	@Schema(description = "")
	public Instant getCommunityChangeDate() {
		return communityChangeDate;
	}

	public void setCommunityChangeDate(Instant communityChangeDate) {
		this.communityChangeDate = communityChangeDate;
	}

	public InfrastructureChangeDatesDto facilityChangeDate(Instant facilityChangeDate) {
		this.facilityChangeDate = facilityChangeDate;
		return this;
	}

	/**
	 * Get facilityChangeDate
	 * 
	 * @return facilityChangeDate
	 **/
	@Schema(description = "")
	public Instant getFacilityChangeDate() {
		return facilityChangeDate;
	}

	public void setFacilityChangeDate(Instant facilityChangeDate) {
		this.facilityChangeDate = facilityChangeDate;
	}

	public InfrastructureChangeDatesDto pointOfEntryChangeDate(Instant pointOfEntryChangeDate) {
		this.pointOfEntryChangeDate = pointOfEntryChangeDate;
		return this;
	}

	/**
	 * Get pointOfEntryChangeDate
	 * 
	 * @return pointOfEntryChangeDate
	 **/
	@Schema(description = "")
	public Instant getPointOfEntryChangeDate() {
		return pointOfEntryChangeDate;
	}

	public void setPointOfEntryChangeDate(Instant pointOfEntryChangeDate) {
		this.pointOfEntryChangeDate = pointOfEntryChangeDate;
	}

	public InfrastructureChangeDatesDto userChangeDate(Instant userChangeDate) {
		this.userChangeDate = userChangeDate;
		return this;
	}

	/**
	 * Get userChangeDate
	 * 
	 * @return userChangeDate
	 **/
	@Schema(description = "")
	public Instant getUserChangeDate() {
		return userChangeDate;
	}

	public void setUserChangeDate(Instant userChangeDate) {
		this.userChangeDate = userChangeDate;
	}

	public InfrastructureChangeDatesDto diseaseClassificationChangeDate(Instant diseaseClassificationChangeDate) {
		this.diseaseClassificationChangeDate = diseaseClassificationChangeDate;
		return this;
	}

	/**
	 * Get diseaseClassificationChangeDate
	 * 
	 * @return diseaseClassificationChangeDate
	 **/
	@Schema(description = "")
	public Instant getDiseaseClassificationChangeDate() {
		return diseaseClassificationChangeDate;
	}

	public void setDiseaseClassificationChangeDate(Instant diseaseClassificationChangeDate) {
		this.diseaseClassificationChangeDate = diseaseClassificationChangeDate;
	}

	public InfrastructureChangeDatesDto diseaseConfigurationChangeDate(Instant diseaseConfigurationChangeDate) {
		this.diseaseConfigurationChangeDate = diseaseConfigurationChangeDate;
		return this;
	}

	/**
	 * Get diseaseConfigurationChangeDate
	 * 
	 * @return diseaseConfigurationChangeDate
	 **/
	@Schema(description = "")
	public Instant getDiseaseConfigurationChangeDate() {
		return diseaseConfigurationChangeDate;
	}

	public void setDiseaseConfigurationChangeDate(Instant diseaseConfigurationChangeDate) {
		this.diseaseConfigurationChangeDate = diseaseConfigurationChangeDate;
	}

	public InfrastructureChangeDatesDto userRoleConfigurationChangeDate(Instant userRoleConfigurationChangeDate) {
		this.userRoleConfigurationChangeDate = userRoleConfigurationChangeDate;
		return this;
	}

	/**
	 * Get userRoleConfigurationChangeDate
	 * 
	 * @return userRoleConfigurationChangeDate
	 **/
	@Schema(description = "")
	public Instant getUserRoleConfigurationChangeDate() {
		return userRoleConfigurationChangeDate;
	}

	public void setUserRoleConfigurationChangeDate(Instant userRoleConfigurationChangeDate) {
		this.userRoleConfigurationChangeDate = userRoleConfigurationChangeDate;
	}

	public InfrastructureChangeDatesDto featureConfigurationChangeDate(Instant featureConfigurationChangeDate) {
		this.featureConfigurationChangeDate = featureConfigurationChangeDate;
		return this;
	}

	/**
	 * Get featureConfigurationChangeDate
	 * 
	 * @return featureConfigurationChangeDate
	 **/
	@Schema(description = "")
	public Instant getFeatureConfigurationChangeDate() {
		return featureConfigurationChangeDate;
	}

	public void setFeatureConfigurationChangeDate(Instant featureConfigurationChangeDate) {
		this.featureConfigurationChangeDate = featureConfigurationChangeDate;
	}

	public InfrastructureChangeDatesDto campaignChangeDate(Instant campaignChangeDate) {
		this.campaignChangeDate = campaignChangeDate;
		return this;
	}

	/**
	 * Get campaignChangeDate
	 * 
	 * @return campaignChangeDate
	 **/
	@Schema(description = "")
	public Instant getCampaignChangeDate() {
		return campaignChangeDate;
	}

	public void setCampaignChangeDate(Instant campaignChangeDate) {
		this.campaignChangeDate = campaignChangeDate;
	}

	public InfrastructureChangeDatesDto campaignFormMetaChangeDate(Instant campaignFormMetaChangeDate) {
		this.campaignFormMetaChangeDate = campaignFormMetaChangeDate;
		return this;
	}

	/**
	 * Get campaignFormMetaChangeDate
	 * 
	 * @return campaignFormMetaChangeDate
	 **/
	@Schema(description = "")
	public Instant getCampaignFormMetaChangeDate() {
		return campaignFormMetaChangeDate;
	}

	public void setCampaignFormMetaChangeDate(Instant campaignFormMetaChangeDate) {
		this.campaignFormMetaChangeDate = campaignFormMetaChangeDate;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InfrastructureChangeDatesDto infrastructureChangeDatesDto = (InfrastructureChangeDatesDto) o;
		return Objects.equals(this.countryChangeDate, infrastructureChangeDatesDto.countryChangeDate)
				&& Objects.equals(this.regionChangeDate, infrastructureChangeDatesDto.regionChangeDate)
				&& Objects.equals(this.districtChangeDate, infrastructureChangeDatesDto.districtChangeDate)
				&& Objects.equals(this.communityChangeDate, infrastructureChangeDatesDto.communityChangeDate)
				&& Objects.equals(this.facilityChangeDate, infrastructureChangeDatesDto.facilityChangeDate)
				&& Objects.equals(this.pointOfEntryChangeDate, infrastructureChangeDatesDto.pointOfEntryChangeDate)
				&& Objects.equals(this.userChangeDate, infrastructureChangeDatesDto.userChangeDate)
				&& Objects.equals(this.diseaseClassificationChangeDate,
						infrastructureChangeDatesDto.diseaseClassificationChangeDate)
				&& Objects.equals(this.diseaseConfigurationChangeDate,
						infrastructureChangeDatesDto.diseaseConfigurationChangeDate)
				&& Objects.equals(this.userRoleConfigurationChangeDate,
						infrastructureChangeDatesDto.userRoleConfigurationChangeDate)
				&& Objects.equals(this.featureConfigurationChangeDate,
						infrastructureChangeDatesDto.featureConfigurationChangeDate)
				&& Objects.equals(this.campaignChangeDate, infrastructureChangeDatesDto.campaignChangeDate)
				&& Objects.equals(this.campaignFormMetaChangeDate, infrastructureChangeDatesDto.campaignFormMetaChangeDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(countryChangeDate, regionChangeDate, districtChangeDate, communityChangeDate,
				facilityChangeDate, pointOfEntryChangeDate, userChangeDate, diseaseClassificationChangeDate,
				diseaseConfigurationChangeDate, userRoleConfigurationChangeDate, featureConfigurationChangeDate,
				campaignChangeDate, campaignFormMetaChangeDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InfrastructureChangeDatesDto {\n");

		sb.append("    countryChangeDate: ").append(toIndentedString(countryChangeDate)).append("\n");
		sb.append("    regionChangeDate: ").append(toIndentedString(regionChangeDate)).append("\n");
		sb.append("    districtChangeDate: ").append(toIndentedString(districtChangeDate)).append("\n");
		sb.append("    communityChangeDate: ").append(toIndentedString(communityChangeDate)).append("\n");
		sb.append("    facilityChangeDate: ").append(toIndentedString(facilityChangeDate)).append("\n");
		sb.append("    pointOfEntryChangeDate: ").append(toIndentedString(pointOfEntryChangeDate)).append("\n");
		sb.append("    userChangeDate: ").append(toIndentedString(userChangeDate)).append("\n");
		sb.append("    diseaseClassificationChangeDate: ").append(toIndentedString(diseaseClassificationChangeDate))
				.append("\n");
		sb.append("    diseaseConfigurationChangeDate: ").append(toIndentedString(diseaseConfigurationChangeDate))
				.append("\n");
		sb.append("    userRoleConfigurationChangeDate: ").append(toIndentedString(userRoleConfigurationChangeDate))
				.append("\n");
		sb.append("    featureConfigurationChangeDate: ").append(toIndentedString(featureConfigurationChangeDate))
				.append("\n");
		sb.append("    campaignChangeDate: ").append(toIndentedString(campaignChangeDate)).append("\n");
		sb.append("    campaignFormMetaChangeDate: ").append(toIndentedString(campaignFormMetaChangeDate)).append("\n");
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
