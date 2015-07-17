package kr.bankspring.study.step03;

public class Magician {

	private MagicSystem magicSystem;
	
	
	public Magician(MagicSystem magicSystem){
		this.magicSystem = magicSystem;
	}
	
	public void magic(){
		magicSystem.magic();
	}
	
	public void changeMagicSystem(MagicSystem magicSystem){
		this.magicSystem = magicSystem;
	}
}
