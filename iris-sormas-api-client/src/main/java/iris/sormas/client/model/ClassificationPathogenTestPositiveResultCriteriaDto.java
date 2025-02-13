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
import iris.sormas.client.model.ClassificationCriteriaDto;
import iris.sormas.client.model.PathogenTestType;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassificationPathogenTestPositiveResultCriteriaDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
		date = "2021-01-28T11:46:54.705673+01:00[Europe/Berlin]")
public class ClassificationPathogenTestPositiveResultCriteriaDto extends ClassificationCriteriaDto {
	@JsonProperty("pathogenTestTypes")
	private List<PathogenTestType> pathogenTestTypes = null;

	@JsonProperty("sampleTestTypes")
	private List<PathogenTestType> sampleTestTypes = null;

	public ClassificationPathogenTestPositiveResultCriteriaDto pathogenTestTypes(
			List<PathogenTestType> pathogenTestTypes) {
		this.pathogenTestTypes = pathogenTestTypes;
		return this;
	}

	public ClassificationPathogenTestPositiveResultCriteriaDto addPathogenTestTypesItem(
			PathogenTestType pathogenTestTypesItem) {
		if (this.pathogenTestTypes == null) {
			this.pathogenTestTypes = new ArrayList<>();
		}
		this.pathogenTestTypes.add(pathogenTestTypesItem);
		return this;
	}

	/**
	 * Get pathogenTestTypes
	 * 
	 * @return pathogenTestTypes
	 **/
	@Schema(description = "")
	public List<PathogenTestType> getPathogenTestTypes() {
		return pathogenTestTypes;
	}

	public void setPathogenTestTypes(List<PathogenTestType> pathogenTestTypes) {
		this.pathogenTestTypes = pathogenTestTypes;
	}

	public ClassificationPathogenTestPositiveResultCriteriaDto sampleTestTypes(List<PathogenTestType> sampleTestTypes) {
		this.sampleTestTypes = sampleTestTypes;
		return this;
	}

	public ClassificationPathogenTestPositiveResultCriteriaDto addSampleTestTypesItem(
			PathogenTestType sampleTestTypesItem) {
		if (this.sampleTestTypes == null) {
			this.sampleTestTypes = new ArrayList<>();
		}
		this.sampleTestTypes.add(sampleTestTypesItem);
		return this;
	}

	/**
	 * Get sampleTestTypes
	 * 
	 * @return sampleTestTypes
	 **/
	@Schema(description = "")
	public List<PathogenTestType> getSampleTestTypes() {
		return sampleTestTypes;
	}

	public void setSampleTestTypes(List<PathogenTestType> sampleTestTypes) {
		this.sampleTestTypes = sampleTestTypes;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ClassificationPathogenTestPositiveResultCriteriaDto classificationPathogenTestPositiveResultCriteriaDto = (ClassificationPathogenTestPositiveResultCriteriaDto) o;
		return Objects.equals(this.pathogenTestTypes, classificationPathogenTestPositiveResultCriteriaDto.pathogenTestTypes)
				&& Objects.equals(this.sampleTestTypes, classificationPathogenTestPositiveResultCriteriaDto.sampleTestTypes)
				&& super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pathogenTestTypes, sampleTestTypes, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ClassificationPathogenTestPositiveResultCriteriaDto {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    pathogenTestTypes: ").append(toIndentedString(pathogenTestTypes)).append("\n");
		sb.append("    sampleTestTypes: ").append(toIndentedString(sampleTestTypes)).append("\n");
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
