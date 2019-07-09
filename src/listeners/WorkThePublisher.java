package listeners;

import java.util.Scanner;

public class WorkThePublisher {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Publicizer publicizer = new Publicizer();
		
		FirstOnTheSceneListener fots = new FirstOnTheSceneListener();
		GossipyListener gl = new GossipyListener();
		ConfusedListener cl = new ConfusedListener();
		
		publicizer.addListener(fots);
		publicizer.addListener(gl);
		publicizer.addListener(cl);
		
		while(true) {
			System.out.println("Tell me something coming up and where...");
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			String whatHappened = scanner.nextLine();
			publicizer.publicizeIfCool(x,y,whatHappened);
		}
	}

}
