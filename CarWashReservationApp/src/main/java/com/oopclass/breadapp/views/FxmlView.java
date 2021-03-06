package com.oopclass.breadapp.views;

import java.util.ResourceBundle;

/**
 * OOP Class 20-21
 *
 * @author Gerald Villaran
 */
public enum FxmlView {

    
    RESERVATION {
        @Override
        public String getTitle() {
            return getStringFromResourceBundle("reservation.title");
        }

        @Override
        public String getFxmlFile() {
            return "/fxml/Reservation.fxml";
        }
    }, CANCEL {
        @Override
        public String getTitle() {
            return getStringFromResourceBundle("cancel.title");
        }

        @Override
        public String getFxmlFile() {
            return "/fxml/Cancel.fxml";
        }
    }, PROBLEM {
        @Override
        public String getTitle() {
            return getStringFromResourceBundle("problem.title");
        }

        @Override
        public String getFxmlFile() {
            return "/fxml/Problem.fxml";
        }
    };
    

    public abstract String getTitle();

    public abstract String getFxmlFile();

    String getStringFromResourceBundle(String key) {
        return ResourceBundle.getBundle("Bundle").getString(key);
    }

}
