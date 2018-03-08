package pl.presentation.product;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> products;

    public ProductRepository() {
        this.products =new ArrayList<>();
        products.add(new Product("chleb",2,"SPOZYWCZE"));
        products.add(new Product("maslo",4.6,"SPOZYWCZE"));
        products.add(new Product("opony",590,"INNE"));
        products.add(new Product("olej samochodowy",50.80,"DOMOWE"));
        products.add(new Product("szynka",5.60,"SPOZYWCZE"));
        products.add(new Product("remont samochodu",250,"INNE"));
        products.add(new Product("wieszak",2.5,"INNE"));
        products.add(new Product("proszek",10.34,"DOMOWE"));
    }


    public List<Product> getProducts() {
        return products;
    }
}
