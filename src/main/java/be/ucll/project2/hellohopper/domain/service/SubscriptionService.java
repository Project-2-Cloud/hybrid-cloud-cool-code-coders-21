package be.ucll.project2.hellohopper.domain.service;

import be.ucll.project2.hellohopper.domain.model.Subscription;
import be.ucll.project2.hellohopper.domain.repository.SubscriptionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionService implements ISubscriptionService{

    @Autowired
    private SubscriptionsRepository repository;

    @Override
    public List<Subscription> getAll() {
        return (List<Subscription>) repository.findAll();
    }

    @Override
    public Subscription get(int id) {
        return (Subscription) repository.findById(id).get();
    }

    @Override
    public void add(Subscription subscription) {
        repository.save(subscription);
    }

    @Override
    public void delete(Subscription subscription) {
        repository.delete(subscription);
    }

    @Override
    public void update(Subscription subscription) {
        repository.save(subscription);
    }
}
