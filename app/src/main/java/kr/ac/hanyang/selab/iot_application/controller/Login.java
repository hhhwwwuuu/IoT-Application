package kr.ac.hanyang.selab.iot_application.controller;

// TODO: 시간나면 Singleton으로 개선
public class Login {

    //Maybe Temporal
    private static String id="frebern";
    private static String pwd="selab10T";

    //Temporal
    public static boolean autoLogin(){
        return login(Login.id, Login.pwd);
    }

    public static boolean login(String id, String pwd){

        return true;
    }

    public static String getId() {
        return id;
    }
}
