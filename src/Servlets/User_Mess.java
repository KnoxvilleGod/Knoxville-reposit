package Servlets;


import java.util.ArrayList;
import java.util.jar.Attributes;

public class User_Mess {
    private static ArrayList<String> Messages = new ArrayList<>();
    private static ArrayList<String> Nickname = new ArrayList<>();

    public void setMessages(String messages) {
        Messages.add(messages);

    }

    protected void setNickname(String nickname) {
        Nickname.add(nickname);

    }

    protected String getNickname() {
        String a = "";
        for (String i : Nickname) {
            a = a + i;
        }
        return a.toString();
    }

    protected String getMessage() {
        String a = "";
        for (String i : Messages) {
            a = a +i+"<br/>";
        }
        return a.toString();
    }

    protected String getAll(){
        String a = (getNickname()+": "+getMessage()+"<br/>");
        return a;
    }
}