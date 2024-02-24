package edu.iu.tatajane.primesservice.controller;

import edu.iu.tatajane.primesservice.service.IPrimesService;
import edu.iu.tatajane.primesservice.service.PrimesService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesController {

    IPrimesService primesService;
    public PrimesController(IPrimesService primesService)
    {
        this.primesService = primesService;
    }

    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable int n){
        return primesService.isPrime(n);
    }
}
