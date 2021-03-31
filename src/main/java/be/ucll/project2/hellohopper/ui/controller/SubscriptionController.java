package be.ucll.project2.hellohopper.ui.controller;

import be.ucll.project2.hellohopper.domain.model.Subscription;
import be.ucll.project2.hellohopper.domain.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.security.oauth2.jwt.Jwt;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//change [origins = "*", allowedHeaders = "*"] into [origins = "http://localhost:8080"]
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @GetMapping("/subscriptions")
    public List<Subscription> getAllSubscriptions(){
        return subscriptionService.getAll();
    }

    @GetMapping("/check")
    public boolean greeting(@RequestParam(value = "name", defaultValue = "World") String name,
                            @AuthenticationPrincipal Jwt accessToken) {
        System.out.println("In GET Request");
        String scope = accessToken.getClaims().get("scope").toString();
        Boolean partnerRole = scope.contains("partner");
        System.out.println("Contains sequence 'partner': " + accessToken.getClaims().get("scope").toString());
        System.out.println("Contains sequence 'partner': " + accessToken.getClaims().get("scope").toString().contains("partner"));
        if (partnerRole) {
            return true;
        } else {
            return false;
        }
    }

    @PostMapping("/subscriptions")
    public String addProduct(@RequestBody Subscription subscription, @AuthenticationPrincipal Jwt accessToken) {
        System.out.println("In POST Request");
        String scope = accessToken.getClaims().get("scope").toString();
        Boolean partnerRole = scope.contains("partner");

        if (partnerRole) {
            System.out.println("Contains sequence 'partner': " + accessToken.getClaims().get("scope").toString());
            System.out.println("Contains sequence 'partner': " + accessToken.getClaims().get("scope").toString().contains("partner"));
            return "Subscription added";
        } else {
            return "Not Authorized to add subscription";
        }
    }
}
