package kr.bankspring.study.step01;

public class MainFactory {

	public static void main(String[] args) {
		
		MagicianFactory factory = new MagicianFactory();
		// Magician을 생성하는 주체는 Factory가 된다.
		// 결합도를 낮추기위해서 생성을 어플리케이션에서 하는 것이아니라 팩토리한테 생성을시키고, 요청을하는 것이다.

	//	1. MagicianEnum = "아이스블랫톰", "파이어볼", "라이트링"
	
	//  2. 클래스를 던진다.
		
		Magician magician1 = factory.getMagician(FireBallBullet.class);
		Magician magician2 = factory.getMagician(IceStromBullet.class);
		Magician magician3 = factory.getMagician(LightningBullet.class);
		
		
		magician1.magic();
		magician2.magic();
		magician3.magic();

	}

}
