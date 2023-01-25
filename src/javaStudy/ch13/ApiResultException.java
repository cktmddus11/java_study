package javaStudy.ch13;

public class ApiResultException extends RuntimeException{

    private String resultCode;
    private String resultDetailMessage;

    public ApiResultException(String resultCode, String resultDetailMessage) {
        this.resultCode = resultCode;
        this.resultDetailMessage = resultDetailMessage;
    }

    public static ApiResultException of(String resultCode) {
        return new ApiResultException(resultCode, "");
    }

    public static ApiResultException of(String resultCode, String resultDetailMessage) {
        return new ApiResultException(resultCode, resultDetailMessage);
    }
}
