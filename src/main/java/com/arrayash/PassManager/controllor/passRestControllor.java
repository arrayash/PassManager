package com.arrayash.PassManager.controllor;


import com.arrayash.PassManager.model.data;
import com.arrayash.PassManager.service.passService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class passRestControllor {


    @Autowired
    passService serve;


    @GetMapping("/pass")
    public List<data> getpasses() {
        return serve.GetALlPass();
    }

    @GetMapping("/pass/{passid}")
    public Optional<data> getpassbyname(@PathVariable int passid) {
        return serve.getbyname(passid);
    }

    @PostMapping("/pass")
    public void createpass(@RequestBody data dt) {
        serve.createpass(dt);
    }

    @PostMapping("/mock")
    public void mockdata(@RequestBody List<data> mock){ serve.createMockPass(mock);}

    @PutMapping("/pass/{passid}")
    public void updatepass(@PathVariable int passid ,@RequestBody data dt ){
        serve.updatepass(dt);
    }
    @DeleteMapping("/pass/{passid}")
    public void deletepass(@PathVariable int passid){
        serve.deletepass(passid);
    }
}