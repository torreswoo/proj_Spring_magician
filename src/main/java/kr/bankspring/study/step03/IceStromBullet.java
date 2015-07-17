package kr.bankspring.study.step03;

public class IceStromBullet implements MagicSystem {

	@Override
	public void magic() {
		System.out.println("아이스블랫톰 발사");

	}

	@Override
	public String showMagicName() {
		// TODO Auto-generated method stub
		return "아이스블랫톰";
	}

}
