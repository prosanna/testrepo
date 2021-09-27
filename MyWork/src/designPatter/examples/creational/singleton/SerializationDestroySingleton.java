/**
 * 
 */
package designPatter.examples.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author prosannam
 *
 */
public class SerializationDestroySingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			SingletonForSerialisation instance1 = SingletonForSerialisation.getInstance();
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
					"D:\\Study\\MyWork\\testrepo\\MyWork\\src\\designPatter\\examples\\creational\\singleton\\file.text"));
			out.writeObject(instance1);
			out.close();
			// deserialize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream(
					"D:\\Study\\MyWork\\testrepo\\MyWork\\src\\designPatter\\examples\\creational\\singleton\\file.text"));

			SingletonForSerialisation instance2 = (SingletonForSerialisation) in.readObject();
			System.out.println("instance1 hashCode:- " + instance1.hashCode());
			System.out.println("instance2 hashCode:- " + instance2.hashCode());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class SingletonForSerialisation implements Serializable {
	public static SingletonForSerialisation instance;

	private SingletonForSerialisation() {

	}

	public static SingletonForSerialisation getInstance() {
		if (instance == null) {
			instance = new SingletonForSerialisation();
		}
		return instance;
	}
	
	// This method is to stop creating duplicate object at the time of Deserialization 
	public Object readResolve() {
		return instance;
	}

}
