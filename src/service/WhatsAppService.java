package service;


import domain.Message;

public class WhatsAppService  implements MessageService{

    public void sentMessage(Message message){

        System.out.println("I am WhatsAppService to sent this message in :"+ message.getMessage());
    }



}
