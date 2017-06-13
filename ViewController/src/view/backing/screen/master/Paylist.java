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
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

import view.TableData;

import view.backing.dbcon;

public class Paylist {
    private RichForm f1;
    private RichDocument d1;
    private RichButton b1;
    private RichLink l1;
    private RichLink l2;
    private RichLink l3;
    private RichLink l8;
    private RichOutputLabel ol1;
    private RichButton b4;
    private RichPanelGroupLayout pgl2;
    private RichTable t1;
    private static List<TableData> adfTable = new ArrayList<TableData>();
    private RichOutputLabel ol2;

    public void setAdfTable(List<TableData> adfTable) {
        Paylist.adfTable = adfTable;
    }

    public List<TableData> getAdfTable() {
        return adfTable;
    }

    public void setL8(RichLink l8) {
        this.l8 = l8;
    }

    public RichLink getL8() {
        return l8;
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }

    public void setOl1(RichOutputLabel ol1) {
        this.ol1 = ol1;
    }

    public RichOutputLabel getOl1() {
        return ol1;
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

    public void bphase(PhaseEvent phaseEvent) {
        // Add event code here...
      CheckStatus();
        
        // Add event code here...
        try {
            getAdfTable().clear();
            Connection con = dbcon.getConnection();
            Statement stt = con.createStatement();
            ResultSet rs =
                stt.executeQuery("select tid,custid,boothid,date,vno,amount from payment where  done= '1'");
            System.out.print("select tid,custid,boothid,date,vno,amount from payment where done='1'");
            while (rs.next()) {
                TableData ex1 = new TableData();
                ex1.setA(rs.getString(1));
                ex1.setB(rs.getString(2));
                ex1.setD(rs.getString(4));
                ex1.setC(rs.getString(3));
                ex1.setE(rs.getString(5));
                ex1.setF(rs.getString(6));
                
                getAdfTable().add(ex1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public String CheckStatus() {
        System.out.println("i am here in check status");
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        System.out.println("i am here in check status session " + session.getAttribute("login"));
        if (session.getAttribute("login") != null) {
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
                                                                                "/faces/admin.jsf");
            } catch (Exception er) {
                er.printStackTrace();
            }
        }
        return "";
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setL1(RichLink l1) {
        this.l1 = l1;
    }

    public RichLink getL1() {
        return l1;
    }

    public void setL2(RichLink l2) {
        this.l2 = l2;
    }

    public RichLink getL2() {
        return l2;
    }

    public void setL3(RichLink l3) {
        this.l3 = l3;
    }

    public RichLink getL3() {
        return l3;
    }

    public String logout() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.removeAttribute("login");
        session.invalidate();
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() +
                                                                            "/faces/admin.jsf");
        } catch (Exception er) {
        }
        return "/faces/home.jsf";
            }

    public String pay() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
          session.putValue("login",session.getAttribute("login"));
        
        return "paylist.jsf";
    }

    public String tolltax() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
          session.putValue("login",session.getAttribute("login"));
        
        return "tolltax.jsf";
    }

    public String boothdetail() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
          session.putValue("login",session.getAttribute("login"));
        return "booth_list.jsf";
    }

    public String staffdetail() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
          session.putValue("login",session.getAttribute("login"));
        return "staff_list.jsf";
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

    public void setOl2(RichOutputLabel ol2) {
        this.ol2 = ol2;
    }

    public RichOutputLabel getOl2() {
        return ol2;
    }
}
