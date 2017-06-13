package view.backing.screen.master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;

import javax.faces.event.ValueChangeEvent;

import javax.faces.validator.ValidatorException;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichChooseDate;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectItem;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

import oracle.adf.view.rich.context.AdfFacesContext;

import view.TableData;

import view.backing.dbcon;

public class Payment {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelGroupLayout pgl1;
    private RichPanelGroupLayout pgl2;
    private RichOutputLabel ol1;
    private RichOutputLabel ol2;
    private RichOutputLabel ol3;
    private RichOutputLabel ol4;
    private RichPanelGroupLayout pgl3;
    private RichOutputLabel ol5;
    private RichOutputLabel ol6;
    private RichOutputLabel ol7;
    private RichOutputLabel ol8;
    private RichPanelGroupLayout pgl4;
    private RichOutputLabel ol9;
    private RichOutputLabel ol10;
    private RichInputText it1;
    private RichPanelGroupLayout pgl5;
    private RichInputText it2;
    private RichPanelGroupLayout pgl6;
    private RichInputText it3;
    private RichOutputLabel ol11;
    private RichPanelGroupLayout pgl7;
    private RichOutputLabel ol12;
    private RichInputText it4;
    private RichPanelGroupLayout pgl8;
    private RichButton b1;
    private RichButton b2;
    private RichOutputLabel ol13;
    private RichSelectOneChoice soc1;
    private RichSelectItem si1;
    private RichSelectItem si2;
    private RichSelectItem si3;
    private RichSelectItem si4;
    private RichSelectItem si5;
    private RichSelectItem si6;
    private RichSelectItem si7;
    private RichPanelGroupLayout pgl9;
    private RichOutputLabel ol14;
    private RichSelectOneChoice soc2;
    private RichSelectItem si11;
    private RichSelectItem si8;
    private RichSelectItem si9;
    private RichSelectItem si10;
    private RichOutputLabel ol15;
    private RichImage i1;
    private RichOutputLabel ol22;
    private RichOutputLabel ol42;
    private RichOutputLabel ol43;
    private RichOutputLabel ol44;
    private RichLink l5;
    private RichLink l6;
    private RichLink l7;
    private RichButton b3;
    private RichOutputLabel ol16;
    private RichPanelGroupLayout pgl10;
    private RichOutputLabel ol17;
    private RichChooseDate cd1;
    private RichInputDate id1;


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

    public void setOl42(RichOutputLabel ol42) {
        this.ol42 = ol42;
    }

    public RichOutputLabel getOl42() {
        return ol42;
    }

    public void setOl43(RichOutputLabel ol43) {
        this.ol43 = ol43;
    }

    public RichOutputLabel getOl43() {
        return ol43;
    }

    public void setOl44(RichOutputLabel ol44) {
        this.ol44 = ol44;
    }

    public RichOutputLabel getOl44() {
        return ol44;
    }

    public void setOl22(RichOutputLabel ol22) {
        this.ol22 = ol22;
    }

