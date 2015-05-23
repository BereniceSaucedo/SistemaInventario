package basededatos;

import java.util.List;
import java.util.Set;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import beans.Ubicacion;

/**
 * A data access object (DAO) providing persistence and search support for
 * Ubicacion entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see basededatos.Ubicacion
 * @author MyEclipse Persistence Tools
 */
public class UbicacionDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(UbicacionDAO.class);
	// property constants
	public static final String DESCRIPCION = "descripcion";

	public void save(Ubicacion transientInstance) {
		log.debug("saving Ubicacion instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Ubicacion persistentInstance) {
		log.debug("deleting Ubicacion instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ubicacion findById(java.lang.Integer id) {
		log.debug("getting Ubicacion instance with id: " + id);
		try {
			Ubicacion instance = (Ubicacion) getSession().get(
					"basededatos.Ubicacion", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Ubicacion instance) {
		log.debug("finding Ubicacion instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"basededatos.Ubicacion")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Ubicacion instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Ubicacion as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDescripcion(Object descripcion) {
		return findByProperty(DESCRIPCION, descripcion);
	}

	public List findAll() {
		log.debug("finding all Ubicacion instances");
		try {
			String queryString = "from Ubicacion";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ubicacion merge(Ubicacion detachedInstance) {
		log.debug("merging Ubicacion instance");
		try {
			Ubicacion result = (Ubicacion) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ubicacion instance) {
		log.debug("attaching dirty Ubicacion instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ubicacion instance) {
		log.debug("attaching clean Ubicacion instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}