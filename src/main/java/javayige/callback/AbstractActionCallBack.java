package javayige.callback;


import javayige.bean.PlainResult;
import javayige.context.Context;

/**
 * @Author : orangeCy
 * @Time : 2021/9/12
 * @desc : 猎豹养成产品源码
 */
public abstract class AbstractActionCallBack<T extends PlainResult, C extends Context> implements ActionCallBack<T, C> {

    /**
     * 执行-前置处理
     *
     * @param context
     */
    @Override
    public void beforeProcess(C context) {

    }

    /**
     * 执行-后置处理
     *
     * @param context
     */
    @Override
    public void afterProcess(C context) {

    }
}