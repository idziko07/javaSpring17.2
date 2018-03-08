package pl.presentation.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ShowInfoProductController {
    private ProductRepository products;

    public ShowInfoProductController(ProductRepository products) {
        this.products = products;
    }

    @ResponseBody
    @RequestMapping(name = "/lista",method = RequestMethod.GET)
    public String showInfo(String category){
        String text = category;
        Category category1;
        if(category == null){
            category1 =Category.valueOf("WSZYSTKIE");
        }else{
            category = category.toUpperCase();
            category1 = Category.valueOf(category);
        }
        List<Product> products = this.products.getProducts();

        String results ="";
        double price = 0;
        for (Product product : products) {
            product.getCategory().toUpperCase();
            if (text == null || product.getCategory().equals(category1.name())){
                results += product.toString() + "<br>" ;
                price += product.getPrice();
            }
        }
        return results + "<br>" + "Cena artykułów wynosi: " + price + " zł";
        //return category;
    }

}
