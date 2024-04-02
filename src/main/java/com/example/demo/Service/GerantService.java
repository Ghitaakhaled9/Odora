package com.example.demo.Service;

import com.example.demo.Repository.GerantRepository;
import com.example.demo.entities.Gerant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GerantService {
    private final GerantRepository gerantRepository;

    @Autowired
    public GerantService(GerantRepository gerantRepository) {
        this.gerantRepository = gerantRepository;
    }

    public List<Gerant> getAllGerants() {
        return gerantRepository.findAll();
    }

    public Gerant getGerantById(Long id) {
        return gerantRepository.findById(id).orElse(null);
    }

    public Gerant createGerant(Gerant gerant) {
        return gerantRepository.save(gerant);
    }

    public Gerant updateGerant(Long id, Gerant gerantDetails) {
        Gerant gerant = gerantRepository.findById(id).orElse(null);
        if (gerant != null) {
            // Update gerant details
            return gerantRepository.save(gerant);
        }
        return null;
    }

    public void deleteGerant(Long id) {
        gerantRepository.deleteById(id);
    }
}
