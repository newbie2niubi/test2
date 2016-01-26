import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
	public static void main(String[] args){
		System.out.println("Reading Objects...");
		try (ObjectInputStream os = new ObjectInputStream(new FileInputStream("test.ser"))){
			Person person = (Person)os.readObject();
			System.out.println(person);
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
