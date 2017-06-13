package view.backing.screen.master;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.PhaseEvent;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

import oracle.adf.view.rich.context.AdfFacesContext;

import view.backing.dbcon;

public class Dummy {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelGroupLayout pgl1;
    private RichPanelGroupLayout pgl2;
    private RichOutputLabel ol1;
    private RichInputText it1;
    private RichOutputLabel ol2;
    private RichOutputLabel ol3;
    private RichPanelGroupLayout pgl3;
    private RichInputText it2;
    private RichInputText it3;
    private RichOutputLabel ol4;
    private RichInputText it4;
    private RichPanelGroupLayout pgl4;
    private RichOutputLabel ol5;
    private RichButton b1;
    private RichPanelGroupLayout pgl5;
    private RichImage i1;
    private RichImage i2;
    private RichOutputLabel ol6;
    private RichOutputLabel ol7;
    private RichOutputLabel ol8;
    private RichInputText it5;

    private RichInputText mobNoBind;

    public void setMobNoBind(RichInputText mobNoBind) {
        this.mobNoBind = mobNoBind;
    }

    public RichInputText getMobNoBind() {
        return mobNoBind;
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

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void bphase(PhaseEvent phaseEvent) {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        ol7.setValue(session.getAttribute("amount"));
        try {
                    Connection conn =  dbcon.getConnection();
                    Statement stt = conn.createStatement();
                    ResultSet rs = stt.executeQuery("select phno from user_REG where id='"+session.getAttribute("id")+"'");
                  System.out.println("select phno from user_reg where id='"+session.getAttribute("id")+"'");
                    if(rs.next()){
                           getMobNoBind().setValue(rs.getString(1));
                           AdfFacesContext.getCurrentInstance().addPartialTarget(mobNoBind);
                           
                       }}
            catch(Exception er)
            {}
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

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
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

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
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

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }

    public void setI1(RichImage i1) {
        this.i1 = i1;
    }

    public RichImage getI1() {
        return i1;
    }

    public void setI2(RichImage i2) {
        this.i2 = i2;
    }

    public RichImage getI2() {
        return i2;
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

    public String pay() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        
        try{
            Connection con=dbcon.getConnection();
            Statement stt= con.createStatement();
            System.out.println("UPDATE payment SET done='" + 1+"'where tid='"+session.getAttribute("tid")+"'");
            stt.executeUpdate("UPDATE payment SET done='" + 1+"'where tid='"+session.getAttribute("tid")+"'" );
                    System.out.println("UPDATE delpay SET done='" + 1+"'where tid='"+session.getAttribute("tid")+"'");
                    stt.executeUpdate("UPDATE delpay SET done='" + 1+"'where tid='"+session.getAttribute("tid")+"'");
             
             
                }
        catch(Exception e){e.printStackTrace();}
        return "done.jsf";
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }
    @SuppressWarnings("oracle.jdeveloper.java.nested-assignment")
    public void sendSMSAction(ActionEvent actionEvent) {
        // Add event code here...
        if (mobNoBind.getValue() != null) {
                  // Replace with your username
                  String user = "shalinijoshi16";

                  // Replace with your API KEY (We have sent API KEY on activation email, also available on panel)
                  String apikey = "HHzbUjt6xKbf3Ou6xEgT";

                  // Replace with the destination mobile Number to which you want to send sms
                  String mobile = mobNoBind.getValue().toString();

                  // Replace if you have your own Sender ID, else donot change
                  String senderid = "MYTEXT";

                  // Replace with your Message content
                  HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
                  String a= session.getAttribute("id").toString();
                  String b= session.getAttribute("vno").toString();
                  
                  String message = "Dear Customer, your Payment has been successfully done. Your Registered vehicle no "+b+" and Order number is "+a+". Thank you ";

                  // For Plain Text, use "txt" ; for Unicode symbols or regional Languages like hindi/tamil/kannada use "uni"
                  String type = "txt";

                  //Prepare Url
                  URLConnection myURLConnection = null;
                  URL myURL = null;
                  BufferedReader reader = null;

                  //encoding message
                  String encoded_message = URLEncoder.encode(message);

                  //Send SMS API
                  String mainUrl = "http://smshorizon.co.in/api/sendsms.php?";

                  //Prepare parameter string
                  StringBuilder sbPostData = new StringBuilder(mainUrl);
                  sbPostData.append("user=" + user);
                  sbPostData.append("&apikey=" + apikey);
                  sbPostData.append("&message=" + encoded_message);
                  sbPostData.append("&mobile=" + mobile);
                  sbPostData.append("&senderid=" + senderid);
                  sbPostData.append("&type=" + type);

                  //final string
                  mainUrl = sbPostData.toString();
                  System.out.println("URL to Send SMS-" + mainUrl);
                  try {
                      //prepare connection
                      myURL = new URL(mainUrl);
                      myURLConnection = myURL.openConnection();
                      myURLConnection.connect();
                      reader = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
                      //reading response
                      String response;
                      while ((response = reader.readLine()) != null) {
                          //print response
                          System.out.println("null------>"+response);
                      }
                      System.out.println(response);
                      //finally close connection
                      reader.close();


                  } catch (Exception e) {
                      e.printStackTrace();
                  }
    
}}}
