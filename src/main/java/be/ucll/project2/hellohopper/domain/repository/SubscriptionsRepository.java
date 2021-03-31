package be.ucll.project2.hellohopper.domain.repository;

import be.ucll.project2.hellohopper.domain.model.Subscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionsRepository extends CrudRepository<Subscription, String> {
}
