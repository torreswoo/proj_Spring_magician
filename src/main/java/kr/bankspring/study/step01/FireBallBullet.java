package kr.bankspring.study.step01;


public class FireBallBullet implements MagicSystem{

	@Override
	public void magic() {
		System.out.println("파이어볼 발사");
	}

	@Override
	public String showMagicName() {
		return "파이어볼";
	}

}
