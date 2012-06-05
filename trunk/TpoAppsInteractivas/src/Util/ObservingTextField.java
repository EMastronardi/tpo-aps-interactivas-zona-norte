package Util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;

import com.qt.datapicker.DatePicker;

public class ObservingTextField extends JTextField implements Observer {
    
	public void update(Observable o, Object arg) {
        Calendar calendar = (Calendar) arg;
        DatePicker dp = (DatePicker) o;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                
        setText(dateFormat.format(calendar.getTime()));
    }
}
