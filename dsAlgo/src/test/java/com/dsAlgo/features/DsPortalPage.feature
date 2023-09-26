Feature: dsAlgo:000 launching the ds portal application

@dsPortal
Scenario: User launch the dsAlgo application 
	Given open the browser maximize and set the timeouts 
	And load the url 
	When user click the "Get Started" button 
	Then user redirects to the home page and verify the page title