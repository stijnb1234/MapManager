package org.inventivetalent.mapmanager;

/**
 * Exception thrown if no more map IDs are available
 */
public class MapLimitExceededException extends RuntimeException {

	public MapLimitExceededException() {
	}

	public MapLimitExceededException(String message) {
		super(message);
	}

	public MapLimitExceededException(String message, Throwable cause) {
		super(message, cause);
	}

	public MapLimitExceededException(Throwable cause) {
		super(cause);
	}

	public MapLimitExceededException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
