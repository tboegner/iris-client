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

import iris.sormas.client.api.DistrictControllerApi;
import iris.sormas.client.model.DistrictDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DistrictControllerApi
 */
@Ignore
public class DistrictControllerApiTest {

	private final DistrictControllerApi api = new DistrictControllerApi();

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getAll4Test() {
		Long since = null;
		List<DistrictDto> response = api.getAll4(since);

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getAllUuids9Test() {
		List<String> response = api.getAllUuids9();

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getByUuids12Test() {
		List<String> body = null;
		List<DistrictDto> response = api.getByUuids12(body);

		// TODO: test validations
	}
}
