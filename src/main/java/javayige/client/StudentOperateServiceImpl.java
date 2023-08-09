package javayige.client;


import javayige.bean.OrangeCyBean;

/**
 * validate - process 模型
 * @Author : orangeCy
 * @Time : 2021/9/12
 * @desc : 猎豹养成产品源码
 */
public class StudentOperateServiceImpl implements StudentOperateService {

    @Override
    public void createStu(String stuName) {
        //校验超过3个以及以上 的话 抽取validate方法
        if(null == stuName) {
            System.out.println("参数不能为空");
            return;
        }
        if(stuName.equals("lb") || stuName.length() > 4) {
            System.out.println("参数非法 包含敏感词 长度过长");
            return;
        }
        //落库
        System.out.println("学生插入成功==="+stuName);
    }

    @Override
    public OrangeCyBean queryStuById(Long stuId) {
        if (null == stuId) {
            System.out.println("参数不能为空");
            return null;
        }
        //mock query db
        OrangeCyBean student = new OrangeCyBean();
        student.setId(11L);
        student.setName("xm");
        System.out.println("学生插入成功===" + student);
        return student;
    }
}