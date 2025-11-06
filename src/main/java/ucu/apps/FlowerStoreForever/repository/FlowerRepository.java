package ucu.apps.FlowerStoreForever.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ucu.apps.FlowerStoreForever.store.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Long> {
}

