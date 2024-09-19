import java.text.SimpleDateFormat;
import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting(){
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name){
        return String.format("Hello %s.Lovely to see you.",name);
    }

    // Guest Greeting (Ninja Bonus Version!)
    public String guestGreeting(String name,String dayPeriod){
        return switch (dayPeriod){
            case "morning" -> String.format("Good Morning, %s. Lovely to see you",name);
            case "afternoon"->String.format("Good Afternoon, %s. Lovely to see you",name);
            case "evening"->String.format("Good Evening, %s. Lovely to see you",name);
            default -> String.format("Hello, %s. Lovely to see you",name);
        };

    }

    // Guest Greeting (Ninja Bonus SENSEI VERSION: Version!)

    public String guestGreeting(){

        Date periodOfDay = new Date();
        SimpleDateFormat dayHours= new SimpleDateFormat("H");
        int hour = Integer.parseInt(dayHours.format(periodOfDay));

        if(hour >= 0 && hour<12){
            return "Good Morning Sir!";
        }else if(hour >=12 && hour<18 ){
            return "Good Afternoon Sir!";
        } else
            return "Good Evening Sir!";

    }





    public String dateAnnouncement(){
        Date today = new Date();
        return "It is currently "+today;
    }

    public String respondBeforeAlexis(String conversation){
        if(conversation.indexOf("Alexis")!=-1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }else if (conversation.indexOf("Alfred")!=-1){
            return "At your service. As you wish, naturally.";
        }else
        return "Right. And with that I shall retire.";
    }



    public void teaseAlfred(String name){
        System.out.println("AlfredBot : Hello  "+name);
        for(int i=0;i<3;i++){
            System.out.println("Hello Alexis!");
            System.out.println("AlfredBot : I am Not Alexis Sir, I am AlfredBot");
        }
        System.out.println("AlfredBot : I am not Alexis!!! you don't understand".toUpperCase());

    }


}
