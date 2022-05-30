package ch.fhnw.acrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//controller does routing e.g. html
@Controller
@RequestMapping(path = "/products")

public class ProductController {

    @GetMapping

    public String getProductPage() {
        return "products.html";
    }

}
