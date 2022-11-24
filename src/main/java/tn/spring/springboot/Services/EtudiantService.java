package tn.spring.springboot.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Repository.IContratRepository;

@Service
public class EquipeService implements IContratService{


   private IContratRepository contratRepository;
    @Autowired
    public EquipeService(){

   }
}
