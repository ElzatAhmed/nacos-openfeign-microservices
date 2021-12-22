package org.elzatahmed.microservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("hello-provider")
public interface HelloService {

    @GetMapping
    ResponseEntity<String> hello();

    @GetMapping("/{name}")
    ResponseEntity<String> hello(@PathVariable String name);

}
