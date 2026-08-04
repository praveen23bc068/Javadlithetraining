package inheritance;

class social_media{
    void display(){
        System.out.println("Social Media");
        System.out.println("------------");
    }
}

//child1->whatsapp
class whatsapp extends social_media{
    void whatsapp_details(){
        System.out.println("WHATSUP");
    }
}

//child 2
class instagram extends social_media{
    void instagram_details(){
        System.out.println("INSTA");
    }
}

//child 2
class snapchat extends social_media{
    void snapchat_details(){
        System.out.println("INSTA");
    }
}

public class social {
    public static void main (String[] args){
        social_media s=new social_media();
        s.display();

        whatsapp w=new whatsapp();
        w.whatsapp_details();
        w.display();

        instagram i=new instagram();
        i.instagram_details();
        i.display();

        snapchat sp=new snapchat();
        sp.snapchat_details();
        sp.display();


    }
}
