package br.com.pablo.controller;

import br.com.pablo.model.dao.HibernateDAO;
import br.com.pablo.model.dao.InterfaceDAO;
import br.com.pablo.model.entities.Endereco;
import br.com.pablo.model.entities.Pessoa;
import br.com.pablo.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MbPessoa implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Pessoa pessoa = new Pessoa();
    private Endereco endereco = new Endereco();
    private List<Pessoa> pessoas;
    private List<Endereco> enderecos;

    public MbPessoa() {
    }
    
    private InterfaceDAO<Pessoa> pessoaDAO(){
        InterfaceDAO<Pessoa> pessoaDAO = new HibernateDAO<Pessoa>(Pessoa.class, FacesContextUtil.getRequestSession());
        return pessoaDAO;
    }
    
    private InterfaceDAO<Endereco> enderecoDAO(){
        InterfaceDAO<Endereco> enderecoDAO = new HibernateDAO<Endereco>(Endereco.class, FacesContextUtil.getRequestSession());
        return enderecoDAO;
    }
    
    public String LimpPessoa(){
        pessoa = new Pessoa();
        endereco = new Endereco();
        return editPessoa();
    }
    
    public String editPessoa(){        
        return "/restrict/cadastrarpessoa.faces";
    }
}
