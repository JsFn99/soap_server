package ma.fnine.soap_server.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor @NoArgsConstructor
public class Product {
    private int id;
    private String name;
    private double price;
    private Date creationDate;
}
