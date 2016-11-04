import java.util.logging.Level;
import java.util.Set;
import java.util.HashSet;
import java.util.logging.Logger;

public class CompteCourant extends Compte {
   private double plafondDeDecouvert;
   
   public void setPlafondDeDecouvert(double value) {
   
      				log.log(Level.FINE, "change plafondDeDecouvert");
      this.plafondDeDecouvert = value;
   }
   
   public double getPlafondDeDecouvert() {
      return this.plafondDeDecouvert;
   }
   
   private double tauxAgios;
   
   public void setTauxAgios(double value) {
   
      				log.log(Level.FINE, "change tauxAgios");
      this.tauxAgios = value;
   }
   
   public double getTauxAgios() {
      return this.tauxAgios;
   }
   
   /**
    * <pre>
    *           0..*     1..*
    * CompteCourant ------------------------- Virement
    *           compteCourant        &gt;       virement
    * </pre>
    */
   private Set<Virement> virement;
   
   public Set<Virement> getVirement() {
      if (this.virement == null) {
         this.virement = new HashSet<Virement>();
      }
      return this.virement;
   }
   
      private static final Logger log = Logger.getLogger("CompteCourant");
   }
