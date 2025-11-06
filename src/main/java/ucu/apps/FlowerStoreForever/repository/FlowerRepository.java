package ucu.apps.flowerstoreforever.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ucu.apps.flowerstoreforever.store.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Long> {
}

