package controller;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.IProductService;
import service.ProductServiceIMPL;

import java.util.List;

@Controller
@RequestMapping(value ={ "/","/product"})
public class ProductController {
    private final IProductService productService = new ProductServiceIMPL();
    @Autowired
    @GetMapping("/")
    public String index(Model model){
        List<Product> productList = productService.findAll();
            model.addAttribute("listProduct",productList);
        return "/index";
    }
}
