
package java9recipes.chapter5.ConstructingInstancesoftheSameClasswithDifferentValues;

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
