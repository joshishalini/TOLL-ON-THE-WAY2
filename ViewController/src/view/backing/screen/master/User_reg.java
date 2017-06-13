package view.backing.screen.master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.faces.component.html.HtmlCommandLink;

import javax.faces.event.PhaseEvent;

import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectItem;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichIcon;
import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;
import oracle.adf.view.rich.context.AdfFacesContext;

import view.backing.dbcon;

public class User_reg {
    private RichForm f1;
    private RichDocument d1;
        private RichPopup p1;
        private RichOutputLabel ol26;

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void setOl26(RichOutputLabel ol26) {
        this.ol26 = ol26;
    }

    public RichOutputLabel getOl26() {
        return ol26;
    }

    public void setD2(RichDialog d2) {
        this.d2 = d2;
    }

    public RichDialog getD2() {
        return d2;
    }
    private RichDialog d2;
    private RichPanelGroupLayout pgl1;
    private RichOutputLabel ol1;
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
    private RichInputText it1;
    private RichPanelGroupLayout pgl6;
    private RichOutputLabel ol5;
    private RichInputText it2;
    private RichPanelGroupLayout pgl7;
    private RichOutputLabel ol6;
    private RichInputText it3;
    private RichPanelGroupLayout pgl8;
    private RichButton b1;
    private RichLink l8;
    private RichOutputLabel ol7;
   
    private RichPanelGroupLayout pgl9;
    private RichOutputLabel ol8;
    private RichInputDate id1;
    private RichPanelGroupLayout pgl10;
    private RichOutputLabel ol9;
    private RichSelectOneChoice soc1;
    private RichSelectItem si1;
    private RichSelectItem si2;
    private RichPanelGroupLayout pgl11;
    private RichOutputLabel ol10;
    private RichInputText it4;
    private RichPanelGroupLayout pgl12;
    private RichOutputLabel ol11;
    private RichInputText it5;
    private RichPanelGroupLayout pgl13;
    private RichInputText it6;
    private RichOutputLabel ol12;
    private RichPanelGroupLayout pgl14;
    private RichOutputLabel ol13;
    private RichInputText it7;
    private RichPanelGroupLayout pgl15;
    private RichButton b2;
    private RichPanelGroupLayout pgl16;
    private RichOutputLabel ol14;
    private RichInputText it8;
    private RichPanelGroupLayout pgl17;
    private RichOutputLabel ol15;
    private RichInputText it9;
    private RichPanelGroupLayout pgl18;
    private RichOutputLabel ol16;
    private RichInputText it10;
    private RichLink l18;
    private RichOutputLabel ol17;
    private RichPanelGroupLayout pgl19;

    public void setL18(RichLink l18) {
        this.l18 = l18;
    }

    public RichLink getL18() {
        return l18;
    }


    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setOl1(RichOutputLabel ol1) {
        this.ol1 = ol1;
    }

    public RichOutputLabel getOl1() {
        return ol1;
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

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
    }

    public void setOl5(RichOutputLabel ol5) {
        this.ol5 = ol5;
    }

