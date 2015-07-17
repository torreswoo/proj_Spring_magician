package kr.bankspring.study.step01;

// 전략패턴 http://blog.hanpo.tw/2011/06/strategy-pattern.html
// 런타임시에 알고리즘을 선택/교체 가능하게 해주는 디자인 패턴
// 상호교환이 가능한 부품들의 느슨한-결합(loosely coupled)을 통해 소프트웨어를 구성할 수 있도
// 느슨한-결합(loosely coupled)은 소프트웨어를 보다 확장성있고 재사용성이 뛰어나게, 유지보수가 쉽도
// 메모리에 뜬 객체들을 인스턴스화 
// 스프링은 전략패턴이 많다.

public class Main {

	public static void main(String[] args) {

		MagicSystem fireBallBullet = new FireBallBullet();
		Magician magician = new Magician(fireBallBullet);
		magician.magic();
		
		MagicSystem iceStromBullet = new IceStromBullet();
		magician.changeMagicSystem(iceStromBullet);
		magician.magic();
		
		MagicSystem lightningBullet = new LightningBullet();		
		magician.changeMagicSystem(lightningBullet);
		magician.magic();

	}

}
