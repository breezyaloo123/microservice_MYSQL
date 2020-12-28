package com.example.projet.projet.Controller;



import com.example.projet.projet.EtudiantRepository;
import com.example.projet.projet.model.Etudiants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/mysql")
public class EtudiantController {

    @Autowired
   private EtudiantRepository repository;

//    @RequestMapping(value = "/etudiant",method = RequestMethod.GET)
//    public String getStudents()
//    {
//        return "cooool";
//    }

    @RequestMapping(path = "/addEtudiant")
        public Boolean addEtudiant(@RequestParam(name = "num_etudiant",defaultValue = "null") String num_etudiant,@RequestParam(name = "prenom",defaultValue =
    "null") String prenom,@RequestParam(name = "nom",defaultValue = "null") String nom)
        {
            repository.save(new Etudiants(num_etudiant,prenom,nom));
            return true;
        }


    @GetMapping(path = "/etudiants")
    public List<Etudiants> getEtudiant()
    {
        return repository.findAll();
    }


    @PostMapping(path = "/addEtud")
    public @ResponseBody Etudiants addEtudiant(@RequestBody Etudiants p)
    {
        return repository.save(p);
    }
}
