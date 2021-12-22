package org.elzatahmed.microservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodbyeController implements GoodbyeService{

    @Override
    @GetMapping
    public ResponseEntity<String> goodbye() {
        return ResponseEntity.ok("Goodbye!");
    }

    @Override
    @GetMapping("/{name}")
    public ResponseEntity<String> goodbye(@PathVariable String name) {
        return ResponseEntity.ok("Goodbye, " + name + "!");
    }
}
