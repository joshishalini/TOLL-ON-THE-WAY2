package view.backing.screen.master;

import java.io.IOException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.input.RichInputText;
import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.PhaseEvent;
import javax.faces.event.ValueChangeEvent;

import javax.faces.validator.ValidatorException;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectItem;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

import view.backing.dbcon;

public class Add_booth_detail {

    private RichForm f1;
    private RichDocument d1;
    private RichPanelGroupLayout pgl1;
    private RichPanelGroupLayout pgl2,pgl12,pgl10;
    private RichButton b2;
    private RichLink l4;

    public void setPgl10(RichPanelGroupLayout pgl10) {
        this.pgl10 = pgl10;
    }

    public RichPanelGroupLayout getPgl10() {
        return pgl10;
    }

    public void setPgl12(RichPanelGroupLayout pgl12) {
        this.pgl12 = pgl12;
    }

    public RichPanelGroupLayout getPgl12() {
        return pgl12;
    }
    private RichOutputLabel ol1;
    private RichInputText it1,mobNoBind;
    private RichPopup p1;
    private RichDialog d2;
    private RichOutputLabel ol20;
    private RichOutputLabel ol2;
    private RichInputText it2;
    private RichLink l1;
    private RichLink l2;
    private RichLink l3,l5,l6,l7;

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
    private RichPanelGroupLayout pgl3;
    private RichInputText it3;
    private RichInputText it4;
    private RichOutputLabel ol3;
    private RichSelectOneChoice soc1;
    private RichOutputLabel ol4;
    private RichPanelGroupLayout pgl4;
    private RichOutputLabel ol5;
    private RichOutputLabel ol6;
    private RichInputText it5;
    private RichInputText it6;
    private RichPanelGroupLayout pgl5;
    private RichInputText it7;
    private RichInputText it8;
    private RichOutputLabel ol7;
    private RichOutputLabel ol8;
    private RichPanelGroupLayout pgl6;
    private RichOutputLabel ol9;
    private RichOutputLabel ol10;
    private RichInputText it9;
    private RichInputText it10;
    private RichPanelGroupLayout pgl7;
    private RichButton b1;
    private RichPanelGroupLayout pgl8;
    private RichOutputLabel ol11;
    private RichSelectItem si35;

    private RichSelectItem si8;
    private RichSelectItem si9;
    private RichSelectItem si10;
    private RichSelectItem si11;
    private RichSelectItem si12;
    private RichSelectItem si13;
    private RichSelectItem si14;
    private RichSelectItem si15;
    private RichSelectItem si16;
    private RichSelectItem si17;
    private RichSelectItem si18;
    private RichSelectItem si19;
    private RichSelectItem si20;
    private RichSelectItem si21;
    private RichSelectItem si22;
    private RichInputText it11;

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
    private RichSelectItem si23;
    private RichSelectItem si24, si1, si2, si3, si4, si5, si6, si7;

    public void setSi35(RichSelectItem si35) {
        this.si35 = si35;
    }

