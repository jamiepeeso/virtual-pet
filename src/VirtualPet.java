
public class VirtualPet {

	int hungerLevel;
	int tiredLevel;
	int boredLevel;

	boolean dragonLives() {
		if (boredLevel < 50 && hungerLevel < 50 && tiredLevel < 50) {
			return true;
		} else {
			return false;
		}
	}
	String dragonPicture = ("\r\n" + 
			"        ,----..___    ,.-''````''-.\r\n" + 
			"     ,'`      _,..>-'`             `.           -ART BY-\r\n" + 
			"    /                                `.          -ZEUS-\r\n" + 
			"   /                    .-\"\"\"-.        '.\r\n" + 
			"  (                ,.-.`       `.        `,\r\n" + 
			"  |                 \\/           \\        (_   __..  _,......_\r\n" + 
			"   \\                `;           ;          `Y`    `Y         `',\r\n" + 
			"    \\                \\           /\\         /     /`             \\\r\n" + 
			"     \\                '.       .'--`       `     /      c=,       `\r\n" + 
			"      `,                '-----'                 (          `       |\r\n" + 
			"        \\                                                           \\\r\n" + 
			"         |                                                           \\\r\n" + 
			"         \\              `--._             _,..-----....__     _....___)\r\n" + 
			"          |                  ``''--....-'`       __,.-`  `````\r\n" + 
			"          )                               ,.--'``\r\n" + 
			"         /                           ,.-'`\r\n" + 
			"        /                        ,-'`\r\n" + 
			"       /                       /`\r\n" + 
			"      /                      ,/\r\n" + 
			"                            /\r\n" + 
			"                           /");
	
	void tick() {
		hungerLevel = hungerLevel + 5;
		tiredLevel = tiredLevel + 5;
		boredLevel = boredLevel + 5;
	}

	void comandFeed() {
		hungerLevel = hungerLevel - 25;
		tiredLevel = tiredLevel + 10;
		boredLevel = boredLevel - 5;
	}

	void comandSleep() {
		hungerLevel = hungerLevel + 10;
		tiredLevel = tiredLevel - 30;
		boredLevel = boredLevel + 5;
	}

	void comandPlay() {
		hungerLevel = hungerLevel + 15;
		tiredLevel = tiredLevel + 20;
		boredLevel = boredLevel - 25;
	}
}

// Required in VirtualPet class
// + - [ ] Create a `tick()` method that represents the passage of time.
// + - [ ] Create at least three instance variables (aka attributes aka
// properties aka fields).
// + - [ ] Create at least three methods (messages you send to your pet).