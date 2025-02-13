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

import iris.sormas.client.api.AdditionalTestControllerApi;
import iris.sormas.client.model.AdditionalTestDto;
import iris.sormas.client.model.PushResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdditionalTestControllerApi
 */
@Ignore
public class AdditionalTestControllerApiTest {

	private final AdditionalTestControllerApi api = new AdditionalTestControllerApi();

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getAllActiveUuidsTest() {
		List<String> response = api.getAllActiveUuids();

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getAllAdditionalTestsTest() {
		Long since = null;
		List<AdditionalTestDto> response = api.getAllAdditionalTests(since);

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getByUuids1Test() {
		List<String> body = null;
		List<AdditionalTestDto> response = api.getByUuids1(body);

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void postAdditionalTestsTest() {
		List<AdditionalTestDto> body = null;
		List<PushResult> response = api.postAdditionalTests(body);

		// TODO: test validations
	}
}
