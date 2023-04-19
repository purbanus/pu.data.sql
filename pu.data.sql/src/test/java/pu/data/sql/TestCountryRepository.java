package pu.data.sql;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestCountryRepository
{
@Autowired private CountryRepository countryRepository;

@Test
void addSomeCountries()
{
	Country country = new Country(99, "pipio" );
	Country savedCountry = countryRepository.saveAndFlush( country );
	
//	List<Country> countries = countryRepository.getAllCountries();
//	System.out.println( countries );

	assertEquals( 4, savedCountry.getId() );
	assertEquals( "pipio", savedCountry.getName() );
}

}
