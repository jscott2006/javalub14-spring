package pl.sda.javalub14springboot.dice;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DiceService {

    private final Random random;

    public DiceService(Random random) {
        this.random = random;
    }

    public int roll(int sides) {
        return random.nextInt(sides) + 1;
    }
}
