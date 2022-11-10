/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.jsf.controllers;

import com.jsf.bean.PersonaForm;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author danielcastrejon
 */
@Named(value = "lifecycleBean")
@RequestScoped
public class LifecycleManagedBean {

    private PersonaForm personaForm = new PersonaForm();
    /**
     * Creates a new instance of LifecycleManagedBean
     */
    public LifecycleManagedBean() {
    }
    
    public PersonaForm getPersonaForm(){
        return personaForm;
    }
    
    public void setPersonaForm(PersonaForm personaForm){
        this.personaForm = personaForm;
    }
    
}
