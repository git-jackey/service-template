package javayige.callback;

import javayige.bean.PlainResult;
import javayige.context.Context;

/**
 * @Author : orangeCy
 * @Time : 2021/9/12
 * @desc : 猎豹养成产品源码
 * 流程引擎-抽象执行事件接口
 */

public interface ActionCallBack<T extends PlainResult, C extends Context> {

    /**
     * 参数校验
     * @param context
     */
    void paramValidate(C context);

    /**
     * 业务校验
     * @param context
     */
    void bizValidate(C context);

    /**
     * 执行-前置处理
     * @param context
     */
    void beforeProcess(C context);

    /**
     * 执行
     * @param context
     */
    void process(C context);

    /**
     * 执行-后置处理
     * @param context
     */
    void afterProcess(C context);

    /**
     * 对结果的装配
     * @param context
     * @return
     */
    T assemble(C context);
}