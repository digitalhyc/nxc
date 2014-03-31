package NxcFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andrew on 14-3-31.
 */
public class CourseFrame extends JFrame {
    private JTextField courseName = new JTextField(20);
    private JTextField courseWeight = new JTextField(20);

    private JButton generateButton = new JButton("Generate");
    private JButton cancelButton = new JButton("Cancel");
    private JButton resetButton = new JButton("Reset");

    private JLabel cNameLabel = new JLabel("Course Name", SwingConstants.LEFT);
    private JLabel cWeightLabel = new JLabel("Course Weight", SwingConstants.LEFT);

    public CourseFrame()
    {
        super("Generate Class");
        setSize(300, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        init();

        setVisible(true);
    }

    private void init()
    {

    }
}
