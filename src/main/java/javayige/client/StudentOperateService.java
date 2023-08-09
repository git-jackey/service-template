package javayige.client;


import javayige.bean.OrangeCyBean;

/**
 * @Author : orangeCy
 * @Time : 2021/9/12
 * @desc : 猎豹养成产品源码
 */
public interface StudentOperateService {

    void createStu(String stuName);

    OrangeCyBean queryStuById(Long stuId);
}