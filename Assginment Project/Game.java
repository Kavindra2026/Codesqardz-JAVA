/*< applet code="Game.class" height=500 width=600>
</applet>
*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Game extends Applet implements ActionListener {
  int y3, x4, y4, z1, z2, r1, r2, r3;
  int x1 = 20, x2 = 60, y1 = 30, y2 = 200, x3, w;
  Color c1, c2;
  Panel p1, p2;
  Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;

  public void init() {
    c1 = new Color(r1, r2, r3);
    setLayout(null);
    p1 = new Panel();
    p2 = new Panel();
    b1 = new Button("START");
    b2 = new Button("STOP");
    b3 = new Button("RED");
    b4 = new Button("GREEN");
    b5 = new Button("BLUE");
    b4.setBounds(200, 350, 40, 30);
    b5.setBounds(250, 350, 40, 30);
    p1.setBounds(60, 440, 400, 30);
    p2.setBounds(20, 470, 600, 30);
    p1.add(b1);
    p1.add(b2);
    p2.add(b3);
    p2.add(b4);
    p2.add(b5);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6 = new Button("PINK");
    p2.add(b6);
    b6.addActionListener(this);
    b7 = new Button("ORANGE");
    p2.add(b7);
    b7.addActionListener(this);
    b8 = new Button("YELLOW");
    p2.add(b8);
    b8.addActionListener(this);
    b9 = new Button("MAGENTA");
    p2.add(b9);
    b9.addActionListener(this);
    b10 = new Button("BLACK");
    p2.add(b10);
    b10.addActionListener(this);
    add(p1);
    add(p2);
    setVisible(true);
  }

  public void paint(Graphics g) {
    g.setColor(c1);
    g.fillOval(x1, y1, 30, 30);
    g.fillOval(x2, y2, 30, 30);
    z1 = c1.getRGB();
    if (z1 == z2) {
      g.drawString("WIN", 50, 40);
    }
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b3) {
      c2 = Color.RED;
      z2 = c2.getRGB();
    }

    if (e.getSource() == b4) {
      c2 = Color.GREEN;
      z2 = c2.getRGB();
    }
    if (e.getSource() == b5) {
      c2 = Color.BLUE;
      z2 = c2.getRGB();
    }
    if (e.getSource() == b6) {
      c2 = Color.PINK;
      z2 = c2.getRGB();
    }
    if (e.getSource() == b7) {
      c2 = Color.ORANGE;
      z2 = c2.getRGB();
    }
    if (e.getSource() == b8) {
      c2 = Color.YELLOW;
      z2 = c2.getRGB();
    }
    if (e.getSource() == b9) {
      c2 = Color.MAGENTA;
      z2 = c2.getRGB();
    }
    if (e.getSource() == b10) {
      c2 = Color.BLACK;
      z2 = c2.getRGB();
    }

    if (e.getSource() == b1) {
      w = 1;
      new Thread1(this);
      new Thread2(this);
      new Thread3(this);
      new Thread4(this);
      new Thread5(this);
      new Thread6(this);
      new Thread7(this);
      new Thread8(this);
      new Thread9(this);
    }
    if (e.getSource() == b2) {
      w = 0;
    }
  }
}

class Thread1 extends Thread {

  Game ball;

  public Thread1(Game ball) {
    this.ball = ball;
    start();
  }

  public void run() {
    System.out.println("THREAD1");
    while (ball.w == 1) {

      if (ball.x1 >= 495) {
        ball.x1 = 0;
      }
      if (ball.x2 >= 495) {
        ball.x2 = 20;
      }
      if (ball.y1 >= 390) {
        ball.y1 = 30;
      }
      if (ball.y2 >= 395) {
        ball.y2 = 0;
      } else {
        ball.x1 = ball.x1 + 10;
        ball.x2 = ball.x2 + 5;
        ball.y1 = ball.y1 + 4;
        ball.y2 = ball.y2 + 3;
      }
      ball.repaint();
    }
    try {
      Thread.sleep(50000);
    } catch (Exception e1) {
      e1.printStackTrace();
    }
  }
}

class Thread2 extends Thread {
  Game ball;

  Thread2(Game ball) {
    this.ball = ball;
    start();
  }

  public void run() {
    while (ball.w == 1) {
      ball.c1 = Color.red;
      ball.repaint();
    }
    try {
      Thread.sleep(50000);
    } catch (Exception e1) {
      e1.printStackTrace();
    }
  }
}

class Thread3 extends Thread {
  Game ball;

  Thread3(Game ball) {
    this.ball = ball;
    start();
  }

  public void run() {
    System.out.println("THREAD3");
    while (ball.w == 1) {
      ball.c1 = Color.GREEN;
      ball.repaint();
    }
    try {
      Thread.sleep(50000);
    } catch (Exception e1) {
      e1.printStackTrace();
    }
  }
}

class Thread4 extends Thread {
  Game ball;

  Thread4(Game ball) {
    this.ball = ball;
    start();
  }

  public void run() {
    System.out.println("THREAD4");
    while (ball.w == 1) {
      ball.c1 = Color.BLUE;
      ball.repaint();
    }
    try {
      Thread.sleep(50000);
    } catch (Exception e1) {
      e1.printStackTrace();
    }
  }
}

class Thread5 extends Thread {
  Game ball;

  Thread5(Game ball) {
    this.ball = ball;
    start();
  }

  public void run() {
    System.out.println("THREAD5");
    while (ball.w == 1) {
      ball.c1 = Color.PINK;
      ball.repaint();
    }
    try {
      Thread.sleep(50000);
    } catch (Exception e1) {
      e1.printStackTrace();
    }
  }
}

class Thread6 extends Thread {
  Game ball;

  Thread6(Game ball) {
    this.ball = ball;
    start();
  }

  public void run() {
    while (ball.w == 1) {
      ball.c1 = Color.orange;
      ball.repaint();
    }
    try {
      Thread.sleep(50000);
    } catch (Exception e1) {
      e1.printStackTrace();
    }
  }
}

class Thread7 extends Thread {
  Game ball;

  Thread7(Game ball) {
    this.ball = ball;
    start();
  }

  public void run() {
    while (ball.w == 1) {
      ball.c1 = Color.YELLOW;
      ball.repaint();
    }
    try {
      Thread.sleep(50000);
    } catch (Exception e1) {
      e1.printStackTrace();
    }
  }
}

class Thread8 extends Thread {
  Game ball;

  Thread8(Game ball) {
    this.ball = ball;
    start();
  }

  public void run() {
    while (ball.w == 1) {
      ball.c1 = Color.MAGENTA;
      ball.repaint();
    }
    try {
      Thread.sleep(50000);
    } catch (Exception e1) {
      e1.printStackTrace();
    }
  }
}

class Thread9 extends Thread {
  Game ball;

  Thread9(Game ball) {
    this.ball = ball;
    start();
  }

  public void run() {
    while (ball.w == 1) {
      ball.c1 = Color.BLACK;
      ball.repaint();
    }
    try {
      Thread.sleep(50000);
    } catch (Exception e1) {
      e1.printStackTrace();
    }
  }
}
