package exercices;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class C_Auteur
{
    @Id
    @GeneratedValue
    private int id;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String dateMort;
    private String biblographie;

   @OneToMany(cascade = CascadeType.ALL)
    private List<C_Genre> genres;
    @OneToMany(cascade = CascadeType.ALL)
    private List<C_Livres> livres;

    public C_Auteur(int id, String nom, String prenom, String dateNaissance, String dateMort, String biblographie, List<C_Genre> genres, List<C_Livres> livres)
    {

        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.dateMort = dateMort;
        this.biblographie = biblographie;
        this.genres = genres;
        this.livres = livres;
    }

    public C_Auteur()
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

    public String getPrenom()
    {

        return prenom;
    }

    public void setPrenom(String prenom)
    {

        this.prenom = prenom;
    }

    public String getDateNaissance()
    {

        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance)
    {

        this.dateNaissance = dateNaissance;
    }

    public String getDateMort()
    {

        return dateMort;
    }

    public void setDateMort(String dateMort)
    {

        this.dateMort = dateMort;
    }

    public String getBiblographie()
    {

        return biblographie;
    }

    public void setBiblographie(String biblographie)
    {

        this.biblographie = biblographie;
    }

    public List<C_Genre> getGenres()
    {

        return genres;
    }

    public void setGenres(List<C_Genre> genres)
    {

        this.genres = genres;
    }

    public List<C_Livres> getLivres()
    {

        return livres;
    }

    public void setLivres(List<C_Livres> livres)
    {

        this.livres = livres;
    }

}
