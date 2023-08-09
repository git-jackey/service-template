package javayige.context;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : orangeCy
 * @Time : 2021/9/12
 * @desc : 猎豹养成产品源码
 */
public class Context {
    private  Map<Class<?>, Object> CONTEXT;

    //key 规范

    public <T> T get(Class<T> clazz) {
        if (null == CONTEXT) {
            CONTEXT = new HashMap<Class<?>, Object>();
        }
        return (T)CONTEXT.get(clazz);
    }

    public void put(Object obj) {
        if(null == obj) {
            return;
        }
        if(null == CONTEXT) {
            CONTEXT = new HashMap<Class<?>, Object>();
        }
        CONTEXT.put(obj.getClass(),obj);
    }
 }