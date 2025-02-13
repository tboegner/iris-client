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

import java.util.ArrayList;
import java.util.List;

/**
 * ClassificationCaseCriteriaDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
		date = "2021-01-28T11:46:54.705673+01:00[Europe/Berlin]")
public class ClassificationCaseCriteriaDto extends ClassificationCriteriaDto {
	@JsonProperty("propertyId")
	private String propertyId = null;

	@JsonProperty("propertyValues")
	private List<Object> propertyValues = null;

	public ClassificationCaseCriteriaDto propertyId(String propertyId) {
		this.propertyId = propertyId;
		return this;
	}

	/**
	 * Get propertyId
	 * 
	 * @return propertyId
	 **/
	@Schema(description = "")
	public String getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

	public ClassificationCaseCriteriaDto propertyValues(List<Object> propertyValues) {
		this.propertyValues = propertyValues;
		return this;
	}

	public ClassificationCaseCriteriaDto addPropertyValuesItem(Object propertyValuesItem) {
		if (this.propertyValues == null) {
			this.propertyValues = new ArrayList<>();
		}
		this.propertyValues.add(propertyValuesItem);
		return this;
	}

	/**
	 * Get propertyValues
	 * 
	 * @return propertyValues
	 **/
	@Schema(description = "")
	public List<Object> getPropertyValues() {
		return propertyValues;
	}

	public void setPropertyValues(List<Object> propertyValues) {
		this.propertyValues = propertyValues;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ClassificationCaseCriteriaDto classificationCaseCriteriaDto = (ClassificationCaseCriteriaDto) o;
		return Objects.equals(this.propertyId, classificationCaseCriteriaDto.propertyId)
				&& Objects.equals(this.propertyValues, classificationCaseCriteriaDto.propertyValues) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(propertyId, propertyValues, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ClassificationCaseCriteriaDto {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
		sb.append("    propertyValues: ").append(toIndentedString(propertyValues)).append("\n");
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
