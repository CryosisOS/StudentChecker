/**
 * Author: Nathan van der Velde
 * Date Created: 2018-05-28
 */

package gui;

//IMPORTS

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class FileSelectionScene
{
    /// CLASS FIELDS
    private JPanel select_files;
    private JButton Cancel;
    private JButton Ok;
    private JPanel BottomPane;
    private JTextField FileTwo_filePath;
    private JTextField FileOne_filePath;
    private JButton FileTwo_Browse;
    private JButton FileOne_Browse;
    private JPanel FileOne_Pane;
    private JPanel FileTwo_Pane;
    
    final JFileChooser fc = new JFileChooser();
    
    
    public FileSelectionScene()
    {
        
        
        FileOne_Browse.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int returnVal = fc.showOpenDialog(FileOne_Pane);
                if (returnVal == JFileChooser.APPROVE_OPTION)
                {
                    File file = fc.getSelectedFile();
                    //This is where a real application would open the file
                    log.append("Opening: " + file.getName() + ".\n");
                }
                else
                {
                    log.append("Opening command cancelled by user.\n");
                }//ENDIF
            }//END actionPerformed
        });
        FileTwo_Browse.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int returnVal = fc.showOpenDialog(FileTwo_Pane);
                if(returnVal == JFileChooser.APPROVE_OPTION)
                {
                    File file = fc.getSelectedFile();
                    //This is where a real application would open the file
                    log.append("Opening: "+file.getName()+".\n");
                }
                else
                {
                    log.append("Opening command cancelled by user.\n");
                }//ENDIF
            }//END action Performed
        });
        Cancel.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }//END actionPerformed
        });
    }//END FileSelectionScene
}//END class FileSelectionScene
