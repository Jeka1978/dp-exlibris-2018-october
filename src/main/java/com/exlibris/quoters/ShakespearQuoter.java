package com.exlibris.quoters;

import com.exlibris.my_spring.Benchmark;
import com.exlibris.my_spring.InjectRandomInt;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Setter
@Component
public class ShakespearQuoter implements Quoter {
    @Value("${shake}")
    private String message;

    @InjectRandomInt(min = 3, max = 5)
    private int repeat;


    @Override
    @Benchmark
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
