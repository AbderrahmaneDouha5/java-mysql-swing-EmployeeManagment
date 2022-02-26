/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posant.mainapp;

import java.util.List;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.ArrayList;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.time.*;
import java.util.concurrent.*;
import javax.swing.table.DefaultTableModel;
import posant.databases.*;
import java.time.format.DateTimeFormatter;

public class myDate {
    Calendar c ;
    SimpleDateFormat f;
    SimpleDateFormat f2;
    public myDate(String dbname){
        c = new GregorianCalendar();
        f = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
    }
    public myDate(){
        c = new GregorianCalendar();
        f = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        
    }
    
    public int get_month_days(){
        GregorianCalendar date = new GregorianCalendar();
        return date.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
    public List<String> years(){ 
        List<String> result = new ArrayList<>();
        result.add("--");
        for(Integer i=c.get(Calendar.YEAR);i>=1950;i--) result.add(i.toString());
        return result;
    }
    
    public List<String> months(){
        List<String> result = new ArrayList<>();
        result.add("--");
        for(Integer i=1;i<=12;i++) result.add(myDate.number_form(i));
        return result;
    }
    
    public List<String> days(){
        List<String> result = new ArrayList<>();
        result.add("--");
        for(Integer i =1;i <= 31;i++) result.add(myDate.number_form(i));
        return result;
    }
    
    public String current_date(){
        return f.format(new Date());
    }
    public String current_date_time(){
        return f2.format(new Date());
    }
    
    public String current_year(){
        return f.format(new Date()).substring(0, 4);
    }
    
    public String current_month(){
        return f.format(new Date()).substring(5, 7);
    }
    
    public String current_day(){
        return f.format(new Date()).substring(8);
    }
    
    public String form_date(int year,int  month, int day){

        return f.format(new GregorianCalendar(year-1,month,day).getTime());
    }
    
    
    public void display_years(javax.swing.JComboBox<String> combo){
        for(String x:years()) combo.addItem(x);
    }
    
    public void display_months(javax.swing.JComboBox<String> combo){
        for(String x:months()) combo.addItem(x);
    }
    
    public void display_days(javax.swing.JComboBox<String> combo){
        for(String x:days()) combo.addItem(x);
    }
    public void display_all(javax.swing.JComboBox<String> years_combo,javax.swing.JComboBox<String> months_combo,javax.swing.JComboBox<String> days_combo){
        display_years(years_combo);
        display_months(months_combo);
        display_days(days_combo);
    }
    static private String number_form(Integer i){
        return i.toString().length() == 2 ? i.toString():"0"+i.toString();
    }
    
    
    
    public void event_schedule(Runnable task,long time){
        ScheduledExecutorService event = Executors.newScheduledThreadPool(1);	 
        event.schedule( task, time, TimeUnit.SECONDS);
    }
    
    public long duration_two_date(String date){
    LocalDate d1 = LocalDate.parse(this.current_date_time(), DateTimeFormatter.ISO_LOCAL_DATE);
    LocalDate d2 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
    Duration diff = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());
    long diffseconds = diff.toSeconds();
    return diffseconds;
    }
}
