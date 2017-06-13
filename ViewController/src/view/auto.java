package view;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

public class auto {
    public auto() {
        super();
    }
    public List<SelectItem> autoCity(String string) {
        // Add e000vent code here...
        List<SelectItem> item = new ArrayList();
        try {

            java.sql.Connection con = view.backing.dbcon.getConnection();
            java.sql.Statement stt = con.createStatement();
            java.sql.ResultSet rs = stt.executeQuery("select city from state_city where city like '"+string+"%'");
            while (rs.next()) {
                item.add(new SelectItem(rs.getString(1)));
            }
        } catch (Exception er) {
        }
        return item;
    }

    public List<SelectItem> autoState(String string) {
        // Add event code here...
       
            List<SelectItem> item = new ArrayList();
            try {

                java.sql.Connection con = view.backing.dbcon.getConnection();
                java.sql.Statement stt = con.createStatement();
                java.sql.ResultSet rs = stt.executeQuery("select state from state_city where state like '"+string+"%'");
                while (rs.next()) {
                    item.add(new SelectItem(rs.getString(1)));
                }
            } catch (Exception er) {
            }
            return item;
        }
    
}
