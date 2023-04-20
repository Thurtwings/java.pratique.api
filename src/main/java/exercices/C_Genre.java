package exercices;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class C_Genre
{
    @Id
    @GeneratedValue
    private int id;
    private String nom;

    public C_Genre(int id, String nom)
    {
        this.id = id;
        this.nom = nom;
    }

    public C_Genre()
    {

    }

    public int getId()
    {

        return id;
    }

    public void setId(int id)
    {

        this.id = id;
    }

    public String getNom()
    {

        return nom;
    }

    public void setNom(String nom)
    {

        this.nom = nom;
    }

}
