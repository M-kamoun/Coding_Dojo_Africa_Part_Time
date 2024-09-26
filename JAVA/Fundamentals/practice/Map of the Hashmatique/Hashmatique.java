import java.util.*;

public class Hashmatique {

    public static void main(String[] args) {

        HashMap<String,String> trackList = new HashMap<String,String>();

        trackList.put("Uprising","Paranoia is in bloom, the PR transmissions will resume");
        trackList.put("Starlight","Starlight,I will be chasing a starlight,Until the end of my life");
        trackList.put("Plug In Baby","My plug-in baby,Crucifies my enemies,When I'm tired of giving, woah-oh-oh");
        trackList.put("Feeling Good","It's a new dawn,It's a new day,It's a new life for me,And I'm feeling good");

        System.out.println("--------- lyrics ----------------------------------");
        System.out.println(trackList.get("Plug In Baby"));


        System.out.println("--------- Track list----------------------------------");

        Set<String> keys = trackList.keySet();
        for(String key:keys)
            System.out.printf("%s : %s \n",key,trackList.get(key));

    }

}
