
package edu.fcm.hcdl.dao;

import edu.fcm.hcdl.model.Provincia;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("provinciaDao")
public class ProvinciaDaoImpl extends AbstractDao<Integer, Provincia> implements ProvinciaDao {    
    
    @Override
    public List<Provincia> getAll() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("nombre"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
        List<Provincia> pl = (List<Provincia>) criteria.list();
        // No need to fetch userProfiles since we are not showing them on list page. Let them lazy load. 
        // Uncomment below lines for eagerly fetching of userProfiles if you want.
        /*
		for(User user : users){
			Hibernate.initialize(user.getUserProfiles());
		}*/
        return pl;
    }

    @Override
    public void createProvincia(Provincia p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editProvincia(Provincia p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeProvincia(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Provincia getProvincia(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
