package kr.bankspring.study.step01;

public class MagicianFactory {
	
	final String fireBall = FireBallBullet.class.getName();
	
	public Magician getMagician(Class magicSystemName){
		MagicSystem magicSystem ;
		
		String typeName = magicSystemName.getName();
		if(typeName.equals(FireBallBullet.class.getName())){
			magicSystem = new FireBallBullet();
			
		}else if(typeName.equals(IceStromBullet.class.getName())){
			magicSystem = new IceStromBullet();
			
		}else if(typeName.equals(LightningBullet.class.getName())){
			magicSystem = new LightningBullet();
			
		}else{
			magicSystem = null;
		}
		
		Magician magician = new Magician(magicSystem);
		return magician;
	}

}
