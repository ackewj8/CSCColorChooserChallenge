module williamcsc325.csccolorchooserchallenge {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens williamcsc325.csccolorchooserchallenge to javafx.fxml;
    exports williamcsc325.csccolorchooserchallenge;
}