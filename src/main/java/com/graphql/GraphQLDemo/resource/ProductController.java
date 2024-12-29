package com.graphql.GraphQLDemo.resource;

import com.graphql.GraphQLDemo.entity.Product;
import com.graphql.GraphQLDemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
//@RequestMapping("/products")
@Controller
public class ProductController {
    @Autowired
    private ProductService service;

//    @GetMapping
    @QueryMapping
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

//    @GetMapping("/{category}")
    @QueryMapping
    public List<Product> getProductByCategory(/*@PathVariable*/@Argument String category){

        return service.getProductByCategory(category);
    }
    @MutationMapping
    public Product updateStock(@Argument int id,@Argument int stock){
        return service.updateStockById(id,stock);
    }

    @MutationMapping
    public Product reciveNewShipment(@Argument int id,@Argument int quantity){
        return service.receiveNewShipmen(id,quantity);
    }
}
