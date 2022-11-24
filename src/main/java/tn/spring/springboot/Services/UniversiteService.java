package tn.spring.springboot.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Repository.IContratRepository;

@Service
public class EtudiantService implements IContratService{


   private IContratRepository contratRepository;
    @Autowired
    public EtudiantService(){

   }
}
