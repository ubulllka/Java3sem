package prac13.task03;

import java.util.StringTokenizer;

public class Address {
    String country;
    String region;
    String city;
    String street;
    String house;
    String building;
    String apartment;

    public Address(String address, boolean flag){
        if (!flag) {
            String[] arr = address.split(",");
            for (int i = 0; i < arr.length; i++)
                arr[i] = arr[i].strip();
            country = arr[0];
            region = arr[1];
            city = arr[2];
            street = arr[3];
            house = arr[4];
            building = arr[5];
            apartment = arr[6];
        }
        else {
            StringTokenizer st = new StringTokenizer(address,",");
            String[] arr = new String[7];
            int cnt=0;
            while (st.hasMoreTokens()) {
                arr[cnt] = st.nextToken();
                cnt+=1;
            }
            for (int i = 0; i < arr.length; i++)
                arr[i] = arr[i].strip();
            country = arr[0];
            region = arr[1];
            city = arr[2];
            street = arr[3];
            house = arr[4];
            building = arr[5];
            apartment = arr[6];
        }
    }
    @Override
    public String toString(){
        return country+" "+region+" "+city+" "+street+" "+house+" "+building+" "+apartment;
    }


}
