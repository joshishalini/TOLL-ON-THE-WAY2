package view.backing.screen.master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;

import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;

import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.context.AdfFacesContext;

import view.TableData;

import view.TableData2;

import view.backing.dbcon;

public class Staff {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelTabbed pt1;
    private RichShowDetailItem sdi1;
    private RichTable t1;
    private RichShowDetailItem sdi2;
    private RichTable t2;
    private RichButton b4;

    public void setAdfTableTwo(List<TableData2> adfTableTwo) {
        Staff.adfTableTwo = adfTableTwo;
    }

    public List<TableData2> getAdfTableTwo() {
        return adfTableTwo;
    }
    private static List<TableData> adfTable = new ArrayList<TableData>();
    private static List<TableData2> adfTableTwo = new ArrayList<TableData2>();


    public void setAdfTable(List<TableData> adfTable) {
        Staff.adfTable = adfTable;
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
    public String CheckStatus() {
        System.out.println("i am here in check status");
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        System.out.println("i am here in check status session " + session.getAttribute("boothid"));
        if (session.getAttribute("boothid") != null) {
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
                                                                                "/faces/stafflogin.jsf");
            } catch (Exception er) {
                er.printStackTrace();
            }
        }
        return "";
    }

    public void bphase(PhaseEvent phaseEvent) {
        // Add event code here...
        CheckStatus(); 
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        try {
            getAdfTableTwo().clear();
            getAdfTable().clear();
            Connection con = dbcon.getConnection();
            Statement stt = con.createStatement();
            System.out.println("select tid,custid,boothid,vtype,vno,tjourney, date from delpay where datediff(curdate(),date)<=1 && boothid='" +
                               session.getAttribute("boothid") + "'&& done='" + 1 +
                               "' group by tid  order by date asc");
            ResultSet rss =
                stt.executeQuery("select tid,custid,boothid,vtype,vno,tjourney, date from delpay where datediff(curdate(),date)<=1 && boothid='" +
                                 session.getAttribute("boothid") + "'&& done='" + 1 +
                                 "' group by tid  order by date asc");
            int i = 1;
            while (rss.next()) {
                TableData2 ex1 = new TableData2();
                ex1.setA(rss.getString("tid"));
                i++;
                ex1.setB(rss.getString("custid"));
                ex1.setC(rss.getString("boothid"));
                ex1.setD(rss.getString("vtype"));
                ex1.setE(rss.getString("vno"));
                ex1.setF(rss.getString("tjourney"));
                ex1.setG(rss.getString("date"));
                //    ex1.setTime("screen/master/s_notice.jsf?id="+rs.getString(1));
                getAdfTableTwo().add(ex1);
                //    ex1.setTime("screen/master/s_notice.jsf?id="+rs.getString(1));

            }
            //getAdfTable().clear();
            System.out.println("select tid,custid,boothid,vtype,vno,tjourney, date from delpay where datediff(curdate(),date)>1 && boothid='" +
                               session.getAttribute("boothid") + "'&& done='" + 1 +
                               "' group by tid  order by date asc");
            ResultSet rs =
                stt.executeQuery("select tid,custid,boothid,vtype,vno,tjourney, date from delpay where datediff(curdate(),date)>1 && boothid='" +
                                 session.getAttribute("boothid") + "'&& done='" + 1 +
                                 "' group by tid  order by date asc");
            int n = 1;
            while (rs.next()) {
                TableData ex1 = new TableData();
                ex1.setId(rs.getString("tid"));
                i++;
                ex1.setName(rs.getString("custid"));
                ex1.setState(rs.getString("boothid"));
                ex1.setCity(rs.getString("vtype"));
                ex1.setPhno(rs.getString("vno"));
                ex1.setPayment(rs.getString("tjourney"));

                ex1.setStaff(rs.getString("date"));
                //    ex1.setTime("screen/master/s_notice.jsf?id="+rs.getString(1));
                getAdfTable().add(ex1);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setPt1(RichPanelTabbed pt1) {
        this.pt1 = pt1;
    }

    public RichPanelTabbed getPt1() {
        return pt1;
    }

    public void setSdi1(RichShowDetailItem sdi1) {
        this.sdi1 = sdi1;
    }

    public RichShowDetailItem getSdi1() {
        return sdi1;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setSdi2(RichShowDetailItem sdi2) {
        this.sdi2 = sdi2;
    }

    public RichShowDetailItem getSdi2() {
        return sdi2;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public String delpay() {
        // Add event code here...
        return null;
    }

    public String newdelpay() {
        // Add event code here...
        return null;
    }

    public String paydone() {
        // Add event code here...
        String tid = getAdfTableTwo().get(getT2().getRowIndex()).getA();
        try {
            getAdfTableTwo().clear();
            Connection con = dbcon.getConnection();
            Statement stt = con.createStatement();
            System.out.println("VALueeeeeeeeee--------------------->" + tid);
            System.out.println("delete from delpay where tid='" + tid + "'");
            stt.executeUpdate("delete from delpay where tid='" + tid + "'");
            AdfFacesContext.getCurrentInstance().addPartialTarget(t2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public String ppay() {
        // Add event code here...
        String tid = getAdfTable().get(getT1().getRowIndex()).getId();
        try {
            getAdfTable().clear();
            Connection con = dbcon.getConnection();
            Statement stt = con.createStatement();
            System.out.println("delete from delpay where tid='" + tid + "'");
            stt.executeUpdate("delete from delpay where tid='" + tid + "'");
            AdfFacesContext.getCurrentInstance().addPartialTarget(t1);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }

    public String home() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.removeAttribute("boothid");
        session.invalidate();
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() +
                                                                            "/faces/home.jsf");
        } catch (Exception er) {
        }
        return "/faces/home.jsf";}
}
