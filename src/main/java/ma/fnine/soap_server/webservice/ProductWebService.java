package ma.fnine.soap_server.webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import ma.fnine.soap_server.entities.Product;

import java.util.Date;
import java.util.List;

@WebService(name = "ProductWebService")
public class ProductWebService {
    @WebMethod(operationName = "getPrice")
    public Double sellingsPrice(@WebParam(name = "price") Double price) {
        return price * 1.2;
    }

    @WebMethod(operationName = "getProduct")
    public Product getProduct(@WebParam(name = "code") int code) {
        Product product = new Product();
        product.setId(code);
        product.setName("Ordinateur");
        product.setPrice(4000);
        product.setCreationDate(new Date());
        return product;
    }

    @WebMethod(operationName = "getProducts")
    public List<Product> getProducts() {
        return List.of(
            new Product(1, "Ordinateur", 4000, new Date()),
            new Product(2, "Imprimante", 1000, new Date()),
            new Product(3, "Scanner", 500, new Date()),
            new Product(4, "Disque dur", 300, new Date()),
            new Product(5, "Clé USB", 50, new Date())
        );
    }
}
