/**
 * The copyright of this code source belongs to
 * LightCode Website. Nobody has the right to use 
 * it without permission. If you has any question
 * when seeing this statement, please contact us by
 * sending email to ymhd318@163.com
 */
package com.camel.blog.bean;

import java.io.Serializable;

/**
 * Created by QYD
 *
 * At 2015 下午11:55:06
 */
public class WebResult<T> implements Serializable {

    private static final long serialVersionUID = -975602676825707359L;

    private int code;
    private String message;
    private boolean success;
    private T data;
    
    public WebResult() {
        this.code = 200;
        this.success = true;
        this.message = "success";
        this.data = null;
    }
    
    
    
}
