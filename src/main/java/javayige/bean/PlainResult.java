package javayige.bean;


/**
 * @Author : orangeCy.奕
 * @Time : 2021/9/12
 * @desc : 猎豹养成产品源码
 */
public class PlainResult<T> {
    private boolean success = Boolean.TRUE;
    private int code;
    private String msg;
    private T data;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <E> PlainResult<E> create() {
        return new PlainResult<E>();
    }

    public static <E> PlainResult<E> createFailed(String errMsg) {
        PlainResult<E> result = new PlainResult<E>();
        result.setSuccess(false);
        result.setMsg(errMsg);
        return result;
    }

    public boolean isSuccess() {
        return success;
    }
}