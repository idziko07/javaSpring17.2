package pl.presentation.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddProductController {

    private ProductRepository products;

    public AddProductController(ProductRepository products) {
        this.products = products;
    }
    @GetMapping("/add")
    public String addProduct(@RequestParam String name,@RequestParam Double price, @RequestParam String category){
        Product prod = new Product(name,price,category);
        products.getProducts().add(prod);
        return "/";
    }
}
