package exercices.Controllers;

import exercices.C_Livres;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/livre")
public class Controller_Livre
{
    public List<C_Livres> livres = new ArrayList<C_Livres>();

    @GetMapping
    public List<C_Livres> getLivres()
    {
        livres.add(new C_Livres());
        return livres;
    }

}
