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
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectItem;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

import view.TableData;

import view.backing.dbcon;

public class Search {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelGroupLayout pgl1;
    private RichPanelGroupLayout pgl2;
    private RichOutputLabel ol1;
    private RichSelectOneChoice soc1;
    private RichSelectItem si1;
    private RichSelectItem si2;
    private RichTable t1;
    private RichPanelGroupLayout pgl3;
    private static List<TableData> adfTable = new ArrayList<TableData>();
    private RichPanelGroupLayout pgl4;
    private RichOutputLabel ol2;
    private RichLink l1;
    private RichLink l2;
    private RichLink l3;
    private RichOutputLabel ol5;
    private RichInputText it1;
    private RichButton b2;

    public void setL5(RichLink l5) {
        this.l5 = l5;
    }

    public RichLink getL5() {
        return l5;
    }

    public void setL6(RichLink l6) {
        this.l6 = l6;
    }

    public RichLink getL6() {
        return l6;
    }

    public void setL7(RichLink l7) {
        this.l7 = l7;
    }

    public RichLink getL7() {
        return l7;
    }

    public void setOl12(RichOutputLabel ol12) {
        this.ol12 = ol12;
    }

    public RichOutputLabel getOl12() {
        return ol12;
    }

    public void setOl3(RichOutputLabel ol3) {
        this.ol3 = ol3;
    }

    public RichOutputLabel getOl3() {
        return ol3;
    }

    public void setOl4(RichOutputLabel ol4) {
        this.ol4 = ol4;
    }

    public RichOutputLabel getOl4() {
        return ol4;
    }
    private RichLink l5;
    private RichLink l6;
    private RichLink l7;
    private RichOutputLabel ol12;
    private RichOutputLabel ol3;
    private RichOutputLabel ol4;
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

    public void setAdfTable(List<TableData> adfTable) {
        Search.adfTable = adfTable;
    }

    public  List<TableData> getAdfTable() {
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

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
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

    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }

    public void setSi1(RichSelectItem si1) {
        this.si1 = si1;
    }

    public RichSelectItem getSi1() {
        return si1;
    }

    public void setSi2(RichSelectItem si2) {
        this.si2 = si2;
    }

    public RichSelectItem getSi2() {
        return si2;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
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
        // Add event code here...
        CheckStatus();
        try {
            getAdfTable().clear();
            Connection con = dbcon.getConnection();
            Statement stt = con.createStatement();
            ResultSet rs =
                stt.executeQuery("select id,city,state,name from booth_detail group by id");
            System.out.print("select id,city,state,name from booth_detail group by id");
            while (rs.next()) {
                TableData ex1 = new TableData();
                ex1.setId(rs.getString(1));
                ex1.setName(rs.getString(2));
                ex1.setBooth(rs.getString(4));
                ex1.setState(rs.getString(3));
                
                getAdfTable().add(ex1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String payment() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        String idbooth = getAdfTable().get(getT1().getRowIndex()).getId();
        session.putValue("idbooth", idbooth);
         String a= session.getAttribute("id").toString();
        session.putValue("id", a);
        System.out.println("valueee search----->"+a);
        return "payment.jsf";
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setOl2(RichOutputLabel ol2) {
        this.ol2 = ol2;
    }

    public RichOutputLabel getOl2() {
        return ol2;
    }

    public void setOl5(RichOutputLabel ol5) {
        this.ol5 = ol5;
    }

    public RichOutputLabel getOl5() {
        return ol5;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
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

    public String history() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
         String id= session.getAttribute("id").toString();
        session.putValue("id", id);
        System.out.println("valueee search----->"+id);
        return "history.jsf";
    }
}
