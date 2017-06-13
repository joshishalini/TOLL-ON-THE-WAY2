
package view.backing.screen.master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.html.HtmlCommandLink;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.ValueChangeEvent;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichMenu;
import oracle.adf.view.rich.component.rich.RichPanelWindow;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectItem;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandMenuItem;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichIcon;
import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

import oracle.adf.view.rich.context.AdfFacesContext;

import org.apache.myfaces.trinidad.event.SelectionEvent;

import view.TableData;

import view.backing.dbcon;

public class Staff_list {
    private RichLink l8;
    private RichButton b3;
   

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
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

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setL3(RichLink l3) {
        this.l3 = l3;
    }

    public RichLink getL3() {
        return l3;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setCl1(HtmlCommandLink cl1) {
        this.cl1 = cl1;
    }

    public HtmlCommandLink getCl1() {
        return cl1;
    }

    public void setL4(RichLink l4) {
        this.l4 = l4;
    }

    public RichLink getL4() {
        return l4;
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }

    public void setI1(RichIcon i1) {
        this.i1 = i1;
    }

    public RichIcon getI1() {
        return i1;
    }

    public void setI2(RichImage i2) {
        this.i2 = i2;
    }

    public RichImage getI2() {
        return i2;
    }

    public void setCl2(HtmlCommandLink cl2) {
        this.cl2 = cl2;
    }

    public HtmlCommandLink getCl2() {
        return cl2;
    }

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

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
    }

