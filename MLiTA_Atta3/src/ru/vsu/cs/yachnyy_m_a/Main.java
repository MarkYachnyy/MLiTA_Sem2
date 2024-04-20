package ru.vsu.cs.yachnyy_m_a;

import ru.vsu.cs.yachnyy_m_a.util.ArrayUtils;
import ru.vsu.cs.yachnyy_m_a.util.SwingUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        SwingUtils.setDefaultFont("Microsoft Sans Serif", 20);
        java.awt.EventQueue.invokeLater(()->{
            new FormMain().setVisible(true);
        });
    }
}
