/*CIST 2372
Nic Smith
Final Project - Sheriff Office Booking System */
package sheriffofficebookingsystem;

import java.util.Comparator;

public class Inmate extends CellBlock {
    protected
            // variables
            String idNumber, firstName, lastName, age, height, weight, ethnicity,
                   cellBlock, cell, courtDate, dateArrested, dateReleased, status, visitorLog;
    public
            // constructors
            Inmate (){}
            Inmate(String idn, String fn, String ln, String a, String h, String w, String e, String cd,
                    String da, String dr, String cb, String c, String s, String vl) {
                idNumber = idn;
                firstName = fn;
                lastName  =ln;
                age = a;
                height = h;
                weight = w;
                ethnicity = e;
                courtDate = cd;
                dateArrested = da;
                dateReleased = dr;
                cellBlock = cb;
                cell = c;
                status = s;
                visitorLog = vl;
            }
            // accessors and mutators
            String getIdNumber() {
                return idNumber;
            }
            String getAge() {
                return age;
            }
            String getHeight() {
                return height;
            }
            String getWeight() {
                return weight;
            }
            String getCellBlock() {
                return cellBlock;
            }
            String getFirstName() {
                return firstName;
            }
            String getLastName() {
                return lastName;
            }
            String getCourtDate() {
                return courtDate;
            }
            String getEthnicity() {
                return ethnicity;
            }
            String getDateArrested() {
                return dateArrested;
            }
            String getDateReleased() {
                return dateReleased;
            }
            String getCell() {
                return cell;
            }
            String getStatus() {
                return status;
            }
            String getVisitorLog() {
                return visitorLog;
            }
            void setIdNumber(String idn) {
                idNumber = idn;
            }
            void setAge(String a) {
                age = a;
            }
            void setHeight(String h) {
                height = h;
            }
            void setWeight(String w) {
                weight = w;
            }
            void setCellBlock(String cb) {
                cellBlock = cb;
            }
            void setFirstName(String fn) {
                firstName = fn;
            }
            void setLastName(String ln) {
                lastName = ln;
            }
            void setEthnicity(String e) {
                ethnicity = e;
            }
            void setCourtDate(String cd) {
                courtDate = cd;
            }
            void setDateArrested(String da) {
                dateArrested = da;
            }
            void setDateReleased(String dr) {
                dateReleased = dr;
            }
            void setCell(String c) {
                cell = c;
            }
            void setStatus(String s) {
                status = s;
            }
            void setVisitorLog(String vl) {
                visitorLog = vl;
            }
        // compares inmates by their last name
        static Comparator<Inmate> COMPARE_BY_LASTNAME = 
                (Inmate i1, Inmate i2) -> i1.getLastName().compareTo(i2.getLastName());
        // compares inmates by their cell block
        static Comparator<Inmate> COMPARE_BY_CELLBLOCK = 
                (Inmate i1, Inmate i2) -> i1.getCellBlock().compareTo(i2.getCellBlock());
}
