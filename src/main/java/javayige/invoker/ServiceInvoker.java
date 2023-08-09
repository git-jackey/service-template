package javayige.invoker;


import javayige.bean.PlainResult;
import javayige.callback.AbstractActionCallBack;
import javayige.context.Context;

/**
 * @Author : orangeCy
 * @Time : 2021/9/12
 * @desc : 猎豹养成产品源码
 */
public interface ServiceInvoker<T extends PlainResult,C extends Context>{

    /**
     * invoke
     * @param context
     * @param action
     * @return
     */
    T invoke(C context, AbstractActionCallBack<T,C> action);
}