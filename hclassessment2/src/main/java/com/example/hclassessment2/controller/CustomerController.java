package com.example.hclassessment2.controller;

import com.example.hclassessment2.model.Customer;
import com.example.hclassessment2.model.Product;
import com.example.hclassessment2.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private ShoppingService shoppingService;

    @PostMapping("/customers/register")
    public Customer registerCustomer(@RequestBody Customer customer) {
        return shoppingService.registerCustomer(customer);
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return shoppingService.getAllCustomers();
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return shoppingService.getCustomerById(id);
    }

    @PutMapping("/customers/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        return shoppingService.updateCustomer(id, customer);
    }

    @DeleteMapping("/customers/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        shoppingService.deleteCustomer(id);
        return "Customer deleted successfully.";
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return shoppingService.addProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return shoppingService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id) {
        return shoppingService.getProductById(id);
    }

    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return shoppingService.updateProduct(id, product);
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable Long id) {
        shoppingService.deleteProduct(id);
        return "Product deleted successfully.";
    }
}
