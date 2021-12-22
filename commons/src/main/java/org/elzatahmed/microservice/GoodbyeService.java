package org.elzatahmed.microservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("goodbye-provider")
public interface GoodbyeService {

    @GetMapping
    ResponseEntity<String> goodbye();

    @GetMapping("/{name}")
    ResponseEntity<String> goodbye(@PathVariable String name);

}
