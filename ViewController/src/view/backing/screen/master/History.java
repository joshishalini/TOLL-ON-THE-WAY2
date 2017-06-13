package view.backing.screen.master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;

import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

import view.TableData;

import view.backing.dbcon;

public class History {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelGroupLayout pgl2;
    private RichTable t1;
    private static List<TableData> adfTable = new ArrayList<TableData>();
    private RichOutputLabel ol1;

    public void setAdfTable(List<TableData> adfTable) {
        History.adfTable = adfTable;
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

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }
    public String CheckStatus() {
        System.out.println("i am here in check status");
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        System.out.println("i am here in check status session " + session.getAttribute("id"));
        if (session.getAttribute("id") != null) {
            try {
                //FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() +
                //       "/faces/screen/master/booth_list.jsf");
            } catch (Exception er) {
                er.printStackTrace();
            }


        } else {
            System.out.println("i am here in check status else");
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() +
                                                                                "/faces/custlogin.jsf");
            } catch (Exception er) {
                er.printStackTrace();
            }
        }
        return "";
    }

    public void bphase(PhaseEvent phaseEvent) {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        CheckStatus();
        // Add event code here...
        try {
            getAdfTable().clear();
            Connection con = dbcon.getConnection();
            Statement stt = con.createStatement();
            ResultSet rs =
                stt.executeQuery("select tid,boothid,date,vno,amount from payment where custid='"+session.getAttribute("id")+"'&& done= '1'");
            System.out.print("select tid,boothid,date,vno,amount from payment where custid='"+session.getAttribute("id")+"'&& done='1'");
            while (rs.next()) {
                TableData ex1 = new TableData();
                ex1.setA(rs.getString(1));
                ex1.setB(rs.getString(2));
                ex1.setD(rs.getString(4));
                ex1.setC(rs.getString(3));
                ex1.setE(rs.getString(5));
               
                
                getAdfTable().add(ex1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public String pay() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
         String a= session.getAttribute("id").toString();
        session.putValue("id", a);
        System.out.println("valueee search----->"+a);
        return "search.jsf";
    }

    public String logout() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.removeAttribute("id");
        session.invalidate();
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() +
                                                                            "/faces/home.jsf");
        } catch (Exception er) {
        }
        return "/faces/home.jsf";
    }

    public void setOl1(RichOutputLabel ol1) {
        this.ol1 = ol1;
    }

    public RichOutputLabel getOl1() {
        return ol1;
    }
}
