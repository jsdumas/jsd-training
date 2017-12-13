
package io.jsd.training.client.ws.trainingcenter.clients.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour formateur complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="formateur">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.centreformation.treeptik.fr/}personne">
 *       &lt;sequence>
 *         &lt;element name="entreprise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="poste" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formateur", propOrder = {
    "entreprise",
    "id",
    "poste"
})
public class Formateur
    extends Personne
{

    protected String entreprise;
    protected Integer id;
    protected String poste;

    /**
     * Obtient la valeur de la propriété entreprise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntreprise() {
        return entreprise;
    }

    /**
     * Définit la valeur de la propriété entreprise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntreprise(String value) {
        this.entreprise = value;
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
     * Obtient la valeur de la propriété poste.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoste() {
        return poste;
    }

    /**
     * Définit la valeur de la propriété poste.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoste(String value) {
        this.poste = value;
    }

}
