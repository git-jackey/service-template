package javayige.bean;


import java.io.Serializable;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/9/12
 * @Desc : OrangeCyBean
 */
public class OrangeCyBean implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * name
     */
    private String name;

    /**
     * feature
     */
    private String feature;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}