    public RichOutputLabel getOl5() {
        return ol5;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setPgl7(RichPanelGroupLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGroupLayout getPgl7() {
        return pgl7;
    }

    public void setOl6(RichOutputLabel ol6) {
        this.ol6 = ol6;
    }

    public RichOutputLabel getOl6() {
        return ol6;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
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

    public void setL8(RichLink l8) {
        this.l8 = l8;
    }

    public RichLink getL8() {
        return l8;
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


    public String login() {
        // Add event code here...
        return null;
    }

    public String regi() {
        // Add event code here...
        return "custreg.jsf";
    }

  

   
    public void setOl7(RichOutputLabel ol7) {
        this.ol7 = ol7;
    }

    public RichOutputLabel getOl7() {
        return ol7;
    }

   

    public void setPgl9(RichPanelGroupLayout pgl9) {
        this.pgl9 = pgl9;
    }

    public RichPanelGroupLayout getPgl9() {
        return pgl9;
    }

    public void setOl8(RichOutputLabel ol8) {
        this.ol8 = ol8;
    }

    public RichOutputLabel getOl8() {
        return ol8;
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }

    public void setPgl10(RichPanelGroupLayout pgl10) {
        this.pgl10 = pgl10;
    }

    public RichPanelGroupLayout getPgl10() {
        return pgl10;
    }

    public void setOl9(RichOutputLabel ol9) {
        this.ol9 = ol9;
    }

    public RichOutputLabel getOl9() {
        return ol9;
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

    public void setPgl11(RichPanelGroupLayout pgl11) {
        this.pgl11 = pgl11;
    }

    public RichPanelGroupLayout getPgl11() {
        return pgl11;
    }

    public void setOl10(RichOutputLabel ol10) {
        this.ol10 = ol10;
    }

    public RichOutputLabel getOl10() {
        return ol10;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setPgl12(RichPanelGroupLayout pgl12) {
        this.pgl12 = pgl12;
    }

    public RichPanelGroupLayout getPgl12() {
        return pgl12;
    }

    public void setOl11(RichOutputLabel ol11) {
        this.ol11 = ol11;
    }

    public RichOutputLabel getOl11() {
        return ol11;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public void setPgl13(RichPanelGroupLayout pgl13) {
        this.pgl13 = pgl13;
    }

    public RichPanelGroupLayout getPgl13() {
        return pgl13;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public void setOl12(RichOutputLabel ol12) {
        this.ol12 = ol12;
    }

    public RichOutputLabel getOl12() {
        return ol12;
    }

    public void setPgl14(RichPanelGroupLayout pgl14) {
        this.pgl14 = pgl14;
    }

    public RichPanelGroupLayout getPgl14() {
        return pgl14;
    }

    public void setOl13(RichOutputLabel ol13) {
        this.ol13 = ol13;
    }

    public RichOutputLabel getOl13() {
        return ol13;
    }

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
    }

    public void setPgl15(RichPanelGroupLayout pgl15) {
        this.pgl15 = pgl15;
    }

    public RichPanelGroupLayout getPgl15() {
        return pgl15;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setPgl16(RichPanelGroupLayout pgl16) {
        this.pgl16 = pgl16;
    }

    public RichPanelGroupLayout getPgl16() {
        return pgl16;
    }

    public void setOl14(RichOutputLabel ol14) {
        this.ol14 = ol14;
    }

    public RichOutputLabel getOl14() {
        return ol14;
    }

    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
    }

    public void setPgl17(RichPanelGroupLayout pgl17) {
        this.pgl17 = pgl17;
    }

    public RichPanelGroupLayout getPgl17() {
        return pgl17;
    }

    public void setOl15(RichOutputLabel ol15) {
        this.ol15 = ol15;
    }

    public RichOutputLabel getOl15() {
        return ol15;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public void setPgl18(RichPanelGroupLayout pgl18) {
        this.pgl18 = pgl18;
    }

    public RichPanelGroupLayout getPgl18() {
        return pgl18;
    }

    public void setOl16(RichOutputLabel ol16) {
        this.ol16 = ol16;
    }

    public RichOutputLabel getOl16() {
        return ol16;
    }

    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
    }

    public String register() {
        // Add event code here...
        try{
                if(getIt9().getValue().equals(getIt10().getValue())){ 
            Connection con = dbcon.getConnection();
            Statement stt=con.createStatement();
                System.out.println("hiii..222222222222222");
                Date d1 = (Date) getId1().getValue();
                String trr = new SimpleDateFormat("YYYY-MM-dd").format(d1);

            stt.execute("insert into user_reg values('" + getIt2().getValue() + "','" + getIt3().getValue() + "','"+trr+"','" + getSoc1().getValue() + "','" + getIt4().getValue() +"','"+getIt5().getValue()+"','"+getIt6().getValue()+"','"+getIt7().getValue()+"')");
            stt.execute("insert into user_login values('"+getIt2().getValue()+"','"+getIt8().getValue()+"','"+getIt9().getValue()+"')");
                getP1().show(new RichPopup.PopupHints());        
            }else{
                    System.out.println("hiii..");
                    getIt9().setContentStyle("border:1px red solid;"); 
                    getIt10().setContentStyle("border:1px red solid;"); 
                    AdfFacesContext.getCurrentInstance().addPartialTarget(it9);
                    AdfFacesContext.getCurrentInstance().addPartialTarget(it10);
                }
            }
        catch(Exception e){e.printStackTrace();}
        return null;
    }



    public String l8() {
        // Add event code here...
        return null;
    }

    public String signin() {
        // Add event code here...
        return "/faces/custlogin.jsf";
    }

    public void setOl17(RichOutputLabel ol17) {
        this.ol17 = ol17;
    }

    public RichOutputLabel getOl17() {
        return ol17;
    }

    public void setPgl19(RichPanelGroupLayout pgl19) {
        this.pgl19 = pgl19;
    }

    public RichPanelGroupLayout getPgl19() {
        return pgl19;
    }


    public void bphase(PhaseEvent phaseEvent) {
        // Add event code here...
        try {
            Connection con = dbcon.getConnection();
            Statement st = con.createStatement();
        ResultSet rss = st.executeQuery("select distinct id from user_reg");
        int i = 1;
        while (rss.next()) {
            i++;
        }
        if (i <= 9) {
            getIt2().setValue("NC-0000" + i);
        }
        if (i > 9 && i <= 99) {
            getIt2().setValue("NC-000" + i);
        }
        if (i >= 100 && i <= 999) {
            getIt2().setValue("NC-00" + i);
        }
        if (i >= 1000 && i <= 9999) {
            getIt2().setValue("NC-0" + i);
        }
        if (i >= 10000) {
            getIt2().setValue("NC-" + i);
        }
        
    } catch (SQLException e) {
        }
    }}
