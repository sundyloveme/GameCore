package d_test.main;

import java.awt.Event;
import java.awt.Point;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;

import com.rupeng.game.GameCore;
import com.sundy.www.gamecore.GameImage;
import com.sundy.www.gamecore.GameSprite;
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
		/*
		 * 填写测试代码
		 */
		GameCore.setGameTitle("猴赛雷偷桃(￣▽￣)");// 加载标题
		GameCore.loadBgView("白色.jpg");// 加载背景
		
		GameSprite spHouZi = new GameSprite("houzi", 40, 50);// 猴子精灵
		spHouZi.playSpriteAnimate("tou");// 播放猴子
		
		GameCore.pause(99999);//暂停
	}

	public static void main(String[] args)
	{
		GameCore.start(new Main());
	}
}
