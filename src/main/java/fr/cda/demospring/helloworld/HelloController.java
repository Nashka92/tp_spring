package fr.cda.demospring.helloworld;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/hello")
@RestController

public class HelloController {

    @GetMapping("/hello") // GET http://localhost:8080/hello
    public String hello() {
        return "GET sur Hello world !";
    }

    /** @PostMapping
    public String helloPost() {
        return "POST sur hello world";
    } **/

    @PutMapping
    public String helloPut() {
        return "PUT sur hello world";
    }

    @DeleteMapping
    public String helloDelete() {
        return "DELETE sur hello world";
    }

    @PatchMapping
    public String helloPatch() {
        return "PATCH sur hello world";
    }

    @PostMapping("/{name}")
    public String helloPostWithName(@PathVariable String name) {
        return "Hello" + name;
    }

    @PostMapping
    public String helloPostWithRequestParam(@RequestParam(defaultValue = "anna") String name) {
        return "Hello " + name;
    }

    @PostMapping("/body")
    String helloPostWithBody(@RequestBody String name) {
        return "Hello " + name;
    }
}
