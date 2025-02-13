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

package iris.sormas.client.api;

import org.junit.Test;
import org.junit.Ignore;

import iris.sormas.client.api.ExternalVisitsControllerApi;
import iris.sormas.client.model.ExternalVisitDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExternalVisitsControllerApi
 */
@Ignore
public class ExternalVisitsControllerApiTest {

	private final ExternalVisitsControllerApi api = new ExternalVisitsControllerApi();

	/**
	 * Get follow up end dates Get latest follow up end date assigned to the specified person. Note: Only returns values
	 * for persons who have their symptom journal status set to ACCEPTED! Only returns values changed after {since}, which
	 * is interpreted as a UNIX timestamp.
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getLatestFollowUpEndDatesTest() {
		Long since = null;
		String response = api.getLatestFollowUpEndDates(since);

		// TODO: test validations
	}

	/**
	 * Get person information Get some personal data for a specific person
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getPersonByUuidTest() {
		String personUuid = null;
		String response = api.getPersonByUuid(personUuid);

		// TODO: test validations
	}

	/**
	 * Get API version
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getVersionTest() {
		String response = api.getVersion();

		// TODO: test validations
	}

	/**
	 * Check person validity Check if a the Uuid given as parameter exists in SORMAS.
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void isValidPersonUuidTest() {
		String personUuid = null;
		String response = api.isValidPersonUuid(personUuid);

		// TODO: test validations
	}

	/**
	 * Save visits Upload visits with all symptom and disease related data to SORMAS.
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void postExternalVisitsTest() {
		List<ExternalVisitDto> body = null;
		String response = api.postExternalVisits(body);

		// TODO: test validations
	}

	/**
	 * Save symptom journal status
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void postSymptomJournalStatusTest() {
		String personUuid = null;
		String body = null;
		String response = api.postSymptomJournalStatus(personUuid, body);

		// TODO: test validations
	}
}
