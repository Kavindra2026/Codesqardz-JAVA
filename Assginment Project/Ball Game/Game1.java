import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game1 extends JPanel implements ActionListener {
  int y3, x4, y4, z1, z2, r1, r2, r3;
  int x1 = 600, x2 = 700, y1 = 80, y2 = 200, x3, w;
  Color c1, c2;
  JPanel p1, p2;
  JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;

  public void init() {
    c1 = new Color(r1, r2, r3);
    setLayout(null);

    p1 = new JPanel();
    p2 = new JPanel();
    b1 = new JButton("START");
    b2 = new JButton("STOP");

    // Button jframe
    b3 = new JButton("RED");
    b4 = new JButton("GREEN");
    b5 = new JButton("BLUE");
    b7 = new JButton("ORANGE");
    b6 = new JButton("PINK");
    b8 = new JButton("YELLOW");
    b9 = new JButton("MAGENTA");
    b10 = new JButton("BLACK");

    // dirction of ball and button
    b4.setBounds(1300, 400, 40, 30);
    b5.setBounds(1300, 400, 40, 30);
    p1.setBounds(480, 550, 400, 30);
    p2.setBounds(400, 580, 600, 30);

    p1.add(b1);
    p1.add(b2);
    p2.add(b3);
    p2.add(b4);
    p2.add(b5);
    p2.add(b6);
    p2.add(b7);
    p2.add(b7);
    p2.add(b8);
    p2.add(b9);
    p2.add(b10);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b10.addActionListener(this);

    // set Button color
    b3.setBackground(Color.RED);
    b4.setBackground(Color.GREEN);
    b5.setBackground(Color.BLUE);
    b6.setBackground(Color.PINK);
    b7.setBackground(Color.ORANGE);
    b8.setBackground(Color.YELLOW);
    b9.setBackground(Color.MAGENTA);
    b10.setBackground(Color.BLACK);

    add(p1);
    add(p2);

    setVisible(true);
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.setColor(c1);
    g.fillOval(x1, y1, 50, 50);
    g.fillOval(x2, y2, 50, 50);

    z1 = c1.getRGB();
    if (z1 == z2) {
      g.setFont(new Font("Arial", Font.BOLD, 50));
      g.drawString("WIN", 20, 50);

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
      c2 = Color.orange;
      z2 = c2.getRGB();
    }
    if (e.getSource() == b8) {
      c2 = Color.yellow;
      z2 = c2.getRGB();
    }
    if (e.getSource() == b9) {
      c2 = Color.magenta;
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

  public static void main(String[] args) {

    JFrame jf = new JFrame();
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Heading
    JLabel heading = new JLabel("Ball Game");
    heading.setFont(new Font("Arial", Font.BOLD, 30));
    heading.setHorizontalAlignment(SwingConstants.CENTER);
    heading.setForeground(Color.BLUE);
    Game1 gamePanel = new Game1();
    gamePanel.init();
    JPanel wrapper = new JPanel();
    wrapper.setLayout(new BorderLayout());
    wrapper.add(heading, BorderLayout.NORTH);
    wrapper.add(gamePanel, BorderLayout.CENTER);
    jf.setContentPane(wrapper);
    jf.pack();
    jf.setLocationRelativeTo(null);
    jf.setVisible(true);
    jf.setSize(1000, 800);
    jf.setLocationRelativeTo(null);
    Game1 ps = new Game1();
    ps.init();
    jf.getContentPane().add(ps);
    jf.setVisible(true);
  }
}

class Thread1 extends Thread {
  Game1 ball;

  Thread1(Game1 ball) {
    this.ball = ball;
    start();
  }

  public void run() {
    System.out.println("THREAD1");
    while (ball.w == 1) {
      if (ball.x1 >= 1300)
        ball.x1 = 300;
      if (ball.x2 >= 1300)
        ball.x2 = 300;
      if (ball.y1 >= 400)
        ball.y1 = 100;
      if (ball.y2 >= 400)
        ball.y2 = 100;

      else {
        ball.x1 = ball.x1 + 10;
        ball.x2 = ball.x2 + 4;
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
  Game1 ball;

  Thread2(Game1 ball) {
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
  Game1 ball;

  Thread3(Game1 ball) {
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
  Game1 ball;

  Thread4(Game1 ball) {
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
  Game1 ball;

  Thread5(Game1 ball) {
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
  Game1 ball;

  Thread6(Game1 ball) {
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
  Game1 ball;

  Thread7(Game1 ball) {
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
  Game1 ball;

  Thread8(Game1 ball) {
    this.ball = ball;
    start();
  }

  public void run() {
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

class Thread9 extends Thread {
  Game1 ball;

  Thread9(Game1 ball) {
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