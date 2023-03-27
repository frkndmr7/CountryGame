import java.util.Scanner;

public class CountryGame {
    public void game(){
        Joker joker = new Joker();
        EasyCountry country = new EasyCountry();
        MediumCountry country0= new MediumCountry();
        HardCountry countryx= new HardCountry();
        country.addCountryeasy("Turkiye","Ankara","Turkish","Europe","Turkish Lira");
        country.addCountryeasy("Germany" , "Berlin" , "German" , "Europe","Euro");
        country.addCountryeasy("England","London","English","Europe","Sterlin");
        country.addCountryeasy("France","Paris" , "French" , "Europe" , "Euro");
        country.addCountryeasy("USA","Washington" , "English" , "North America" , "US Dollar");
        country.addCountryeasy("Netherlands","Amsterdam" , "Dutch" , "Europe" , "Euro");
        country.addCountryeasy( "Russia","Moscow" , "Russian", "Europe" , "Russian Ruble");
        country.addCountryeasy( "Sweden","Stockholm" , "Swedish" , "Europe" , "Euro");
        country.addCountryeasy( "China","Beijing" , "Chinese" , "Asia" , "Renminbi");
        country.addCountryeasy( "Azerbaijan","Baku" , "Azerbaijanian" , "Asia" , "Manat");


        country0.addCountrymedium("Brasil","Brasilia" , "Brasilian" , "South America" ,  "Real");
        country0.addCountrymedium("Egypt","Cairo", "Arabic" , "Africa" , "Egyptian Pound");
        country0.addCountrymedium( "Ukraine","Kiev" , "Ukrainian" , "Europe" , "Hryvnia" );
        country0.addCountrymedium("India","New Delhi" , "Hindi" , "Asia" , "Indian Rupee");
        country0.addCountrymedium( "Qatar","Doha" , "Arabic" , "Asia" , "Qatari Riyal");
        country0.addCountrymedium( "Bulgaria","Sofia" , "Bulgarian" , "Europe" , "Lev");
        country0.addCountrymedium( "Switzerland","Zurich" , "German" , "Europe" , "Swiss Franc");
        country0.addCountrymedium( "Serbia","Belgrade" , "Serbian" , "Europe" ,"Serbian Dinar");
        country0.addCountrymedium(  "Croatia","Zagreb" ,"Croatian" , "Europe" ,"Croatian Kuna");
        country0.addCountrymedium( "Belgium","Brussels" , "Dutch" , "Europe" , "Euro");

        countryx.addCountryhard( "Taiwan","Taipei" , "Chinese" , "Asia" , "New Taiwan Dollar");
        countryx.addCountryhard("Vietnam","Hanoi" , "Vietnamese" , "Asia" , "Dong");
        countryx.addCountryhard( "Cambodia","Phnom Penh" , "Khmer" , "Asia" , "Riel");
        countryx.addCountryhard("Tunisia","Tunis" , "Arabic" , "Asia" , "Tunusian Dinar" );
        countryx.addCountryhard(  "Montenegro","Podgorica" , "Montenegrin" , "Europe" , "Euro");
        countryx.addCountryhard(  "Chile","Santiago" , "Spanish" , "South America" , "Chilean Peso");
        countryx.addCountryhard( "Nigeria","Abuja" , "English" , "Africa" , "Naira");
        countryx.addCountryhard(  "Peru","Lima" , "Spanish" , "South America" , "Peruvian Sol");
        countryx.addCountryhard(   "Albania","Tirana" , "Albanian", "Europe" , "Lek");
        countryx.addCountryhard( "Yemen","Sanaa" , "Arabic" , "Asia","Yemeni Rial");

        // Output input by user
        Scanner cevap = new Scanner(System.in);
        int sayi=0;
        int puan =0;
        while (sayi<25){
            int hint1 = 4;

            for (int i=0; i<3;i++) {
                String[] gameDetail1 = country.getCountryeasyDetails(country.getRandomEasyCountryName());
                System.out.println(gameDetail1[0]);

                for (int j = 1; j < gameDetail1.length; j++) {
                    String hint = cevap.nextLine();
                    if (hint.equals("hint")&&hint1>0){
                        joker.getRandomCharacter(gameDetail1[j].toLowerCase());
                        hint1--;
                        System.out.println("Your remaining hint: "+hint1);
                        if (hint1==0){
                            System.out.println("Your hint is over");
                        }
                        String object = cevap.nextLine();
                        if (object.toLowerCase().equals(gameDetail1[j].toLowerCase())) {
                            System.out.println("true");
                            puan ++;
                            sayi += 2;

                            System.out.println("Points: " + puan);
                        } else {
                            sayi += 2;
                            System.out.println("Points: " + puan);
                        }
                    } else if (hint.equals("hint")) {
                        if (hint1 == 0){
                            System.out.println("Your hint is over");
                            String object = cevap.nextLine();
                            if (object.toLowerCase().equals(gameDetail1[j].toLowerCase())) {
                                System.out.println("true");
                                puan+=2;
                                sayi+=2;
                                System.out.println("Points: " + puan);
                            } else {
                                sayi += 2;
                                System.out.println("Points: " + puan);
                            }
                        }


                    }
                    else{
                        String object = cevap.nextLine();
                        if (object.toLowerCase().equals(gameDetail1[j].toLowerCase())) {
                            System.out.println("true");
                            puan+=2;
                            sayi+=2;
                            System.out.println("Points: " + puan);
                        } else {
                            sayi += 2;
                            System.out.println("Points: " + puan);
                        }
                    }

                        /*if (hint1==0){
                            if (hint.equals("hint")){
                                System.out.println("Joker hakkınız bitmiştir");
                            }

                        }*/

                }

            }
            break;

        }
        if (sayi==puan){
            puan+=2;
            sayi+=2;
            System.out.println("Bingo!! + 2 points added");
            System.out.println(puan);
        }
        while (sayi>=24&&puan>=20){
            int hint1 = 4;

            System.out.println("Congratulations ");
            System.out.println("2. level up ");

            for (int i=0; i<3;i++){
                String[] gameDetail2 = country0.getCountrymediumDetails(country0.getRandomCountryeasyName());
                System.out.println(gameDetail2[0]);

                for (int j=1; j<gameDetail2.length;j++){
                    String hint = cevap.nextLine();
                    if (hint.equals("hint")&&hint1>0){
                        joker.getRandomCharacter(gameDetail2[j].toLowerCase());
                        hint1--;
                        System.out.println("Your remaining hint: "+hint1);
                        if (hint1==0){
                            System.out.println("Your hint is over");
                        }
                        String object = cevap.nextLine();
                        if (object.toLowerCase().equals(gameDetail2[j].toLowerCase())) {
                            System.out.println("true");
                            puan ++;
                            sayi += 2;
                            System.out.println("Points: " + puan);
                        }
                        else {
                            sayi += 2;
                            System.out.println("Points: " + puan);
                        }
                    }
                    else if (hint.equals("hint")) {
                        if (hint1 == 0){
                            System.out.println("Your hint is over");
                            String object = cevap.nextLine();
                            if (object.toLowerCase().equals(gameDetail2[j].toLowerCase())) {
                                System.out.println("true");
                                puan+=2;
                                sayi+=2;
                                System.out.println("Points: " + puan);
                            } else {
                                sayi += 2;
                                System.out.println("Points: " + puan);
                            }
                        }

                    }
                    else {
                        String object = cevap.nextLine();
                        if (object.toLowerCase().equals(gameDetail2[j].toLowerCase())) {
                            System.out.println("true");
                            puan+=2;
                            sayi+=2;
                            System.out.println("Points: " + puan);
                        } else {
                            sayi += 2;
                            System.out.println("Points: " + puan);
                        }
                    }


                }

            }
            break;
        }
        if (sayi==puan){
            puan+=2;
            sayi+=2;
            System.out.println("Bingo!! + 2 points added");
            System.out.println(puan);
        }
        while (sayi>=48&&puan>=40){
            int hint1 = 4;

            System.out.println("Congratulations ");
            System.out.println("3. level up ");

            for (int i=0; i<3;i++){
                String[] gameDetail3 = countryx.getCountryhardDetails(countryx.getRandomHardCountryName());
                System.out.println(gameDetail3[0]);

                for (int j=1; j<gameDetail3.length;j++){
                    String hint = cevap.nextLine();
                    if (hint.equals("hint")&&hint1>0){
                        joker.getRandomCharacter(gameDetail3[j].toLowerCase());
                        hint1--;
                        System.out.println("Your remaining hint: "+hint1);
                        if (hint1==0){
                            System.out.println("Your hint is over");
                        }
                        String object = cevap.nextLine();
                        if (object.toLowerCase().equals(gameDetail3[j].toLowerCase())) {
                            System.out.println("true");
                            puan ++;
                            sayi += 2;

                            System.out.println("Points: " + puan);
                        } else {
                            sayi += 2;
                            System.out.println("Points: " + puan);
                        }
                    }
                    else if (hint.equals("hint")) {
                        if (hint1 == 0){
                            System.out.println("Your hint is over");
                            String object = cevap.nextLine();
                            if (object.toLowerCase().equals(gameDetail3[j].toLowerCase())) {
                                System.out.println("true");
                                puan+=2;
                                sayi+=2;
                                System.out.println("Points: " + puan);
                            } else {
                                sayi += 2;
                                System.out.println("Points: " + puan);
                            }
                        }

                    }
                    else {
                        String object = cevap.nextLine();
                        if (object.toLowerCase().equals(gameDetail3[j].toLowerCase())) {
                            System.out.println("true");
                            puan+=2;
                            sayi+=2;
                            System.out.println("Points: " + puan);
                        } else {
                            sayi += 2;
                            System.out.println("Points: " + puan);
                        }
                    }



                }

            }
            break;

        }
        if (sayi==puan){
            puan+=2;
            sayi+=2;
            System.out.println("Bingo!! + 2 points added");
            System.out.println(puan);
        }
        System.out.println("Points: "+puan);
        if (puan>=66){
            System.out.println("YOU WIN :)");
        }
        else{
            System.out.println("TRY AGAIN :(");
        }
    }
}

