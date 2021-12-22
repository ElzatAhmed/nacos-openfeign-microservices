package org.elzatahmed.microservice;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ConsumerController {

    private final HelloService helloService;
    private final GoodbyeService goodbyeService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return helloService.hello();
    }

    @GetMapping("/hello/{name}")
    public ResponseEntity<String> hello(@PathVariable String name){
        return helloService.hello(name);
    }

    @GetMapping("/goodbye")
    public ResponseEntity<String> goodbye(){
        return goodbyeService.goodbye();
    }

    @GetMapping("/goodbye/{name}")
    public ResponseEntity<String> goodbye(@PathVariable String name){
        return goodbyeService.goodbye(name);
    }

}
