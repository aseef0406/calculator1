/*
 Calculator using switch in JavaFX By Md.Aseef
 */
package calculator1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author ASEEF
 */
public class FXMLDocumentController implements Initializable {
    
   float data=0f; 
   int operation=0;
   float ans = 0f;
   @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button div;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button mul;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button seven;

    @FXML
    private Button three;

    @FXML
    private Button minus;

    @FXML
    private Button zero;

    @FXML
    private Button equals;

    @FXML
    private Button clear;

    @FXML
    private Button plus;

    @FXML
    private TextField display;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if(event.getSource()==one){
            display.setText(display.getText()+"1");
        }
        else if(event.getSource()==two){
            display.setText(display.getText()+"2");
        }
        else if(event.getSource()==three){
            display.setText(display.getText()+"3");
        }
        else if(event.getSource()==four){
            display.setText(display.getText()+"4");
        }
        else if(event.getSource()==five){
            display.setText(display.getText()+"5");
        }
        else if(event.getSource()==six){
            display.setText(display.getText()+"6");
        }
        else if(event.getSource()==seven){
            display.setText(display.getText()+"7");
        }
        else if(event.getSource()==eight){
            display.setText(display.getText()+"8");
        }
        else if(event.getSource()==nine){
            display.setText(display.getText()+"9");
        }
        else if(event.getSource()==zero){
            display.setText(display.getText()+"0");
        }
        else if(event.getSource()==clear){
            display.setText("");
        }
        else if(event.getSource()==plus){
            data=Float.parseFloat(display.getText());
            operation =1;
            display.setText("");
        }
        else if(event.getSource()==minus){
            data=Float.parseFloat(display.getText());
            operation =2;
            display.setText("");
        }
        else if(event.getSource()==mul){
            data=Float.parseFloat(display.getText());
            operation =3;
            display.setText("");
        }
        else if(event.getSource()==div){
            data=Float.parseFloat(display.getText());
            operation =4;
            display.setText("");
        }
        else if(event.getSource()==equals){
            Float secondData = Float.parseFloat(display.getText());
            switch(operation){
                case 1 : 
                            ans = data + secondData;
                            display.setText(String.valueOf(ans));
                            break;
                case 2 :
                            ans = data - secondData;
                            display.setText(String.valueOf(ans));
                            break;
                case 3 :
                            ans = data * secondData;
                            display.setText(String.valueOf(ans));
                            break;
                case 4 :    
                        try{
                            ans = data / secondData;
                        }
                        catch(Exception e){display.setText("error");}
                            display.setText(String.valueOf(ans));
                            break;
            }
        }

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
