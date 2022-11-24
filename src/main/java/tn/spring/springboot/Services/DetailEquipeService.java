package tn.spring.springboot.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import tn.spring.springboot.Repository.IContratRepository;

@Service
public class ContratService implements IContratService{


   private IContratRepository contratRepository;
    @Autowired
    public ContratService(){

   }
}
