package pe.edu.cibertec.appfundamentosrest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/fundamentos")
public class FundamentosController {

    @GetMapping("/ejercicio1")
    public ResponseEntity<String> Ejercicio1(){
        return new ResponseEntity<>("Hola Mundo Rest", HttpStatus.OK);
    }


}
