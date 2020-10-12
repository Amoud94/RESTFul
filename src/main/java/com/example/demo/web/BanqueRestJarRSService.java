package com.example.demo.web;
import com.example.demo.dao.CompteRepository;
import com.example.demo.entity.compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@RestController
public class BanqueRestJarRSService {
    @Autowired
    private CompteRepository compteRepository;

    @GetMapping("/comptes")
    public List<compte> ListCompte(){
        return compteRepository.findAll();
    }

    @GetMapping(path = "/comptes/{code}")
    public compte findCompte(@PathVariable(value = "code") Long code){
        return compteRepository.findById(code).get();
    }

    @PostMapping(path = "/comptes")
    public compte save(@RequestBody compte cp){
        return compteRepository.save(cp);
    }

    @PutMapping("/comptes/{code}")
    public compte update(@PathVariable(value = "code") Long code, compte cp ){
        cp.setCode(code);
        return compteRepository.save(cp);
    }

    @DeleteMapping("/comptes/{code}")
    public void update(@PathVariable(value = "code") Long code ){
         compteRepository.deleteById(code);
    }

}
