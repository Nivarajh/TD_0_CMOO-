import java.util.Set;
import java.util.HashSet;
import java.util.logging.Logger;

public class Client {
   /**
    * <pre>
    *           1..1     1..*
    * Client ------------------------- Compte
    *           client        &gt;       compte
    * </pre>
    */
   private Set<Compte> compte;
   
   public Set<Compte> getCompte() {
      if (this.compte == null) {
         this.compte = new HashSet<Compte>();
      }
      return this.compte;
   }
   
      private static final Logger log = Logger.getLogger("Client");
   }
