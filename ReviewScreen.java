import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.awt.datatransfer.*;

import javax.swing.*;
import javax.swing.text.*;
import javax.swing.tree.*;
import javax.swing.table.*;

public class ReviewScreen extends JPanel 
{
	
    //private static JFrame frame;
    
    public JTextField answerField1, answerField2, answerField3, answerField4,
    	answerField5, answerField6, answerField7, answerField8, answerField9, 
    	answerField10;
    
    public JList list;
    
    public JLabel qLabel1, qLabel2, qLabel3, qLabel4, qLabel5, qLabel6, qLabel7,
    	qLabel8, qLabel9, qLabel10;
    
    public JPanel questionPanel, answerPanel, buttonPanel;
    
    public DefaultListModel listModel;

    public ReviewScreen() {
    	
        super(new BorderLayout());
        
        JPanel topPanel = new JPanel();
        
        questionPanel = createQuestionSection();
        
        answerPanel = createAnswerSection();  

		buttonPanel = createButtonSection(); 

        listModel = createListModel();
        
        list = new JList(listModel);
        
        list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        
        list.setVisibleRowCount(1);
        
        list.getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        list.setDragEnabled(true);
        
        list.setTransferHandler(new TransferHandler() {

            public boolean canImport(TransferHandler.TransferSupport info) {

                JList.DropLocation dl = (JList.DropLocation)info.getDropLocation();
                
                if (dl.getIndex() == -1) {
                	
                    return false;
                }
                
                return true;
            }

            public boolean importData(TransferHandler.TransferSupport info) {
            	
                if (!info.isDrop()) {
                	
                    return false;
                }
                

                JList.DropLocation dl = (JList.DropLocation)info.getDropLocation();
                
                DefaultListModel listModel = (DefaultListModel)list.getModel();
                
                int index = dl.getIndex();
                
                boolean insert = dl.isInsert();
                
                // Get the current string under the drop.
                String value = (String)listModel.getElementAt(index);

                // Get the string that is being dropped.
                Transferable t = info.getTransferable();
              
                return false;
            }
            
            public int getSourceActions(JComponent c) {
            	
                return COPY;
            }
            
            protected Transferable createTransferable(JComponent c) {
                JList list = (JList)c;
                
                Object[] values = list.getSelectedValues();
        
                StringBuffer buff = new StringBuffer();

                for (int i = 0; i < values.length; i++) {
                	
                    Object val = values[i];
                    
                    buff.append(val == null ? "" : val.toString());
                    
                    if (i != values.length - 1) {
                    	
                        buff.append("\n");
                    }
                    
                }
                
                return new StringSelection(buff.toString());
            }
        });
        
        list.setDropMode(DropMode.ON_OR_INSERT);
        
        JScrollPane listView = new JScrollPane(list);
        
        listView.setPreferredSize(new Dimension(720, 40));
        
        topPanel.add(listView);
       
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                questionPanel, answerPanel);

        add(splitPane, BorderLayout.CENTER);
        
        add(topPanel, BorderLayout.PAGE_START);
        
        add(buttonPanel, BorderLayout.SOUTH);
        
        setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    }

    public JPanel createQuestionSection() {

    	GridLayout questionGrid = new GridLayout(10,1);
        
        JPanel questionPanel = new JPanel();
        questionPanel.setLayout(questionGrid);
        
        qLabel1 = new JLabel("The average sea level is expected to");
        questionPanel.add(qLabel1);
        
        qLabel2 = new JLabel("An increase of 2°F in the average global temperature would");
        questionPanel.add(qLabel2);

        qLabel3 = new JLabel("The major cause of rising sea levels is");
        questionPanel.add(qLabel3);
        
        qLabel4 = new JLabel("Changing rainfall patterns will");
        questionPanel.add(qLabel4);
        
        qLabel5 = new JLabel("The percentage of climate experts that agree that climate change is real is");
        questionPanel.add(qLabel5);
        
        qLabel6 = new JLabel("Rising sea levels could cause");
        questionPanel.add(qLabel6);
        
        qLabel7 = new JLabel("In the last century, the global average temperature");
        questionPanel.add(qLabel7);
        
        qLabel8 = new JLabel("The function of greenhouse gases is to");
        questionPanel.add(qLabel8);
        
        qLabel9 = new JLabel("Increased carbon dioxide in the atmosphere");
        questionPanel.add(qLabel9);

        qLabel10 = new JLabel("Even a small rise in average sea level would");
        questionPanel.add(qLabel10);
        
        return questionPanel;
    }
    
    public JPanel createAnswerSection() {
    	
    	GridLayout answerGrid = new GridLayout(10,1);
        
        JPanel answerPanel = new JPanel();
        answerPanel.setLayout(answerGrid);

        answerField1 = new JTextField(10);
        answerField1.setText("");
        answerField1.setDragEnabled(true);
        answerPanel.add(answerField1);
        
        answerField2 = new JTextField(10);
        answerField2.setText("");
        answerField2.setDragEnabled(true);
        answerPanel.add(answerField2);
        
        answerField3 = new JTextField(10);
        answerField3.setText("");
        answerField3.setDragEnabled(true);
        answerPanel.add(answerField3);
        
        answerField4 = new JTextField(10);
        answerField4.setText("");
        answerField4.setDragEnabled(true);
        answerPanel.add(answerField4);
        
        answerField5 = new JTextField(10);
        answerField5.setText("");
        answerField5.setDragEnabled(true);
        answerPanel.add(answerField5);
        
        answerField6 = new JTextField(10);
        answerField6.setText("");
        answerField6.setDragEnabled(true);
        answerPanel.add(answerField6);
        
        answerField7 = new JTextField(10);
        answerField7.setText("");
        answerField7.setDragEnabled(true);
        answerPanel.add(answerField7);
        
        answerField8 = new JTextField(10);
        answerField8.setText("");
        answerField8.setDragEnabled(true);
        answerPanel.add(answerField8);
        
        answerField9 = new JTextField(10);
        answerField9.setText("");
        answerField9.setDragEnabled(true);
        answerPanel.add(answerField9);
        
        answerField10 = new JTextField(10);
        answerField10.setText("");
        answerField10.setDragEnabled(true);
        answerPanel.add(answerField10);
        
        return answerPanel;
    }
    
    public JPanel createButtonSection() {
    	
		buttonPanel = new JPanel();	
		
		buttonPanel.setBackground(Color.LIGHT_GRAY);

		JButton checkAnswersButton = new JButton("Check Answers!");
		checkAnswersButton.addActionListener(new checkButtonListener());
		
		buttonPanel.add(checkAnswersButton);
		
		JButton returnHomeButton = new JButton("Home");
		
		buttonPanel.add(returnHomeButton);
		
		return buttonPanel;

    }
    
	class checkButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			
		}
	}
    
    public DefaultListModel createListModel() {
    	
    	//Create a list model and a list.
        DefaultListModel listModel = new DefaultListModel();
        listModel.addElement("serious population displacement");
        listModel.addElement("severely decrease crop yields");
        listModel.addElement("increased by more than 1°F");
        listModel.addElement("negatively affect millions of people");
        listModel.addElement("trap heat above the earth");
        listModel.addElement("compromise fresh water supply");
        listModel.addElement("melting of glaciers");
        listModel.addElement("97%");
        listModel.addElement("rise by about 15 inches");
        listModel.addElement("increases the average global temperature");
        
        return listModel;
    }

}