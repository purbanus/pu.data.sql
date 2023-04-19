package pu.data.sql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application
{
@SuppressWarnings( "resource" )
public static void main( String [] args )
{
	// StringHelper.printClassPath();
	SpringApplication.run( Application.class, args );
}

}
