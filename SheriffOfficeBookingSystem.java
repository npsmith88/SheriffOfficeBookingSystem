/*CIST 2372
Nic Smith
Final Project - Sheriff Office Booking System */
package sheriffofficebookingsystem;

import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SheriffOfficeBookingSystem extends Application {

    private final ComboBox<String> editInmateCbox = new ComboBox<>();
    private final ComboBox<String> ethnicityCbox = new ComboBox<>();
    private final ComboBox<String> cellBlockCbox = new ComboBox<>();
    private final ComboBox<String> cellsCbox = new ComboBox<>();
    private final ComboBox<String> statusCbox = new ComboBox<>();
    private final ArrayList<Inmate> inmates = new ArrayList<>();
    private final ArrayList<Visitor> visitors = new ArrayList<>();
    private final ArrayList<String> minimumSecurityCells = new ArrayList<>();
    private final ArrayList<String> maximumSecurityCells = new ArrayList<>();
    private final ArrayList<String> isolationCells = new ArrayList<>();
    private final ArrayList<String> hospitalCells = new ArrayList<>();
    GridPane gPane = new GridPane();
    // create textfields involved in booking an inmate
    TextField tFirstName = new TextField();
    TextField tLastName = new TextField();
    TextField tIDNumber = new TextField();
    TextField tAge = new TextField();
    TextField tHeight = new TextField();
    TextField tWeight = new TextField();
    TextField tCourtDate = new TextField();
    TextField tDateArrested = new TextField();
    TextField tDateReleased = new TextField();
    TextField tVisitorLog = new TextField();

    // create labels involved in booking an inmate
    Label lIDNumber = new Label("ID#:");
    Label lFirstName = new Label("First Name:");
    Label lLastName = new Label("Last Name:");
    Label lAge = new Label("Age:");
    Label lHeight = new Label("Height:");
    Label lWeight = new Label("Weight:");
    Label lEthnicity = new Label("Ethnicity:");
    Label lCourtDate = new Label("Court Date:");
    Label lDateArrested = new Label("Date Arrested:");
    Label lDateReleased = new Label("Date Released:");
    Label lCellBlock = new Label("Cell Block:");
    Label lCell = new Label("Cell:");
    Label lStatus = new Label("Status:");
    Label lVisitorLog = new Label("Visitor Log:");
    
    // create labels involved in viewing visitors
    Label lVisitorIDNumber = new Label("Visitor ID#");
    Label lVisitorSSNumber = new Label("Visitor SS#");
    Label lVisitorFName = new Label("Visitor First Name:");
    Label lVisitorLName = new Label("Visitor Last Name:");
    Label lVisitorDate = new Label("Visitor Date:");
    Label lInmateVisited = new Label("Inmate Visited:");

    @Override
    public void start(Stage primaryStage) {
        // create border pane for stage
        BorderPane pane = new BorderPane();

        // create inmate and visitor objects
        Inmate newInmate1 = new Inmate("001", "Bill", "Johnson", "25", "5'10\"", "190",
                "Caucasian", "01/05/2016", "05/15/2015", "07/05/2019", "MaximumSecurity",
                "2B", "Incarcerated", "Jane Adams");
        
        Visitor newVisitor1 = new Visitor("501", "123-45-6789", "Jane", "Adams", "10/11/2016", "Bill Johnson");
        
        Inmate newInmate2 = new Inmate("002", "Jose", "Martinez", "31", "5'8\"", "212",
                "Hispanic", "12/15/2018", "03/15/2015", "03/15/2020", "Minimum Security",
                "1A", "Incarcerated", "Tyler Holmes");
        
        Visitor newVisitor2 = new Visitor("502", "223-45-6789", "Tyler", "Holmes", "09/11/2016", "Jose Martinez");
        
        Inmate newInmate3 = new Inmate("003", "John", "King", "30", "5'11\"", "202",
                "Caucasian", "11/11/2017", "07/01/2015", "07/11/2025", "Minimum Security",
                "1B", "Incarcerated", "Alvin Mason");
        
        Visitor newVisitor3 = new Visitor("503", "323-45-6789", "Alvin", "Mason", "10/21/2015", "John King");
        
        Inmate newInmate4 = new Inmate("004", "Otto", "Graham", "36", "5'6\"", "233",
                "Hispanic", "10/10/2017", "02/10/2013", "04/10/2023", "Minimum Security",
                "49A", "Incarcerated", "Amy Maxwell");
        
        Visitor newVisitor4 = new Visitor("504", "423-45-6789", "Amy", "Maxwell", "10/11/2008", "Otto Graham");
        
        Inmate newInmate5 = new Inmate("005", "Manny", "Freeman", "29", "6'9\"", "180",
                "Hispanic", "11/05/2016", "05/15/2015", "07/05/2019", "MinimumSecurity",
                "70B", "Incarcerated", "Sam Sylvester");
        
        Visitor newVisitor5 = new Visitor("505", "523-45-6789", "Sam", "Sylvester", "10/11/2010", "Manny Freeman");
        
        Inmate newInmate6 = new Inmate("006", "Juicy", "Coutoure", "35", "5'10\"", "190",
                "African-American", "01/05/2016", "05/15/2015", "07/05/2019", "Isolation",
                "3", "Incarcerated", "Fetty Wap");
        
        Visitor newVisitor6 = new Visitor("506", "623-45-6789", "Fetty", "Wap", "10/11/2000", "Juicy Coutoure");
        
        Inmate newInmate7 = new Inmate("007", "James", "Barr", "21", "6'1\"", "210",
                "Caucasian", "01/05/2016", "05/15/2015", "07/05/2019", "MinimumSecurity",
                "24A", "Incarcerated", "Marvin Irish");
        
        Visitor newVisitor7 = new Visitor("507", "723-45-6789", "Marvin", "Irish", "10/11/2006", "James Barr");
        
        Inmate newInmate8 = new Inmate("008", "Henry", "Hanks", "44", "5'7\"", "190",
                "Caucasian", "01/05/2016", "05/15/2015", "07/05/2019", "Hospital",
                "37", "Incarcerated", "Jim Houston");
        
        Visitor newVisitor8 = new Visitor("508", "823-45-6789", "Jim", "Houston", "10/16/2014", "Henry Hanks");
        
        Inmate newInmate9 = new Inmate("009", "Franky", "Utah", "25", "5'10\"", "190",
                "Asian", "01/05/2016", "05/15/2015", "07/05/2019", "MinimumSecurity",
                "54A", "Incarcerated", "Lucy Violet");
        
        Visitor newVisitor9 = new Visitor("509", "923-45-6789", "Lucy", "Violet", "11/11/2011", "Franky Utah");
        
        Inmate newInmate10 = new Inmate("010", "Paul", "Pogba", "25", "7'0\"", "290",
                "Caucasian", "01/05/2016", "05/15/2015", "07/05/2019", "Hospital",
                "26", "Incarcerated", "Denzel Washington");
        
        Visitor newVisitor10 = new Visitor("510", "103-45-6789", "Denzel", "Washington", "10/11/2011", "Paul Pogba");
        
        Inmate newInmate11 = new Inmate("011", "Tom", "Clancy", "55", "5'10\"", "190",
                "Caucasian", "01/05/2016", "05/15/2015", "07/05/2019", "MinimumSecurity",
                "87B", "Incarcerated", "Darcy Clancy");
        
        Visitor newVisitor11 = new Visitor("511", "113-45-6789", "Darcy", "Clancy", "10/11/2012", "Tom Clancy");
        
        Inmate newInmate12 = new Inmate("012", "Joey", "Pendergrass", "25", "5'10\"", "190",
                "African-American", "01/05/2016", "05/15/2015", "07/05/2019", "MaximumSecurity",
                "11B", "Incarcerated", "Shakey Flakes");
        
        Visitor newVisitor12 = new Visitor("512", "122-45-6789", "Shakey", "Flakes", "10/11/2013", "Joey Pendergrass");
        
        Inmate newInmate13 = new Inmate("013", "Sonny", "Weems", "33", "5'10\"", "190",
                "Caucasian", "01/05/2016", "05/15/2015", "07/05/2019", "MaximumSecurity",
                "30A", "Incarcerated", "Carrie Fisher");
        
        Visitor newVisitor13 = new Visitor("513", "133-45-6789", "Carrie", "Fisher", "10/11/2014", "Sonny Weems");
        
        Inmate newInmate14 = new Inmate("014", "Luke", "Greg", "25", "5'10\"", "190",
                "Hispanic", "11/15/2016", "05/15/2011", "07/05/2039", "MaximumSecurity",
                "23B", "Incarcerated", "Jason Carter");
        
        Visitor newVisitor14 = new Visitor("514", "143-45-6789", "Jason", "Carter", "10/11/2010", "Luke Gregg");
        
        Inmate newInmate15 = new Inmate("015", "Jared", "Fogle", "43", "5'10\"", "190",
                "Asian", "01/05/2016", "05/15/2008", "07/05/2019", "MaximumSecurity",
                "14B", "Incarcerated", "Billy Aaron");
        
        Visitor newVisitor15 = new Visitor("515", "153-45-6789", "Billy", "Aaron", "10/11/2012", "Jared Fogle");
        
        Inmate newInmate16 = new Inmate("016", "Michael", "James", "27", "5'11\"", "290",
                "African-American", "06/06/2018", "03/13/2013", "07/05/2024", "MinimumSecurity",
                "200B", "Incarcerated", "Virginia Toler");
        
        Visitor newVisitor16 = new Visitor("516", "163-45-6789", "Virginia", "Toler", "10/31/2012", "Michael James");
        
        Inmate newInmate17 = new Inmate("017", "Jamal", "Hyde", "24", "5'10\"", "190",
                "African-American", "01/05/2016", "05/15/2015", "03/15/2018", "MaximumSecurity",
                "7A", "Incarcerated", "Cam Williams");
        
        Visitor newVisitor17 = new Visitor("517", "173-45-6789", "Cam", "Williams", "10/11/2003", "Jamal Hyde");
        
        Inmate newInmate18 = new Inmate("018", "Jim", "Henson", "65", "5'6\"", "155",
                "Native American", "01/07/2017", "05/15/2009", "10/10/2019", "Isolation",
                "8", "Incarcerated", "Samuel Adams");
        
        Visitor newVisitor18 = new Visitor("518", "183-45-6789", "Samuel", "Adams", "10/11/2011", "Jim Henson");
        
        Inmate newInmate19 = new Inmate("019", "Mark", "Ruffalo", "30", "5'11\"", "330",
                "Caucasian", "01/05/2016", "05/15/2013", "08/15/2020", "MinimumSecurity",
                "44A", "Incarcerated", "Deion Sanders");
        
        Visitor newVisitor19 = new Visitor("519", "193-45-6789", "Deion", "Sanders", "09/09/2015", "Mark Ruffalo");
        
        Inmate newInmate20 = new Inmate("020", "Thad", "Matta", "55", "5'9\"", "189",
                "Caucasian", "02/05/2016", "02/15/2010", "02/05/2019", "MaximumSecurity",
                "23B", "Incarcerated", "Quincy Pondexter");
        
        Visitor newVisitor20 = new Visitor("520", "188-45-6789", "Quincy", "Pondexter", "02/11/2015", "Thad Matta");
        
        // add inmate objects to inmates array list
        inmates.add(newInmate1);
        inmates.add(newInmate2);
        inmates.add(newInmate3);
        inmates.add(newInmate4);
        inmates.add(newInmate5);
        inmates.add(newInmate6);
        inmates.add(newInmate7);
        inmates.add(newInmate8);
        inmates.add(newInmate9);
        inmates.add(newInmate10);
        inmates.add(newInmate11);
        inmates.add(newInmate12);
        inmates.add(newInmate13);
        inmates.add(newInmate14);
        inmates.add(newInmate15);
        inmates.add(newInmate16);
        inmates.add(newInmate17);
        inmates.add(newInmate18);
        inmates.add(newInmate19);
        inmates.add(newInmate20);
        
        // add visitor objects to visitors array list
        visitors.add(newVisitor1);
        visitors.add(newVisitor2);
        visitors.add(newVisitor3);
        visitors.add(newVisitor4);
        visitors.add(newVisitor5);
        visitors.add(newVisitor6);
        visitors.add(newVisitor7);
        visitors.add(newVisitor8);
        visitors.add(newVisitor9);
        visitors.add(newVisitor10);
        visitors.add(newVisitor11);
        visitors.add(newVisitor12);
        visitors.add(newVisitor13);
        visitors.add(newVisitor14);
        visitors.add(newVisitor15);
        visitors.add(newVisitor16);
        visitors.add(newVisitor17);
        visitors.add(newVisitor18);
        visitors.add(newVisitor19);
        visitors.add(newVisitor20);

        // add soptions to ethnicity and cellblock cboxes
        cellBlockCbox.getItems().addAll("Minimum Security", "Maximum Security", "Isolation", "Hospital");
        ethnicityCbox.getItems().addAll("African-American", "Asian", "Caucasian", "Hispanic", "Native American");

        for (int i = 1; i < 201; i++) {
            minimumSecurityCells.add(i + "A");
            minimumSecurityCells.add(i + "B");
        }
        for (int i = 1; i < 51; i++) {
            maximumSecurityCells.add(i + "A");
            maximumSecurityCells.add(i + "B");
        }
        for (int i = 1; i < 11; i++) {
            isolationCells.add(i + "");
        }
        for (int i = 1; i < 51; i++) {
            hospitalCells.add(i + "");
        }
        // add options to cells cbox
        cellsCbox.getItems().addAll(minimumSecurityCells);
        cellsCbox.getItems().addAll(maximumSecurityCells);
        cellsCbox.getItems().addAll(isolationCells);
        cellsCbox.getItems().addAll(hospitalCells);
        // add options to status cbox
        statusCbox.getItems().addAll("Incarcerated", "Released");
        
        HBox topPane = new HBox(5);
        topPane.setPadding(new Insets(5, 5, 5, 5));
        // button uses gridpane and lets user add inmate to inmates arraylist
        Button bookInmateButton = new Button("Book Inmate");
        bookInmateButton.setOnAction(e -> {
            tIDNumber.clear();
            tFirstName.clear();
            tLastName.clear();
            tIDNumber.clear();
            tAge.clear();
            tHeight.clear();
            tWeight.clear();
            tCourtDate.clear();
            tDateArrested.clear();
            tDateReleased.clear();
            tVisitorLog.clear();
            showInmateInfo();
            
        });
        // editInmateCbox is compiled of idNumbers of inmates in arraylist inmates
        for (Inmate in : inmates) {
            editInmateCbox.getItems().add(in.getIdNumber());
        }
        editInmateCbox.setValue("Edit Inmate");
        editInmateCbox.setOnAction(e -> {
            String currentInmate = editInmateCbox.getValue();
            for (Inmate in : inmates) {
                if (currentInmate == in.getIdNumber()) {
                    changeLabels(in.getIdNumber(), in.getFirstName(), in.getLastName(),
                            in.getAge(), in.getHeight(), in.getWeight(), in.getEthnicity(),
                            in.getCourtDate(), in.getDateArrested(), in.getDateReleased(),
                            in.getCellBlock(), in.getCell(), in.getStatus(), in.getVisitorLog());
                    showInmateInfo();
                }
            }
        });
        // button uses a scroll pane and adds inmates, sorted by lastName
        Button viewInmatesByNameButton = new Button();
        viewInmatesByNameButton.setText("View Inmates By Name");
        viewInmatesByNameButton.setOnAction(e -> {

            ScrollPane sp = new ScrollPane();

            Collections.sort(inmates, Inmate.COMPARE_BY_LASTNAME);
            GridPane gPane2 = new GridPane();
            gPane2.setHgap(5);
            gPane2.setVgap(5);
            gPane2.add(lIDNumber, 0, 0);
            gPane2.add(lFirstName, 1, 0);
            gPane2.add(lLastName, 2, 0);
            gPane2.add(lAge, 3, 0);
            gPane2.add(lHeight, 4, 0);
            gPane2.add(lWeight, 5, 0);
            gPane2.add(lEthnicity, 6, 0);
            gPane2.add(lCourtDate, 7, 0);
            gPane2.add(lDateArrested, 8, 0);
            gPane2.add(lDateReleased, 9, 0);
            gPane2.add(lCellBlock, 10, 0);
            gPane2.add(lCell, 11, 0);
            gPane2.add(lStatus, 12, 0);
            gPane2.add(lVisitorLog, 13, 0);

            for (int i = 0; i < inmates.size(); i++) {
                Inmate in = inmates.get(i);
                gPane2.add(new Label(in.getIdNumber()), 0, i + 1);
                gPane2.add(new Label(in.getFirstName()), 1, i + 1);
                gPane2.add(new Label(in.getLastName()), 2, i + 1);
                gPane2.add(new Label(in.getAge()), 3, i + 1);
                gPane2.add(new Label(in.getHeight()), 4, i + 1);
                gPane2.add(new Label(in.getWeight()), 5, i + 1);
                gPane2.add(new Label(in.getEthnicity()), 6, i + 1);
                gPane2.add(new Label(in.getCourtDate()), 7, i + 1);
                gPane2.add(new Label(in.getDateArrested()), 8, i + 1);
                gPane2.add(new Label(in.getDateReleased()), 9, i + 1);
                gPane2.add(new Label(in.getCellBlock()), 10, i + 1);
                gPane2.add(new Label(in.getCell()), 11, i + 1);
                gPane2.add(new Label(in.getStatus()), 12, i + 1);
                gPane2.add(new Label(in.getVisitorLog()), 13, i + 1);
            }
            sp.setContent(gPane2);

            Scene scene2;
            Stage newStage;
            //make scene2 from gpane2
            scene2 = new Scene(sp, 950, 500);
            //make a stage for scene2
            newStage = new Stage();
            newStage.setScene(scene2);
            //tell stage it is meant to pop-up (Modal)
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.setTitle("View Inmates By Name");
            newStage.show();
        });
        // button uses a scroll pane and adds inmates, sorted by cellBlock
        Button viewInmatesByCellBlockButton = new Button();
        viewInmatesByCellBlockButton.setText("View Inmates By Cell Block");
        viewInmatesByCellBlockButton.setOnAction(e -> {

            ScrollPane sp = new ScrollPane();

            Collections.sort(inmates, Inmate.COMPARE_BY_CELLBLOCK);
            GridPane gPane2 = new GridPane();
            gPane2.setHgap(5);
            gPane2.setVgap(5);
            gPane2.add(lIDNumber, 0, 0);
            gPane2.add(lFirstName, 1, 0);
            gPane2.add(lLastName, 2, 0);
            gPane2.add(lAge, 3, 0);
            gPane2.add(lHeight, 4, 0);
            gPane2.add(lWeight, 5, 0);
            gPane2.add(lEthnicity, 6, 0);
            gPane2.add(lCourtDate, 7, 0);
            gPane2.add(lDateArrested, 8, 0);
            gPane2.add(lDateReleased, 9, 0);
            gPane2.add(lCellBlock, 10, 0);
            gPane2.add(lCell, 11, 0);
            gPane2.add(lStatus, 12, 0);
            gPane2.add(lVisitorLog, 13, 0);

            for (int i = 0; i < inmates.size(); i++) {
                Inmate in = inmates.get(i);
                gPane2.add(new Label(in.getIdNumber()), 0, i + 1);
                gPane2.add(new Label(in.getFirstName()), 1, i + 1);
                gPane2.add(new Label(in.getLastName()), 2, i + 1);
                gPane2.add(new Label(in.getAge()), 3, i + 1);
                gPane2.add(new Label(in.getHeight()), 4, i + 1);
                gPane2.add(new Label(in.getWeight()), 5, i + 1);
                gPane2.add(new Label(in.getEthnicity()), 6, i + 1);
                gPane2.add(new Label(in.getCourtDate()), 7, i + 1);
                gPane2.add(new Label(in.getDateArrested()), 8, i + 1);
                gPane2.add(new Label(in.getDateReleased()), 9, i + 1);
                gPane2.add(new Label(in.getCellBlock()), 10, i + 1);
                gPane2.add(new Label(in.getCell()), 11, i + 1);
                gPane2.add(new Label(in.getStatus()), 12, i + 1);
                gPane2.add(new Label(in.getVisitorLog()), 13, i + 1);
            }
            sp.setContent(gPane2);

            Scene scene2;
            Stage newStage;
            //make scene2 from gpane2
            scene2 = new Scene(sp, 950, 500);
            //make a stage for scene2
            newStage = new Stage();
            newStage.setScene(scene2);
            //tell stage it is meant to pop-up (Modal)
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.setTitle("View Inmates By Cell Block");
            newStage.show();
        });
        // button uses a scroll pane and adds visitors, sorted by visitorLName
        Button viewVisitorsByNameButton = new Button();
        viewVisitorsByNameButton.setText("View Visitors By Name");
        viewVisitorsByNameButton.setOnAction(e -> {

            ScrollPane sp = new ScrollPane();

            Collections.sort(visitors, Visitor.COMPARE_BY_VISITORLNAME);
            GridPane gPane2 = new GridPane();
            gPane2.setHgap(5);
            gPane2.setVgap(5);
            gPane2.add(lVisitorIDNumber, 0, 0);
            gPane2.add(lVisitorSSNumber, 1, 0);
            gPane2.add(lVisitorFName, 2, 0);
            gPane2.add(lVisitorLName, 3, 0);
            gPane2.add(lVisitorDate, 4, 0);
            gPane2.add(lInmateVisited, 5, 0);

            for (int i = 0; i < visitors.size(); i++) {
                Visitor vi = visitors.get(i);
                gPane2.add(new Label(vi.getVisitorIDNumber()), 0, i + 1);
                gPane2.add(new Label(vi.getVisitorSSNumber()), 1, i + 1);
                gPane2.add(new Label(vi.getVisitorFName()), 2, i + 1);
                gPane2.add(new Label(vi.getVisitorLName()), 3, i + 1);
                gPane2.add(new Label(vi.getVisitorDate()), 4, i + 1);
                gPane2.add(new Label(vi.getInmateVisited()), 5, i + 1);
            }
            sp.setContent(gPane2);

            Scene scene2;
            Stage newStage;
            //make scene2 from gpane2
            scene2 = new Scene(sp, 600, 500);
            //make a stage for scene2
            newStage = new Stage();
            newStage.setScene(scene2);
            //tell stage it is meant to pop-up (Modal)
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.setTitle("View Visitors By Name");
            newStage.show();
        });
        // button uses a scroll pane and adds visitors, sorted by visitorDate
        Button viewVisitorsByDateButton = new Button();
        viewVisitorsByDateButton.setText("View Visitors By Date");
        viewVisitorsByDateButton.setOnAction(e -> {

            ScrollPane sp = new ScrollPane();

            Collections.sort(visitors, Visitor.COMPARE_BY_VISITORDATE);
            GridPane gPane2 = new GridPane();
            gPane2.setHgap(5);
            gPane2.setVgap(5);
            gPane2.add(lVisitorIDNumber, 0, 0);
            gPane2.add(lVisitorSSNumber, 1, 0);
            gPane2.add(lVisitorFName, 2, 0);
            gPane2.add(lVisitorLName, 3, 0);
            gPane2.add(lVisitorDate, 4, 0);
            gPane2.add(lInmateVisited, 5, 0);

            for (int i = 0; i < visitors.size(); i++) {
                Visitor vi = visitors.get(i);
                gPane2.add(new Label(vi.getVisitorIDNumber()), 0, i + 1);
                gPane2.add(new Label(vi.getVisitorSSNumber()), 1, i + 1);
                gPane2.add(new Label(vi.getVisitorFName()), 2, i + 1);
                gPane2.add(new Label(vi.getVisitorLName()), 3, i + 1);
                gPane2.add(new Label(vi.getVisitorDate()), 4, i + 1);
                gPane2.add(new Label(vi.getInmateVisited()), 5, i + 1);
            }
            sp.setContent(gPane2);

            Scene scene2;
            Stage newStage;
            //make scene2 from gpane2
            scene2 = new Scene(sp, 600, 500);
            //make a stage for scene2
            newStage = new Stage();
            newStage.setScene(scene2);
            //tell stage it is meant to pop-up (Modal)
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.setTitle("View Visitors By Date");
            newStage.show();
        });
        // button uses a scroll pane and adds visitors, sorted by inmateVisited
        Button viewVisitorsByInmateVisitedButton = new Button();
        viewVisitorsByInmateVisitedButton.setText("View Visitors By Inmate Visited");
        viewVisitorsByInmateVisitedButton.setOnAction(e -> {
            
            ScrollPane sp = new ScrollPane();

            Collections.sort(visitors, Visitor.COMPARE_BY_INMATEVISITED);
            GridPane gPane2 = new GridPane();
            gPane2.setHgap(5);
            gPane2.setVgap(5);
            gPane2.add(lVisitorIDNumber, 0, 0);
            gPane2.add(lVisitorSSNumber, 1, 0);
            gPane2.add(lVisitorFName, 2, 0);
            gPane2.add(lVisitorLName, 3, 0);
            gPane2.add(lVisitorDate, 4, 0);
            gPane2.add(lInmateVisited, 5, 0);
            
            for (int i = 0; i < visitors.size(); i++) {
                Visitor vi = visitors.get(i);
                gPane2.add(new Label(vi.getVisitorIDNumber()), 0, i + 1);
                gPane2.add(new Label(vi.getVisitorSSNumber()), 1, i + 1);
                gPane2.add(new Label(vi.getVisitorFName()), 2, i + 1);
                gPane2.add(new Label(vi.getVisitorLName()), 3, i + 1);
                gPane2.add(new Label(vi.getVisitorDate()), 4, i + 1);
                gPane2.add(new Label(vi.getInmateVisited()), 5, i + 1);
            }
            sp.setContent(gPane2);

            Scene scene2;
            Stage newStage;
            //make scene2 from gpane2
            scene2 = new Scene(sp, 600, 500);
            //make a stage for scene2
            newStage = new Stage();
            newStage.setScene(scene2);
            //tell stage it is meant to pop-up (Modal)
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.setTitle("View Visitors By Inmate Visited");
            newStage.show();
        });
        // add buttons and combobox to top pane
        topPane.getChildren().addAll(bookInmateButton, editInmateCbox, viewInmatesByNameButton,
                viewInmatesByCellBlockButton, viewVisitorsByNameButton, viewVisitorsByDateButton,
                viewVisitorsByInmateVisitedButton);
        Scene scene = new Scene(pane, 1000, 600);
        // set and show the scene
        primaryStage.setTitle("Sheriff Office Booking System");
        primaryStage.setScene(scene);
        primaryStage.show();
        // set gpane and toppane to top and center of borderpane
        pane.setTop(topPane);
        pane.setCenter(gPane);
    }

    public static void main(String[] args) {
        launch(args);
    }
    // method shows all info for Inmate object
    private void showInmateInfo() {
        Button addInmateButton = new Button("Add Inmate");
        addInmateButton.setOnAction(e -> {
            Inmate newInmateX = new Inmate();
            newInmateX.setIdNumber(tIDNumber.getText());
            newInmateX.setFirstName(tFirstName.getText());
            newInmateX.setLastName(tLastName.getText());
            newInmateX.setAge(tAge.getText());
            newInmateX.setHeight(tHeight.getText());
            newInmateX.setWeight(tWeight.getText());
            newInmateX.setEthnicity(ethnicityCbox.getValue());
            newInmateX.setCourtDate(tCourtDate.getText());
            newInmateX.setDateArrested(tDateArrested.getText());
            newInmateX.setDateReleased(tDateReleased.getText());
            newInmateX.setCellBlock(cellBlockCbox.getValue());
            newInmateX.setCell(cellsCbox.getValue());
            newInmateX.setStatus(statusCbox.getValue());
            newInmateX.setVisitorLog(tVisitorLog.getText());
            inmates.add(newInmateX);
            editInmateCbox.getItems().add(newInmateX.getIdNumber());
        });
        gPane.setAlignment(Pos.CENTER);
        gPane.setPadding(new Insets(20, 20, 20, 20));
        gPane.setHgap(5);
        gPane.setVgap(5);
        gPane.add(lIDNumber, 0, 0);
        gPane.add(tIDNumber, 1, 0);
        gPane.add(lFirstName, 0, 1);
        gPane.add(tFirstName, 1, 1);
        gPane.add(lLastName, 0, 2);
        gPane.add(tLastName, 1, 2);
        gPane.add(lAge, 0, 3);
        gPane.add(tAge, 1, 3);
        gPane.add(lHeight, 0, 4);
        gPane.add(tHeight, 1, 4);
        gPane.add(lWeight, 0, 5);
        gPane.add(tWeight, 1, 5);
        gPane.add(lEthnicity, 0, 6);
        gPane.add(ethnicityCbox, 1, 6);
        gPane.add(lCourtDate, 0, 7);
        gPane.add(tCourtDate, 1, 7);
        gPane.add(lDateArrested, 0, 8);
        gPane.add(tDateArrested, 1, 8);
        gPane.add(lDateReleased, 0, 9);
        gPane.add(tDateReleased, 1, 9);
        gPane.add(lCellBlock, 0, 10);
        gPane.add(cellBlockCbox, 1, 10);
        gPane.add(lCell, 0, 11);
        gPane.add(cellsCbox, 1, 11);
        gPane.add(lStatus, 0, 12);
        gPane.add(statusCbox, 1, 12);
        gPane.add(lVisitorLog, 0, 13);
        gPane.add(tVisitorLog, 1, 13);
        gPane.add(addInmateButton, 1, 14);
    }
    // method changes labels to fit corresponding inmate attributes
    private void changeLabels(String idNumber, String firstName, String lastName,
            String age, String height, String weight, String ethnicity,
            String courtDate, String dateArrested, String dateReleased,
            String cellBlock, String cell, String status, String visitorLog) {
        // set textfields to inmate attributes
        tIDNumber.setText(idNumber);
        tFirstName.setText(firstName);
        tLastName.setText(lastName);
        tAge.setText(age);
        tHeight.setText(height);
        tWeight.setText(weight);
        ethnicityCbox.setValue(ethnicity);
        tCourtDate.setText(courtDate);
        tDateArrested.setText(dateArrested);
        tDateReleased.setText(dateReleased);
        cellBlockCbox.setValue(cellBlock);
        cellsCbox.setValue(cell);
        statusCbox.setValue(status);
        tVisitorLog.setText(visitorLog);
    }
}
