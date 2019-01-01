package com.tapir.app.controller;

import com.tapir.app.controller.request.TapirDto;
import com.tapir.app.controller.responses.BasicResponse;
import com.tapir.app.jpa.model.Tapir;
import com.tapir.app.jpa.service.TapirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crud")
public class CrudController {

    @Autowired
    private TapirRepository tapirRepository;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<BasicResponse> create(@RequestBody TapirDto request) {
        BasicResponse result = new BasicResponse();

        Tapir tapir = request.convertTo();
        tapir = tapirRepository.persist(tapir);
        result.setCode(200);
        result.setMessage("guardado tapir numero: " + tapir.getId());


        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @RequestMapping(value = "/read", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<BasicResponse> read(){
        BasicResponse result = new BasicResponse();

        result.setCode(200);
        result.setMessage("lista de tapires existentes en base de datos");
        result.setTapirs(tapirRepository.findAll());

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<BasicResponse> update(@RequestParam Long id,
                                                @RequestBody TapirDto request){
        BasicResponse result = new BasicResponse();

        Tapir tapir = tapirRepository.findById(id);
        tapir.setPesoKilos(request.getPesoKilos());
        tapir.setNombre(request.getNombre());
        tapir.setEdadAnimal(request.getEdadAnimal());

        tapir = tapirRepository.persist(tapir);
        result.setCode(200);
        result.setMessage("updateado tapir numero: " + tapir.getId());

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<BasicResponse> delete(@RequestParam Long id){
        BasicResponse result = new BasicResponse();

        Tapir tapir = tapirRepository.findById(id);
        boolean deleted = tapirRepository.delete(tapir);


        result.setCode(200);
        result.setMessage("borrado tapir: " + tapir.getNombre());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}




