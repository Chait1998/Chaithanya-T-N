Feature: Access a Product via Search

	Scenario: Access a Product via Search 
	Given go to  www.ebay.com website
	
	Given Type any search string in the search bar. For example: MacBook.
	Then Titile of the page 
	Then Change the Search category. For example: Computers/Tablets & Networking and click Search.
	Then Verify that the page loads completely.
	And Verify that the first result name matches with the search string.
    Then close the browser
	
	
  
	
	
