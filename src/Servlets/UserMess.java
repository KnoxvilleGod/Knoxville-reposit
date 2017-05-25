package Servlets;

import java.util.ArrayList;

public class UserMess {
    private static ArrayList<String> User = new ArrayList<>();
    private static ArrayList<String> MessageAll = new ArrayList<>();
    private static ArrayList<String> MessagePolitika = new ArrayList<>();
    private static ArrayList<String> MessageIsskustvo = new ArrayList<>();
    private static ArrayList<String> MessageObrazovanie = new ArrayList<>();
    private static ArrayList<String> MessagePets = new ArrayList<>();
    private static ArrayList<String> MessageLove = new ArrayList<>();


    protected void setUser(String name) {
        User.add(name);

    }

    protected void setMessageAll(String message) {
        MessageAll.add(message);
    }

    protected String getUser() {
        String a = "";
        for (String i : User) {
            a = a + i;
        }
        return a.toString();
    }

    protected String getMessageAll() {
        String a = "";
        for (String i : MessageAll) {
            a = a + i+"<br/>";
        }
        return a.toString();
    }
    protected void setMessagePolitika(String messagePolitika){
        MessagePolitika.add(messagePolitika);
    }
    protected String getMessagePoliika(){
        String a= "";
        for (String i: MessagePolitika){
            a = a+i+"<br/>";
        }
        return a.toString();
    }
    protected void setMessageIsskustvo(String messageIsskustvo){
        MessageIsskustvo.add(messageIsskustvo);
    }
    protected String getMessageIsskustvo(){
        String a= "";
        for (String i: MessageIsskustvo){
            a= a+i+"<br/>";
        }
        return a.toString();
    }
    protected void setMessageObrazovanie(String messageObrazovanie){
        MessageObrazovanie.add(messageObrazovanie);
    }
    protected String getMessageObrazovanie(){
        String a= "";
        for (String i:MessageObrazovanie){
            a=a+i+"<br/>";
        }
        return a.toString();
    }
    protected void setMessagePets(String messagePets){
        MessagePets.add(messagePets);
    }
    protected String getMessagePets(){
        String a= "";
        for(String i:MessagePets){
            a=a+i+"<br/>";
        }
        return a.toString();
    }
    protected void setMessageLove(String messageLove){
        MessageLove.add(messageLove);
    }
    protected String getMessageLove(){
        String a = "";
        for(String i:MessageLove){
            a=a+i+"<br/>";
        }
        return a.toString();
    }
    protected String getAll (){
        String a =(getUser()+":"+getMessageAll());
      return a;
    }



}
