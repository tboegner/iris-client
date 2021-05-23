package iris.client_bff.search_client.web.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
	LocationList.JSON_PROPERTY_LOCATIONS
})
public class LocationList {
  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private List<LocationInformation> locations = new ArrayList<>();

  public LocationList locations(List<LocationInformation> locations) {

	this.locations = locations;
	return this;
  }

  public LocationList addLocationsItem(LocationInformation locationsItem) {
	this.locations.add(locationsItem);
	return this;
  }

  /**
   * Get locations
   * 
   * @return locations
   **/
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<LocationInformation> getLocations() {
	return locations;
  }

  public void setLocations(List<LocationInformation> locations) {
	this.locations = locations;
  }

  @Override
  public boolean equals(Object o) {
	if (this == o) {
	  return true;
	}
	if (o == null || getClass() != o.getClass()) {
	  return false;
	}
	LocationList locationList = (LocationList) o;
	return Objects.equals(this.locations, locationList.locations);
  }

  @Override
  public int hashCode() {
	return Objects.hash(locations);
  }

  @Override
  public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("class LocationList {\n");
	sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
	sb.append("}");
	return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
	if (o == null) {
	  return "null";
	}
	return o.toString().replace("\n", "\n    ");
  }

}
