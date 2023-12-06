module exercisesmod {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens edu.hydes.exercises18 to javafx.fxml;

    exports edu.hydes.exercises03;
    exports edu.hydes.exercises02;
    exports edu.hydes.exercises04;
    exports edu.hydes.exercises05;
    exports edu.hydes.exercises06;
    exports edu.hydes.exercises07;
    exports edu.hydes.exercises09;
    exports edu.hydes.exercises10;
    exports edu.hydes.exercises11;
    exports edu.hydes.exercises12;
    exports edu.hydes.exercises13;
    exports edu.hydes.exercises14;
    exports edu.hydes.exercises18;
        }