package main;

import java.awt.Point;

import com.rupeng.game.GameCore;
import com.sundy.www.gamecore.GameImage;
import com.sundy.www.gamecore.GameSprite;
import com.sundy.www.gamecore.GameText;

public class Main implements Runnable
{

	@Override
	public void run()
	{
		GameImage img=new GameImage("µ∞µ∞.jpg");
		img.setImgName("√€∑‰.jpg");
		img.remove();
		
		
		GameCore.pause(100000);
	}

	public static void main(String[] args)
	{
		GameCore.start(new Main());
	}

}
