package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmlearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmlearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmlearnApplication.class, args);

        countryService = context.getBean(CountryService.class);

        LOGGER.info("Inside Main");

        testGetAllCountries();
        testFindCountry();
        testAddCountry();
        testUpdateCountry();
        testDeleteCountry();
    }

    private static void testGetAllCountries() {

        LOGGER.info("Start");

        List<Country> countries =
                countryService.getAllCountries();

        LOGGER.debug("Countries={}", countries);

        LOGGER.info("End");
    }
    
    private static void testFindCountry() {

        try {

            LOGGER.info("Start");

            Country country = countryService.findCountryByCode("IN");

            LOGGER.debug("Country={}", country);

            LOGGER.info("End");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
    private static void testAddCountry() {

        Country country = new Country();

        country.setCode("AA");
        country.setName("Test Country");

        countryService.addCountry(country);

        LOGGER.info("Country Added");

    }
    private static void testUpdateCountry() {

        try {

            countryService.updateCountry("AA", "Updated Country");

            LOGGER.info("Country Updated");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
    private static void testDeleteCountry() {

        countryService.deleteCountry("AA");

        LOGGER.info("Country Deleted");

    }

}