    public void setPgl7(RichPanelGroupLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGroupLayout getPgl7() {
        return pgl7;
    }
    private RichDocument d1;
    private RichSelectOneChoice soc1;
    private RichSelectItem si1;
    private RichSelectItem si2;
    private RichSelectItem si3, si4;
    private RichInputText it1;
    private RichButton b1, b2;
    private RichPanelGroupLayout pgl1;
    private RichLink l1;
    private RichLink l2;
    private RichPanelGroupLayout pgl2;
    private RichLink l3;
    private RichOutputLabel ol2;
    private RichOutputLabel ol3;
    private RichOutputLabel ol4;
    private RichPanelGroupLayout pgl3;
    private HtmlCommandLink cl1;
    private RichLink l4;
    private RichPanelGroupLayout pgl4;
    private RichPanelGroupLayout pgl5;
    private RichIcon i1;
    private RichImage i2;
    private HtmlCommandLink cl2;
    private RichLink l5;
    private RichLink l6;
    private RichLink l7;
    private RichPanelGroupLayout pgl6;
    private RichOutputLabel ol5;
    private RichInputText it2;
    private RichPanelGroupLayout pgl7;
    private RichOutputLabel ol6;
    private RichInputText it3;

    private RichForm f1;

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setSi4(RichSelectItem si4) {
        this.si4 = si4;
    }

    public RichSelectItem getSi4() {
        return si4;
    }
    private RichPopup p1;
    private RichMenu m1;
    private RichCommandMenuItem cmi1;
    private RichCommandMenuItem cmi2;
    private RichPopup p2;
    private RichPanelWindow pw1;
    private RichOutputLabel ol1;
    private RichInputText it4;
    private RichInputText it5;
    private RichInputText it6;
    private RichInputText it7;
    private RichTable t1;

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

    public void setSi3(RichSelectItem si3) {
        this.si3 = si3;
    }

    public RichSelectItem getSi3() {
        return si3;
    }

    public void choice_val_change(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        if (getSoc1().getValue().equals("BY All")) {
            try {
                Connection con = dbcon.getConnection();
                Statement stt = con.createStatement();
                ResultSet rs =
                    stt.executeQuery("select id,name,phno,jobpost,username,booth_name from staff_detail group by id");
                getAdfTable().clear();
                while (rs.next()) {
                    TableData ex1 = new TableData();
                    ex1.setId(rs.getString(1));
                    ex1.setName(rs.getString(2));
                    ex1.setPhno(rs.getString(3));
                    ex1.setStaff(rs.getString(4));
                    ex1.setUser(rs.getString(5));
                    ex1.setBooth(rs.getString(6));
                    getAdfTable().add(ex1);
                }
                AdfFacesContext.getCurrentInstance().addPartialTarget(t1);
                AdfFacesContext.getCurrentInstance().addPartialTarget(it1);
                getIt1().setDisabled(true);
            } catch (Exception er) {
                er.printStackTrace();
            }
        }
        if (getSoc1().getValue().equals("BY ID")) {
            AdfFacesContext.getCurrentInstance().addPartialTarget(it1);
            getIt1().setDisabled(false);
        }
        if (getSoc1().getValue().equals("BY STAFF NAME")) {
            AdfFacesContext.getCurrentInstance().addPartialTarget(it1);
            getIt1().setDisabled(false);
        }
        if (getSoc1().getValue().equals("BY JOB POST")) {
            AdfFacesContext.getCurrentInstance().addPartialTarget(it1);
            getIt1().setDisabled(false);
        }
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void input_valchange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        if (getSoc1().getValue().toString().equalsIgnoreCase("BY ID")) {
            try {
                Connection con = dbcon.getConnection();
                Statement stt = con.createStatement();
                ResultSet rs =stt.executeQuery("select id,name,phno,jobpost,username,booth_name from staff_detail where id like" +
                                     "'%" + valueChangeEvent.getNewValue().toString() + "%'" + " group by id");
                System.out.printf("select id,name,phno,jobpost,username,booth_name from staff_detail where id like" +
                                     "'%" + valueChangeEvent.getNewValue().toString() + "%'" + " group by id");
                getAdfTable().clear();
                while (rs.next()) {
                    TableData ex1 = new TableData();
                    ex1.setId(rs.getString(1));
                    ex1.setName(rs.getString(2));
                    ex1.setPhno(rs.getString(6));
                    ex1.setStaff(rs.getString(4));
                    ex1.setUser(rs.getString(5));
                    ex1.setBooth(rs.getString(6));
                    getAdfTable().add(ex1);
                }
                AdfFacesContext.getCurrentInstance().addPartialTarget(t1);

            } catch (Exception er) {
                er.printStackTrace();
            }
        }
        if (getSoc1().getValue().equals("By STAFF NAME")) {
            try {
                Connection con = dbcon.getConnection();
                Statement stt = con.createStatement();
                ResultSet rs =
                    stt.executeQuery("select id,name,phno,jobpost,username,booth_name from staff_detail where name like" +
                                     "'%" + valueChangeEvent.getNewValue().toString() + "%'" + " group by id");
                System.out.print("select id,name,phno,jobpost,username,booth_name from staff_detail where name like" +
                                     "'%" + valueChangeEvent.getNewValue().toString() + "%'" + " group by id");
                getAdfTable().clear();
                while (rs.next()) {
                    TableData ex1 = new TableData();
                    ex1.setId(rs.getString(1));
                    ex1.setName(rs.getString(2));
                    ex1.setPhno(rs.getString(3));
                    ex1.setStaff(rs.getString(4));
                    ex1.setUser(rs.getString(5));
                    ex1.setBooth(rs.getString(6));
                    getAdfTable().add(ex1);
                }
                AdfFacesContext.getCurrentInstance().addPartialTarget(t1);
            } catch (Exception er) {
                er.printStackTrace();
            }
        }
        if (getSoc1().getValue().equals("By JOB POST")) {
            try {
                Connection con = dbcon.getConnection();
                Statement stt = con.createStatement();
                ResultSet rs =
                    stt.executeQuery("select id,name,phno,jobpost,username,booth_name from staff_detail where jobpost like" +
                                     "'%" + valueChangeEvent.getNewValue().toString() + "%'" + " group by id");
                System.out.print("select id,name,phno,jobpost,username,booth_name from staff_detail where jobpost like" +
                                     "'%" + valueChangeEvent.getNewValue().toString() + "%'" + " group by id");
                getAdfTable().clear();
                while (rs.next()) {
                    TableData ex1 = new TableData();
                    ex1.setId(rs.getString(1));
                    ex1.setName(rs.getString(2));
                    ex1.setPhno(rs.getString(3));
                    ex1.setStaff(rs.getString(4));
                    ex1.setUser(rs.getString(5));
                    ex1.setBooth(rs.getString(6));
                    getAdfTable().add(ex1);
                }
                AdfFacesContext.getCurrentInstance().addPartialTarget(t1);
            } catch (Exception er) {
                er.printStackTrace();
            }
        }
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public String create() {
        // Add event code here...
        return "add_staff_detail.jsf";
    }

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void setM1(RichMenu m1) {
        this.m1 = m1;
    }

    public RichMenu getM1() {
        return m1;
    }

    public void setCmi1(RichCommandMenuItem cmi1) {
        this.cmi1 = cmi1;
    }

    public RichCommandMenuItem getCmi1() {
        return cmi1;
    }

    public void setCmi2(RichCommandMenuItem cmi2) {
        this.cmi2 = cmi2;
    }

    public RichCommandMenuItem getCmi2() {
        return cmi2;
    }

    public String view_detail() {
        // Add event code here...
        return null;
    }

    public String edit() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        String id = getAdfTable().get(getT1().getRowIndex()).getId();
        session.putValue("id", id);
        return "add_staff_detail.jsf";
    }

    public void setP2(RichPopup p2) {
        this.p2 = p2;
    }

    public RichPopup getP2() {
        return p2;
    }

    public void setPw1(RichPanelWindow pw1) {
        this.pw1 = pw1;
    }

    public RichPanelWindow getPw1() {
        return pw1;
    }

    public void setOl1(RichOutputLabel ol1) {
        this.ol1 = ol1;
    }

    public RichOutputLabel getOl1() {
        return ol1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setOl2(RichOutputLabel ol2) {
        this.ol2 = ol2;
    }

    public RichOutputLabel getOl2() {
        return ol2;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setOl3(RichOutputLabel ol3) {
        this.ol3 = ol3;
    }

    public RichOutputLabel getOl3() {
        return ol3;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setOl4(RichOutputLabel ol4) {
        this.ol4 = ol4;
    }

    public RichOutputLabel getOl4() {
        return ol4;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public void setOl5(RichOutputLabel ol5) {
        this.ol5 = ol5;
    }

    public RichOutputLabel getOl5() {
        return ol5;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public void setOl6(RichOutputLabel ol6) {
        this.ol6 = ol6;
    }

    public RichOutputLabel getOl6() {
        return ol6;
    }

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    private static List<TableData> adfTable = new ArrayList<TableData>();

    public void bphase(PhaseEvent phaseEvent) {
        // Add event code here...
        CheckStatus();

        try {
            getAdfTable().clear();
            Connection con = dbcon.getConnection();
            Statement stt = con.createStatement();
            ResultSet rs =
                stt.executeQuery("select id,name,phno,jobpost,username,booth_name from staff_detail group by id");
            while (rs.next()) {
                TableData ex1 = new TableData();
                ex1.setId(rs.getString(1));
                ex1.setName(rs.getString(2));
                ex1.setPhno(rs.getString(3));
                ex1.setStaff(rs.getString(4));
                ex1.setUser(rs.getString(5));
                ex1.setBooth(rs.getString(6));
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
            System.out.println("EEEERRRRRRRRRRRROOORRRRRRRRRRR------------>>>>>>>>>>>");
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

    public void setAdfTable(List<TableData> adfTable) {
        Staff_list.adfTable = adfTable;
    }

    public List<TableData> getAdfTable() {
        return adfTable;
    }

    public String view() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        String id = getAdfTable().get(getT1().getRowIndex()).getId();
        session.putValue("id", id);
        return "view_staff_detail.jsf";
    }

    public String boothdetail() {
        // Add event code here...
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

    public String boot() {
        // Add event code here...
        return null;
    }

    public String tolltax() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
          session.putValue("login",session.getAttribute("login"));
            return "tolltax.jsf";
    }

    public void setL8(RichLink l8) {
        this.l8 = l8;
    }

    public RichLink getL8() {
        return l8;
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

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

   

    public String pay() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
          session.putValue("login",session.getAttribute("login"));
        
        return "paylist.jsf";
    }
}
