public class AlfredTest {
    public static void main(String[] args) {

        AlfredQuotes alfredBot = new AlfredQuotes();

        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth kane");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        String testGuestGreeting2 = alfredBot.guestGreeting("Beth Kane","afternoon");
        String testGuestGreeting3 = alfredBot.guestGreeting();

        // String Test

        String alexisTest = alfredBot.respondBeforeAlexis(
                "Alexis! Play some low-fi beats."
        );
        String alfredTest = alfredBot.respondBeforeAlexis(
                "I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis(
                "Maybe that's what Batman is about. Not winning. But failing.."
        );



        // sysOut testing
        System.out.println(testGreeting);
        System.out.println("**********************************************************");
        System.out.println(testGuestGreeting);
        System.out.println("**********************************************************");
        System.out.println(testDateAnnouncement);
        System.out.println("**********************************************************");
        System.out.println(alexisTest);
        System.out.println("**********************************************************");
        System.out.println(alfredTest);
        System.out.println("**********************************************************");
        System.out.println(notRelevantTest);
        System.out.println("**********************************************************");
        System.out.println(testGuestGreeting2);
        System.out.println("**********************************************************");
        System.out.println(testGuestGreeting3);
        System.out.println("**********************************************************");
        alfredBot.teaseAlfred("beth kane");




    }
}
