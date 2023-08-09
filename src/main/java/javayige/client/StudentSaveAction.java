package javayige.client;


import javayige.bean.PlainResult;
import javayige.context.Context;
import javayige.callback.AbstractActionCallBack;

/**
 * @Author : orangeCy
 * @Time : 2021/9/12
 * @desc : 猎豹养成产品源码
 */
public class StudentSaveAction extends AbstractActionCallBack<PlainResult, Context> {

    @Override
    public void paramValidate(Context context) {
        //校验超过3个以及以上 的话 抽取validate方法
        String stuName = context.get(String.class);
        if (null == stuName) {
            System.out.println("参数不能为空");
            return;
        }
        if (stuName.equals("lb")) {
            System.out.println("参数非法 包含敏感词 ");
            return;
        }
        if (stuName.length() > 4) {
            System.out.println("参数非法  长度过长");
            return;
        }
        //传递的功能
        context.put(true);
    }

    @Override
    public void bizValidate(Context context) {

    }

    @Override
    public void process(Context context) {
        //落库
        Boolean validateSuccess = context.get(Boolean.class);
        if (Boolean.TRUE.equals(validateSuccess)) {
            System.out.println("学生插入成功===");
        }
    }

    @Override
    public PlainResult assemble(Context context) {
        return null;
    }

}