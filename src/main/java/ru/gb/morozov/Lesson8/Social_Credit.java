package ru.gb.morozov.Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Social_Credit extends JFrame {
    private int value;

    public Social_Credit(int initialValue) {
        setTitle("Your Social Credit");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setVisible(true);
        JLabel counterValueView = new JLabel();
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);
        value = initialValue;
        counterValueView.setText(String.valueOf(value));
        JButton button1 = new JButton("Похвалить Си Цзиньпина");
        JButton button2 = new JButton("Сделать хорошее дело");
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
        JButton button3 = new JButton("Поругать Си Цзипина");
        JButton button4 = new JButton("Сделать плохое дело");
        add(button3, BorderLayout.WEST);
        add(button4, BorderLayout.EAST);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value += 100;
                counterValueView.setText(String.valueOf(value));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value += 100;
                counterValueView.setText(String.valueOf(value));
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value -= 100;
                counterValueView.setText(String.valueOf(value));
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value -= 100;
                counterValueView.setText(String.valueOf(value));
            }
        });

    };


    public static void main(String[] args) {
        new Social_Credit(1000);
    }

}
