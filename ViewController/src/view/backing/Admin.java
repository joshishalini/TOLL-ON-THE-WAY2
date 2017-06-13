package view.backing;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.faces.context.FacesContext;

import javax.faces.event.PhaseEvent;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichDecorativeBox;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelBorderLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;
import oracle.adf.view.rich.context.AdfFacesContext;

public class Admin {
    private RichForm f1;
    private RichButton b1;
        private RichDecorativeBox db1;
        private RichPanelBorderLayout pbl1;
        private RichPanelBorderLayout pbl2;
        private RichPanelGridLayout pgl1;
        private RichGridRow gr1;
        private RichGridCell gc1;
        private RichInputText it1;
    private RichInputText it2;
        private RichGridRow gr2;
        private RichGridRow gr3;
        private RichMessages m1;
        private RichDecorativeBox db2;
        private RichButton b2;
        private RichOutputLabel ol1;
        private RichOutputLabel ol2;
        private RichPanelGroupLayout pgl2;
        private RichPanelGroupLayout pgl3;
        private RichPanelGroupLayout pgl4;
        private RichOutputLabel ol3;
        private RichInputText it3;
        private RichPanelGroupLayout pgl5;
        private RichOutputLabel ol4;
        private RichInputText it4;


    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setGr2(RichGridRow gr2) {
        this.gr2 = gr2;
    }

    public RichGridRow getGr2() {
        return gr2;
    }

    public void setGr3(RichGridRow gr3) {
        this.gr3 = gr3;
    }

    public RichGridRow getGr3() {
        return gr3;
    }

    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }

    public void setDb2(RichDecorativeBox db2) {
        this.db2 = db2;
    }

    public RichDecorativeBox getDb2() {
        return db2;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
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

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }

    public void setOl4(RichOutputLabel ol4) {
        this.ol4 = ol4;
    }

    public RichOutputLabel getOl4() {
        return ol4;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setDb1(RichDecorativeBox db1) {
        this.db1 = db1;
    }

    public RichDecorativeBox getDb1() {
        return db1;
    }

    public void setPbl1(RichPanelBorderLayout pbl1) {
        this.pbl1 = pbl1;
    }

    public RichPanelBorderLayout getPbl1() {
        return pbl1;
    }

    public void setPbl2(RichPanelBorderLayout pbl2) {
        this.pbl2 = pbl2;
    }

    public RichPanelBorderLayout getPbl2() {
        return pbl2;
    }

    public void setPgl1(RichPanelGridLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGridLayout getPgl1() {
        return pgl1;
    }

    public void setGr1(RichGridRow gr1) {
        this.gr1 = gr1;
    }

    public RichGridRow getGr1() {
        return gr1;
    }

    public void setGc1(RichGridCell gc1) {
        this.gc1 = gc1;
    }

    public RichGridCell getGc1() {
        return gc1;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }
    private RichDocument d1;

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

    public String doLogin() {
        // Add event code here...
        try {
                    Connection conn =  dbcon.getConnection();
                    Statement stt = conn.createStatement();
                    ResultSet rs = stt.executeQuery("select * from admin_login where username='"+getIt2().getValue()+"' and pass='"+getIt3().getValue()+"'");
                    if(rs.next()){
                       HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
                         session.putValue("login", rs.getInt(1));
                        
                        return "/faces/screen/master/booth_list.jsf";
                    }
                    else{
                        getIt2().setContentStyle("border:1px red solid;height: 25px;width: 250px;");
                            AdfFacesContext.getCurrentInstance().addPartialTarget(it2);
                            getIt3().setContentStyle("border:1px red solid;height: 25px;width: 250px;");
                                AdfFacesContext.getCurrentInstance().addPartialTarget(it3);
                              
                            getIt3().setShortDesc("Username/Password id incorrect....");
                        }
                }
                catch(Exception er){
                    er.printStackTrace();
                }

        return null;
    }


    public void bphase(PhaseEvent phaseEvent) {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        System.out.println("i am here in check status session "+session.getAttribute("login"));
        if(session.getAttribute("login")!=null)
        {             try {
                FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath()+"/faces/screen/master/booth_list.jsf");
            }
                      catch(Exception er){}
           
            }
        else {
            System.out.println("i am here in check status else" );     
        }
        }
    }
