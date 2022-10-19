package rikkei.academy.controller;

import rikkei.academy.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import rikkei.academy.service.IProductService;
import rikkei.academy.service.ProductServiceIMPL;

import java.util.List;

@Controller
@RequestMapping({"/","/product"})
public class ProductController {
    @Autowired
    private IProductService productService;
    @GetMapping("/")
    public String index(Model model){
        List<Product> product = productService.findAll();
            model.addAttribute("productList",product);
        return "/index";
    }
    @GetMapping("/create")
    public String formCreate(Model model){
        return "/create";
    }
}
