package com.br.pablo.util;

import javax.faces.context.FacesContext;
import org.hibernate.Session;

public class FacesContextUtil {

    private static final String HIBERNATE__SESSION = "hibernate_session";

    public static void setRequestSession(Session session) {
        FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put(HIBERNATE__SESSION, session);
    }

    public static Session getHIBERNATE__SESSION() {
        return (Session) FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get(HIBERNATE__SESSION);
    }
}
