package com.saludo.practica_spring.clase1.ejClase.controllers;

import com.saludo.practica_spring.clase1.ejClase.entities.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/user")
public class UserController {

    //TODO: find what's the meaning of atomic
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    public Greeting sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(
                counter.incrementAndGet(),
                "Hi, " + name + "! How are you?",
                this.getClass().getSimpleName());
    }

    @GetMapping("/bye/{name}")
    public Greeting sayBye(@PathVariable String name) {
        return new Greeting(
                counter.incrementAndGet(),
                "Bye, " + name + "! See you soon!",
                this.getClass().getSimpleName());
    }

}
