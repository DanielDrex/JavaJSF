/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsf.util;

import javax.faces.context.FacesContext;

/**
 *
 * @author danielcastrejon
 */
public class ResourcesUtil {
    
    public static String getString(String key){
        FacesContext context = FacesContext.getCurrentInstance();
        String value = context.getApplication().evaluateExpressionGet(context, key, String.class);
        return value;
    }
}
