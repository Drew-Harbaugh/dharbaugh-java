package com.techelevator;

import com.techelevator.city.City;
import com.techelevator.city.CityDAO;
import com.techelevator.city.JdbcCityDAO;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;

public class DAOExample {

    public static void main(String[] args){

       BasicDataSource worldDataSource =  new BasicDataSource();
        worldDataSource.setUrl("jdbc:postgresql://localhost:5432/world");
        worldDataSource.setUsername("postgres");
        worldDataSource.setPassword("postgres1");

        CityDAO cityDAO = new JdbcCityDAO(worldDataSource);

//        for (int i = 37; i < 200; i++) {
//            City myCity = cityDAO.findCityById(i);
//            System.out.println(myCity.getName() + " " + myCity.getPopulation());
//        }

        List<City> usaCitites = cityDAO.findCityByCountryCode("USA");
        for (City c : usaCitites) {
            System.out.println(c.getName() + ", " + c.getDistrict());
        }

        List<City> ohioCities = cityDAO.findCityByDistrict("Ohio");
        for (City c : usaCitites) {
            System.out.println(c.getName() + ", " + c.getDistrict());
        }

    }
}
