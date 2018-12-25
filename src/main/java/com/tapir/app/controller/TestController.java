package com.tapir.app.controller;

import com.tapir.app.objetos.ParejaTapires;
import com.tapir.app.jpa.model.Tapir;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/service")
public class TestController {

    @RequestMapping("/saludo")
    public List<String> saludoCool() {
        List<String> resultado = new ArrayList<>();
        resultado.add("primera información");
        resultado.add("segundda información");
        resultado.add("tercera información");
        return resultado;
    }

    @RequestMapping("/pareja")
    public ParejaTapires obtenerUnaPareja() {
        ParejaTapires result=new ParejaTapires();
        result.setAnos(9);

        Tapir tapirMacho = new Tapir();
        tapirMacho.setEdadAnimal(10);
        tapirMacho.setNombre("paku");
        tapirMacho.setPesoKilos(100.58f);

        Tapir pareja = new Tapir();
        pareja.setEdadAnimal(9);
        pareja.setNombre("peku");
        pareja.setPesoKilos(99.85f);

        result.setTapirPrimero(pareja);
        result.setTapirSegundo(tapirMacho);

        return result;
    }
}
