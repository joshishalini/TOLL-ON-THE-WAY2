package view.backing.screen.master;

import java.sql.Connection;
import java.sql.Statement;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import javax.faces.event.PhaseEvent;

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

public class Tolltax {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelGroupLayout pgl1;
    private RichPanelGroupLayout pgl2;
    private RichOutputLabel ol1;
    private RichInputText it1;
    private RichPanelGroupLayout pgl3;
    private RichOutputLabel ol2;
    private RichInputText it2;
    private RichPanelGroupLayout pgl4;
    private RichOutputLabel ol3;
    private RichOutputLabel ol4;
    private RichOutputLabel ol5;
    private RichOutputLabel ol6;
    private RichOutputLabel ol7;
    private RichPanelGroupLayout pgl5;
    private RichPanelGroupLayout pgl10;
    private RichOutputLabel ol8;
    private RichInputText it23;
    private RichOutputLabel ol9;
    private RichOutputLabel ol10;
    private RichOutputLabel ol11;
    private RichOutputLabel ol12;
    private RichOutputLabel ol13;
    private RichPanelGroupLayout pgl11;
    private RichOutputLabel ol14;
    private RichInputText it24;
    private RichInputText it25;
    private RichInputText it26;
    private RichInputText it27;
    private RichPanelGroupLayout pgl12;
    private RichInputText it28;
    private RichOutputLabel ol15;
    private RichPopup p1;
    private RichOutputLabel ol16;
    private RichDialog d2;
    private RichLink l1;
    private RichLink l2;
    private RichLink l3;
    private RichButton b3;
    private RichLink l4;

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }

    public void setSoc3(RichSelectOneChoice soc3) {
        this.soc3 = soc3;
    }

    public RichSelectOneChoice getSoc3() {
        return soc3;
    }

    public void setSoc4(RichSelectOneChoice soc4) {
        this.soc4 = soc4;
    }

    public RichSelectOneChoice getSoc4() {
        return soc4;
    }

    public void setSoc5(RichSelectOneChoice soc5) {
        this.soc5 = soc5;
    }

    public RichSelectOneChoice getSoc5() {
        return soc5;
    }
    private RichSelectOneChoice soc1, soc2, soc3, soc4, soc5;
    private RichSelectItem si1;
    private RichSelectItem si2;
    private RichSelectItem si3;
    private RichSelectItem si4;
    private RichSelectItem si5;
    private RichSelectItem si6;
    private RichSelectItem si7;
    private RichSelectItem si8;
    private RichSelectItem si9;
    private RichInputText it3;
    private RichInputText it4;
    private RichInputText it5;
    private RichInputText it6;
    private RichPanelGroupLayout pgl6;
    private RichInputText it7;
    private RichInputText it8;
    private RichInputText it9;
    private RichInputText it10;
    private RichPanelGroupLayout pgl7;
    private RichInputText it11;
    private RichInputText it12;
    private RichInputText it13;
    private RichInputText it14;
    private RichPanelGroupLayout pgl8;
    private RichInputText it15;
    private RichInputText it16;
    private RichInputText it17;
    private RichInputText it18;
    private RichPanelGroupLayout pgl9;
    private RichInputText it19;
    private RichInputText it20;
    private RichInputText it21;
    private RichInputText it22;
    private RichButton b1;
    private RichButton b2;

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

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
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

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
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

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
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

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
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

    public void setIt11(RichInputText it11) {
        this.it11 = it11;
    }

    public RichInputText getIt11() {
        return it11;
    }

    public void setIt12(RichInputText it12) {
        this.it12 = it12;
    }

    public RichInputText getIt12() {
        return it12;
    }

    public void setIt13(RichInputText it13) {
        this.it13 = it13;
    }

    public RichInputText getIt13() {
        return it13;
    }

    public void setIt14(RichInputText it14) {
        this.it14 = it14;
    }

    public RichInputText getIt14() {
        return it14;
    }

    public void setPgl8(RichPanelGroupLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGroupLayout getPgl8() {
        return pgl8;
    }

    public void setIt15(RichInputText it15) {
        this.it15 = it15;
    }

    public RichInputText getIt15() {
        return it15;
    }

    public void setIt16(RichInputText it16) {
        this.it16 = it16;
    }

    public RichInputText getIt16() {
        return it16;
    }

    public void setIt17(RichInputText it17) {
        this.it17 = it17;
    }

    public RichInputText getIt17() {
        return it17;
    }

    public void setIt18(RichInputText it18) {
        this.it18 = it18;
    }

    public RichInputText getIt18() {
        return it18;
    }

    public void setPgl9(RichPanelGroupLayout pgl9) {
        this.pgl9 = pgl9;
    }

    public RichPanelGroupLayout getPgl9() {
        return pgl9;
    }

    public void setIt19(RichInputText it19) {
        this.it19 = it19;
    }

    public RichInputText getIt19() {
        return it19;
    }

    public void setIt20(RichInputText it20) {
        this.it20 = it20;
    }

    public RichInputText getIt20() {
        return it20;
    }

    public void setIt21(RichInputText it21) {
        this.it21 = it21;
    }

    public RichInputText getIt21() {
        return it21;
    }

    public void setIt22(RichInputText it22) {
        this.it22 = it22;
    }

    public RichInputText getIt22() {
        return it22;
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

    public void setPgl10(RichPanelGroupLayout pgl10) {
        this.pgl10 = pgl10;
    }

    public RichPanelGroupLayout getPgl10() {
        return pgl10;
    }

    public void setOl8(RichOutputLabel ol8) {
        this.ol8 = ol8;
    }

    public RichOutputLabel getOl8() {
        return ol8;
    }

    public void setIt23(RichInputText it23) {
        this.it23 = it23;
    }

    public RichInputText getIt23() {
        return it23;
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

    public void setOl11(RichOutputLabel ol11) {
        this.ol11 = ol11;
    }

    public RichOutputLabel getOl11() {
        return ol11;
    }

    public void setOl12(RichOutputLabel ol12) {
        this.ol12 = ol12;
    }

    public RichOutputLabel getOl12() {
        return ol12;
    }

    public void setOl13(RichOutputLabel ol13) {
        this.ol13 = ol13;
    }

    public RichOutputLabel getOl13() {
        return ol13;
    }

    public void setPgl11(RichPanelGroupLayout pgl11) {
        this.pgl11 = pgl11;
    }

    public RichPanelGroupLayout getPgl11() {
        return pgl11;
    }

    public void setOl14(RichOutputLabel ol14) {
        this.ol14 = ol14;
    }

    public RichOutputLabel getOl14() {
        return ol14;
    }

    public void setIt24(RichInputText it24) {
        this.it24 = it24;
    }

    public RichInputText getIt24() {
        return it24;
    }

    public void setIt25(RichInputText it25) {
        this.it25 = it25;
    }

    public RichInputText getIt25() {
        return it25;
    }

    public void setIt26(RichInputText it26) {
        this.it26 = it26;
    }

    public RichInputText getIt26() {
        return it26;
    }

    public void setIt27(RichInputText it27) {
        this.it27 = it27;
    }

    public RichInputText getIt27() {
        return it27;
    }

    public void setPgl12(RichPanelGroupLayout pgl12) {
        this.pgl12 = pgl12;
    }

    public RichPanelGroupLayout getPgl12() {
        return pgl12;
    }

    public void setIt28(RichInputText it28) {
        this.it28 = it28;
    }

    public RichInputText getIt28() {
        return it28;
    }

    public void setOl15(RichOutputLabel ol15) {
        this.ol15 = ol15;
    }

    public RichOutputLabel getOl15() {
        return ol15;
    }

    public String save() {
        // Add event code here...
        try {
            Connection conn = dbcon.getConnection();
            Statement stt = conn.createStatement();
            stt.execute("insert into toll_tax value('" + getIt1().getValue() + "','" +
                        getIt3().getValue() + "','" + getIt4().getValue() + "','" + getIt5().getValue() + "','" +
                        getIt6().getValue() + "','" + getIt7().getValue() + "','" + getIt8().getValue() + "','" +
                        getIt9().getValue() + "','" + getIt10().getValue() + "','" + getIt11().getValue() + "','" +
                        getIt12().getValue() + "','" + getIt13().getValue() + "','" + getIt14().getValue() + "','" +
                        getIt15().getValue() + "','" + getIt16().getValue() + "','" + getIt17().getValue() + "','" +
                        getIt18().getValue() + "','" + getIt19().getValue() + "','" + getIt20().getValue() + "','" +
                        getIt21().getValue() + "','" + getIt22().getValue() + "','" + getIt24().getValue() + "','" +
                        getIt25().getValue() + "','" + getIt26().getValue() + "','" + getIt27().getValue() + "','" +
                        getIt28().getValue() + "')");
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

    public void setOl16(RichOutputLabel ol16) {
        this.ol16 = ol16;
    }

    public RichOutputLabel getOl16() {
        return ol16;
    }

    public void setD2(RichDialog d2) {
        this.d2 = d2;
    }

    public RichDialog getD2() {
        return d2;
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

    public String tolltax() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
          session.putValue("login",session.getAttribute("login"));
        
        return "tolltax.jsf";
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
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

    public void bphase(PhaseEvent phaseEvent) {
        // Add event code here...
        CheckStatus();
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

    public void setL4(RichLink l4) {
        this.l4 = l4;
    }

    public RichLink getL4() {
        return l4;
    }

    public String pay() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
          session.putValue("login",session.getAttribute("login"));
        
        return "paylist.jsf";
    }
}
