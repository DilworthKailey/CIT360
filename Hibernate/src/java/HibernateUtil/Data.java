/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HibernateUtil;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

/**
 *
 * @author Kailey
 */
@ManagedBean
@SessionScoped
public class Data {
    
    private CDs c;
    private HibernateUtil helper = new HibernateUtil();
    private Session session;
    
    public void addCD(){
        c = new CDs("Undertale");
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(c);
        session.getTransaction().commit();
        session.close();
    }
    
    
}