    public RichSelectItem getSi35() {
        return si35;
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

    public void setSi11(RichSelectItem si11) {
        this.si11 = si11;
    }

    public RichSelectItem getSi11() {
        return si11;
    }

    public void setSi12(RichSelectItem si12) {
        this.si12 = si12;
    }

    public RichSelectItem getSi12() {
        return si12;
    }

    public void setSi13(RichSelectItem si13) {
        this.si13 = si13;
    }

    public RichSelectItem getSi13() {
        return si13;
    }

    public void setSi14(RichSelectItem si14) {
        this.si14 = si14;
    }

    public RichSelectItem getSi14() {
        return si14;
    }

    public void setSi15(RichSelectItem si15) {
        this.si15 = si15;
    }

    public RichSelectItem getSi15() {
        return si15;
    }

    public void setSi16(RichSelectItem si16) {
        this.si16 = si16;
    }

    public RichSelectItem getSi16() {
        return si16;
    }

    public void setSi17(RichSelectItem si17) {
        this.si17 = si17;
    }

    public RichSelectItem getSi17() {
        return si17;
    }

    public void setSi18(RichSelectItem si18) {
        this.si18 = si18;
    }

    public RichSelectItem getSi18() {
        return si18;
    }

    public void setSi19(RichSelectItem si19) {
        this.si19 = si19;
    }

    public RichSelectItem getSi19() {
        return si19;
    }

    public void setSi20(RichSelectItem si20) {
        this.si20 = si20;
    }

    public RichSelectItem getSi20() {
        return si20;
    }

    public void setSi21(RichSelectItem si21) {
        this.si21 = si21;
    }

    public RichSelectItem getSi21() {
        return si21;
    }

    public void setSi22(RichSelectItem si22) {
        this.si22 = si22;
    }

    public RichSelectItem getSi22() {
        return si22;
    }

    public void setSi23(RichSelectItem si23) {
        this.si23 = si23;
    }

    public RichSelectItem getSi23() {
        return si23;
    }

    public void setSi24(RichSelectItem si24) {
        this.si24 = si24;
    }

    public RichSelectItem getSi24() {
        return si24;
    }

    public void setSi25(RichSelectItem si25) {
        this.si25 = si25;
    }

    public RichSelectItem getSi25() {
        return si25;
    }

    public void setSi26(RichSelectItem si26) {
        this.si26 = si26;
    }

    public RichSelectItem getSi26() {
        return si26;
    }

    public void setSi27(RichSelectItem si27) {
        this.si27 = si27;
    }

    public RichSelectItem getSi27() {
        return si27;
    }

    public void setSi28(RichSelectItem si28) {
        this.si28 = si28;
    }

    public RichSelectItem getSi28() {
        return si28;
    }

    public void setSi29(RichSelectItem si29) {
        this.si29 = si29;
    }

    public RichSelectItem getSi29() {
        return si29;
    }

    public void setSi30(RichSelectItem si30) {
        this.si30 = si30;
    }

    public RichSelectItem getSi30() {
        return si30;
    }

    public void setSi31(RichSelectItem si31) {
        this.si31 = si31;
    }

    public RichSelectItem getSi31() {
        return si31;
    }

    public void setSi32(RichSelectItem si32) {
        this.si32 = si32;
    }

    public RichSelectItem getSi32() {
        return si32;
    }

    public void setSi33(RichSelectItem si33) {
        this.si33 = si33;
    }

    public RichSelectItem getSi33() {
        return si33;
    }

    public void setSi34(RichSelectItem si34) {
        this.si34 = si34;
    }

    public RichSelectItem getSi34() {
        return si34;
    }
    private RichSelectItem si25;
    private RichSelectItem si26;
    private RichSelectItem si27;
    private RichSelectItem si28;
    private RichSelectItem si29;
    private RichSelectItem si30;
    private RichSelectItem si31;
    private RichSelectItem si32;
    private RichSelectItem si33;
    private RichSelectItem si34;

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

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setOl2(RichOutputLabel ol2) {
        this.ol2 = ol2;
    }

    public RichOutputLabel getOl2() {
        return ol2;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setOl3(RichOutputLabel ol3) {
        this.ol3 = ol3;
    }

    public RichOutputLabel getOl3() {
        return ol3;
    }

    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }

    public void setOl4(RichOutputLabel ol4) {
        this.ol4 = ol4;
    }

    public RichOutputLabel getOl4() {
        return ol4;
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
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

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
    }

    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
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

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
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

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
    }

