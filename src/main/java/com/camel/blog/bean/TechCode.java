/**
 * The copyright od this code source belongs to
 * LightCode Website. Nobody has the right to use 
 * it without permission. If you has any question
 * when seeing this statement, please contact us by
 * sending email to ymhd318@163.com
 */
package com.camel.blog.bean;

import java.util.Date;

/**
 * Created by QYD
 *
 * At 2015 下午6:34:57
 */
public class TechCode {
    private Date   createDate;
    private Date   modifiedDate;
    private int    id;
    private String techRegionCode;
    private String techLabelCode;
    private String techRegionName;
    private String techLabelName;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTechRegionCode() {
        return techRegionCode;
    }

    public void setTechRegionCode(String techRegionCode) {
        this.techRegionCode = techRegionCode;
    }

    public String getTechLabelCode() {
        return techLabelCode;
    }

    public void setTechLabelCode(String techLabelCode) {
        this.techLabelCode = techLabelCode;
    }

    public String getTechRegionName() {
        return techRegionName;
    }

    public void setTechRegionName(String techRegionName) {
        this.techRegionName = techRegionName;
    }

    public String getTechLabelName() {
        return techLabelName;
    }

    public void setTechLabelName(String techLabelName) {
        this.techLabelName = techLabelName;
    }

}
