package view.backing.screen.master;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichCarousel;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.event.CarouselSpinEvent;

public class Test {
    private RichForm f1;
    private RichDocument d1;
    private RichCarousel c1;
    private RichCarousel c2;
    private RichImage i1;
    private RichInputText mobNoBind;
    private RichButton b1;

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
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
                  String message = "TOLL ON THE WAY Shalini";

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
              }
          }

          public void setMobNoBind(RichInputText mobNoBind) {
              this.mobNoBind = mobNoBind;
          }

          public RichInputText getMobNoBind() {
              return mobNoBind;
          }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setC1(RichCarousel c1) {
        this.c1 = c1;
    }

    public RichCarousel getC1() {
        return c1;
    }

    public void setC2(RichCarousel c2) {
        this.c2 = c2;
    }

    public RichCarousel getC2() {
        return c2;
    }

    public void handleCarouselSpin(CarouselSpinEvent carouselSpinEvent) {
        // Add event code here...
    }

    public void setI1(RichImage i1) {
        this.i1 = i1;
    }

    public RichImage getI1() {
        return i1;
    }

    

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }
}