    public void setPgl7(RichPanelGroupLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGroupLayout getPgl7() {
        return pgl7;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setPgl8(RichPanelGroupLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGroupLayout getPgl8() {
        return pgl8;
    }

    public void setOl11(RichOutputLabel ol11) {
        this.ol11 = ol11;
    }

    public RichOutputLabel getOl11() {
        return ol11;
    }

    public void valchange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...

    }

    public void setIt11(RichInputText it11) {
        this.it11 = it11;
    }

    public RichInputText getIt11() {
        return it11;
    }

    public void bphase(PhaseEvent phaseEvent) {
        // Add event code here...
        CheckStatus();
        Connection conn = null;
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        if (session.getAttribute("id") == null) {
            try {
                conn = dbcon.getConnection();
                Statement stt = conn.createStatement();
                ResultSet rs = stt.executeQuery("select * from booth_detail");
                int i = 1;
                while (rs.next()) {
                    i = rs.getInt(1);
                }
                i = i + 1;
                getIt1().setValue(i);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {

                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            try {
                Connection con = dbcon.getConnection();
                Statement st = con.createStatement();
                ResultSet rs =
                    st.executeQuery("select * from booth_detail where id = '" + session.getAttribute("id") + "'");
                while (rs.next()) {
                    getIt1().setValue(rs.getString(1));
                    getIt2().setValue(rs.getString(2));
                    getIt11().setValue(rs.getString(3));
                    getIt4().setValue(rs.getString(4));
                    getIt5().setValue(rs.getString(5));
                    getIt6().setValue(rs.getString(6));
                    getIt7().setValue(rs.getString(7));
                    getIt8().setValue(rs.getString(8));
                    getIt9().setValue(rs.getString(9));
                    getIt10().setValue(rs.getString(10));
                   //session.removeAttribute("id");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String toString() {
        // Add event code here...

        return null;
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


    public String save() {
        // Add event code here...
        try {
            Connection conn = dbcon.getConnection();
            Statement stt = conn.createStatement();
            
            stt.execute("delete from booth_detail where id='" + getIt1().getValue() + "'");
            System.out.print("delete from booth_detail where id='" + getIt1().getValue() + "'");
                
            stt.execute("insert into booth_detail value('" + getIt1().getValue() + "','" + getIt2().getValue() + "','" +
                        getIt11().getValue() + "','" + getIt4().getValue() + "','" + getIt5().getValue() + "','" +
                        getIt6().getValue() + "','" + getIt7().getValue() + "','" + getIt8().getValue() + "','" +
                        getIt9().getValue() + "','" + getIt10().getValue() + "')");
            System.out.println("insert into booth_detail value('" + getIt1().getValue() + "','" + getIt2().getValue() + "','" +
                        getIt11().getValue() + "','" + getIt4().getValue() + "','" + getIt5().getValue() + "','" +
                        getIt6().getValue() + "','" + getIt7().getValue() + "','" + getIt8().getValue() + "','" +
                        getIt9().getValue() + "','" + getIt10().getValue() + "')");
            getP1().show(new RichPopup.PopupHints());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void setD2(RichDialog d2) {
        this.d2 = d2;
    }

    public RichDialog getD2() {
        return d2;
    }

    public void setOl20(RichOutputLabel ol20) {
        this.ol20 = ol20;
    }

    public RichOutputLabel getOl20() {
        return ol20;
 
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
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
          session.putValue("login",session.getAttribute("login"));
        
        return "booth_list.jsf";
    }

    public String tolltax() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
          session.putValue("login",session.getAttribute("login"));
        
        return "toll_tax.jsf";
    }

    public void phoneNoValidator(FacesContext facesContext, UIComponent uIComponent, Object object) {
        // Add event code here...
        String msg2 = "";
               if (object != null) {
                   String phnNo = object.toString();
                   int openB = 0;
                   int closeB = 0;
                   boolean closeFg = false;
                   char[] xx = phnNo.toCharArray();
                   for (char c : xx) {
                       if (c == '(') {
                           openB = openB + 1;
                       } else if (c == ')') {
                           closeB = closeB + 1;
                       }

                       if (closeB > openB) {
                           closeFg = true; //closed brackets will not be more than open brackets at any given time.
                       }
                   }
                   //if openB=0 then no. of closing and opening brackets equal || opening bracket must always come before closing brackets
                   //closing brackets must not come before first occurrence of openning bracket
                   if (openB != closeB || closeFg == true || (phnNo.lastIndexOf("(") > phnNo.lastIndexOf(")")) ||
                       (phnNo.indexOf(")") < phnNo.indexOf("("))) {
                       msg2 = "Brackets not closed properly.";
                       FacesMessage message2 = new FacesMessage(msg2);
                       message2.setSeverity(FacesMessage.SEVERITY_ERROR);
                       throw new ValidatorException(message2);
                   }
                   if (phnNo.contains("()")) {
                       msg2 = "Empty Brackets are not allowed.";
                       FacesMessage message2 = new FacesMessage(msg2);
                       message2.setSeverity(FacesMessage.SEVERITY_ERROR);
                       throw new ValidatorException(message2);
                   }
                   if (phnNo.contains("(.") || phnNo.contains("(-") || phnNo.contains("-)")) {
                       msg2 = "Invalid Phone Number.Check content inside brackets.";
                       FacesMessage message2 = new FacesMessage(msg2);
                       message2.setSeverity(FacesMessage.SEVERITY_ERROR);
                       throw new ValidatorException(message2);
                   }

                   openB = 0;
                   closeB = 0;
                   closeFg = false;
                   //check for valid language name.Allowed- brackets,dots,hyphen

                   String expression = "([0-9\\-\\+\\(\\)]+)";
                   CharSequence inputStr = phnNo;
                   Pattern pattern = Pattern.compile(expression);
                   Matcher matcher = pattern.matcher(inputStr);
                   String error = "Invalid Phone Number";
                   System.out.println("Index of plus is--->" + phnNo.lastIndexOf("+"));
                   System.out.println("Bracket index--->" + phnNo.charAt(0));

                   if (matcher.matches()) {
                       if (phnNo.contains("++") || phnNo.contains("--")) {
                           throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, error,
                                                                         "Can not contain two hyphen(--) or plus(++)"));
                       } else if (phnNo.lastIndexOf("+") > 1) {
                           throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, error,
                                                                         "Plus sign should be in proper place"));
                       } else if (phnNo.lastIndexOf("+") == 1 && phnNo.charAt(0) != '(') {
                           throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, error,
                                                                         "Plus sign should be in proper place"));
                       } else if (phnNo.startsWith(" ") || phnNo.endsWith(" ")) {
                           throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, error,
                                                                         "Space Not allowed at start and end"));
                       }

                   } else {
                       throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, error,
                                                                     "Only numeric character,+,() and - allowed"));
                   }
               }
        }

    public void emailValidator(FacesContext facesContext, UIComponent uIComponent, Object object) {
        // Add event code here...
        if(object!=null){
                   String name=object.toString();
                   String expression="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                   CharSequence inputStr=name;
                   Pattern pattern=Pattern.compile(expression);
                   Matcher matcher=pattern.matcher(inputStr);
                   String msg="Email is not in Proper Format";
                   if(matcher.matches()){
                      
                   }
                   else{
                       throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,msg,null));
                   }
               }
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
        session.removeAttribute("login");
        session.invalidate();
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() +
                                                                            "/faces/admin.jsf");
        } catch (Exception er) {
        }
        return "/faces/home.jsf";
        
    }

    public void setL4(RichLink l4) {
        this.l4 = l4;
    }

    public RichLink getL4() {
        return l4;
    }

    public String payment() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
          session.putValue("login",session.getAttribute("login"));
        
        return "paylist.jsf";
    }
}


