
package perez;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para teorema complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="teorema">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="catA" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="catB" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "teorema", propOrder = {
    "catA",
    "catB"
})
public class Teorema {

    protected double catA;
    protected double catB;

    /**
     * Obtiene el valor de la propiedad catA.
     * 
     */
    public double getCatA() {
        return catA;
    }

    /**
     * Define el valor de la propiedad catA.
     * 
     */
    public void setCatA(double value) {
        this.catA = value;
    }

    /**
     * Obtiene el valor de la propiedad catB.
     * 
     */
    public double getCatB() {
        return catB;
    }

    /**
     * Define el valor de la propiedad catB.
     * 
     */
    public void setCatB(double value) {
        this.catB = value;
    }

}
