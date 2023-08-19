package com.example.Stage.Service;

import com.example.Stage.Entites.Vehicule;
import com.example.Stage.Repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculeService {

@Autowired
    public VehiculeRepository vehiculeRepository;


    public List<Vehicule> getAllvegicule()
    {
        return vehiculeRepository.findAll();
    }
public   Vehicule createVehcile(Vehicule vehicule)
    {
        return  vehiculeRepository.save(vehicule);
    }

    //public Vehicule updateVehicule(String id, Vehicule updatedVehicule) {
      //  updatedVehicule.setId(id);
        //return vehiculeRepository.save(updatedVehicule);
    //}

    public void deleteVehicule(String id) {
        vehiculeRepository.deleteById(id);
    }
}
