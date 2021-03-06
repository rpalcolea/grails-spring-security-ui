// See: http://www.gebish.org/manual/current/configuration.html

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver
import org.openqa.selenium.remote.DesiredCapabilities

//System.setProperty 'webdriver.chrome.driver', 'c:/dev/chromedriver.exe'
//System.setProperty 'phantomjs.binary.path', ''

//driver = { new ChromeDriver() }
driver = { new PhantomJSDriver(new DesiredCapabilities()) }

reportsDir = new File('build/geb-reports')
baseUrl = 'http://localhost:8238/'
quitCachedDriverOnShutdown = true

environments {

	// run as 'grails -Dgeb.env=phantomjs test-app'
	phantomjs {
		driver = { new PhantomJSDriver(new DesiredCapabilities()) }
	}

	// run as 'grails -Dgeb.env=chrome test-app'
	chrome {
		driver = { new ChromeDriver() }
	}

	// run as 'grails -Dgeb.env=firefox test-app'
	firefox {
		driver = { new FirefoxDriver() }
	}
}
