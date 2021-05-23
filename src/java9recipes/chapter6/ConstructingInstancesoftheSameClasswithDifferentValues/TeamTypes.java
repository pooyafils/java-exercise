
package java9recipes.chapter6.ConstructingInstancesoftheSameClasswithDifferentValues;

import java9recipes.chapter6.Player;

import java.util.List;

/**
 * Recipe 5-6
 * 
 * Defining an Interface for a Class
 * 
 * @author juneau
 */
public interface TeamTypes {
    
    void setPlayers(List<Players> players);
    void setName(String name);
    void setCity(String city);
    String getFullName();

}
