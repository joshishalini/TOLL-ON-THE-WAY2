package view.backing.screen.master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.PhaseEvent;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

import view.TableData;

import view.backing.dbcon;

public class Activetoll {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelGroupLayout pgl2;
    private RichOutputLabel ol1;
    private RichTable t1;
    private static List<TableData> adfTable = new ArrayList<TableData>();

    public void setAdfTable(List<TableData> adfTable) {
        Activetoll.adfTable = adfTable;
    }

    public List<TableData> getAdfTable() {
        return adfTable;
    }

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public String staff() {
        // Add event code here...
        return "/faces/stafflogin.jsf";
    }

    public String user() {
        // Add event code here...
        return "/faces/custlogin.jsf";
    }

    public String toll() {
        // Add event code here...
        return "activetoll.jsf";
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setOl1(RichOutputLabel ol1) {
        this.ol1 = ol1;
    }

    public RichOutputLabel getOl1() {
        return ol1;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void bphase(PhaseEvent phaseEvent) {
        // Add event code here...
        try {
            getAdfTable().clear();
            Connection con = dbcon.getConnection();
            Statement stt = con.createStatement();
            ResultSet rs =
                stt.executeQuery("select id,name,state,city,email,phno,website,noofstaff from booth_detail group by id");
            System.out.print("select id,city,state,name from booth_detail group by id");
            while (rs.next()) {
                TableData ex1 = new TableData();
                ex1.setId(rs.getString(1));
                ex1.setName(rs.getString(2));
                ex1.setCity(rs.getString(4));
                ex1.setState(rs.getString(3));
                ex1.setA(rs.getString(5));
                ex1.setB(rs.getString(6));
                ex1.setC(rs.getString(7));
                ex1.setD(rs.getString(8));
                
                getAdfTable().add(ex1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
