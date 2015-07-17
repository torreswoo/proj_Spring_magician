package kr.bankspring.study.step03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String [] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("kr/bankspring/study/step03/application-context.xml");
		FireBallBullet bean = context.getBean(FireBallBullet.class);
		
		Magician fireBallMagician = context.getBean("fireBallMagician", Magician.class);
		Magician iceStromMagician = context.getBean("iceStromMagician", Magician.class);
		Magician lightningBallMagician = context.getBean("lightningBallMagician", Magician.class);
		
		fireBallMagician.magic();
		iceStromMagician.magic();
		lightningBallMagician.magic();
		
		
	}
}
