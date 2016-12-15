/*****************************************************************************

 ****************************************************************************/

/*
 * User: Arjun
 * Date: Apr 2, 2011
 */

package com.ubiquity.common.jaxb.ecomm;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class EntityTypeDAO {

	public static void save(EntityType entityType) {
		PersistenceManager pm = PMF.getNonTxnPm();
		try {
			pm.makePersistent(entityType);
		} finally {
			pm.close();

		}
	}

	public static int getEntityType(Long entityId) {
		PersistenceManager pm = PMF.getNonTxnPm();
		Query query = pm.newQuery(EntityType.class);
		query.declareParameters("Long entityId");
		query.setFilter("this.entityId == entityId");
		List<EntityType> result = (List<EntityType>) query.execute(entityId);
		return result.size() > 0 ? result.get(0).getEntitytype() : -1;
	}
}
