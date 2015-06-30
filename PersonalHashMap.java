import java.util.Map;
import java.util.HashMap;

class PersonalHashMap {
	public static void main(String[] agrs){
		Map<String, String> personalMap = new HashMap<String, String>();
		//so far it seems that I tend to forget '()' when I"m creating/?instansiating a new object
		personalMap.put("Name", "Talon");
		personalMap.put("Breed", "Saiya-Jin");
		personalMap.put("Class", "Alpha");
		personalMap.put("Affinity", "Lighting");
		personalMap.put("Mode", "Selective-Stealth");
		System.out.println("Contents of my map :\n"+personalMap);
		/*  from TutorialsPoint:
		 *	This class makes no guarantees as to the iteration order of the map; in particular, 
		 *	it does not guarantee that the order will remain constant over time.
		*/
		System.out.println("\n\nThe Key Set of my map are: "+personalMap.keySet());
		System.out.println("\nMy Breed is of the :"+personalMap.get("Breed")+": class");
	}
}