package listeners;

public class CoolEvent {

		private int x;
		private int y;
		private String whatHappened;
		public CoolEvent(int x, int y, String whatHappened) {
			this.x = x;
			this.y = y;
			this.whatHappened = whatHappened;
		}
		
		public int getX() {
			return this.x;
		}
		public int getY() {
			return this.y;
		}
		public String whatHappened() {
			return this.whatHappened;
		}
}
