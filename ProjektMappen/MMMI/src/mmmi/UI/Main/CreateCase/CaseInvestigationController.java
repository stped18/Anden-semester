/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmmi.UI.Main.CreateCase;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import mmmi.UI.Main.createCase.NodeFinder;

/**
 * FXML Controller class
 *
 * @author steff
 */
public class CaseInvestigationController extends NodeFinder implements Initializable {

    @FXML
    private TextArea fxTa_physicsInformationCitizen;
    @FXML
    private TextArea fxTa_physicsInformatinOthers;
    @FXML
    private TextArea fxTa_physicsRemarks;
    @FXML
    private RadioButton fxRb_physicalLevelFunction0;
    @FXML
    private RadioButton fxRb_physicalLevelFunction1;
    @FXML
    private RadioButton fxRb_physicalLevelFunction2;
    @FXML
    private RadioButton fxRb_physicalLevelFunction3;
    @FXML
    private RadioButton fxRb_physicalLevelFunction4;
    @FXML
    private TextArea fxTa_mentallyInformationCitizen;
    @FXML
    private TextArea fxTa_mentallyInformatinOthers;
    @FXML
    private TextArea fxTa_mentallyRemarks;
    @FXML
    private RadioButton fxRb_mentallyLevelFunction0;
    @FXML
    private RadioButton fxRb_mentallyLevelFunction1;
    @FXML
    private RadioButton fxRb_mentallyLevelFunction2;
    @FXML
    private RadioButton fxRb_mentallyLevelFunction3;
    @FXML
    private RadioButton fxRb_mentallyLevelFunction4;
    @FXML
    private TextArea fxTa_socialInformationCitizen;
    @FXML
    private TextArea fxTa_sociallyInformatinOthers;
    @FXML
    private TextArea fxTa_sociallyRemarks;
    @FXML
    private RadioButton fxRb_sociallyLevelFunction0;
    @FXML
    private RadioButton fxRb_sociallyLevelFunction1;
    @FXML
    private RadioButton fxRb_sociallyLevelFunction2;
    @FXML
    private RadioButton fxRb_sociallyLevelFunction3;
    @FXML
    private RadioButton fxRb_sociallyLevelFunction4;
    @FXML
    private TextArea fxTa_practiceTasksInformationCitizen;
    @FXML
    private TextArea fxTa_practiceTasksInformatinOthers;
    @FXML
    private TextArea fxTa_practiceTasksRemarks;
    @FXML
    private RadioButton fxRb_practiceTasksLevelFunction0;
    @FXML
    private RadioButton fxRb_practiceTasksLevelFunction1;
    @FXML
    private RadioButton fxRb_practiceTasksLevelFunction2;
    @FXML
    private RadioButton fxRb_practiceTasksLevelFunction3;
    @FXML
    private RadioButton fxRb_practiceTasksLevelFunction4;
    @FXML
    private TextArea fxTa_selfcareInformationCitizen;
    @FXML
    private TextArea fxTa_selfcareInformatinOthers;
    @FXML
    private TextArea fxTa_selfcareRemarks;
    @FXML
    private RadioButton fxRb_selfcareLevelFunction0;
    @FXML
    private RadioButton fxRb_selfcareLevelFunction1;
    @FXML
    private RadioButton fxRb_selfcareLevelFunction2;
    @FXML
    private RadioButton fxRb_selfcareLevelFunction3;
    @FXML
    private RadioButton fxRb_selfcareLevelFunction4;
    @FXML
    private TextArea fxTa_mobilityInformationCitizen;
    @FXML
    private TextArea fxTa_mobilityInformatinOthers;
    @FXML
    private TextArea fxTa_mobilityRemarks;
    @FXML
    private RadioButton fxRb_mobilityLevelFunction0;
    @FXML
    private RadioButton xRb_mobilityLevelFunction1;
    @FXML
    private RadioButton fxRb_mobilityLevelFunction2;
    @FXML
    private RadioButton fxRb_mobilityLevelFunction3;
    @FXML
    private RadioButton fxRb_mobilityLevelFunction4;
    @FXML
    private TextArea fxTa_communicationInformationCitizen;
    @FXML
    private TextArea fxTa_communicationInformatinOthers;
    @FXML
    private TextArea fxTa_communicationRemarks;
    @FXML
    private RadioButton fxRb_communicationLevelFunction0;
    @FXML
    private RadioButton fxRb_communicationLevelFunction1;
    @FXML
    private RadioButton fxRb_communicationLevelFunction2;
    @FXML
    private RadioButton fxRb_communicationLevelFunction3;
    @FXML
    private RadioButton fxRb_communicationLevelFunction4;
    @FXML
    private TextArea fxTa_communityLifeInformationCitizen;
    @FXML
    private TextArea fxTa_communityLifeInformatinOthers;
    @FXML
    private TextArea fxTa_communityLifeRemarks;
    @FXML
    private RadioButton fxRb_communityLifeLevelFunction0;
    @FXML
    private RadioButton fxRb_communityLifeLevelFunction1;
    @FXML
    private RadioButton fxRb_communityLifeLevelFunction2;
    @FXML
    private RadioButton fxRb_communityLifeLevelFunction3;
    @FXML
    private RadioButton fxRb_communityLifeLevelFunction4;
    @FXML
    private TextArea fxTa_socialLifeInformationCitizen;
    @FXML
    private TextArea fxTa_socialLifeInformatinOthers;
    @FXML
    private TextArea fxTa_socialLifeRemarks;
    @FXML
    private RadioButton fxRb_socialLifeLevelFunction0;
    @FXML
    private RadioButton fxRb_socialLifeLevelFunction1;
    @FXML
    private RadioButton fxRb_socialLifeLevelFunction2;
    @FXML
    private RadioButton fxRb_socialLifeLevelFunction3;
    @FXML
    private RadioButton fxRb_socialLifeLevelFunction4;
    @FXML
    private TextArea fxTa_healthInformationCitizen;
    @FXML
    private TextArea fxTa_healthInformatinOthers;
    @FXML
    private TextArea fxTa_healthRemarks;
    @FXML
    private RadioButton fxRb_healthLevelFunction0;
    @FXML
    private RadioButton fxRb_healthLevelFunction1;
    @FXML
    private RadioButton fxRb_healthLevelFunction2;
    @FXML
    private RadioButton fxRb_healthLevelFunction3;
    @FXML
    private RadioButton fxRb_healthLevelFunction4;
    @FXML
    private TextArea fxTa_environmentInformationCitizen;
    @FXML
    private TextArea fxTa_environmentInformatinOthers;
    @FXML
    private TextArea fxTa_environmentRemarks;
    @FXML
    private RadioButton fxRb_environmentLevelFunction0;
    @FXML
    private RadioButton fxRb_environmentLevelFunction1;
    @FXML
    private RadioButton fxRb_environmentLevelFunction2;
    @FXML
    private RadioButton fxRb_environmentLevelFunction3;
    @FXML
    private RadioButton fxRb_environmentLevelFunction4;
    @FXML
    private RadioButton fxRb_evaluated0;
    @FXML
    private RadioButton fxRb_evaluated1;
    @FXML
    private RadioButton fxRb_evaluated2;
    @FXML
    private RadioButton fxRb_evaluated3;
    @FXML
    private RadioButton fxRb_evaluated4;

    @FXML
    private Button fxBtn_save;
    @FXML
    private AnchorPane fxAc_CaseInvestigationroot;

    @FXML
    private JFXTextField fxTf_physicalThemes;
    @FXML
    private JFXTextField fxTf_mentallyThemes;
    @FXML
    private JFXTextField fxTf_sociallyThemes;
    @FXML
    private JFXTextField fxTf_practiceTasksThemes;
    @FXML
    private JFXTextField fxTf_selfcareThemes;
    @FXML
    private JFXTextField fxTf_mobilityThemes;
    @FXML
    private JFXTextField fxTf_communicationThemes;
    @FXML
    private JFXTextField fxTf_communityLifeThemes;
    @FXML
    private JFXTextField fxTf_socialLifeThemes;
    @FXML
    private JFXTextField fxTf_healthThemes;
    @FXML
    private JFXTextField fxTf_environmentThemes;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        runRadioFinder(fxAc_CaseInvestigationroot);
        

    }

    @FXML
    private void BtnHandler(ActionEvent event) {
        findeNodehandler(fxAc_CaseInvestigationroot);
     

    }


}












