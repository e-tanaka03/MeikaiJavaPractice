package day;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Day {
    GregorianCalendar today = new GregorianCalendar();
    int[] DayMax =     {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int[] LeapDayMax = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    private int year = 1;
    private int month = 1;
    private int date = 1;

    public static boolean isLeap(int y){
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    }

    public Day(){
        year = today.get(YEAR);
        month = today.get(MONTH) + 1;
        date = today.get(DATE);
    }
    public Day(int year){
        if (year > 0) {
            this.year = year;
        }
        else{
            this.year = 1;
        }
    }
    public Day(int year, int month){
        this(year);
        if ((1 <= month) && (month <= 12)) {
            this.month = month;
        }
        else{
            if (month < 1) {
                this.month = 1;
            }
            else if (month > 12) {
                this.month = 12;
            }
        }
    }
    public Day(int year, int month, int date){
        this(year, month);
        if (isLeap()) {
            if ((1 <= date) && (date <= LeapDayMax[this.month - 1])) {
                this.date = date;
            }
            else{
                if (date < 1) {
                    this.date = 1;
                }
                else if (date > LeapDayMax[this.month - 1]) {
                    this.date = LeapDayMax[this.month - 1];
                }
            }
        }
        else{
            if ((1 <= date) && (date <= DayMax[this.month - 1])) {
                this.date = date;
            }
            else{
                if (date < 1) {
                    this.date = 1;
                }
                else if (date > DayMax[this.month - 1]) {
                    this.date = DayMax[this.month - 1];
                }
            }
        }
    }
    public Day(Day d){
        this(d.year, d.month, d.date);
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDate(){
        return date;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setDate(int date){
        this.date = date;
    }

    public void set(int year, int month, int date){
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public boolean isLeap(){
        return isLeap(year);
    }

    public int dayOfWeek(){
        int y = year;
        int m = month;
        if(m == 1 || m == 2){
            y--;
            m += 12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
    }

    public boolean equalTo(Day d){
        return year == d.year && month == d.month && date == d.date;
    }

    public String toString(){
        String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
        return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
    }

    public int elapsedDay(){
        int day = 0;
        
        if (isLeap()) {
            for(int i = 1; i < month; i++){
                day += LeapDayMax[i - 1];
            }

            day += date;
        }
        else{
            for(int i = 1; i < month; i++){
                day += DayMax[i - 1];
            }

            day += date;
        }

        return day;
    }

    public int remainDay(){
        int day = 0;

        if (isLeap()) {
            for(int i = 12; i > month; i--){
                day += LeapDayMax[i - 1];
            }

            day += LeapDayMax[month - 1] - date;
        }
        else{
            for(int i = 12; i > month; i--){
                day += DayMax[i - 1];
            }
    
            day += DayMax[month - 1] - date;
        }
        return day;
    }

    
    public static int compareTo(Day d1, Day d2){
        int compare;    // -1:d2よりd1が前日 0:d1とd2は同日 1:d2よりd1が後日
        
        if (d1.equalTo(d2)) {
            compare = 0;
        }
        else{
            if (d1.getYear() > d2.getYear()) {
                compare = 1;
            }
            else if (d1.getYear() < d2.getYear()) {
                compare = -1;
            }
            else{
                if (d1.getMonth() > d2.getMonth()) {
                    compare = 1;
                }
                else if (d1.getMonth() < d2.getMonth()) {
                    compare = -1;
                }
                else{
                    if (d1.getDate() > d2.getDate()) {
                        compare = 1;
                    }
                    else{
                        compare = -1;
                    }
                }
            }
        }
        
        return compare;
    }

    public int compareTo(Day d){
        return compareTo(this, d);
    }

    public void advaceDay(){
        if (isLeap()) {
            if (date + 1 > LeapDayMax[month - 1]) {
                if (month + 1 > 12) {
                    year++;
                    month = 1;
                    date = 1;
                }
                else{
                    month++;
                    date = 1;
                }
            }
            else{
                date++;
            }
        }
        else{
            if (date + 1 > DayMax[month - 1]) {
                if (month + 1 > 12) {
                    year++;
                    month = 1;
                    date = 1;
                }
                else{
                    month++;
                    date = 1;
                }
            }
            else{
                date++;
            }
        }
    }

    public Day nextDay(){
        Day d = new Day(this);
        d.advaceDay();

        return d;
    }

    public void retreatDay(){
        if (date - 1 < 1) {
            if (month - 1 < 1) {
                year--;
                month = 12;
                date = 31;
            }
            else{
                month--;
                if (isLeap()) {
                    date = LeapDayMax[month - 1];
                }
                else{
                    date = DayMax[month - 1];
                }
            }
        }
        else{
            date--;
        }
    }

    public Day beforeDay(){
        Day d = new Day(this);
        d.retreatDay();

        return d;
    }

    public void advaceNDay(int n){
        for(int i = 0; i < n; i++){
            advaceDay();
        }
    }

    public Day nextNDay(int n){
        Day d = new Day(this);
        d.advaceNDay(n);

        return d;
    }

    public void retreatNDay(int n){
        for(int i = 0; i < n; i++){
            retreatDay();
        }
    }

    public Day beforeNDay(int n){
        Day d = new Day(this);
        d.retreatNDay(n);

        return d;
    }
}