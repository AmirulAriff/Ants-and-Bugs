package ants.and.bugs;


public class OrganismsFactory {
    
  public Organisms getOrganisms(int choice){
      
      if(choice == 1){
          return new Ants();
      }
      else if(choice == 2){
          return new Bugs();
      }
      return null;
  }
    
    
}
