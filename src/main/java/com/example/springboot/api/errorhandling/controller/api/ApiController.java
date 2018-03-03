package com.example.springboot.api.errorhandling.controller.api;

import com.example.springboot.api.errorhandling.SampleModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ApiController {

    @GetMapping("/api/v1/get")
    @ApiOperation(value = "Find value",
            notes = "Gets default value")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("value");
    }


    @PostMapping(value = "/api/v1/post")
    public ResponseEntity<SampleModel> put(@Valid @RequestBody SampleModel model) {
        return ResponseEntity.ok().body(model);
    }

}
