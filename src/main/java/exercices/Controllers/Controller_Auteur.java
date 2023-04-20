package exercices.Controllers;

import exercices.C_Auteur;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auteur")
public class Controller_Auteur
{
    public List<C_Auteur> auteurs = new ArrayList<C_Auteur>();

    @GetMapping
    public List<C_Auteur> getAuteurs()
    {
        auteurs.add(new C_Auteur());
        return auteurs;
    }
}
