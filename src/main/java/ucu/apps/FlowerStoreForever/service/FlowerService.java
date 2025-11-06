package ucu.apps.flowerstoreforever.service;

import lombok.RequiredArgsConstructor;
import ucu.apps.flowerstoreforever.repository.FlowerRepository;
import ucu.apps.flowerstoreforever.store.Flower;

import org.springframework.stereotype.Service;

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
