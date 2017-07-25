
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
        return pl;
    }

    @Override
    public void saveProvincia(Provincia p) {
        save(p);
    }

    @Override
    public void deleteById(int id) {
        Provincia p = getByKey(id);
        delete(p);
    }

    @Override
    public Provincia findProvinciaById(int id) {
        return getByKey(id);
    }

    @Override
    public Provincia findProvinciaByName(String Nombre) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("nombre", Nombre));
        Provincia p = (Provincia) crit.uniqueResult();
        return p;
    }

}
