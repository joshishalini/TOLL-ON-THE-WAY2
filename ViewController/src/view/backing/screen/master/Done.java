package view.backing.screen.master;

import javax.faces.context.FacesContext;

import javax.faces.event.PhaseEvent;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

public class Done {
    private RichForm f1;
    private RichDocument d1;
    private RichOutputLabel ol5;
    private RichImage i1;
    private RichOutputLabel ol1;
    private RichOutputLabel ol2;
    private RichPanelGroupLayout pgl1;
    private RichOutputLabel ol42;
    private RichOutputLabel ol43;
    private RichOutputLabel ol44;
    private RichLink l5;
    private RichLink l6;
    private RichLink l7;
    private RichLink l1;
    private RichLink l2;
    private RichButton b1;
    private RichButton b3;

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

    public void setOl5(RichOutputLabel ol5) {
        this.ol5 = ol5;
    }

    public RichOutputLabel getOl5() {
        return ol5;
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

    public void setI1(RichImage i1) {
        this.i1 = i1;
    }

    public RichImage getI1() {
        return i1;
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

    public String logout() {
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

    public String home() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
          session.putValue("id",session.getAttribute("id"));
        
        return "search.jsf";
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
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
    }
  
}
