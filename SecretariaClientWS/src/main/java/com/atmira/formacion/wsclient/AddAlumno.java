
package com.atmira.formacion.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AddAlumno complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AddAlumno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dniProfesor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dniAlumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreAlumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nota" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddAlumno", propOrder = {
    "dniProfesor",
    "dniAlumno",
    "nombreAlumno",
    "nota"
})
public class AddAlumno {

    protected String dniProfesor;
    protected String dniAlumno;
    protected String nombreAlumno;
    protected double nota;

    /**
     * Obtiene el valor de la propiedad dniProfesor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDniProfesor() {
        return dniProfesor;
    }

    /**
     * Define el valor de la propiedad dniProfesor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDniProfesor(String value) {
        this.dniProfesor = value;
    }

    /**
     * Obtiene el valor de la propiedad dniAlumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDniAlumno() {
        return dniAlumno;
    }

    /**
     * Define el valor de la propiedad dniAlumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDniAlumno(String value) {
        this.dniAlumno = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAlumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    /**
     * Define el valor de la propiedad nombreAlumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAlumno(String value) {
        this.nombreAlumno = value;
    }

    /**
     * Obtiene el valor de la propiedad nota.
     * 
     */
    public double getNota() {
        return nota;
    }

    /**
     * Define el valor de la propiedad nota.
     * 
     */
    public void setNota(double value) {
        this.nota = value;
    }

}
