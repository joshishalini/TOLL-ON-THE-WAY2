package view.backing.screen.master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.RichDialog;
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
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

import view.backing.dbcon;

public class View_staff_detail {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelGroupLayout pgl1;
    private RichInputText it1;
    private RichInputText it2;
    private RichOutputLabel ol1,ol25,ol27,ol28,ol29,ol30,ol31,ol32,ol33,ol34,ol35,ol36,ol37,ol38,ol39,ol40,ol41,ol24,ol23;
    private RichOutputLabel ol2;
    private RichPanelGroupLayout pgl2;
    private RichPanelGroupLayout pgl3;
    private RichSelectItem si35;
    private RichSelectOneChoice soc7;


    public void setSi35(RichSelectItem si35) {
        this.si35 = si35;
    }

    public RichSelectItem getSi35() {
        return si35;
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
    private RichSelectItem si16;
    private RichSelectItem si17;
    private RichSelectItem si18;
    private RichSelectItem si19;
    private RichSelectItem si20;
    private RichSelectItem si21;
    private RichSelectItem si22;

    private RichOutputLabel ol3;
    private RichPopup p1;
    private RichDialog d2;
    private RichOutputLabel ol22;
    private RichSelectOneChoice soc6;

    public void setOl22(RichOutputLabel ol22) {
        this.ol22 = ol22;
    }

    public RichOutputLabel getOl22() {
        return ol22;
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
    private RichPanelGroupLayout pgl4;
    private RichOutputLabel ol4;
    private RichOutputLabel ol5;
    private RichInputText it3;
    private RichChooseDate cd1;
    private RichInputDate id1;
    private RichPanelGroupLayout pgl5;
    private RichOutputLabel ol6;
    private RichOutputLabel ol7;
    private RichSelectOneChoice soc1;
    private RichSelectItem si1;
    private RichSelectItem si2;
    private RichSelectItem si3;
    private RichSelectItem si4;
    private RichInputText it4;
    private RichPanelGroupLayout pgl6;
    private RichInputText it5;
    private RichInputText it6;
    private RichOutputLabel ol8;
    private RichOutputLabel ol9;
    private RichSelectOneChoice soc2;
    private RichSelectItem si6;
    private RichSelectItem si5;
    private RichPanelGroupLayout pgl7;
    private RichOutputLabel ol10;
    private RichOutputLabel ol11;
    private RichInputText it7;
    private RichInputText it8;
    private RichPanelGroupLayout pgl8;
    private RichInputText it9;
    private RichInputText it10;
    private RichOutputLabel ol12;
    private RichOutputLabel ol13;
    private RichPanelGroupLayout pgl9;
    private RichOutputLabel ol14;
    private RichOutputLabel ol15;
    private RichInputText it11;
    private RichInputText it12;
    private RichPanelGroupLayout pgl10;
    private RichOutputLabel ol16;
    private RichOutputLabel ol17;
    private RichInputText it13;
    private RichPanelGroupLayout pgl11;
    private RichOutputLabel ol18;
    private RichOutputLabel ol19;
    private RichSelectOneChoice soc3;
    private RichSelectItem si8;
    private RichSelectItem si7;
    private RichSelectOneChoice soc4;
    private RichSelectItem si10;
    private RichSelectItem si9;
    private RichPanelGroupLayout pgl12;
    private RichOutputLabel ol20;
    private RichOutputLabel ol21;
    private RichInputText it14;
    private RichInputText it15;
    private RichPanelGroupLayout pgl13;
    private RichPanelGroupLayout pgl14;
    private RichButton b1;
    private RichSelectOneChoice soc5;
    private RichSelectItem si11;
    private RichSelectItem si12;
    private RichSelectItem si13;
    private RichSelectItem si14;
    private RichSelectItem si15;
    private RichSelectItem si23;
    private RichSelectItem si24, si25, si26, si27, si28, si29, si30, si31, si32, si33, si34;

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

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
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

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setOl3(RichOutputLabel ol3) {
        this.ol3 = ol3;
    }

    public RichOutputLabel getOl3() {
        return ol3;
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
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

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
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

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
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

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
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

    public void setOl8(RichOutputLabel ol8) {
        this.ol8 = ol8;
    }

    public RichOutputLabel getOl8() {
        return ol8;
    }

    public void setOl9(RichOutputLabel ol9) {
        this.ol9 = ol9;
    }

    public RichOutputLabel getOl9() {
        return ol9;
    }

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }

    public void setSi6(RichSelectItem si6) {
        this.si6 = si6;
    }

    public RichSelectItem getSi6() {
        return si6;
    }

    public void setSi5(RichSelectItem si5) {
        this.si5 = si5;
    }

    public RichSelectItem getSi5() {
        return si5;
    }

    public void setPgl7(RichPanelGroupLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGroupLayout getPgl7() {
        return pgl7;
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

    public void setPgl8(RichPanelGroupLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGroupLayout getPgl8() {
        return pgl8;
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

    public void setOl15(RichOutputLabel ol15) {
        this.ol15 = ol15;
    }

    public RichOutputLabel getOl15() {
        return ol15;
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

    public void setPgl10(RichPanelGroupLayout pgl10) {
        this.pgl10 = pgl10;
    }

    public RichPanelGroupLayout getPgl10() {
        return pgl10;
    }

    public void setOl16(RichOutputLabel ol16) {
        this.ol16 = ol16;
    }

    public RichOutputLabel getOl16() {
        return ol16;
    }

    public void setOl17(RichOutputLabel ol17) {
        this.ol17 = ol17;
    }

    public RichOutputLabel getOl17() {
        return ol17;
    }

    public void setIt13(RichInputText it13) {
        this.it13 = it13;
    }

    public RichInputText getIt13() {
        return it13;
    }

    public void setPgl11(RichPanelGroupLayout pgl11) {
        this.pgl11 = pgl11;
    }

    public RichPanelGroupLayout getPgl11() {
        return pgl11;
    }

    public void setOl18(RichOutputLabel ol18) {
        this.ol18 = ol18;
    }

    public RichOutputLabel getOl18() {
        return ol18;
    }

    public void setOl19(RichOutputLabel ol19) {
        this.ol19 = ol19;
    }

    public RichOutputLabel getOl19() {
        return ol19;
    }

    public void setSoc3(RichSelectOneChoice soc3) {
        this.soc3 = soc3;
    }

    public RichSelectOneChoice getSoc3() {
        return soc3;
    }

    public void setSi8(RichSelectItem si8) {
        this.si8 = si8;
    }

    public RichSelectItem getSi8() {
        return si8;
    }

    public void setSi7(RichSelectItem si7) {
        this.si7 = si7;
    }

    public RichSelectItem getSi7() {
        return si7;
    }

    public void setSoc4(RichSelectOneChoice soc4) {
        this.soc4 = soc4;
    }

    public RichSelectOneChoice getSoc4() {
        return soc4;
    }

    public void setSi10(RichSelectItem si10) {
        this.si10 = si10;
    }

    public RichSelectItem getSi10() {
        return si10;
    }

    public void setSi9(RichSelectItem si9) {
        this.si9 = si9;
    }

    public RichSelectItem getSi9() {
        return si9;
    }

    public void setPgl12(RichPanelGroupLayout pgl12) {
        this.pgl12 = pgl12;
    }

    public RichPanelGroupLayout getPgl12() {
        return pgl12;
    }

    public void setOl20(RichOutputLabel ol20) {
        this.ol20 = ol20;
    }

    public RichOutputLabel getOl20() {
        return ol20;
    }

    public void setOl21(RichOutputLabel ol21) {
        this.ol21 = ol21;
    }

    public RichOutputLabel getOl21() {
        return ol21;
    }

    public void setIt14(RichInputText it14) {
        this.it14 = it14;
    }

    public RichInputText getIt14() {
        return it14;
    }

    public void setIt15(RichInputText it15) {
        this.it15 = it15;
    }

    public RichInputText getIt15() {
        return it15;
    }

    public void setPgl13(RichPanelGroupLayout pgl13) {
        this.pgl13 = pgl13;
    }

    public RichPanelGroupLayout getPgl13() {
        return pgl13;
    }

    public void setPgl14(RichPanelGroupLayout pgl14) {
        this.pgl14 = pgl14;
    }

    public RichPanelGroupLayout getPgl14() {
        return pgl14;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setSoc5(RichSelectOneChoice soc5) {
        this.soc5 = soc5;
    }

    public RichSelectOneChoice getSoc5() {
        return soc5;
    }

    public void setSi17(RichSelectItem si17) {
        this.si17 = si17;
    }

    public RichSelectItem getSi17() {
        return si17;
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

    public void bphase(PhaseEvent phaseEvent) {
        // Add event code here...
        Connection conn = null;
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        if (session.getAttribute("id") == null) {
            try {
                conn = dbcon.getConnection();
                Statement stt = conn.createStatement();
                ResultSet rs = stt.executeQuery("select * from staff_detail");
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
                    st.executeQuery("select * from staff_detail where id = '" + session.getAttribute("id") + "'");
                while (rs.next()) {
                    getIt1().setValue(rs.getString(1));
                    getIt2().setValue(rs.getString(2));
                    getIt3().setValue(rs.getString(3));
                    getId1().setValue(rs.getString(4));
                    getSoc1().setValue(rs.getString(5));
                    getIt4().setValue(rs.getString(6));
                    getIt5().setValue(rs.getString(7));
                    getSoc2().setValue(rs.getString(8));
                    getIt7().setValue(rs.getString(9));
                    getIt8().setValue(rs.getString(10));
                    getIt9().setValue(rs.getString(11));
                    getIt10().setValue(rs.getString(12));
                    getSoc6().setValue(rs.getString(13));
                    getSoc7().setValue(rs.getString(14));
                    getIt13().setValue(rs.getString(15));
                    getSoc5().setValue(rs.getString(16));
                    getSoc3().setValue(rs.getString(17));
                    getSoc4().setValue(rs.getString(18));
                    getIt14().setValue(rs.getString(19));
                    getIt15().setValue(rs.getString(20));
                    session.removeAttribute("id");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String save() {
        // Add event code here
        try {
            Connection conn = dbcon.getConnection();
            Statement stt = conn.createStatement();
            Date d1 = (Date) getId1().getValue();
            String trr = new SimpleDateFormat("YYYY-MM-dd").format(d1);
            stt.execute("delete from staff_detail where id='" + getIt1().getValue() + "'");
            stt.execute("insert into staff_detail value('" + getIt1().getValue() + "','" + getIt2().getValue() + "','" +
                        getIt3().getValue() + "','" + trr + "','" + getSoc1().getValue() + "','" + getIt4().getValue() +
                        "','" + getIt5().getValue() + "','" + getSoc2().getValue() + "','" + getIt7().getValue() +
                        "','" + getIt8().getValue() + "','" + getIt9().getValue() + "','" + getIt10().getValue() +
                        "','" + getSoc6().getValue() + "','" + getSoc7().getValue() + "','" + getIt13().getValue() +
                        "','" + getSoc5().getValue() + "','" + getSoc3().getValue() + "','" + getSoc4().getValue() +
                        "','" + getIt14().getValue() + "','" + getIt15().getValue() + "')");
            getP1().show(new RichPopup.PopupHints());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void setSoc6(RichSelectOneChoice soc6) {
        this.soc6 = soc6;
    }

    public RichSelectOneChoice getSoc6() {
        return soc6;
    }

    public void setSoc7(RichSelectOneChoice soc7) {
        this.soc7 = soc7;
    }

    public RichSelectOneChoice getSoc7() {
        return soc7;
    }

    public void setOl25(RichOutputLabel ol25) {
        this.ol25 = ol25;
    }

    public RichOutputLabel getOl25() {
        return ol25;
    }

    public void setOl27(RichOutputLabel ol27) {
        this.ol27 = ol27;
    }

    public RichOutputLabel getOl27() {
        return ol27;
    }

    public void setOl28(RichOutputLabel ol28) {
        this.ol28 = ol28;
    }

    public RichOutputLabel getOl28() {
        return ol28;
    }

    public void setOl29(RichOutputLabel ol29) {
        this.ol29 = ol29;
    }

    public RichOutputLabel getOl29() {
        return ol29;
    }

    public void setOl30(RichOutputLabel ol30) {
        this.ol30 = ol30;
    }

    public RichOutputLabel getOl30() {
        return ol30;
    }

    public void setOl31(RichOutputLabel ol31) {
        this.ol31 = ol31;
    }

    public RichOutputLabel getOl31() {
        return ol31;
    }

    public void setOl32(RichOutputLabel ol32) {
        this.ol32 = ol32;
    }

    public RichOutputLabel getOl32() {
        return ol32;
    }

    public void setOl33(RichOutputLabel ol33) {
        this.ol33 = ol33;
    }

    public RichOutputLabel getOl33() {
        return ol33;
    }

    public void setOl34(RichOutputLabel ol34) {
        this.ol34 = ol34;
    }

    public RichOutputLabel getOl34() {
        return ol34;
    }

    public void setOl35(RichOutputLabel ol35) {
        this.ol35 = ol35;
    }

    public RichOutputLabel getOl35() {
        return ol35;
    }

    public void setOl36(RichOutputLabel ol36) {
        this.ol36 = ol36;
    }

    public RichOutputLabel getOl36() {
        return ol36;
    }

    public void setOl37(RichOutputLabel ol37) {
        this.ol37 = ol37;
    }

    public RichOutputLabel getOl37() {
        return ol37;
    }

    public void setOl38(RichOutputLabel ol38) {
        this.ol38 = ol38;
    }

    public RichOutputLabel getOl38() {
        return ol38;
    }

    public void setOl39(RichOutputLabel ol39) {
        this.ol39 = ol39;
    }

    public RichOutputLabel getOl39() {
        return ol39;
    }

    public void setOl40(RichOutputLabel ol40) {
        this.ol40 = ol40;
    }

    public RichOutputLabel getOl40() {
        return ol40;
    }

    public void setOl41(RichOutputLabel ol41) {
        this.ol41 = ol41;
    }

    public RichOutputLabel getOl41() {
        return ol41;
    }

    public void setOl24(RichOutputLabel ol24) {
        this.ol24 = ol24;
    }

    public RichOutputLabel getOl24() {
        return ol24;
    }

    public void setOl23(RichOutputLabel ol23) {
        this.ol23 = ol23;
    }

    public RichOutputLabel getOl23() {
        return ol23;
    }
}
