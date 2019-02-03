public class Excercise2 {

    public static void pages (int news ) {
        int pages =0;
        if(news>0&news<=10){
            pages = 1;
        }
        else if (news>10&news%10==0){
            pages=news/10;
        }
        else pages =news/10+1;
        System.out.println("Для вывода "+news+" новостей необходимо "+pages+" страниц");
    }
}
