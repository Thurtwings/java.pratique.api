package exercices;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class C_Livres
{
    @Id
    @GeneratedValue
    private int id;
    private String titre;
    private String dateSortie;
    @OneToOne
    private C_Genre genre;
    private String synopsis;
    @OneToOne
    private C_Auteur auteur;
    private int nbrePages;
    private float prix;

    public C_Livres(int id, String titre, String dateSortie, C_Genre genre, String synopsis, C_Auteur auteur, int nbrePages, float prix)
    {

        this.id = id;
        this.titre = titre;
        this.dateSortie = dateSortie;
        this.genre = genre;
        this.synopsis = synopsis;
        this.auteur = auteur;
        this.nbrePages = nbrePages;
        this.prix = prix;
    }

    public C_Livres()
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

    public String getTitre()
    {

        return titre;
    }

    public void setTitre(String titre)
    {

        this.titre = titre;
    }

    public String getDateSortie()
    {

        return dateSortie;
    }

    public void setDateSortie(String dateSortie)
    {

        this.dateSortie = dateSortie;
    }

    public C_Genre getGenre()
    {

        return genre;
    }

    public void setGenre(C_Genre genre)
    {

        this.genre = genre;
    }

    public String getSynopsis()
    {
        return synopsis;
    }

    public void setSynopsis(String synopsis)
    {
        this.synopsis = synopsis;
    }

    public C_Auteur getAuteur()
    {
        return auteur;
    }

    public void setAuteur(C_Auteur auteur)
    {
        this.auteur = auteur;
    }

    public int getNbrePages()
    {
        return nbrePages;
    }

    public void setNbrePages(int nbrePages)
    {
        this.nbrePages = nbrePages;
    }

    public float getPrix()
    {
        return prix;
    }

    public void setPrix(float prix)
    {
        this.prix = prix;
    }

}
