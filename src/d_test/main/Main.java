package d_test.main;

import java.awt.Event;
import java.awt.Point;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;

import com.rupeng.game.GameCore;
import com.sundy.www.gamecore.GameImage;
import com.sundy.www.gamecore.GameSprite;
import com.sundy.www.gamecore.GameSpriteCoin;
import com.sundy.www.gamecore.GameText;

/**
 * 
 * @author Sundy
 * 
 */
public class Main implements Runnable
{

	@Override
	public void run()
	{
		GameImage im = new GameImage("µ°µ°.jpg", 40, 40);

		while (true)
		{
			int kc = GameCore.getPressedKeyCode();
			switch (kc)
			{

			case KeyEvent.VK_RIGHT:
				GameCore.setImagePosition(0, GameCore.getImageX(0) + 1,
						GameCore.getImageY(0)-40);
				GameCore.showImage(0);
				break;
			// case KeyEvent.VK_LEFT:
			// im.moveLeft();
			// break;
			}

		}

	}

	public static void main(String[] args)
	{
		GameCore.start(new Main());
	}
}
