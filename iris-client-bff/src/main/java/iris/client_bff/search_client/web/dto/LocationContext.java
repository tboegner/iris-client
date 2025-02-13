/*
 * IRIS-Gateway API
 * ### Encryption of the data to be transmitted (contact data) In order to be not limited in the amount of data, a hybrid encryption with symmetric encryption of the data and asymmetric encryption of the symmetric key is used for the encryption of the contact data.    1. The apps and applications get the public key of the health department as a 4096-bit RSA key from the IRIS+ server. This key is base64-encoded similar to the Private Enhanced Mail (PEM) format but without key markers (-----BEGIN PUBLIC KEY----- / -----END PUBLIC KEY-----).   2. The app generates a 256-bit AES key.   3. The data is encrypted with this key (algorithm: AES/CBC/PKCS5Padding and 16 byte IV)   4. IV bytes are prepended to the cipher text. Those merged bytes represent the encrypted content.   5. The AES key must be encrypted with the public RSA key of the health department. (algorithm: RSA with Optimal Asymmetric Encryption Padding (OAEP) \"RSA/ECB/OAEPWITHSHA-256ANDMGF1PADDING\")   6. The encrypted AES key and the encrypted content must be transmitted base64 encoded.    #### Schematic sequence    ```   pubKeyEncryption = publicKeyFromBase64(givenPublicKey);   contentKey = generateAESKey();   iv = generateRandomBytes(16);    encrypted = contentKey.encrypt(content, \"AES/CBC/PKCS5Padding\", iv);   keyEncrypted = pubKeyEncryption.encrypt(contentKey, \"RSA/NONE/OAEPWithSHA3-256AndMGF1Padding\");    submissionDto.encryptedData = base64Encode(concat(iv,encrypted));   submissionDto.secret = base64Encode(keyEncrypted);   ``` 
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: jens.kutzsche@gebea.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package iris.client_bff.search_client.web.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Ein Standort hat ggf. weitere Informationen wie Tische/Räume, etc.
 */
@JsonPropertyOrder({
	LocationContext.JSON_PROPERTY_ID,
	LocationContext.JSON_PROPERTY_NAME
})
public class LocationContext {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public LocationContext id(String id) {

	this.id = id;
	return this;
  }

  /**
   * Interne ID des Kontext
   * 
   * @return id
   **/
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
	return id;
  }

  public void setId(String id) {
	this.id = id;
  }

  public LocationContext name(String name) {

	this.name = name;
	return this;
  }

  /**
   * Bezeichnung
   * 
   * @return name
   **/
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  @Override
  public boolean equals(Object o) {
	if (this == o) {
	  return true;
	}
	if (o == null || getClass() != o.getClass()) {
	  return false;
	}
	LocationContext locationContext = (LocationContext) o;
	return Objects.equals(this.id, locationContext.id) &&
		Objects.equals(this.name, locationContext.name);
  }

  @Override
  public int hashCode() {
	return Objects.hash(id, name);
  }

  @Override
  public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("class LocationContext {\n");
	sb.append("    id: ").append(toIndentedString(id)).append("\n");
	sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
