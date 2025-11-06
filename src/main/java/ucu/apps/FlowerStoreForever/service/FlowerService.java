package ucu.apps.FlowerStoreForever.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ucu.apps.FlowerStoreForever.store.Flower;
import ucu.apps.FlowerStoreForever.repository.FlowerRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FlowerService {

    private final FlowerRepository flowerRepository;

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

    public Flower addFlower(Flower flower) {
        return flowerRepository.save(flower);
    }
}
