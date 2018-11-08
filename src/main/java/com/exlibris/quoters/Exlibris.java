package com.exlibris.quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Exlibris {
    @Media(MediaType.BOOK)
    private Quoter quoter;

    @Scheduled(fixedDelay = 1000)
    public void printall(){
        quoter.sayQuote();
    }
}
