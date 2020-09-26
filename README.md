# selenium-cucumber-framework


## Installation

To install all dependencies, run 

```console
$ mvn clean install
```

## Running tests ##

```console
$ mvn test
```

By default, tests will run on Chrome. To change that, specify `-Dbrowser={browser}` where `{browser}` is either `chrome` or `firefox`.

You can also select specific scenarios to execute using `-Dcucumber.options="--tags @your_tag"`. More info about tags and how to combine them [here](https://github.com/cucumber/cucumber/tree/master/tag-expressions).

---

## Architecture 🔨🔨🔨

- Selenium WebDriver tool as the baseline due to its vast array of open-source collection of APIs which is used for testing web applications.
	- Largest open source community support and numerous integrations
	- Use of regex based xpaths to make tests dynamic and yet stable
	
	
- Cucumber Framework due to its BDD approach
	- Gherkin language support, making it layman friendly and understandable for all stakeholders.
	- Easy parameterization from the feature files, making tests scalable on the go.
	- Reusability of same steps across different tests in different combinations.

---

## Support

Reach out to me at one of the following places!

- Linkedin at <a href="https://www.linkedin.com/in/madilqayyum/" target="_blank">`Adil Qayyum Linkedin`</a>
- Email at: adilqayyumk@gmail.com