import java.util.logging.Level;
import java.util.Set;
import java.util.HashSet;
import java.util.logging.Logger;

public class Virement {
   private double somme;
   
   private void setSomme(double value) {
   
      				log.log(Level.FINE, "change somme");
      this.somme = value;
   }
   
   private double getSomme() {
      return this.somme;
   }
   
   /**
    * <pre>
    *           1..*     0..*
    * Virement ------------------------- CompteCourant
    *           virement        &lt;       compteCourant
    * </pre>
    */
   private Set<CompteCourant> compteCourant;
   
   public Set<CompteCourant> getCompteCourant() {
      if (this.compteCourant == null) {
         this.compteCourant = new HashSet<CompteCourant>();
      }
      return this.compteCourant;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * Virement ------------------------- CompteAssuranceVie
    *           virement        &gt;       compteAssuranceVie
    * </pre>
    */
   private Set<CompteAssuranceVie> compteAssuranceVie;
   
   public Set<CompteAssuranceVie> getCompteAssuranceVie() {
      if (this.compteAssuranceVie == null) {
         this.compteAssuranceVie = new HashSet<CompteAssuranceVie>();
      }
      return this.compteAssuranceVie;
   }
   
      private static final Logger log = Logger.getLogger("Virement");
   }
