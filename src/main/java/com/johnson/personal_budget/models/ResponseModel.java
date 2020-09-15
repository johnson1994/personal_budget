package com.johnson.personal_budget.models;

import javax.servlet.http.HttpServletResponse;

/**
 * 返回值封装
 *
 * @param <T>
 */
public class ResponseModel<T> {

    public enum ResponseCode {
        // 正常代码
        SUCCESS(0, "SUCCESS"),
        // 其他代码

        // 系统异常
        UNKNOWN(9999, "UNKNOWN_ERROR");

        private final int code;
        private final String message;

        private ResponseCode(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public int getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }


    int code;           // 返回代码
    T data;             // 数据
    String message;     // 消息

    public ResponseModel(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public ResponseModel(int code, String message) {
        this.code = code;
        this.data = null;
        this.message = message;
    }

    /**
     * 返回成功消息
     *
     * @param code 代码
     * @param data 数据
     * @param <T>
     * @return 消息对象
     */
    public static <T> ResponseModel<T> success(ResponseCode code, T data) {
        return new ResponseModel<>(code.getCode(), data, code.getMessage());
    }


    /**
     * 返回成功消息 （使用默认code:0）
     *
     * @param data 数据
     * @param <T>
     * @return 消息对象
     */
    public static <T> ResponseModel<T> success(T data) {
        return success(ResponseCode.SUCCESS, data);
    }

    /**
     * 返回失败消息 （使用code:9999）
     *
     * @param response HttpServletResponse对象
     * @param status   HTTP状态码
     * @return 失败消息对象
     */
    public static ResponseModel failed(HttpServletResponse response, int status) {
        response.setStatus(status);
        return new ResponseModel(ResponseCode.UNKNOWN.getCode(), ResponseCode.UNKNOWN.getMessage());
    }

    /**
     * 返回失败消息 (使用code:9999, HTTP状态码500)
     *
     * @param response HttpServletResponse对象
     * @return 失败消息对象
     */
    static ResponseModel failed(HttpServletResponse response) {
        return failed(response, HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }


}
