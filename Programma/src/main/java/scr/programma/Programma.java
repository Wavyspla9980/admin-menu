package scr.programma;

import org.bukkit.plugin.java.JavaPlugin;
import scr.programma.Gui.Chat;
import scr.programma.Gui.Op;

import javax.swing.*;

public final class Programma extends JavaPlugin {
   public JFrame jFrame = new JFrame();
    @Override
    public void onEnable() {

        jFrame.setSize(500,500);
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        jFrame.add(new Op().button).setBounds(10,100,100,100);
        jFrame.add(new Chat().button).setBounds(200,100,100,100);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
