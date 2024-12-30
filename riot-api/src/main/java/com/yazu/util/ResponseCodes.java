package com.yazu.util;

public enum ResponseCodes {
    BAD_REQUEST(400, "Bad request"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Data not found"),
    METHOD_NOT_ALLOWED(405, "Method not allowed"),
    UNSUPPORTED_MEDIA_TYPE(415, "Unsupported media type"),
    RATE_LIMIT_EXCEEDED(429, "Rate limit exceeded"),
    INTERNAL_SERVER_ERROR(500, "Internal server error"),
    BAD_GATEWAY(502, "Bad gateway"),
    SERVICE_UNAVAILABLE(503, "Service unavailable"),
    GATEWAY_TIMEOUT(504, "Gateway timeout");

    private final int statusCode;
    private final String reason;

    ResponseCodes(int statusCode, String reason) {
        this.statusCode = statusCode;
        this.reason = reason;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getReason() {
        return reason;
    }

    public static ResponseCodes fromStatusCode(int statusCode) {
        for (ResponseCodes error : values()) {
            if (error.statusCode == statusCode) {
                return error;
            }
        }
        throw new IllegalArgumentException("Unknown HTTP status code: " + statusCode);
    }
}
