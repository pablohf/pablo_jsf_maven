package br.com.pablo.suport;

import br.com.pablo.model.dao.HibernateDAO;
import br.com.pablo.model.dao.InterfaceDAO;
import br.com.pablo.model.entities.Sexo;
import br.com.pablo.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "bbsexo")
@RequestScoped
public class BbSexo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    public List<Sexo> getSexos(){
        InterfaceDAO<Sexo> sexoDAO = new HibernateDAO<Sexo>(Sexo.class, FacesContextUtil.getRequestSession());
        return sexoDAO.getEntities();
    }    
}
