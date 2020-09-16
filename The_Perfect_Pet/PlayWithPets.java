import java.io.*;
import java.util.ArrayList;

public interface PlayWithPets extends Serializable  {
	
	public void createNewPets(String name, String color, String type);
	
	public void putPetsToSleep();
	
	public void feedPets(); 
	
	public void monkeyMakeNoise();
	
	public void getHungerLevel();
	
	public void getAllPets();
	
	public void walkDog();
	
	public void growAllPets();
	
	public static void savePets(ArrayList<Pet> pets, String fileLocation) {

		try {    
            FileOutputStream file = new FileOutputStream(fileLocation); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            out.writeObject(pets); 
                          
            out.close(); 
            file.close(); 
                
        } catch(IOException e) { 
        	e.printStackTrace();
        }
	}
	
	public static ArrayList<Pet> readSavedPets(String fileLocation){
		ArrayList<Pet> pets = new ArrayList<Pet>();
		try{    
            FileInputStream file = new FileInputStream(fileLocation); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            pets = (ArrayList<Pet>)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            return pets;
        }catch(IOException e) { 
            
        } catch (ClassNotFoundException e) {
			
		} 
		
		return pets;
	}
}
