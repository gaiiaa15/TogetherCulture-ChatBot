package org.example;

import javax.swing.*;

import static org.example.MainInterface.showGUI;
import static org.example.ChatBot.showChatBot;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //Database Connection
        String url = "jdbc:mysql://localhost:3306/together_culture";
        String AdName = "tgcadmin";
        String passKey = "tgcad1234";
        //Call and instantiate the Together Culture Database
        connection TGCDB = new connection(url, AdName, passKey);
        TGCDB.getConnected();
        TGCDB.getDisconnected();
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                showGUI();
//
//           }
//        });
    }
}