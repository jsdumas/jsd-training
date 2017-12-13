
package io.jsd.training.client.ws.trainingcenter.clients.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour formation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="formation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="difficulte" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="duree" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="formateurs" type="{http://webservice.centreformation.treeptik.fr/}formateur" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="intitule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formation", propOrder = {
    "difficulte",
    "duree",
    "formateurs",
    "id",
    "intitule"
})
public class Formation {

    protected Integer difficulte;
    protected Integer duree;
    @XmlElement(nillable = true)
    protected List<Formateur> formateurs;
    protected Integer id;
    protected String intitule;

    /**
     * Obtient la valeur de la propriété difficulte.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDifficulte() {
        return difficulte;
    }

    /**
     * Définit la valeur de la propriété difficulte.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDifficulte(Integer value) {
        this.difficulte = value;
    }

    /**
     * Obtient la valeur de la propriété duree.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuree() {
        return duree;
    }

    /**
     * Définit la valeur de la propriété duree.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuree(Integer value) {
        this.duree = value;
    }

    /**
     * Gets the value of the formateurs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formateurs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormateurs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Formateur }
     * 
     * 
     */
    public List<Formateur> getFormateurs() {
        if (formateurs == null) {
            formateurs = new ArrayList<Formateur>();
        }
        return this.formateurs;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété intitule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntitule() {
        return intitule;
    }

    /**
     * Définit la valeur de la propriété intitule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntitule(String value) {
        this.intitule = value;
    }

}
