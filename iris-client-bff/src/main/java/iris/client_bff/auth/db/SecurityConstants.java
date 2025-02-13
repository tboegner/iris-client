package iris.client_bff.auth.db;

import java.util.concurrent.TimeUnit;

public class SecurityConstants {

	public static final long EXPIRATION_TIME = TimeUnit.MINUTES.toMillis(60);

	public static final String BEARER_TOKEN_PREFIX = "Bearer ";
	public static final String AUTHENTICATION_INFO = "Authentication-Info";
	public static final String JWT_CLAIM_USER_ROLE = "role";
}
