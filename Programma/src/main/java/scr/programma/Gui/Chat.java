package scr.programma.Gui;

import org.bukkit.Bukkit;

import javax.swing.*;

public class Chat {
    public JButton button = new JButton("Chat");


    public Chat(){
        button.addActionListener(e -> {
            JFrame frame = new JFrame();
            frame.setSize(500,500);
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JTextPane textPane = new JTextPane();
            JButton start = new JButton();

            frame.add(textPane).setBounds(10,100,100,100);
            frame.add(start).setBounds(10,300,100,100);

            start.addActionListener(e1 -> {
                Bukkit.getServer().broadcastMessage(textPane.getText());
            });
        });
    }
}
