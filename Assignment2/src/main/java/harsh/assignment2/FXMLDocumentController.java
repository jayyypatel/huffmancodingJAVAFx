
package harsh.assignment2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author jayp2
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private TextArea outputTextArea;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void exitHandler(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void encodeHanlder(ActionEvent event) {
        outputTextArea.clear();
        outputTextArea.appendText("Encode Button - under development");   
    }

    @FXML
    private void decodeHandler(ActionEvent event) {
        outputTextArea.clear();
        outputTextArea.appendText("Decode Button - under development"); 
    }

    @FXML
    private void disFrequenciesHandler(ActionEvent event) {
        outputTextArea.clear();
        outputTextArea.appendText("Display Frequencies Button - under development"); 
    }

    @FXML
    private void saveHuffmanTreeButtonHandler(ActionEvent event) {
        outputTextArea.clear();
        outputTextArea.appendText("Save Huffman Tree Button - under development"); 
    }

    @FXML
    private void disHuffmanTreeHandler(ActionEvent event) {
        outputTextArea.clear();
        outputTextArea.appendText("Display Huffman Tree Button - under development"); 
    }

    @FXML
    private void disHuffmanCodesButtonHandler(ActionEvent event) {
        outputTextArea.clear();
        outputTextArea.appendText("Display huffman codes Button - under development"); 
    }

    @FXML
    private void loadHuffmanTreeButtonHandler(ActionEvent event) {
        outputTextArea.clear();
        outputTextArea.appendText("Load huffman tree Button - under development"); 
    }
}
