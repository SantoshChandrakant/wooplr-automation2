/*****************************************************************************

 ****************************************************************************/

/*
 * User: Arjun
 * Date: Apr 2, 2011
 */

package com.ubiquity.common.jaxb.ecomm;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class EntityType {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;

	@Persistent
	private Long entityId;

	@Persistent
	private Integer entitytype;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEntityId() {
		return entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	public Integer getEntitytype() {
		return entitytype;
	}

	public void setEntitytype(Integer entitytype) {
		this.entitytype = entitytype;
	}
}
