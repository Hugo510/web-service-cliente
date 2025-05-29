
package perez;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the perez package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Hello_QNAME = new QName("http://perez/", "hello");
    private static final QName _HelloResponse_QNAME = new QName("http://perez/", "helloResponse");
    private static final QName _Teorema_QNAME = new QName("http://perez/", "teorema");
    private static final QName _TeoremaResponse_QNAME = new QName("http://perez/", "teoremaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: perez
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     * @return
     *     the new instance of {@link Hello }
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     * @return
     *     the new instance of {@link HelloResponse }
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Teorema }
     * 
     * @return
     *     the new instance of {@link Teorema }
     */
    public Teorema createTeorema() {
        return new Teorema();
    }

    /**
     * Create an instance of {@link TeoremaResponse }
     * 
     * @return
     *     the new instance of {@link TeoremaResponse }
     */
    public TeoremaResponse createTeoremaResponse() {
        return new TeoremaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://perez/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://perez/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Teorema }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Teorema }{@code >}
     */
    @XmlElementDecl(namespace = "http://perez/", name = "teorema")
    public JAXBElement<Teorema> createTeorema(Teorema value) {
        return new JAXBElement<>(_Teorema_QNAME, Teorema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TeoremaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TeoremaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://perez/", name = "teoremaResponse")
    public JAXBElement<TeoremaResponse> createTeoremaResponse(TeoremaResponse value) {
        return new JAXBElement<>(_TeoremaResponse_QNAME, TeoremaResponse.class, null, value);
    }

}
