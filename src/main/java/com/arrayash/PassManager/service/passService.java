package com.arrayash.PassManager.service;


import com.arrayash.PassManager.Repository.passrepo;
import com.arrayash.PassManager.model.data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class passService {



    @Autowired
    passrepo pr;


    public List<data>  GetALlPass(){
        return pr.findAll();
    }

    public void createpass(data dt){
         pr.save(dt);
    }

    public Optional<data> getbyname(long passid) {
        return pr.findById((long) passid);
    }

    public void updatepass(data dt) {

        pr.save(dt);

    }

    public void deletepass(long passid) {
        System.out.println("deleted !!!!");
        pr.deleteById((long) passid);
    }

    public void createMockPass(List<data> mock) {
        pr.saveAll(mock);
    }
}
