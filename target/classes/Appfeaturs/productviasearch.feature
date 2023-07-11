Feature: Access a Product via Search

	Scenario: Access a Product via Search 
	Given go to  www.ebay.com website
	When Type any search string in the search bar. For example: MacBook.
	And Change the Search category. For example: Computers/Tablets & Networking and click Search.
	And Verify that the page loads completely.
	And Verify that the first result name matches with the search string.
    Then close the browser
	
	
  
	
	
