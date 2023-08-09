package javayige.invoker;


import javayige.bean.PlainResult;
import javayige.callback.AbstractActionCallBack;
import javayige.context.Context;

/**
 * @Author : orangeCy
 * @Time : 2021/9/12
 * @desc : 猎豹养成产品源码
 */
public class ServiceInvokerImpl implements ServiceInvoker {

    @Override
    public PlainResult invoke(Context context, AbstractActionCallBack action) {
        //template pattern
        // 校验
        processParamValidate(context,action);
        // 执行
        action.process(context);
        // 装配
        return processAssemble(context,action);
    }

    private void processParamValidate(Context context, AbstractActionCallBack action) {
        System.out.println("开始执行paramValidate");
        action.paramValidate(context);
        System.out.println("结束执行paramValidate");
    }

    private void processProcess(Context context, AbstractActionCallBack action) {
        System.out.println("开始执行process");
        action.process(context);
        System.out.println("结束执行process");
    }

    private PlainResult  processAssemble(Context context, AbstractActionCallBack action) {
        System.out.println("开始执行assemble");
        PlainResult assemble = action.assemble(context);
        System.out.println("结束执行assemble");
        return assemble;
    }
}