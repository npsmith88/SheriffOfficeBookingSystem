/*CIST 2372
Nic Smith
Final Project - Sheriff Office Booking System */
package sheriffofficebookingsystem;

import java.util.Comparator;

public class Visitor {
    protected 
            // variables
            String visitorIDNumber, visitorSSNumber, visitorFName, visitorLName, visitorDate, inmateVisited;
    public 
            // constructors
            Visitor(String vid, String vss, String vfn, String vln, String vd, String iv) {
                visitorIDNumber = vid;
                visitorSSNumber = vss;
                visitorFName = vfn;
                visitorLName = vln;
                visitorDate = vd;
                inmateVisited = iv;
            }
            // accessors and mutators
            String getVisitorIDNumber() {
                return visitorIDNumber;
            }
            String getVisitorSSNumber() {
                return visitorSSNumber;
            }
            String getVisitorFName() {
                return visitorFName;
            }
            String getVisitorLName() {
                return visitorLName;
            }
            String getVisitorDate() {
                return visitorDate;
            }
            String getInmateVisited() {
                return inmateVisited;
            }
            void setVisitorIDNumber(String vid) {
                visitorIDNumber = vid;
            }
            void setVisitorSSNumber(String vss) {
                visitorSSNumber = vss;
            }
            void setVisitorFName(String vfn) {
                visitorFName = vfn;
            }
            void setVisitorLName(String vln) {
                visitorLName = vln;
            }
            void setVisitorDate(String vd) {
                visitorDate = vd;
            }
            void setInmateVisited(String iv) {
                inmateVisited = iv;
            }
        // compares visitors by their last name
        static Comparator<Visitor> COMPARE_BY_VISITORLNAME = 
                (Visitor v1, Visitor v2) -> v1.getVisitorLName().compareTo(v2.getVisitorLName());
        // compares visitors by date visited
        static Comparator<Visitor> COMPARE_BY_VISITORDATE = 
                (Visitor v1, Visitor v2) -> v1.getVisitorDate().compareTo(v2.getVisitorDate());
        // compares visitors by inmate visited
        static Comparator<Visitor> COMPARE_BY_INMATEVISITED = 
                (Visitor v1, Visitor v2) -> v1.getInmateVisited().compareTo(v2.getInmateVisited());
}
