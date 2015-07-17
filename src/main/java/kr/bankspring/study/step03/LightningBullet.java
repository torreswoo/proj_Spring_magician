package kr.bankspring.study.step03;

public class LightningBullet implements MagicSystem {

	@Override
	public void magic() {
		System.out.println("라이트링 발사");

	}

	@Override
	public String showMagicName() {
		// TODO Auto-generated method stub
		return "라이트링";
	}

}
