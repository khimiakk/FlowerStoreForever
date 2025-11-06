package ucu.apps.FlowerStoreForever.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ucu.apps.FlowerStoreForever.store.Flower;
import ucu.apps.FlowerStoreForever.service.FlowerService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/flower")
public class FlowerController {

    private final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("/flower")
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }

    @PostMapping("/flower")
    public Flower addFlower(@RequestBody Flower flower) {
        return flowerService.addFlower(flower);
    }

}
