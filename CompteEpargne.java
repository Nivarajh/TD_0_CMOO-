import java.util.logging.Level;
import java.util.logging.Logger;

public class CompteEpargne extends Compte {
   private double tauxInteret;
   
   private void setTauxInteret(double value) {
   
      				log.log(Level.FINE, "change tauxInteret");
      this.tauxInteret = value;
   }
   
   private double getTauxInteret() {
      return this.tauxInteret;
   }
   
   private double plancher;
   
   private void setPlancher(double value) {
   
      				log.log(Level.FINE, "change plancher");
      this.plancher = value;
   }
   
   private double getPlancher() {
      return this.plancher;
   }
   
   public void verserInterets() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   private double calculerInterests() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public double debiter() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
      private static final Logger log = Logger.getLogger("CompteEpargne");
   }
