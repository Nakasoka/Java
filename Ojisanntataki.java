package sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class Ojisann1 extends TimerTask {	//アイコンが一つずつ変わる
	
	
	public void run() {
		Random r = new Random();

			int i = r.nextInt(5);	//0～4までの値をランダムで渡す
			if(i==0) {
				Ojisanntataki.action=0;	//actionPerformedに渡す値
				Ojisanntataki.center.setIcon(new ImageIcon("ButtonSelect1.jpg"));//centerが農家のおじさんに変わる
				Ojisanntataki.north.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				Ojisanntataki.south.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				Ojisanntataki.east.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				Ojisanntataki.west.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				
			}
			else if(i==1) {
				Ojisanntataki.action=1;
				Ojisanntataki.north.setIcon(new ImageIcon("ButtonSelect1.jpg"));//northが農家のおじさんに変わる
				Ojisanntataki.center.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				Ojisanntataki.south.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				Ojisanntataki.east.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				Ojisanntataki.west.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				
			}
			else if(i==2) {
				Ojisanntataki.action=2;
				Ojisanntataki.south.setIcon(new ImageIcon("ButtonSelect1.jpg"));//southが農家のおじさんに変わる
				Ojisanntataki.north.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				Ojisanntataki.center.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				Ojisanntataki.east.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				Ojisanntataki.west.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				
			}
			else if(i==3) {
				Ojisanntataki.action=3;
				Ojisanntataki.east.setIcon(new ImageIcon("ButtonSelect1.jpg"));//eastが農家のおじさんに変わる
				Ojisanntataki.north.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				Ojisanntataki.south.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				Ojisanntataki.center.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				Ojisanntataki.west.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				
			}
			else if(i==4) {
				Ojisanntataki.action=4;
				Ojisanntataki.west.setIcon(new ImageIcon("ButtonSelect1.jpg"));//westが農家のおじさんに変わる
				Ojisanntataki.north.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				Ojisanntataki.south.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				Ojisanntataki.east.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				Ojisanntataki.center.setIcon(new ImageIcon("ButtonSelect2.jpg"));
				Ojisanntataki.action=4;
			}
	}
}

class Ojisann2 extends TimerTask {	//二つ同時にアイコンが変わる
	
	public void run() {
		Random r = new Random();
		
		int i = r.nextInt(6);		//0～５までの値をランダムで渡す
		if(i==0) {					//south,northが農家のおじさんに変わる
			Ojisanntataki.action=5; //アクションリスナーに渡す値
			Ojisanntataki.center.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			Ojisanntataki.north.setIcon(new ImageIcon("ButtonSelect1.jpg"));
			Ojisanntataki.south.setIcon(new ImageIcon("ButtonSelect1.jpg"));
			Ojisanntataki.east.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			Ojisanntataki.west.setIcon(new ImageIcon("ButtonSelect2.jpg"));
		}
		else if(i==1) {				//east,west
			Ojisanntataki.action=6;
			Ojisanntataki.north.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			Ojisanntataki.center.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			Ojisanntataki.south.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			Ojisanntataki.east.setIcon(new ImageIcon("ButtonSelect1.jpg"));
			Ojisanntataki.west.setIcon(new ImageIcon("ButtonSelect1.jpg"));
		}
		else if(i==2) {				//north,east
			Ojisanntataki.action=7;
			Ojisanntataki.south.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			Ojisanntataki.north.setIcon(new ImageIcon("ButtonSelect1.jpg"));
			Ojisanntataki.center.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			Ojisanntataki.east.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			Ojisanntataki.west.setIcon(new ImageIcon("ButtonSelect1.jpg"));
		}
		else if(i==3) {				//east,south
			Ojisanntataki.action=8;
			Ojisanntataki.east.setIcon(new ImageIcon("ButtonSelect1.jpg"));
			Ojisanntataki.north.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			Ojisanntataki.south.setIcon(new ImageIcon("ButtonSelect1.jpg"));
			Ojisanntataki.center.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			Ojisanntataki.west.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			
		}
		else if(i==4) {				//south,west
			Ojisanntataki.action=9;
			Ojisanntataki.west.setIcon(new ImageIcon("ButtonSelect1.jpg"));
			Ojisanntataki.north.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			Ojisanntataki.south.setIcon(new ImageIcon("ButtonSelect1.jpg"));
			Ojisanntataki.east.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			Ojisanntataki.center.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			Ojisanntataki.action=9;
		}
		else if(i==5) {				//west,north
			Ojisanntataki.action=10;
			Ojisanntataki.west.setIcon(new ImageIcon("ButtonSelect1.jpg"));
			Ojisanntataki.north.setIcon(new ImageIcon("ButtonSelect1.jpg"));
			Ojisanntataki.south.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			Ojisanntataki.east.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			Ojisanntataki.center.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			Ojisanntataki.action=10;
		}
	}
}
class Ojisann3 extends TimerTask {	//centerのみ農家のおじさんに変わる
	
	public void run() {	
		Ojisanntataki.action=11;
		Ojisanntataki.west.setIcon(new ImageIcon("ButtonSelect2.jpg"));
		Ojisanntataki.north.setIcon(new ImageIcon("ButtonSelect2.jpg"));
		Ojisanntataki.south.setIcon(new ImageIcon("ButtonSelect2.jpg"));
		Ojisanntataki.east.setIcon(new ImageIcon("ButtonSelect2.jpg"));
		Ojisanntataki.center.setIcon(new ImageIcon("ButtonSelect1.jpg"));
	}
}


