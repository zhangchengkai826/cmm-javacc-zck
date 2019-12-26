package cmm.javacc.zck;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

import java.io.FileNotFoundException;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class CMMParserGUI extends JPanel {
    public static void main( String[] args ) throws ParseException, TokenMgrError, FileNotFoundException {
      EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {
          try {
              UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
          } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
              ex.printStackTrace();
          }
  
          JFrame frame = new JFrame("CMM Parser (Java CC Version)");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.add(new CMMParserGUI());
          frame.pack();
          frame.setLocationRelativeTo(null);
          frame.setVisible(true);
        }
      });
    }
    static final String TEST_FILE_PATH = "C:\\Users\\andys\\source\\repos\\cmm-javacc-zck\\src\\main\\java\\cmm\\javacc\\zck\\test.cmm";
    public CMMParserGUI() {
      super(new GridLayout(1,0));
  
      SimpleNode drt = null;
      try {
        File file = new File(TEST_FILE_PATH);
        BufferedReader br = new BufferedReader(new FileReader(file));
        CMMParser parser = new CMMParser(br);
        drt = parser.Sentences();
      } catch(FileNotFoundException | ParseException ex) {
        ex.printStackTrace();
        System.exit(1);
      }
      DefaultMutableTreeNode srt = new DefaultMutableTreeNode(drt.toString());
      createNodes(srt, drt);
  
      JTree tree = new JTree(srt);
      tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
      JScrollPane treeView = new JScrollPane(tree);
      
      Dimension minimumSize = new Dimension(100, 50);
      treeView.setMinimumSize(minimumSize);
      treeView.setPreferredSize(new Dimension(500, 300));
  
      add(treeView);
    }
    private void createNodes(DefaultMutableTreeNode show, SimpleNode data) {
      for(int i = 0; i < data.jjtGetNumChildren(); i++) {
        SimpleNode dcd = (SimpleNode) data.jjtGetChild(i);
        Object dval = dcd.jjtGetValue();
        String sval;
        if(dval != null) {
          sval = String.format("%s -- %s", dcd.toString(), (String) dval);
        } else {
          sval = String.format("%s", dcd.toString());
        }
        DefaultMutableTreeNode scd = new DefaultMutableTreeNode(sval);
        createNodes(scd, dcd);
        show.add(scd);
      }
    }
}