
package com.atmira.formacion.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para calcularPromedioProfesorResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="calcularPromedioProfesorResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Resultado" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcularPromedioProfesorResponse", propOrder = {
    "resultado"
})
public class CalcularPromedioProfesorResponse {

    @XmlElement(name = "Resultado")
    protected double resultado;

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     */
    public void setResultado(double value) {
        this.resultado = value;
    }

}
