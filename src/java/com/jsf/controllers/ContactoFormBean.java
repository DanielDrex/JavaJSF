/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.jsf.controllers;

import com.jsf.util.ResourcesUtil;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author danielcastrejon
 */
@Named(value = "contactoFormBean")
@RequestScoped
public class ContactoFormBean {

    private String name;

    /**
     * Creates a new instance of ContactoFormBean
     */
    public ContactoFormBean() {
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSaludo(){
        return ResourcesUtil.getString("#{msg['app.saludo']}") + " "+name;
    }

}