public class Ojisanntataki extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	static JButton center,north,south,east,west;
	static int action = -1;		//runメソッドに渡す値
	static int count=0;			//得点を加算していく値
	
	public Ojisanntataki(String title) {
		  super(title);
		  
		  setBounds(200, 200, 400, 400);
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  center = new JButton(new ImageIcon("ButtonSelect2.jpg"));	//ボタンを設定する
		  north = new JButton(new ImageIcon("ButtonSelect2.jpg"));
		  south = new JButton(new ImageIcon("ButtonSelect2.jpg"));
		  east = new JButton(new ImageIcon("ButtonSelect2.jpg"));
		  west = new JButton(new ImageIcon("ButtonSelect2.jpg"));
		  
		  center.addActionListener(this);//addActionListenerを設定する
		  north.addActionListener(this);
		  south.addActionListener(this);
		  east.addActionListener(this);
		  west.addActionListener(this);
		  		  
		  add("Center",center);	//ボタンを配置する
		  add("North",north);
		  add("South",south);
		  add("East",east);
		  add("West",west);
		  
		  Timer timer = new Timer(true);
		  
		  timer.schedule(new Ojisann1(),1000);//1秒ごとにOjisann1を呼び出す
		  timer.schedule(new Ojisann1(),2000);
		  timer.schedule(new Ojisann1(),3000);
		  timer.schedule(new Ojisann1(),4000);
		  timer.schedule(new Ojisann1(),5000);
		  timer.schedule(new Ojisann2(),6000);//1秒ごとにOjisann2を呼び出す
		  timer.schedule(new Ojisann2(),7000);
		  timer.schedule(new Ojisann2(),8000);
		  timer.schedule(new Ojisann2(),9000);
		  timer.schedule(new Ojisann2(),10000);
		  
		  timer.schedule(new Ojisann1(),11000);//0.5秒ごとにOjisann1を呼び出す
		  timer.schedule(new Ojisann1(),11500);
		  timer.schedule(new Ojisann1(),12000);
		  timer.schedule(new Ojisann1(),12500);
		  timer.schedule(new Ojisann1(),13000);
		  timer.schedule(new Ojisann2(),13500);//0.7秒ごとにOjisann2を呼び出す
		  timer.schedule(new Ojisann2(),14200);
		  timer.schedule(new Ojisann2(),14900);
		  timer.schedule(new Ojisann2(),15600);
		  timer.schedule(new Ojisann2(),16300);
		  
		  timer.schedule(new Ojisann1(),17000);//0.4秒ごとにOjisann1を呼び出す
		  timer.schedule(new Ojisann1(),17400);
		  timer.schedule(new Ojisann1(),17800);
		  timer.schedule(new Ojisann1(),18200);
		  timer.schedule(new Ojisann1(),18600);
		  timer.schedule(new Ojisann1(),19000);
		  timer.schedule(new Ojisann1(),19400);
		  timer.schedule(new Ojisann1(),19800);
		  timer.schedule(new Ojisann1(),20200);
		  timer.schedule(new Ojisann1(),20600);
		  timer.schedule(new Ojisann1(),21000);
		  
		  timer.schedule(new Ojisann3(),22000);//Ojisann3を呼び出す
		  
		  
		  setVisible(true);
		 }
	
	public static void main(String[] args) {
		new Ojisanntataki("おじさんたたき");
	}
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == north) {	//northをクリックしたとき
			if(action==1) {				//northが農家のおじさんに変わっているとき
				action=-1;				//actionを-1にして１クリックのみ判定
				count++;				//得点を加算
				Ojisanntataki.north.setIcon(new ImageIcon("ButtonSelect2.jpg"));//魚屋のおじさんに戻す
			}
			else if(action==5||action==7||action==10) {
				count++;
				Ojisanntataki.north.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			}
		}
		if(e.getSource() == west) {	//westをクリックしたとき
			if(action==4) {
				action=-1;
				count++;
				Ojisanntataki.west.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			}
			else if(action==6||action==9||action==10) {
				count++;
				Ojisanntataki.west.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			}
		}
		if(e.getSource() == south) {//southをクリックしたとき
			if(action==2) {
				action=-1;
				count++;
				Ojisanntataki.south.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			}
			else if(action==5||action==8||action==9) {
				count++;
				Ojisanntataki.south.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			}
		}
		if(e.getSource() == east) {	//eastをクリックしたとき
			if(action==3) {
				action=-1;
				count++;
				Ojisanntataki.east.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			}
			else if(action==6||action==7||action==8) {
				count++;
				Ojisanntataki.east.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			}
		}
		if(e.getSource() == center) {//centerをクリックしたとき
			if(action==0) {
				action=-1;
				count++;
				Ojisanntataki.center.setIcon(new ImageIcon("ButtonSelect2.jpg"));
			}
			else if(action==11) {	//Ojisann3でcenterをクリックしたとき
				action=-1;
				Ojisanntataki.center.setIcon(null);	//アイコンを削除する
				Ojisanntataki.north.setIcon(null);
				Ojisanntataki.south.setIcon(null);
				Ojisanntataki.east.setIcon(null);
				Ojisanntataki.west.setIcon(null);
				Ojisanntataki.center.setText("おめでとう!!あなたの得点は"+count+"点だよ!!");//得点をウィンドウに表示
			}
		}
		System.out.println(count);	//コンソールに現在の得点を表示
	}
}