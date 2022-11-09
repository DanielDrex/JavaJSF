/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.jsf.controllers;

import java.util.Calendar;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.util.logging.Logger;
/**
 *
 * @author danielcastrejon
 */
@Named(value = "navegacionBean")
@RequestScoped
public class NavegacionBean {

    static final Logger LOGGER = Logger.getLogger(NavegacionBean.class.getName());
    /**
     * Creates a new instance of NavegacionBean
     */
    public NavegacionBean() {
        LOGGER.info("Iniciando bean");
    }
    
    public String saludar() {
        int hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if (hora < 12) {
            return "buenos-dias";
        }
        if (hora < 18) { //aquí en Lima, a partir de las 7pm ya es oscuro
            return "buenas-tardes";
        }
        if (hora < 23) {
            return "buenas-noches";
        }
        return null; //todo action=null redirecciona  a la misma página de donde fue invocado
    }    
}
