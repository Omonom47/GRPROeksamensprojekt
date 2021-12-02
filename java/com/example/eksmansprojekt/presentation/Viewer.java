package com.example.eksmansprojekt.presentation;

import com.example.eksmansprojekt.domain.*;

import java.util.Scanner;

public class Viewer {


    public String input(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void test(){

        MediaOverview mo = new MediaOverview();

        UserOverview userOverview = new UserOverview();


        mo.initializeOverview();

        System.out.println("Velkommen til StreamIT!");
        System.out.println("-------------------------");
        System.out.println("Indtast venligst dit brugernavn");
        String username = input();
        System.out.println("Indtast venligst din adgangskode");
        String password = input();
        try{
            userOverview.login(username,password);
        } catch (WrongLoginException e){
            System.out.println(e.getMessage());
        }

        User user = userOverview.getActiveUser();

        System.out.println("Vælg en af følgende muligheder:");
        System.out.println("Tast 1 for at se alle medier");
        System.out.println("Tast 2 for at se din personlig liste");
        System.out.println("Tast 3 for at se eller skifte brugere");
        System.out.println("Tast Q for at lukke programmet");

        boolean running = true;
        while (running){

            String in = input();
            if (in.equals("Q")){
                running = false;
            }
            else if (in.equals("1")) {
                /*
                Vise alle medier
                 */
                mo.testShowAll();
            }
            else if (in.equals("2")){
                /*
                Vise personlig liste
                 */
                user.getPersonalList().show();
                System.out.println("Tast a for at tilføje et element til din liste");
                in = input();
                if (in.equals("a")){
                    System.out.println("Indtast navnet på den film/serie du vil tilføje");
                    in = input();
                    try {
                        user.getPersonalList().add(mo.findMediaWithTitle(in));
                    } catch (NoSuchMediaException e) {
                        System.out.println(e.getMessage());
                    }

                }
            }
            else if (in.equals("4")){
                /*
                Tilføjer element
                 */

            }
            else if (in.equals("3")){
                /*
                Vise alle brugere
                 */

                userOverview.show();
            }
        }


    }
}
