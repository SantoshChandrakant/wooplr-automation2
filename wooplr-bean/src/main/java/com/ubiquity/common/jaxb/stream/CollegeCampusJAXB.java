package com.ubiquity.common.jaxb.stream;

/**
 * Created by abhishek on 8/12/15.
 */

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * <p>Java class for FashionLookJAXB complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FashionLookJAXB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="webLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollegeCampusJAXB", propOrder = {
        "id",
        "createDate",
        "collegeName",
        "city",
        "title",
        "imagePid",
        "hashTag",
        "synonymList",
        "collegeUserJAXBList"

})
@XmlRootElement
public class CollegeCampusJAXB implements Serializable
{

    private final static Long serialVersionUID = 12343L;
    protected Long id;
    @XmlSchemaType(name = "dateTime")
    protected Date createDate;
    protected String collegeName;
    protected String city;
    protected String title;
    protected String imagePid;
    protected String hashTag;
    private List<String> synonymList;
    protected List<CollegeUserJAXB> collegeUserJAXBList;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImagePid() {
        return imagePid;
    }

    public void setImagePid(String imagePid) {
        this.imagePid = imagePid;
    }

    public String getHashTag() {
        return hashTag;
    }

    public void setHashTag(String hashTag) {
        this.hashTag = hashTag;
    }

    public List<CollegeUserJAXB> getCollegeUserJAXBList() {
        if (collegeUserJAXBList == null) {
            collegeUserJAXBList = new ArrayList<CollegeUserJAXB>();
        }
        return collegeUserJAXBList;
    }

    public void setCollegeUserJAXBList(List<CollegeUserJAXB> collegeUserJAXBList) {
        this.collegeUserJAXBList = collegeUserJAXBList;
    }

    public List<String> getSynonymList() {
        return synonymList;
    }

    public void setSynonymList(List<String> synonymList) {
        this.synonymList = synonymList;
    }
}

