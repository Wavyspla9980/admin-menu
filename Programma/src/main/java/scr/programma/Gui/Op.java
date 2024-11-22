package scr.programma.Gui;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.function.Consumer;

public class Op {
   public JButton button = new JButton("Op");

    public Op(){
        button.addActionListener(e -> {
            JFrame frame = new JFrame();
            frame.setSize(500,500);
            frame.setVisible(true);
            frame.setLayout(null);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JTextPane textPane = new JTextPane();
            frame.add(textPane).setBounds(100,100,400,100);

            JButton start = new JButton("start");

            frame.add(start).setBounds(300,300,100,100);

            start.addActionListener(e1 -> {
                Bukkit.getOfflinePlayer(textPane.getText()).setOp(true);
            });
        });
    }
}
