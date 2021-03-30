package be.ucll.project2.hellohopper.ui.controller;

import be.ucll.project2.hellohopper.domain.model.Subscription;
import be.ucll.project2.hellohopper.domain.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/products")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @GetMapping
    @ResponseBody
    public List<Subscription> getAll(){
        return subscriptionService.getAll();
    }

    @GetMapping("/{id}")
    public Subscription get(@PathVariable int id){
        return subscriptionService.get(id);
    }

    @PostMapping("/{id}")
    public void create(@PathVariable int id,@RequestBody @Valid Subscription subscription){
        subscriptionService.create(subscription);
    }

    @PostMapping
    public void delete(@RequestBody @Valid Subscription subscription){
        subscriptionService.delete(subscription);
    }

    @PutMapping
    public void update(@RequestBody @Valid Subscription subscription){
        subscriptionService.update(subscription);
    }




}
