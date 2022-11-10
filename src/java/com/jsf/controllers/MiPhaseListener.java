/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsf.controllers;

import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author danielcastrejon
 */
public class MiPhaseListener implements PhaseListener{
    
    static final Logger LOGGER = Logger.getLogger(MiPhaseListener.class.getName());
    
    @Override
    public void afterPhase(PhaseEvent event) {
        LOGGER.log(Level.INFO, "Después:{0}", event.getPhaseId());
    }
 
 
    @Override
    public void beforePhase(PhaseEvent event) {
        LOGGER.log(Level.INFO, "Antes:{0}", event.getPhaseId());
    }
 
    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
    
}
