package com.ada.restcountries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CountryService {
    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }
    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
