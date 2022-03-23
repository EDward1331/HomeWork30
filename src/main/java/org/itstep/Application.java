package org.itstep;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        // Ваш код пишите здесь
        Scanner sc;
        Map<String, TreeSet<String>> networkMap = new HashMap<>();
        int human;
        String tvChannel,tvShow;
        Set<String> channels = new TreeSet<>();
        do {

            sc = new Scanner(System.in);
            System.out.print("Input tv network: ");
            tvChannel = sc.nextLine();
            System.out.print("Input tv show on " + tvChannel.toUpperCase() + " :");
            tvShow = sc.nextLine();
            if (!networkMap.containsKey(tvChannel)) {
                TreeSet<String> tvShows = new TreeSet<>();
                tvShows.add(tvShow);
                channels.add(tvChannel);
                networkMap.put(tvChannel, tvShows);
            }else{
                networkMap.get(tvChannel).add(tvShow);
            }
            System.out.println(networkMap);
            string();
            System.out.println("Добавить еще шоу?");
            System.out.println("Нажмите 1 - если да или 0 - если нет");
            string();
            sc = new Scanner(System.in);
            human = sc.nextInt();
        }while(human !=0);
        String[] channel2 = new String[channels.size()];
        for (int i = 0; i < channel2.length; i++) {
            channel2[i] = (String) channels.toArray()[i];
        }
        for (String oneChannel : channel2) {
            System.out.println(oneChannel);
            System.out.println(networkMap.get(oneChannel));
        }
    }
    static void string(){System.out.println("------------------------------------------------------");}
    }

