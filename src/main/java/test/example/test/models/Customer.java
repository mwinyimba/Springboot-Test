package test.example.test.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer")
    private Long id;
    private  String first_name;
    private String  last_name;
    private Integer phone_no;
    private  String address;

    @OneToMany(targetEntity = Product.class , cascade = CascadeType.ALL)
//    @JoinColumn(name = "product" , referencedColumnName = "id")
    private List<Product> products;

}
