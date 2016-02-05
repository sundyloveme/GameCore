package main;

import java.awt.Event;
import java.awt.Point;
import java.awt.event.KeyEvent;

import com.rupeng.game.GameCore;
import com.sundy.www.gamecore.GameImage;
import com.sundy.www.gamecore.GameSprite;
import com.sundy.www.gamecore.GameText;

public class Main implements Runnable
{

	@Override
	public void run()
	{
		GameSprite sp1=new GameSprite("guizi");
		sp1.playSpriteAnimate("beginrun");
		sp1.setPosition(80, 80);
		
		GameSprite sp2=new GameSprite("guizi");
		sp2.playSpriteAnimate("beginrun");
		
		while(true)
		{
			int kc=GameCore.getPressedKeyCode();
			if(kc==KeyEvent.VK_UP)
			{
				sp1.moveUp();
			}
			if(kc==KeyEvent.VK_DOWN)
			{
				sp1.moveDown();
			}
			if(kc==KeyEvent.VK_LEFT)
			{
				sp1.moveLeft();
			}
			if(kc==KeyEvent.VK_RIGHT)
			{
				sp1.moveRight();
			}
			//相交
			if(sp1.xiangJiao(sp2))
			{
				System.out.println("相交");
			}
			
			GameCore.pause(2);
		}
		
		
		//GameCore.pause(100000);
	}

	public static void main(String[] args)
	{
		GameCore.start(new Main());
	}

}
