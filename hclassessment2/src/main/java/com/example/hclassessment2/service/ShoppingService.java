package com.example.hclassessment2.service;

import com.example.hclassessment2.model.Customer;
import com.example.hclassessment2.model.Product;
import com.example.hclassessment2.repository.CustomerRepository;
import com.example.hclassessment2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShoppingService {

        @Autowired
        private CustomerRepository customerRepository;

        public Customer registerCustomer(Customer customer) {
            return customerRepository.save(customer);
        }

        public List<Customer> getAllCustomers() {
            return customerRepository.findAll();
        }

        public Customer getCustomerById(Long id) {
            return customerRepository.findById(id).orElse(null);
        }

        public Customer updateCustomer(Long id, Customer updatedCustomer) {
            Customer existing = getCustomerById(id);
            existing.setCustomerName(updatedCustomer.getCustomerName());
            existing.setEmail(updatedCustomer.getEmail());
            return customerRepository.save(existing);
        }

        public void deleteCustomer(Long id) {
            customerRepository.deleteById(id);
        }

    private ProductRepository productRepository;

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        Product existing = getProductById(id);
        existing.setProductName(updatedProduct.getProductName());
        existing.setDescription(updatedProduct.getDescription());
        existing.setPrice(updatedProduct.getPrice());
        existing.setQuantity(updatedProduct.getQuantity());
        existing.setCategory(updatedProduct.getCategory());
        return productRepository.save(existing);
    }

    public void deleteProduct(Long id) {
        Product existing = getProductById(id);
        productRepository.delete(existing);
    }
}
