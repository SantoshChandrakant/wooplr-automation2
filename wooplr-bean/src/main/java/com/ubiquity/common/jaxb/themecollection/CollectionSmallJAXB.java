package com.ubiquity.common.jaxb.themecollection;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.ubiquity.common.jaxb.ecomm.Countable;

/**
 * <p>
 * Java class for CollectionJAXB complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="CollectionJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="object_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="object_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionSmallJAXB", propOrder = { "name", "collectionId", "isPrivate" })
public class CollectionSmallJAXB implements Serializable, Countable {
	private final static Long serialVersionUID = 12343L;
	protected String name;
	protected Long collectionId;
	protected Boolean isPrivate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCollectionId() {
		return collectionId;
	}

	public Long getId() {
		return collectionId;
	}

	public void setCollectionId(Long collectionId) {
		this.collectionId = collectionId;
	}

	public Boolean getIsPrivate() {
		return isPrivate;
	}

	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
}
