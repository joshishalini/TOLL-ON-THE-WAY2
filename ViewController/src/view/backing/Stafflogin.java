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
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;
import oracle.adf.view.rich.context.AdfFacesContext;
 
public class Stafflogin {
    private RichForm f1;
    private RichDocument d1;
    private RichLink l1;
    private RichLink l2;
    private RichLink l5;
    private RichLink l6;
    private RichLink l7;
    private RichOutputLabel ol2;
    private RichOutputLabel ol3;
    private RichOutputLabel ol4;
    private RichOutputLabel ol5;
    private RichOutputLabel ol6;

    public void setOl6(RichOutputLabel ol6) {
        this.ol6 = ol6;
    }

    public RichOutputLabel getOl6() {
        return ol6;
    }
    private RichInputText it1;
    private RichInputText it2;
    private RichButton b2;
    private RichInputText it3;

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
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
    private RichPanelGroupLayout pgl2;
    private RichPanelGroupLayout pgl3;
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
    private RichOutputLabel ol1;

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

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setL3(RichLink l3) {
        this.l3 = l3;
    }

    public RichLink getL3() {
        return l3;
    }
    private RichPanelGroupLayout pgl1;
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

    public String doLogin() {
        // Add event code here...
        try {
                    Connection conn =  dbcon.getConnection();
                    Statement stt = conn.createStatement();
                    ResultSet rs = stt.executeQuery("select booth_name from staff_detail where username='"+getIt2().getValue()+"' and pass='"+getIt3().getValue()+"'");
                    if(rs.next()){
                       HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
                  //     session.putValue("user",getIt2().getValue());
                        //session.putValue("id", rs.getString(1));
                      session.putValue("boothid", rs.getString(1));
                        System.out.println("Valueeeeeee login------------->"+"boothid");
                        return "/faces/screen/master/staff.jsf";
                    }
                    else
                    {
                            System.out.println("hiii..");
                            getIt3().setContentStyle("border:1px red solid;"); 
                            getIt2().setContentStyle("border:1px red solid;"); 
                            AdfFacesContext.getCurrentInstance().addPartialTarget(it3);
                            AdfFacesContext.getCurrentInstance().addPartialTarget(it2);
                        }
                }
                catch(Exception er){
                    er.printStackTrace();
                }
        
        return null;
    }

    public String toll() {
        // Add event code here...
        return "faces/screen/master/activetoll.jsf";
    }

    public String user() {
        // Add event code here...
        return "custlogin.jsf";
    }

    public String staff() {
        // Add event code here...
        return "stafflogin.jsf";
    }

    public void bphase(PhaseEvent phaseEvent) {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        System.out.println("i am here in check status session "+session.getAttribute("boothid"));
        if(session.getAttribute("boothid")!=null)
        {             try {
                FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath()+"/faces/screen/master/staff.jsf");
            }
                      catch(Exception er){}
           
            }
        else {
            System.out.println("i am here in check status else" );     
        }
        }

    }
