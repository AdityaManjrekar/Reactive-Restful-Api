package com.spring.reactive.webflux.SpringReactiveApi.fluxandmonoplayground;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class FluxAndMonoTest {

    @Test
    public void fluxTest(){

      Flux<String> stringFlux =  Flux.just("Spring","Spring Boot","Reactive Spring")
              .concatWith(Flux.error(new RuntimeException("Error occurred")))
              .log();
      stringFlux.subscribe(System.out::println,(e)-> System.err.println(e));
    }

}