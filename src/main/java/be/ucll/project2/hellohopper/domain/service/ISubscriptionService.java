package be.ucll.project2.hellohopper.domain.service;

import be.ucll.project2.hellohopper.domain.model.Subscription;

import java.util.List;

public interface ISubscriptionService {
    List<Subscription> getAll();
    Subscription get(int id);
    void add(Subscription subscription);
    void delete(Subscription subscription);
    void update(Subscription subscription);
}