    public RichOutputLabel getOl22() {
        return ol22;
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
    private RichLink l1;
    private RichLink l2;
    private RichLink l3;

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

    public void setOl2(RichOutputLabel ol2) {
        this.ol2 = ol2;
    }

    public RichOutputLabel getOl2() {
        return ol2;
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

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setOl5(RichOutputLabel ol5) {
        this.ol5 = ol5;
    }

    public RichOutputLabel getOl5() {
        return ol5;
    }

    public void setOl6(RichOutputLabel ol6) {
        this.ol6 = ol6;
    }

    public RichOutputLabel getOl6() {
        return ol6;
    }

    public void setOl7(RichOutputLabel ol7) {
        this.ol7 = ol7;
    }

    public RichOutputLabel getOl7() {
        return ol7;
    }

    public void setOl8(RichOutputLabel ol8) {
        this.ol8 = ol8;
    }

    public RichOutputLabel getOl8() {
        return ol8;
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setOl9(RichOutputLabel ol9) {
        this.ol9 = ol9;
    }

    public RichOutputLabel getOl9() {
        return ol9;
    }

    public void setOl10(RichOutputLabel ol10) {
        this.ol10 = ol10;
    }

    public RichOutputLabel getOl10() {
        return ol10;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setOl11(RichOutputLabel ol11) {
        this.ol11 = ol11;
    }

    public RichOutputLabel getOl11() {
        return ol11;
    }

    public void setPgl7(RichPanelGroupLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGroupLayout getPgl7() {
        return pgl7;
    }

    public void setOl12(RichOutputLabel ol12) {
        this.ol12 = ol12;
    }

    public RichOutputLabel getOl12() {
        return ol12;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setPgl8(RichPanelGroupLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGroupLayout getPgl8() {
        return pgl8;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void bphase(PhaseEvent phaseEvent) {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        if (session.getAttribute("idbooth") == null) {
        } else {
            try {
                Connection con = dbcon.getConnection();
                Statement st = con.createStatement();
                
                System.out.print("select id,name,city,state from booth_detail where id = '" +
                                 session.getAttribute("idbooth") + "'");
                ResultSet rs =
                    st.executeQuery("select id,name,city,state from booth_detail where id = '" +
                                 session.getAttribute("idbooth") + "'");
     
                while (rs.next()) {
                    getOl2().setValue(rs.getString(1));
                    getOl4().setValue(rs.getString(2));
                    getOl6().setValue(rs.getString(3));
                    getOl8().setValue(rs.getString(4));
                   }
                ResultSet rss = st.executeQuery("select distinct tid from payment");
                int i = 1;
                while (rss.next()) {
                    i++;
                }
                if (i <= 9) {
                    getIt1().setValue("INV-0000" + i);
                }
                if (i > 9 && i <= 99) {
                    getIt1().setValue("INV-000" + i);
                }
                if (i >= 100 && i <= 999) {
                    getIt1().setValue("INV-00" + i);
                }
                if (i >= 1000 && i <= 9999) {
                    getIt1().setValue("INV-0" + i);
                }
                if (i >= 10000) {
                    getIt1().setValue("INV-" + i);
                }
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setOl13(RichOutputLabel ol13) {
        this.ol13 = ol13;
    }

    public RichOutputLabel getOl13() {
        return ol13;
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

    public void setSi4(RichSelectItem si4) {
        this.si4 = si4;
    }

    public RichSelectItem getSi4() {
        return si4;
    }

    public void setSi5(RichSelectItem si5) {
        this.si5 = si5;
    }

    public RichSelectItem getSi5() {
        return si5;
    }

    public void setSi6(RichSelectItem si6) {
        this.si6 = si6;
    }

    public RichSelectItem getSi6() {
        return si6;
    }

    public void setSi7(RichSelectItem si7) {
        this.si7 = si7;
    }

    public RichSelectItem getSi7() {
        return si7;
    }

    public void setPgl9(RichPanelGroupLayout pgl9) {
        this.pgl9 = pgl9;
    }

    public RichPanelGroupLayout getPgl9() {
        return pgl9;
    }

    public void setOl14(RichOutputLabel ol14) {
        this.ol14 = ol14;
    }

    public RichOutputLabel getOl14() {
        return ol14;
    }

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }

    public void setSi11(RichSelectItem si11) {
        this.si11 = si11;
    }

    public RichSelectItem getSi11() {
        return si11;
    }

    public void setSi8(RichSelectItem si8) {
        this.si8 = si8;
    }

    public RichSelectItem getSi8() {
        return si8;
    }

    public void setSi9(RichSelectItem si9) {
        this.si9 = si9;
    }

    public RichSelectItem getSi9() {
        return si9;
    }

    public void setSi10(RichSelectItem si10) {
        this.si10 = si10;
    }

    public RichSelectItem getSi10() {
        return si10;
    }



    public void valchange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        
            try {
                if (getSoc1().getValue().equals("1") && getSoc2().getValue().equals("1")) {
                   
                                Connection con = dbcon.getConnection();
                                 Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select a1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                   System.out.println("select a1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }}
                else if (getSoc1().getValue().equals("1") && getSoc2().getValue().equals("2")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select a2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select a2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
               else if(soc1.getValue().equals("1") && soc2.getValue().equals("3"))
                {
                    System.out.println("Valueeeeeeeeeee----->"+session.getAttribute("idbooth"));
                    
                        Connection con = dbcon.getConnection();
                        Statement stt = con.createStatement();
                        ResultSet rs =
                        stt.executeQuery("select a3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       System.out.println("select a3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       while (rs.next()) {
                        getOl15().setValue(rs.getString(1));
                        AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                       }
                    }
                else if (getSoc1().getValue().equals("1") && getSoc2().getValue().equals("4")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select a4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select a4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
             else   if (getSoc1().getValue().equals("2") && getSoc2().getValue().equals("1")) {
                   
                                Connection con = dbcon.getConnection();
                                 Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select b1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                   System.out.println("select b1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }}
                else if (getSoc1().getValue().equals("2") && getSoc2().getValue().equals("2")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select b2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select b2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
                else if(soc1.getValue().equals("2") && soc2.getValue().equals("3"))
                {
                    System.out.println("Valueeeeeeeeeee----->"+session.getAttribute("idbooth"));
                    
                        Connection con = dbcon.getConnection();
                        Statement stt = con.createStatement();
                        ResultSet rs =
                        stt.executeQuery("select b3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       System.out.println("select b3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       while (rs.next()) {
                        getOl15().setValue(rs.getString(1));
                        AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                       }
                    }
                else if (getSoc1().getValue().equals("2") && getSoc2().getValue().equals("4")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select b4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select b4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
                else                if (getSoc1().getValue().equals("3") && getSoc2().getValue().equals("1")) {
                   
                                Connection con = dbcon.getConnection();
                                 Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select c1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                   System.out.println("select c1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }}
                else if (getSoc1().getValue().equals("3") && getSoc2().getValue().equals("2")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select c2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select c2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
               else if(soc1.getValue().equals("3") && soc2.getValue().equals("3"))
                {
                    System.out.println("Valueeeeeeeeeee----->"+session.getAttribute("idbooth"));
                    
                        Connection con = dbcon.getConnection();
                        Statement stt = con.createStatement();
                        ResultSet rs =
                        stt.executeQuery("select c3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       System.out.println("select c3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       while (rs.next()) {
                        getOl15().setValue(rs.getString(1));
                        AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                       }
                    }
                else if (getSoc1().getValue().equals("3") && getSoc2().getValue().equals("4")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select c4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select c4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
              else  if (getSoc1().getValue().equals("4") && getSoc2().getValue().equals("1")) {
                   
                                Connection con = dbcon.getConnection();
                                 Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select d1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                   System.out.println("select a1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }}
                else if (getSoc1().getValue().equals("4") && getSoc2().getValue().equals("2")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select d2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select a2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
                else if(soc1.getValue().equals("4") && soc2.getValue().equals("3"))
                {
                    System.out.println("Valueeeeeeeeeee----->"+session.getAttribute("idbooth"));
                    
                        Connection con = dbcon.getConnection();
                        Statement stt = con.createStatement();
                        ResultSet rs =
                        stt.executeQuery("select d3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       System.out.println("select a3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       while (rs.next()) {
                        getOl15().setValue(rs.getString(1));
                        AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                       }
                    }
                else if (getSoc1().getValue().equals("4") && getSoc2().getValue().equals("4")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select d4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select a4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
            else    if (getSoc1().getValue().equals("5") && getSoc2().getValue().equals("1")) {
                   
                                Connection con = dbcon.getConnection();
                                 Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select e1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                   System.out.println("select a1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }}
                else if (getSoc1().getValue().equals("5") && getSoc2().getValue().equals("2")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select e2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select a2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
                else if(soc1.getValue().equals("5") && soc2.getValue().equals("3"))
                {
                    System.out.println("Valueeeeeeeeeee----->"+session.getAttribute("idbooth"));
                    
                        Connection con = dbcon.getConnection();
                        Statement stt = con.createStatement();
                        ResultSet rs =
                        stt.executeQuery("select e3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       System.out.println("select a3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       while (rs.next()) {
                        getOl15().setValue(rs.getString(1));
                        AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                       }
                    }
                else if (getSoc1().getValue().equals("5") && getSoc2().getValue().equals("4")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select e4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select a4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
               else if (getSoc1().getValue().equals("6") && getSoc2().getValue().equals("1")) {
                   
                                Connection con = dbcon.getConnection();
                                 Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select f1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                   System.out.println("select a1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }}
                else if (getSoc1().getValue().equals("6") && getSoc2().getValue().equals("2")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select f2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select a2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
                else if(soc1.getValue().equals("6") && soc2.getValue().equals("3"))
                {
                    System.out.println("Valueeeeeeeeeee----->"+session.getAttribute("idbooth"));
                    
                        Connection con = dbcon.getConnection();
                        Statement stt = con.createStatement();
                        ResultSet rs =
                        stt.executeQuery("select f3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       System.out.println("select a3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       while (rs.next()) {
                        getOl15().setValue(rs.getString(1));
                        AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                       }
                    }
                else if (getSoc1().getValue().equals("6") && getSoc2().getValue().equals("4")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select fa4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select a4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
                else if (getSoc1().getValue().equals("7")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select g from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select g from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
            }catch(Exception e){
        e.printStackTrace();
            }
            
        
        }

    public String pay() {
        // Add event code here...
        try {
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
            String a= session.getAttribute("id").toString();
              session.putValue("id", a);
            System.out.println("valueee pay----->"+a);
            Connection conn = dbcon.getConnection();
            Statement stt = conn.createStatement();
            Date d1 = (Date) getId1().getValue();
            String trr = new SimpleDateFormat("YYYY-MM-dd").format(d1);

            stt.execute("insert into payment value('"+ getIt1().getValue()+"','" + a + "','" + getOl2().getValue() + "','"+trr+"','" +
                        getSoc1().getValue() + "','" + getIt3().getValue() + "','" + getSoc2().getValue() + "','" +
                        getOl15().getValue() + "','"+0+"')");
           stt.execute("insert into delpay value('"+ getIt1().getValue()+"','" + a + "','" + getOl2().getValue() + "','"+trr+"','" +
                        getSoc1().getValue() + "','" + getIt3().getValue() + "','" + getSoc2().getValue() + "','" +
                        getOl15().getValue() + "','"+0+"')");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.putValue("amount",getOl15().getValue()); 
        session.putValue("tid",getIt1().getValue()); 

        session.putValue("vno",getIt3().getValue()); 
        String a= session.getAttribute("id").toString();
          session.putValue("id", a);
        
        return "dummy.jsf";
    }

    public void changevalII(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        
            try {
                if (getSoc1().getValue().equals("1") && getSoc2().getValue().equals("1")) {
                   
                                Connection con = dbcon.getConnection();
                                 Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select a1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                   System.out.println("select a1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }}
                else if (getSoc1().getValue().equals("1") && getSoc2().getValue().equals("2")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select a2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select a2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
               else if(soc1.getValue().equals("1") && soc2.getValue().equals("3"))
                {
                    System.out.println("Valueeeeeeeeeee----->"+session.getAttribute("idbooth"));
                    
                        Connection con = dbcon.getConnection();
                        Statement stt = con.createStatement();
                        ResultSet rs =
                        stt.executeQuery("select a3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       System.out.println("select a3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       while (rs.next()) {
                        getOl15().setValue(rs.getString(1));
                        AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                       }
                    }
                else if (getSoc1().getValue().equals("1") && getSoc2().getValue().equals("4")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select a4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select a4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
             else   if (getSoc1().getValue().equals("2") && getSoc2().getValue().equals("1")) {
                   
                                Connection con = dbcon.getConnection();
                                 Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select b1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                   System.out.println("select b1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }}
                else if (getSoc1().getValue().equals("2") && getSoc2().getValue().equals("2")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select b2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select b2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
                else if(soc1.getValue().equals("2") && soc2.getValue().equals("3"))
                {
                    System.out.println("Valueeeeeeeeeee----->"+session.getAttribute("idbooth"));
                    
                        Connection con = dbcon.getConnection();
                        Statement stt = con.createStatement();
                        ResultSet rs =
                        stt.executeQuery("select b3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       System.out.println("select b3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       while (rs.next()) {
                        getOl15().setValue(rs.getString(1));
                        AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                       }
                    }
                else if (getSoc1().getValue().equals("2") && getSoc2().getValue().equals("4")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select b4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select b4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
                else                if (getSoc1().getValue().equals("3") && getSoc2().getValue().equals("1")) {
                   
                                Connection con = dbcon.getConnection();
                                 Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select c1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                   System.out.println("select c1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }}
                else if (getSoc1().getValue().equals("3") && getSoc2().getValue().equals("2")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select c2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select c2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
               else if(soc1.getValue().equals("3") && soc2.getValue().equals("3"))
                {
                    System.out.println("Valueeeeeeeeeee----->"+session.getAttribute("idbooth"));
                    
                        Connection con = dbcon.getConnection();
                        Statement stt = con.createStatement();
                        ResultSet rs =
                        stt.executeQuery("select c3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       System.out.println("select c3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       while (rs.next()) {
                        getOl15().setValue(rs.getString(1));
                        AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                       }
                    }
                else if (getSoc1().getValue().equals("3") && getSoc2().getValue().equals("4")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select c4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select c4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
              else  if (getSoc1().getValue().equals("4") && getSoc2().getValue().equals("1")) {
                   
                                Connection con = dbcon.getConnection();
                                 Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select d1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                   System.out.println("select a1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }}
                else if (getSoc1().getValue().equals("4") && getSoc2().getValue().equals("2")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select d2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select a2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
                else if(soc1.getValue().equals("4") && soc2.getValue().equals("3"))
                {
                    System.out.println("Valueeeeeeeeeee----->"+session.getAttribute("idbooth"));
                    
                        Connection con = dbcon.getConnection();
                        Statement stt = con.createStatement();
                        ResultSet rs =
                        stt.executeQuery("select d3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       System.out.println("select a3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       while (rs.next()) {
                        getOl15().setValue(rs.getString(1));
                        AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                       }
                    }
                else if (getSoc1().getValue().equals("4") && getSoc2().getValue().equals("4")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select d4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select a4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
            else    if (getSoc1().getValue().equals("5") && getSoc2().getValue().equals("1")) {
                   
                                Connection con = dbcon.getConnection();
                                 Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select e1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                   System.out.println("select a1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }}
                else if (getSoc1().getValue().equals("5") && getSoc2().getValue().equals("2")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select e2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select a2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
                else if(soc1.getValue().equals("5") && soc2.getValue().equals("3"))
                {
                    System.out.println("Valueeeeeeeeeee----->"+session.getAttribute("idbooth"));
                    
                        Connection con = dbcon.getConnection();
                        Statement stt = con.createStatement();
                        ResultSet rs =
                        stt.executeQuery("select e3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       System.out.println("select a3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       while (rs.next()) {
                        getOl15().setValue(rs.getString(1));
                        AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                       }
                    }
                else if (getSoc1().getValue().equals("5") && getSoc2().getValue().equals("4")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select e4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select a4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
               else if (getSoc1().getValue().equals("6") && getSoc2().getValue().equals("1")) {
                   
                                Connection con = dbcon.getConnection();
                                 Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select f1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                   System.out.println("select a1 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }}
                else if (getSoc1().getValue().equals("6") && getSoc2().getValue().equals("2")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select f2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select a2 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
                else if(soc1.getValue().equals("6") && soc2.getValue().equals("3"))
                {
                    System.out.println("Valueeeeeeeeeee----->"+session.getAttribute("idbooth"));
                    
                        Connection con = dbcon.getConnection();
                        Statement stt = con.createStatement();
                        ResultSet rs =
                        stt.executeQuery("select f3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       System.out.println("select a3 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                       while (rs.next()) {
                        getOl15().setValue(rs.getString(1));
                        AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                       }
                    }
                else if (getSoc1().getValue().equals("6") && getSoc2().getValue().equals("4")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select fa4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select a4 from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
                else if (getSoc1().getValue().equals("7")) {
                      
                                Connection con = dbcon.getConnection();
                                    Statement stt = con.createStatement();
                                    ResultSet rs =
                                        stt.executeQuery("select g from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    System.out.println("select g from toll_tax where id='"+session.getAttribute("idbooth")+"'");
                                    while (rs.next()) {
                                    getOl15().setValue(rs.getString(1));
                                    AdfFacesContext.getCurrentInstance().addPartialTarget(ol15);
                                     }
                                    }
            }catch(Exception e){
        e.printStackTrace();
            }
            
        
    }

    public void setOl15(RichOutputLabel ol15) {
        this.ol15 = ol15;
    }

    public RichOutputLabel getOl15() {
        return ol15;
    }

    public void setI1(RichImage i1) {
        this.i1 = i1;
    }

    public RichImage getI1() {
        return i1;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public String cancle() {
        // Add event code here...
        
        return "search.jsf";}

    public void setOl16(RichOutputLabel ol16) {
        this.ol16 = ol16;
    }

    public RichOutputLabel getOl16() {
        return ol16;
    }

    public void validator(FacesContext facesContext, UIComponent uIComponent, Object object) {
        // Add event code here...
        if(object!=null){
                   String name=object.toString();
                   String expression="^[A-Z]{2}[ -][0-9]{1,2}(?: [A-Z])?(?: [A-Z]*)? [0-9]{4}$";
                   CharSequence inputStr=name;
                   Pattern pattern=Pattern.compile(expression);
                   Matcher matcher=pattern.matcher(inputStr);
                   String msg="Vehicle is Wrong";
                   if(matcher.matches()){
                      
                   }
                   else{
                       throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,msg,null));
                   }
               }
        }

    public void setPgl10(RichPanelGroupLayout pgl10) {
        this.pgl10 = pgl10;
    }

    public RichPanelGroupLayout getPgl10() {
        return pgl10;
    }

    public void setOl17(RichOutputLabel ol17) {
        this.ol17 = ol17;
    }

    public RichOutputLabel getOl17() {
        return ol17;
    }

    public void setCd1(RichChooseDate cd1) {
        this.cd1 = cd1;
    }

    public RichChooseDate getCd1() {
        return cd1;
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }
}
