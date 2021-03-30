package be.ucll.project2.hellohopper.ui.controller;

import java.util.Arrays;
import java.util.List;
import be.ucll.project2.hellohopper.domain.model.Product;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProductController {

    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        return Arrays.asList(
                new Product(
                        "1",
                        "macbook Retina 13.3' ME662 (2013)",
                        "3.0GHz Dual-core Haswell Intel Core i5 Turbo Boost up to 3.2 GHz, 3MB L3 cache 8GB (two 4GB SO-DIMMs) of 1600MHz DDR3 SDRAM",
                        "https://macbookpics.s3.eu-de.cloud-object-storage.appdomain.cloud/img1.jpeg",
                        10,
                        2399
                ),
                new Product(
                        "2",
                        "Macbook Pro 13.3' Retina MF841LL/A",
                        "Macbook Pro 13.3' Retina MF841LL/A Model 2015 Option Ram Care 12/2016",
                        "https://macbookpics.s3.eu-de.cloud-object-storage.appdomain.cloud/img2.jpeg",
                        15,
                        1199
                ),
                new Product(
                        "3",
                        "Macbook Pro 15.4' Retina MC975LL/A Model 2012",
                        "3.0GHz Dual-core Haswell Intel Core i5 Turbo Boost up to 3.2 GHz, 3MB L3 cache 8GB (two 4GB SO-DIMMs) of 1600MHz DDR3 SDRAM",
                        "https://macbookpics.s3.eu-de.cloud-object-storage.appdomain.cloud/img3.jpeg",
                        1,
                        1800
                )
        );
    }
}
