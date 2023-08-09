package javayige.client;


import javayige.context.Context;
import javayige.invoker.ServiceInvoker;
import javayige.invoker.ServiceInvokerImpl;

/**
 * @Author : orangeCy
 * @Time : 2021/9/12
 * @desc : 猎豹养成产品源码
 * 调用测试
 */
public class ServiceProcessTest {

    public static void main(String[] args) {

        //这里使用mock new对象 代替注入
        ServiceInvoker serviceProcess = new ServiceInvokerImpl();
        //构建学生的contexts
        Context context = new Context();
        //stuId 99
        context.put("lb");
        StudentSaveAction studentSaveAction = new StudentSaveAction();
        serviceProcess.invoke(context, studentSaveAction);
    }
}