package April12ArrayObject;

import java.util.Arrays;
import java.util.Scanner;

class Theter {
	int id;
	String name;
	String location;
	int screen[];

	public Theter(int id, String name, String location, int screen[]) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.screen = screen;
	}

//	public String toString() {
//		return "thetre id=" + id + "Thetre name=" + name + "Thetre location=" + location + "Screen"
//				+ Arrays.toString(screen);
//
//	}
	@Override
	public String toString() {
		return "Theter [id=" + id + ", name=" + name + ", location=" + location + ", screen=" + Arrays.toString(screen)
				+ "]";
	}
}

	public class ObjectArray {

		public static void main(String[] args) {
			Theter[] t = new Theter[4];
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < t.length; i++) {
				System.out.println("enter theter id");
				int id = sc.nextInt();

				System.out.println("enter theter name");
				String name = sc.next();

				System.out.println("enter theter location");
				String location = sc.next();

				System.out.println("enter size of screen");
				int size = sc.nextInt();

				int scr[] = new int[size];
				for (int j = 0; j < size; j++) {
					//
					scr[j] = sc.nextInt();
					

				}
				t[i] = new Theter(id, name, location, scr);
			}
			System.out.println("......");
			for (int i = 0; i < t.length; i++)
				System.out.println(t[i]);

		}

	}


